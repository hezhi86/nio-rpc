package com.examples.simpleEcho;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.esotericsoftware.kryo.serializers.JavaSerializer;
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
 * Created by hank on 6/14/18.
 */
public class SimpleBlockKryoClient {

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
                SimpleByteOutputStream bos = new SimpleByteOutputStream();
                //ObjectOutputStream oo = new ObjectOutputStream(bos);
                Kryo kryo = new Kryo();
                Output output  = new Output(bos);

                long t1 = System.currentTimeMillis();
                List<Message> messageList = new ArrayList<>();
                messageList.add(new Message());
                messageList.add(new Message());
                messageList.add(new Message());

                kryo.writeObject(output, messageList);
                output.flush(); //output.close();

                Channels.writeBlocking(channel, ByteBuffer.wrap(bos.toByteArray()));
                // Make sure all data is written
                Channels.flushBlocking(channel);
                // And send EOF
                channel.shutdownWrites();

                // response
                System.out.println("Sent greeting string!  The response is...");
                long t2 = System.currentTimeMillis();
                int res =0;
                ByteBuffer bufferIn = ByteBuffer.allocate(100);
                ByteBuffer bufferWr = ByteBuffer.allocate(100);

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

                bufferWr.flip();
                //CollectionSerializer serializer = new CollectionSerializer();
                Input input = new Input(bufferWr.array());
                List<Message>  mm =  kryo.readObject(input, ArrayList.class);

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
