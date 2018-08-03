package com.app.rpc;

import org.xnio.OptionMap;
import org.xnio.Options;
import org.xnio.Xnio;
import org.xnio.XnioWorker;

/**
 * Created by hank on 7/17/18.
 */
public class Builder {

    private int bufferSize;
    private int ioThreads;
    private int workerThreads;
    private boolean directBuffers;
    //private final List<Undertow.ListenerConfig> listeners = new ArrayList<>();
    //private HttpHandler handler;
    private XnioWorker worker;
    //private ByteBufferPool byteBufferPool;

    private final OptionMap.Builder workerOptions = OptionMap.builder();
    private final OptionMap.Builder socketOptions = OptionMap.builder();
    private final OptionMap.Builder serverOptions = OptionMap.builder();

    public XnioWorker getWorker() throws Exception {
        ioThreads = Math.max(Runtime.getRuntime().availableProcessors(), 2);
        workerThreads = ioThreads * 8;
        long maxMemory = Runtime.getRuntime().maxMemory();
        //smaller than 64mb of ram we use 512b buffers
        if (maxMemory < 64 * 1024 * 1024) {
            //use 512b buffers
            directBuffers = false;
            bufferSize = 512;
        } else if (maxMemory < 128 * 1024 * 1024) {
            //use 1k buffers
            directBuffers = true;
            bufferSize = 1024;
        } else {
            //use 16k buffers for best performance
            //as 16k is generally the max amount of data that can be sent in a single write() call
            directBuffers = true;
            bufferSize = 1024 * 16 - 20; //the 20 is to allow some space for protocol headers, see UNDERTOW-1209
        }

        XnioWorker worker = Xnio.getInstance().createWorker(OptionMap.builder()
                .set(Options.WORKER_IO_THREADS, this.ioThreads)
                .set(Options.CONNECTION_HIGH_WATER, 100000)
                .set(Options.CONNECTION_LOW_WATER, 100000)
                .set(Options.WORKER_TASK_CORE_THREADS, this.workerThreads)
                .set(Options.WORKER_TASK_MAX_THREADS, this.workerThreads)
                .set(Options.TCP_NODELAY, true)
                .set(Options.CORK, true)
                .addAll(OptionMap.builder().getMap())
                .getMap());

        return worker;
    }
}
