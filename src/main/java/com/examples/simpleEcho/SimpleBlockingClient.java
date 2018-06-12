package com.examples.simpleEcho;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.jboss.marshalling.*;
import org.xnio.Xnio;
import org.xnio.IoUtils;
import org.xnio.XnioWorker;
import org.xnio.OptionMap;
import org.xnio.StreamConnection;
import org.xnio.IoFuture;
import org.xnio.ByteBufferPool;
import org.xnio.channels.Channels;
import org.xnio.channels.ConnectedStreamChannel;
import org.xnio.conduits.ConduitStreamSinkChannel;
import org.xnio.conduits.ConduitStreamSourceChannel;
import org.xnio.streams.ChannelInputStream;
import org.xnio.streams.ChannelOutputStream;

import java.util.List;



/**
 * Created by hank on 5/29/18.
 */
public class SimpleBlockingClient {

    public static void main(String[] args) throws Exception {
        final Charset charset = Charset.forName("utf-8");
        final Xnio xnio = Xnio.getInstance();
        final XnioWorker worker = xnio.createWorker(OptionMap.EMPTY);

        // Get the factory for the "river" marshalling protocol
        final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("river");

        // Create a configuration
        final MarshallingConfiguration configuration = new MarshallingConfiguration();
        configuration.setVersion(4);
        Marshaller marshaller = marshallerFactory.createMarshaller(configuration);
        Unmarshaller unmarshaller = marshallerFactory.createUnmarshaller(configuration.clone());

        try {
            final IoFuture<StreamConnection> futureStream = worker.openStreamConnection(new InetSocketAddress("localhost", 12345), null, OptionMap.EMPTY);
            final IoFuture<ConnectedStreamChannel> futureConnection = worker.connectStream(new InetSocketAddress("localhost", 12345), null, OptionMap.EMPTY);
            final ConnectedStreamChannel channel = futureConnection.get(); // throws exceptions

            ConduitStreamSinkChannel sinkChannel = futureStream.get().getSinkChannel();
            ConduitStreamSourceChannel sourceChannel = futureStream.get().getSourceChannel();
            try {
                // Send the greeting
                //Channels.writeBlocking(channel, ByteBuffer.wrap("Hello world!!".getBytes(charset)));
                //final ByteArrayOutputStream  bos = new ByteArrayOutputStream (10);
                final SimpleByteOutputStream sos = new SimpleByteOutputStream(10);
                final ByteOutput byteOutput = Marshalling.createByteOutput(sos);
                marshaller.start(byteOutput);
                marshaller.writeObject(new Message());
                marshaller.finish();

                Channels.writeBlocking(channel, ByteBuffer.wrap(sos.toByteArray()));
                // Make sure all data is written
                Channels.flushBlocking(channel);
                // And send EOF
                channel.shutdownWrites();

                // response
                System.out.println("Sent greeting string!  The response is...");
                int res =0;
                ByteBuffer bufferIn = ByteBuffer.allocate(60);
                ByteBuffer bufferWr = ByteBuffer.allocate(0);

                // Now receive and print the whole response
                while (Channels.readBlocking(channel, bufferIn) != -1) {
                    //bufferIn.flip();
                    //final CharBuffer chars = charset.decode(bufferIn);
                    System.out.println(bufferIn.position());

                    if (res < 1) {
                        System.out.println("====get:" +bufferIn.get(0));
                        int size512 = (int) bufferIn.get(0) + 1;
                        bufferWr = ByteBuffer.allocate(size512 * 512);
                    }
                    res += bufferIn.position();
                    bufferWr.put(bufferIn.array(), 0, bufferIn.position());

                    bufferIn.clear();
                }
                System.out.println("====res:" + res);
                System.out.println("====pos:" + bufferWr.position());

                // unmarshaller
                bufferWr.flip();
                bufferWr.position(1);
                final ByteInput byteInput = Marshalling.createByteInput(bufferWr);

                unmarshaller.start(byteInput);
                Object readSubject = unmarshaller.readObject();
                unmarshaller.finish();

                Message mm = (Message) readSubject;
                System.out.println("====nn:" + mm.getMessageName());

            } finally {
                IoUtils.safeClose(channel);
            }
        } finally {
            worker.shutdown();
        }
    }
}
