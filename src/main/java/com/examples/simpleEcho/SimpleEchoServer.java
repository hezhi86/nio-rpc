package com.examples.simpleEcho;

/**
 * Created by hank on 5/29/18.
 */
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.xnio.ChannelListener;
import org.xnio.IoUtils;
import org.xnio.OptionMap;
import org.xnio.Xnio;
import org.xnio.XnioWorker;
import org.xnio.channels.AcceptingChannel;
import org.xnio.channels.Channels;
import org.xnio.channels.ConnectedStreamChannel;

import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.Marshalling;
import org.jboss.marshalling.MarshallingConfiguration;
import org.jboss.marshalling.Marshaller;
import org.jboss.marshalling.Unmarshaller;

public final class SimpleEchoServer {

    public static void main(String[] args) throws Exception {
        final Charset charset = Charset.forName("utf-8");

        // Get the factory for the "river" marshalling protocol
        final MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("river");

        // Create a configuration
        final MarshallingConfiguration configuration = new MarshallingConfiguration();
        configuration.setVersion(4);
        Marshaller marshaller = marshallerFactory.createMarshaller(configuration);
        Unmarshaller unmarshaller = marshallerFactory.createUnmarshaller(configuration.clone());

        // First define the listener that actually is run on each connection.
        final ChannelListener<ConnectedStreamChannel> readListener = new ChannelListener<ConnectedStreamChannel>() {
            public void handleEvent(ConnectedStreamChannel channel) {
                final ByteBuffer buffer = ByteBuffer.allocate(512);
                int res;
                try {
                    while ((res = channel.read(buffer)) > 0) {
                        buffer.flip();
                        Channels.writeBlocking(channel, buffer);
                    }
                    // make sure everything is flushed out
                    Channels.flushBlocking(channel);
                    if (res == -1) {
                        channel.close();
                    } else {
                        channel.resumeReads();
                    }
                    //System.out.println(new String(buffer.array()));
                } catch (IOException e) {
                    e.printStackTrace();
                    IoUtils.safeClose(channel);
                }
            }
        };

        // Create an accept listener.
        final ChannelListener<AcceptingChannel<ConnectedStreamChannel>> acceptListener = new ChannelListener<AcceptingChannel<ConnectedStreamChannel>>() {
            public void handleEvent(
                    final AcceptingChannel<ConnectedStreamChannel> channel) {
                try {
                    ConnectedStreamChannel accepted;
                    // channel is ready to accept zero or more connections
                    while ((accepted = channel.accept()) != null) {
                        System.out.println("accepted "
                                + accepted.getPeerAddress());
                        // stream channel has been accepted at this stage.
                        accepted.getReadSetter().set(readListener);
                        // read listener is set; start it up
                        accepted.resumeReads();
                    }
                } catch (IOException ignored) {
                    ignored.printStackTrace();
                }
            }
        };

        final XnioWorker worker = Xnio.getInstance().createWorker(
                OptionMap.EMPTY);
        // Create the server.
        AcceptingChannel<? extends ConnectedStreamChannel> server = worker
                .createStreamServer(new InetSocketAddress(12345),
                        acceptListener, OptionMap.EMPTY);
        // lets start accepting connections
        server.resumeAccepts();

        System.out.println("Listening on " + server.getLocalAddress());
    }
}
