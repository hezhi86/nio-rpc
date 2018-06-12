package io.undertow.websockets.core;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import io.undertow.websockets.WebSocketExtension.Parameter;
import java.lang.Object;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2018-05-25T09:28:40+1000")
public class WebSocketLogger_$logger extends DelegatingBasicLogger implements WebSocketLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = WebSocketLogger_$logger.class.getName();
    public WebSocketLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void decodingFrameWithOpCode(final int opCode) {
        super.log.logf(FQCN, DEBUG, null, decodingFrameWithOpCode$str(), opCode);
    }
    private static final String decodingFrameWithOpCode = "UT025003: Decoding WebSocket Frame with opCode %s";
    protected String decodingFrameWithOpCode$str() {
        return decodingFrameWithOpCode;
    }
    @Override
    public final void unhandledErrorInAnnotatedEndpoint(final Object instance, final Throwable thr) {
        super.log.logf(FQCN, ERROR, thr, unhandledErrorInAnnotatedEndpoint$str(), instance);
    }
    private static final String unhandledErrorInAnnotatedEndpoint = "UT025007: Unhandled exception for annotated endpoint %s";
    protected String unhandledErrorInAnnotatedEndpoint$str() {
        return unhandledErrorInAnnotatedEndpoint;
    }
    @Override
    public final void incorrectExtensionParameter(final Parameter param) {
        super.log.logf(FQCN, WARN, null, incorrectExtensionParameter$str(), param);
    }
    private static final String incorrectExtensionParameter = "UT025008: Incorrect parameter %s for extension";
    protected String incorrectExtensionParameter$str() {
        return incorrectExtensionParameter;
    }
}
