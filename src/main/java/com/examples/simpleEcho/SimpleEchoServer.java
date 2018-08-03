package com.examples.simpleEcho;

/**
 * Created by hank on 5/29/18.
 */
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.xnio.*;
import org.xnio.channels.AcceptingChannel;
import org.xnio.conduits.ConduitStreamSinkChannel;
import org.xnio.conduits.ConduitStreamSourceChannel;


public final class SimpleEchoServer {

    public static void main(String[] args) throws Exception {

        XnioWorker worker = Xnio.getInstance().createWorker(OptionMap.builder()
                .set(Options.WORKER_IO_THREADS, 2)
                .set(Options.CONNECTION_HIGH_WATER, 1)
                .set(Options.CONNECTION_LOW_WATER, 1)
                .set(Options.WORKER_TASK_CORE_THREADS, 2)
                .set(Options.WORKER_TASK_MAX_THREADS, 2)
                .set(Options.TCP_NODELAY, true)
                .set(Options.CORK, true)
                .addAll(OptionMap.builder().getMap())
                .getMap());

        AcceptingChannel<StreamConnection> server = worker.createStreamConnectionServer(
                new InetSocketAddress(12345), acceptingChannel -> {
                    try {
                        StreamConnection connection = acceptingChannel.accept();
                        if (connection != null) {
                            System.out.println("accepted");
                            connection.setCloseListener(channel -> System.out.println("connection closed"));
                        }
                        ConduitStreamSourceChannel sourceChannel = connection.getSourceChannel();
                        ConduitStreamSinkChannel sinkChannel = connection.getSinkChannel();

                        sourceChannel
                                .setCloseListener((t)->System.out.println("Source Closed"));
                        sinkChannel
                                .setCloseListener((t)->System.out.println("Sink Closed"));

                        sourceChannel.setReadListener((channel)->{
                            try{
                                ByteBuffer bb = ByteBuffer.allocate(15);
                                StringBuilder builder = new StringBuilder();
                                while(sourceChannel.read(bb) > 0){
                                    bb.flip();
                                    while(bb.position() < bb.limit()){
                                        builder.append((char)bb.get());
                                    }
                                    bb.clear();
                                }
                                System.out.println(builder.toString());
                                System.out.println(String.valueOf(Thread.currentThread().getId()));
                            }catch(Exception e){
                                e.printStackTrace();
                            }
                        });

                        sourceChannel.resumeReads();
                        sinkChannel.resumeWrites();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }, OptionMap.EMPTY);

        server.resumeAccepts();

    }
}
