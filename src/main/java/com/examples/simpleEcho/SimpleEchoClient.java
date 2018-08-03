package com.examples.simpleEcho;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 * Created by hank on 7/4/18.
 */
public class SimpleEchoClient {

    enum SingletonDemo{
        INSTANCE;
        public void otherMethods() {
            String tid = String.valueOf(Thread.currentThread().getId());
            System.out.println(tid);
        }
    }

    public static class Task implements Callable<String> {
        Socket client;
        int ii;

        Task(Socket client, int ii) {
            this.client = client;
            this.ii = ii;
        }

        @Override
        public String call() throws Exception {
            SingletonDemo.INSTANCE.otherMethods();
            //System.out.printf("Thread#%s : in call\n", tid);

            PrintWriter echoWriter = new PrintWriter(client.getOutputStream(),true);

            return "";
        }
    }

    public static void mainTask()  {

        try(Socket client = new Socket("localhost",12345);)
        {
            List<Future<String>> results = new ArrayList<Future<String>>();
            ExecutorService es = Executors.newCachedThreadPool();
            for (int i=0; i<50; i++) {
                results.add(es.submit(new Task(client, i)));
            }

            for (Future<String> ss: results) {
                System.out.println(ss.get());
            }

            Thread.sleep(1000);
            client.close();
            //your Server Source Channel close listener will notify you from here
            Thread.sleep(1000);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        mainTask();
    }

}

