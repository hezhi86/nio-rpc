package com.app.main;

import com.app.rpc.NioServer;

/**
 * Created by hank on 8/1/18.
 */
public class ServerMain {

    public static void main(String args[]) throws Exception {
        NioServer nioServer = new NioServer(12345);
        nioServer.start();
    }
}
