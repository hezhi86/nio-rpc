package io.undertow.websockets.core;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.Generated;
import java.io.UnsupportedEncodingException;
import io.undertow.websockets.core.WebSocketFrameCorruptedException;
import java.io.IOException;
import java.lang.String;
import java.util.zip.DataFormatException;
import io.undertow.websockets.core.WebSocketInvalidCloseCodeException;
import io.undertow.websockets.core.WebSocketFrameType;
import io.undertow.websockets.core.WebSocketHandshakeException;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2018-05-25T09:28:40+1000")
public class WebSocketMessages_$bundle implements WebSocketMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected WebSocketMessages_$bundle() {}
    public static final WebSocketMessages_$bundle INSTANCE = new WebSocketMessages_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String channelClosed = "UT002002: Channel is closed";
    protected String channelClosed$str() {
        return channelClosed;
    }
    @Override
    public final IOException channelClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), channelClosed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidTextFrameEncoding = "UT002003: Text frame contains non UTF-8 data";
    protected String invalidTextFrameEncoding$str() {
        return invalidTextFrameEncoding;
    }
    @Override
    public final UnsupportedEncodingException invalidTextFrameEncoding() {
        final UnsupportedEncodingException result = new UnsupportedEncodingException(String.format(getLoggingLocale(), invalidTextFrameEncoding$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String fragmentedControlFrame = "UT002005: Fragmented control frame";
    protected String fragmentedControlFrame$str() {
        return fragmentedControlFrame;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException fragmentedControlFrame() {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), fragmentedControlFrame$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String toBigControlFrame = "UT002006: Control frame with payload length > 125 octets";
    protected String toBigControlFrame$str() {
        return toBigControlFrame;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException toBigControlFrame() {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), toBigControlFrame$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String reservedOpCodeInControlFrame = "UT002007: Control frame using reserved opcode = %s";
    protected String reservedOpCodeInControlFrame$str() {
        return reservedOpCodeInControlFrame;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException reservedOpCodeInControlFrame(final int opCode) {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), reservedOpCodeInControlFrame$str(), opCode));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String controlFrameWithPayloadLen1 = "UT002008: Received close control frame with payload len 1";
    protected String controlFrameWithPayloadLen1$str() {
        return controlFrameWithPayloadLen1;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException controlFrameWithPayloadLen1() {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), controlFrameWithPayloadLen1$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String reservedOpCodeInDataFrame = "UT002009: Data frame using reserved opcode = %s";
    protected String reservedOpCodeInDataFrame$str() {
        return reservedOpCodeInDataFrame;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException reservedOpCodeInDataFrame(final int opCode) {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), reservedOpCodeInDataFrame$str(), opCode));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String continuationFrameOutsideFragmented = "UT002010: Received continuation data frame outside fragmented message";
    protected String continuationFrameOutsideFragmented$str() {
        return continuationFrameOutsideFragmented;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException continuationFrameOutsideFragmented() {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), continuationFrameOutsideFragmented$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String nonContinuationFrameInsideFragmented = "UT002011: Received non-continuation data frame while inside fragmented message";
    protected String nonContinuationFrameInsideFragmented$str() {
        return nonContinuationFrameInsideFragmented;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException nonContinuationFrameInsideFragmented() {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), nonContinuationFrameInsideFragmented$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unsupportedOpCode = "UT002013: Cannot decode web socket frame with opcode: %s";
    protected String unsupportedOpCode$str() {
        return unsupportedOpCode;
    }
    @Override
    public final IllegalStateException unsupportedOpCode(final int opCode) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedOpCode$str(), opCode));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unsupportedFrameType = "UT002014: WebSocketFrameType %s is not supported by this WebSocketChannel\"";
    protected String unsupportedFrameType$str() {
        return unsupportedFrameType;
    }
    @Override
    public final IllegalArgumentException unsupportedFrameType(final io.undertow.websockets.core.WebSocketFrameType type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedFrameType$str(), type));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String extensionsNotAllowed = "UT002015: Extensions not allowed but received rsv of %s";
    protected String extensionsNotAllowed$str() {
        return extensionsNotAllowed;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException extensionsNotAllowed(final int rsv) {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), extensionsNotAllowed$str(), rsv));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unsupportedProtocol = "UT002016: Could not find supported protocol in request list %s. Supported protocols are %s";
    protected String unsupportedProtocol$str() {
        return unsupportedProtocol;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketHandshakeException unsupportedProtocol(final String requestedSubprotocols, final java.util.Collection<String> subprotocols) {
        final io.undertow.websockets.core.WebSocketHandshakeException result = new io.undertow.websockets.core.WebSocketHandshakeException(String.format(getLoggingLocale(), unsupportedProtocol$str(), requestedSubprotocols, subprotocols));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidPayloadLengthForPing = "UT002019: Invalid payload for PING (payload length must be <= 125, was %s)";
    protected String invalidPayloadLengthForPing$str() {
        return invalidPayloadLengthForPing;
    }
    @Override
    public final IllegalArgumentException invalidPayloadLengthForPing(final long payloadLength) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidPayloadLengthForPing$str(), payloadLength));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String extensionsNotSupported = "UT002023: Extensions not supported";
    protected String extensionsNotSupported$str() {
        return extensionsNotSupported;
    }
    @Override
    public final UnsupportedOperationException extensionsNotSupported() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), extensionsNotSupported$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidCloseFrameStatusCode = "UT002026: Invalid close frame status code: %s";
    protected String invalidCloseFrameStatusCode$str() {
        return invalidCloseFrameStatusCode;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketInvalidCloseCodeException invalidCloseFrameStatusCode(final int statusCode) {
        final io.undertow.websockets.core.WebSocketInvalidCloseCodeException result = new io.undertow.websockets.core.WebSocketInvalidCloseCodeException(String.format(getLoggingLocale(), invalidCloseFrameStatusCode$str(), statusCode));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String streamIsBroken = "UT002027: Could not send data, as the underlying web socket connection has been broken";
    protected String streamIsBroken$str() {
        return streamIsBroken;
    }
    @Override
    public final IOException streamIsBroken() {
        final IOException result = new IOException(String.format(getLoggingLocale(), streamIsBroken$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String frameNotMasked = "UT002034: Web socket frame was not masked";
    protected String frameNotMasked$str() {
        return frameNotMasked;
    }
    @Override
    public final io.undertow.websockets.core.WebSocketFrameCorruptedException frameNotMasked() {
        final io.undertow.websockets.core.WebSocketFrameCorruptedException result = new io.undertow.websockets.core.WebSocketFrameCorruptedException(String.format(getLoggingLocale(), frameNotMasked$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noWebSocketUpgradeHeader = "UT002035: The response did not contain an 'Upgrade: websocket' header";
    protected String noWebSocketUpgradeHeader$str() {
        return noWebSocketUpgradeHeader;
    }
    @Override
    public final IOException noWebSocketUpgradeHeader() {
        final IOException result = new IOException(String.format(getLoggingLocale(), noWebSocketUpgradeHeader$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noWebSocketConnectionHeader = "UT002036: The response did not contain a 'Connection: upgrade' header";
    protected String noWebSocketConnectionHeader$str() {
        return noWebSocketConnectionHeader;
    }
    @Override
    public final IOException noWebSocketConnectionHeader() {
        final IOException result = new IOException(String.format(getLoggingLocale(), noWebSocketConnectionHeader$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String webSocketAcceptKeyMismatch = "UT002037: Sec-WebSocket-Accept mismatch, expecting %s, received %s";
    protected String webSocketAcceptKeyMismatch$str() {
        return webSocketAcceptKeyMismatch;
    }
    @Override
    public final IOException webSocketAcceptKeyMismatch(final String dKey, final String acceptKey) {
        final IOException result = new IOException(String.format(getLoggingLocale(), webSocketAcceptKeyMismatch$str(), dKey, acceptKey));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String messageToBig = "UT002040: Message exceeded max message size of %s";
    protected String messageToBig$str() {
        return messageToBig;
    }
    @Override
    public final String messageToBig(final long maxMessageSize) {
        return String.format(getLoggingLocale(), messageToBig$str(), maxMessageSize);
    }
    private static final String badCompressedPayload = "UT002044: Compressed message payload is corrupted";
    protected String badCompressedPayload$str() {
        return badCompressedPayload;
    }
    @Override
    public final IOException badCompressedPayload(final DataFormatException cause) {
        final IOException result = new IOException(String.format(getLoggingLocale(), badCompressedPayload$str()), cause);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToSendOnNewChannel = "UT002045: Unable to send on newly created channel!";
    protected String unableToSendOnNewChannel$str() {
        return unableToSendOnNewChannel;
    }
    @Override
    public final IllegalStateException unableToSendOnNewChannel() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToSendOnNewChannel$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
}
