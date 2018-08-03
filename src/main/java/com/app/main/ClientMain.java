package com.app.main;

import com.app.rpc.NioClient;
import com.examples.simpleEcho.Message;
import com.examples.simpleEcho.SimpleEchoClient;

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hank on 8/1/18.
 */
public class ClientMain {
    private static   NioClient nioClient;

    public static class Task implements Callable<String> {
        int ii;

        Task(int ii) {
            this.ii = ii;
        }

        @Override
        public String call() throws Exception {
            for (int i = 10; i < 50; i++) {
                nioClient.write("1234" + i);
            }
            return ii+"";
        }
    }

    public static void main(String args[]) throws Exception {
        nioClient = new NioClient();
        nioClient.connect(new InetSocketAddress("localhost", 12345));

        ExecutorService es = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<Future<String>>();
        for (int i=1; i<5; i++) {
            results.add(es.submit(new Task(i)));
        }
        for (Future<?> future : results) {
            future.get();
        }

        Thread.sleep(100);
        nioClient.close();
    }

}
