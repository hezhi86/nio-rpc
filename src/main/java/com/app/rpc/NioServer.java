package com.app.rpc;


import com.app.util.SerialUtil;
import org.xnio.OptionMap;
import org.xnio.StreamConnection;
import org.xnio.XnioWorker;
import org.xnio.channels.AcceptingChannel;
import org.xnio.channels.Channels;
import org.xnio.conduits.ConduitStreamSinkChannel;
import org.xnio.conduits.ConduitStreamSourceChannel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/**
 * Created by hank on 7/13/18.
 */
public class NioServer {

    private int port;

    public NioServer(int port) {
        this.port = port;
    }

    private ConduitStreamSinkChannel sinkChannel;
    private ConduitStreamSourceChannel sourceChannel;

    public void read() {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(18);

            while (Channels.readBlocking(sourceChannel, buffer) != -1) {
                System.out.println("Source "+Thread.currentThread().getId());
                buffer.flip();
                String ss = SerialUtil.deserializer(buffer.array(), String.class);
                System.out.println("Source read." +ss);
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() throws Exception {
        Builder builder = new Builder();
        XnioWorker worker = builder.getWorker();

        System.out.println("port:" + this.port);

        AcceptingChannel<StreamConnection> server =
                worker.createStreamConnectionServer(new InetSocketAddress(this.port), acceptingChannel -> {
                    try {
                        StreamConnection connection = acceptingChannel.accept();
                        connection.setCloseListener(t -> System.out.println("connection closed"));
                        System.out.println("accepted");

                        sinkChannel = connection.getSinkChannel();
                        sourceChannel = connection.getSourceChannel();

                        sinkChannel
                                .setCloseListener(t-> System.out.println("Sink Closed"));
                        sourceChannel
                                .setCloseListener(t -> System.out.println("Source Closed"));
                        sourceChannel
                                .setReadListener(t -> read());

                        sinkChannel.resumeWrites();
                        sourceChannel.resumeReads();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }, OptionMap.EMPTY);

        server.resumeAccepts();
    }

}
