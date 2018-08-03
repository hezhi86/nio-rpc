package com.app.rpc;

import com.app.util.SerialUtil;
import com.dyuproject.protostuff.LinkedBuffer;
import org.xnio.IoFuture;
import org.xnio.OptionMap;
import org.xnio.StreamConnection;
import org.xnio.XnioWorker;
import org.xnio.channels.Channels;
import org.xnio.conduits.ConduitStreamSinkChannel;
import org.xnio.conduits.ConduitStreamSourceChannel;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/**
 * Created by hank on 7/17/18.
 */
public class NioClient {

    private XnioWorker worker;
    IoFuture<StreamConnection> futureStream;
    private ConduitStreamSinkChannel sinkChannel;
    private ConduitStreamSourceChannel sourceChannel;

    @SuppressWarnings("unchecked")
    public void write(Object T) throws Exception {
        LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
        System.out.println("Sink "+Thread.currentThread().getId());

        byte[] bb = SerialUtil.serializer(T);
        sinkChannel.write(ByteBuffer.wrap(bb));

        //Channels.writeBlocking(sinkChannel, ByteBuffer.wrap(bb));
        // Make sure all data is written
        //Channels.flushBlocking(sinkChannel);
        // And send EOF
        sinkChannel.flush();
        sinkChannel.resumeWrites();
    }

    public void read() {

    }


    public void close() throws Exception {
        sinkChannel.close();
        sourceChannel.close();
        worker.shutdown();
    }


    public void connect(InetSocketAddress socketAddress) throws Exception {
        Builder builder = new Builder();
        worker = builder.getWorker();
        futureStream = worker.openStreamConnection(socketAddress, null, OptionMap.EMPTY);

        sinkChannel = futureStream.get().getSinkChannel();
        sourceChannel = futureStream.get().getSourceChannel();

        sinkChannel
                .setCloseListener(t -> System.out.println("Sink Closed"));
        sourceChannel
                .setCloseListener(t -> System.out.println("Source Closed"));
    }

}
