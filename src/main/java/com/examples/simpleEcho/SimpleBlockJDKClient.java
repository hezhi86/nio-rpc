package com.examples.simpleEcho;

import org.xnio.*;
import org.xnio.channels.Channels;
import org.xnio.channels.ConnectedStreamChannel;
import org.xnio.conduits.ConduitStreamSinkChannel;
import org.xnio.conduits.ConduitStreamSourceChannel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hank on 6/13/18.
 */
public class SimpleBlockJDKClient {

    public static void main(String[] args) throws Exception {
        final Charset charset = Charset.forName("utf-8");
        final Xnio xnio = Xnio.getInstance();
        final XnioWorker worker = xnio.createWorker(OptionMap.EMPTY);

        try {
            final IoFuture<StreamConnection> futureStream = worker.openStreamConnection(new InetSocketAddress("localhost", 12345), null, OptionMap.EMPTY);
            final IoFuture<ConnectedStreamChannel> futureConnection = worker.connectStream(new InetSocketAddress("localhost", 12345), null, OptionMap.EMPTY);
            final ConnectedStreamChannel channel = futureConnection.get(); // throws exceptions

            ConduitStreamSinkChannel sinkChannel = futureStream.get().getSinkChannel();
            ConduitStreamSourceChannel sourceChannel = futureStream.get().getSourceChannel();
            try {
                // Send the greeting
                //Channels.writeBlocking(channel, ByteBuffer.wrap("Hello world!!".getBytes(charset)));
                long t1 = System.currentTimeMillis();
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oo = new ObjectOutputStream(bos);
                List<Message> messageList = new ArrayList<>();
                messageList.add(new Message());
                messageList.add(new Message());
                messageList.add(new Message());
                oo.writeObject(messageList);

                Channels.writeBlocking(channel, ByteBuffer.wrap(bos.toByteArray()));
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
/*
                    if (res < 1) {
                        System.out.println("====get:" +bufferIn.get(0));
                        int size512 = (int) bufferIn.get(0) + 1;
                        bufferWr = ByteBuffer.allocate(size512 * 512);
                    }*/
                    res += bufferIn.position();
                    bufferWr.put(bufferIn.array(), 0, bufferIn.position());

                    bufferIn.clear();
                }
                System.out.println("====res:" + res);
                System.out.println("====pos:" + bufferWr.position());

                bufferWr.flip();
                ByteArrayInputStream bi = new ByteArrayInputStream(bufferWr.array());
                ObjectInputStream oi = new ObjectInputStream(bi);

                List<Message>  mm = (List<Message>) oi.readObject();
                System.out.println("====bb:" + mm.get(0).getMessageName());
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
