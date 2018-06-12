package io.undertow.client;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.Generated;
import java.lang.String;
import java.io.IOException;
import java.util.Arrays;
import java.net.URI;
import java.lang.IllegalArgumentException;
import io.undertow.util.HttpString;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2018-05-25T09:28:40+1000")
public class UndertowClientMessages_$bundle implements UndertowClientMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected UndertowClientMessages_$bundle() {}
    public static final UndertowClientMessages_$bundle INSTANCE = new UndertowClientMessages_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String connectionClosed = "UT001000: Connection closed";
    protected String connectionClosed$str() {
        return connectionClosed;
    }
    @Override
    public final String connectionClosed() {
        return String.format(getLoggingLocale(), connectionClosed$str());
    }
    private static final String requestAlreadyWritten = "UT001001: Request already written";
    protected String requestAlreadyWritten$str() {
        return requestAlreadyWritten;
    }
    @Override
    public final IllegalStateException requestAlreadyWritten() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), requestAlreadyWritten$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToUpgradeChannel = "UT001020: Failed to upgrade channel due to response %s (%s)";
    protected String failedToUpgradeChannel$str() {
        return failedToUpgradeChannel;
    }
    @Override
    public final String failedToUpgradeChannel(final int responseCode, final String reason) {
        return String.format(getLoggingLocale(), failedToUpgradeChannel$str(), responseCode, reason);
    }
    private static final String illegalContentLength = "UT001030: invalid content length %d";
    protected String illegalContentLength$str() {
        return illegalContentLength;
    }
    @Override
    public final IllegalArgumentException illegalContentLength(final long length) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalContentLength$str(), length));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unknownScheme = "UT001031: Unknown scheme in URI %s";
    protected String unknownScheme$str() {
        return unknownScheme;
    }
    @Override
    public final IllegalArgumentException unknownScheme(final URI uri) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownScheme$str(), uri));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unknownTransferEncoding = "UT001032: Unknown transfer encoding %s";
    protected String unknownTransferEncoding$str() {
        return unknownTransferEncoding;
    }
    @Override
    public final IOException unknownTransferEncoding(final String transferEncodingString) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unknownTransferEncoding$str(), transferEncodingString));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidConnectionState = "UT001033: Invalid connection state";
    protected String invalidConnectionState$str() {
        return invalidConnectionState;
    }
    @Override
    public final IOException invalidConnectionState() {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidConnectionState$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unknownAjpMessageType = "UT001034: Unknown AJP packet type %s";
    protected String unknownAjpMessageType$str() {
        return unknownAjpMessageType;
    }
    @Override
    public final IOException unknownAjpMessageType(final byte packetType) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unknownAjpMessageType$str(), packetType));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unknownMethod = "UT001035: Unknown method type for AJP request %s";
    protected String unknownMethod$str() {
        return unknownMethod;
    }
    @Override
    public final IOException unknownMethod(final HttpString method) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unknownMethod$str(), method));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String dataStillRemainingInChunk = "UT001036: Data still remaining in chunk %s";
    protected String dataStillRemainingInChunk$str() {
        return dataStillRemainingInChunk;
    }
    @Override
    public final IOException dataStillRemainingInChunk(final long remaining) {
        final IOException result = new IOException(String.format(getLoggingLocale(), dataStillRemainingInChunk$str(), remaining));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String wrongMagicNumber = "UT001037: Wrong magic number, expected %s, actual %s";
    protected String wrongMagicNumber$str() {
        return wrongMagicNumber;
    }
    @Override
    public final IOException wrongMagicNumber(final String expected, final String actual) {
        final IOException result = new IOException(String.format(getLoggingLocale(), wrongMagicNumber$str(), expected, actual));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String receivedInvalidChunk = "UT001038: Received invalid AJP chunk %s with response already complete";
    protected String receivedInvalidChunk$str() {
        return receivedInvalidChunk;
    }
    @Override
    public final IOException receivedInvalidChunk(final byte prefix) {
        final IOException result = new IOException(String.format(getLoggingLocale(), receivedInvalidChunk$str(), prefix));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
}
