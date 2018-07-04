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

import java.util.ArrayList;
import java.util.List;



/**
 * Created by hank on 5/29/18.
 */
public class SimpleBlockMarshClient {

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
                final SimpleByteOutputStream sos = new SimpleByteOutputStream(1000);
                final ByteOutput byteOutput = Marshalling.createByteOutput(sos);

                long t1 = System.currentTimeMillis();
                List<Message> messageList = new ArrayList<>();
                messageList.add(new Message());
                messageList.add(new Message());
                messageList.add(new Message());

                marshaller.start(byteOutput);
                marshaller.writeObject(new Message());
                //marshaller.finish();

                Channels.writeBlocking(channel, ByteBuffer.wrap(sos.toByteArray()));
                // Make sure all data is written
                Channels.flushBlocking(channel);
                // And send EOF
                channel.shutdownWrites();

                // response
                System.out.println("Sent greeting string!  The response is...");
                long t2 = System.currentTimeMillis();
                int res =0;
                ByteBuffer bufferIn = ByteBuffer.allocate(60);
                ByteBuffer bufferWr = ByteBuffer.allocate(300);

                // Now receive and print the whole response
                while (Channels.readBlocking(channel, bufferIn) != -1) {
                    //bufferIn.flip();
                    //final CharBuffer chars = charset.decode(bufferIn);
                    System.out.println(bufferIn.position());

                    if (res < 1) {
                        //System.out.println("====get:" +bufferIn.get(0));
                        //int size512 = (int) bufferIn.get(0) + 1;
                        //bufferWr = ByteBuffer.allocate(size512 * 512);
                    }
                    res += bufferIn.position();
                    bufferWr.put(bufferIn.array(), 0, bufferIn.position());

                    bufferIn.clear();
                }
                System.out.println("====res:" + res);
                System.out.println("====pos:" + bufferWr.position());

                // unmarshaller
                bufferWr.flip();
                //bufferWr.position(1);
                ByteInput byteInput = Marshalling.createByteInput(bufferWr);

                unmarshaller.start(byteInput);
                Message  mm  = (Message) unmarshaller.readObject();
                //unmarshaller.finish();

                System.out.println("====nn:" + mm.getMessageName());
                long t3 = System.currentTimeMillis();
                System.out.println("====t2-t1:" + (t2-t1));
                System.out.println("====t3-t2:" + (t3-t2));

            } finally {
                IoUtils.safeClose(channel);
            }
        } finally {
            worker.shutdown();
        }
    }
}
