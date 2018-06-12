/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.undertow.protocols.alpn;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;

//import org.eclipse.jetty.alpn.ALPN;

/**
 * Jetty ALPN implementation. This is the lowest priority
 *
 * @author Stuart Douglas
 */
public class JettyAlpnProvider  {

    private static final String PROTOCOL_KEY = JettyAlpnProvider.class.getName() + ".protocol";

    private static final boolean ENABLED;

    static {
        ENABLED = AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
            @Override
            public Boolean run() {
                try {
                    Class.forName("org.eclipse.jetty.alpn.ALPN", true, JettyAlpnProvider.class.getClassLoader());
                    return true;
                } catch (ClassNotFoundException e) {
                    return false;
                }
            }
        });
    }


}
