package com.examples.simpleEcho;


import org.xnio.*;

import java.io.PrintWriter;
import java.net.Socket;


/**
 * Created by hank on 7/4/18.
 */
public class SimpleEchoClient {

    public static void main(String[] args) throws Exception {

        try(Socket client = new Socket("localhost",12345);)
        {
            PrintWriter echoWriter = new PrintWriter(client.getOutputStream(),true);
            echoWriter.println("Hello");
            Thread.sleep(1000);
            client.close();
            //your Server Source Channel close listener will notify you from here
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

