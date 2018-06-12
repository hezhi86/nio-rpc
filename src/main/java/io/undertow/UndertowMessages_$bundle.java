package io.undertow;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.nio.channels.ClosedChannelException;
import java.io.Serializable;
import javax.annotation.Generated;
import io.undertow.util.ParameterLimitException;
import io.undertow.protocols.http2.HpackException;
import io.undertow.security.api.AuthenticationMechanism;
import io.undertow.server.RequestTooBigException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.lang.String;
import java.io.IOException;
import java.lang.Exception;
import javax.net.ssl.SSLHandshakeException;
import java.lang.RuntimeException;
import java.lang.NullPointerException;
import io.undertow.server.handlers.form.MultiPartParserDefinition.FileTooLargeException;
import java.lang.Long;
import io.undertow.util.BadRequestException;
import java.lang.Object;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import io.undertow.util.HttpString;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2018-05-25T09:28:40+1000")
public class UndertowMessages_$bundle implements UndertowMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected UndertowMessages_$bundle() {}
    public static final UndertowMessages_$bundle INSTANCE = new UndertowMessages_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    private static final String maximumConcurrentRequestsMustBeLargerThanZero = "UT000001: Maximum concurrent requests must be larger than zero.";
    protected String maximumConcurrentRequestsMustBeLargerThanZero$str() {
        return maximumConcurrentRequestsMustBeLargerThanZero;
    }
    @Override
    public final IllegalArgumentException maximumConcurrentRequestsMustBeLargerThanZero() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), maximumConcurrentRequestsMustBeLargerThanZero$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String responseAlreadyStarted = "UT000002: The response has already been started";
    protected String responseAlreadyStarted$str() {
        return responseAlreadyStarted;
    }
    @Override
    public final IllegalStateException responseAlreadyStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), responseAlreadyStarted$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String responseChannelAlreadyProvided = "UT000004: getResponseChannel() has already been called";
    protected String responseChannelAlreadyProvided$str() {
        return responseChannelAlreadyProvided;
    }
    @Override
    public final IllegalStateException responseChannelAlreadyProvided() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), responseChannelAlreadyProvided$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String requestChannelAlreadyProvided = "UT000005: getRequestChannel() has already been called";
    protected String requestChannelAlreadyProvided$str() {
        return requestChannelAlreadyProvided;
    }
    @Override
    public final IllegalStateException requestChannelAlreadyProvided() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), requestChannelAlreadyProvided$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String handlerCannotBeNull = "UT000008: Handler cannot be null";
    protected String handlerCannotBeNull$str() {
        return handlerCannotBeNull;
    }
    @Override
    public final IllegalArgumentException handlerCannotBeNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), handlerCannotBeNull$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String pathMustBeSpecified = "UT000009: Path must be specified";
    protected String pathMustBeSpecified$str() {
        return pathMustBeSpecified;
    }
    @Override
    public final IllegalArgumentException pathMustBeSpecified() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), pathMustBeSpecified$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String sessionIsInvalid = "UT000010: Session is invalid %s";
    protected String sessionIsInvalid$str() {
        return sessionIsInvalid;
    }
    @Override
    public final IllegalStateException sessionIsInvalid(final String sessionId) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), sessionIsInvalid$str(), sessionId));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String sessionManagerMustNotBeNull = "UT000011: Session manager must not be null";
    protected String sessionManagerMustNotBeNull$str() {
        return sessionManagerMustNotBeNull;
    }
    @Override
    public final IllegalStateException sessionManagerMustNotBeNull() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), sessionManagerMustNotBeNull$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String sessionManagerNotFound = "UT000012: Session manager was not attached to the request. Make sure that the SessionAttachmentHandler is installed in the handler chain";
    protected String sessionManagerNotFound$str() {
        return sessionManagerNotFound;
    }
    @Override
    public final IllegalStateException sessionManagerNotFound() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), sessionManagerNotFound$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String argumentCannotBeNull = "UT000013: Argument %s cannot be null";
    protected String argumentCannotBeNull$str() {
        return argumentCannotBeNull;
    }
    @Override
    public final IllegalArgumentException argumentCannotBeNull(final String argument) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), argumentCannotBeNull$str(), argument));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String formValueIsAFile = "UT000017: Form value is a file, use getFile() instead";
    protected String formValueIsAFile$str() {
        return formValueIsAFile;
    }
    @Override
    public final IllegalStateException formValueIsAFile() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), formValueIsAFile$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String formValueIsAString = "UT000018: Form value is a String, use getValue() instead";
    protected String formValueIsAString$str() {
        return formValueIsAString;
    }
    @Override
    public final IllegalStateException formValueIsAString() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), formValueIsAString$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String requestEntityWasTooLarge = "UT000020: Connection terminated as request was larger than %s";
    protected String requestEntityWasTooLarge$str() {
        return requestEntityWasTooLarge;
    }
    @Override
    public final RequestTooBigException requestEntityWasTooLarge(final long size) {
        final RequestTooBigException result = new RequestTooBigException(String.format(getLoggingLocale(), requestEntityWasTooLarge$str(), size));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String sessionAlreadyInvalidated = "UT000021: Session already invalidated";
    protected String sessionAlreadyInvalidated$str() {
        return sessionAlreadyInvalidated;
    }
    @Override
    public final IllegalStateException sessionAlreadyInvalidated() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), sessionAlreadyInvalidated$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String hashAlgorithmNotFound = "UT000022: The specified hash algorithm '%s' can not be found.";
    protected String hashAlgorithmNotFound$str() {
        return hashAlgorithmNotFound;
    }
    @Override
    public final IllegalArgumentException hashAlgorithmNotFound(final String algorithmName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), hashAlgorithmNotFound$str(), algorithmName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidBase64Token = "UT000023: An invalid Base64 token has been received.";
    protected String invalidBase64Token$str() {
        return invalidBase64Token;
    }
    @Override
    public final IllegalArgumentException invalidBase64Token(final IOException cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidBase64Token$str()), cause);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNonceReceived = "UT000024: An invalidly formatted nonce has been received.";
    protected String invalidNonceReceived$str() {
        return invalidNonceReceived;
    }
    @Override
    public final IllegalArgumentException invalidNonceReceived() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidNonceReceived$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unexpectedTokenInHeader = "UT000025: Unexpected token '%s' within header.";
    protected String unexpectedTokenInHeader$str() {
        return unexpectedTokenInHeader;
    }
    @Override
    public final IllegalArgumentException unexpectedTokenInHeader(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unexpectedTokenInHeader$str(), name));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidHeader = "UT000026: Invalid header received.";
    protected String invalidHeader$str() {
        return invalidHeader;
    }
    @Override
    public final IllegalArgumentException invalidHeader() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidHeader$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String couldNotFindSessionCookieConfig = "UT000027: Could not find session cookie config in the request";
    protected String couldNotFindSessionCookieConfig$str() {
        return couldNotFindSessionCookieConfig;
    }
    @Override
    public final IllegalStateException couldNotFindSessionCookieConfig() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotFindSessionCookieConfig$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String chunkedChannelClosedMidChunk = "UT000029: Channel was closed mid chunk, if you have attempted to write chunked data you cannot shutdown the channel until after it has all been written.";
    protected String chunkedChannelClosedMidChunk$str() {
        return chunkedChannelClosedMidChunk;
    }
    @Override
    public final IOException chunkedChannelClosedMidChunk() {
        final IOException result = new IOException(String.format(getLoggingLocale(), chunkedChannelClosedMidChunk$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String userAuthenticated = "UT000030: User %s successfully authenticated.";
    protected String userAuthenticated$str() {
        return userAuthenticated;
    }
    @Override
    public final String userAuthenticated(final String userName) {
        return String.format(getLoggingLocale(), userAuthenticated$str(), userName);
    }
    private static final String userLoggedOut = "UT000031: User %s has logged out.";
    protected String userLoggedOut$str() {
        return userLoggedOut;
    }
    @Override
    public final String userLoggedOut(final String userName) {
        return String.format(getLoggingLocale(), userLoggedOut$str(), userName);
    }
    private static final String streamIsClosed = "UT000034: Stream is closed";
    protected String streamIsClosed$str() {
        return streamIsClosed;
    }
    @Override
    public final IOException streamIsClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), streamIsClosed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String startBlockingHasNotBeenCalled = "UT000035: Cannot get stream as startBlocking has not been invoked";
    protected String startBlockingHasNotBeenCalled$str() {
        return startBlockingHasNotBeenCalled;
    }
    @Override
    public final IllegalStateException startBlockingHasNotBeenCalled() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), startBlockingHasNotBeenCalled$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String connectionTerminatedReadingMultiPartData = "UT000036: Connection terminated parsing multipart data";
    protected String connectionTerminatedReadingMultiPartData$str() {
        return connectionTerminatedReadingMultiPartData;
    }
    @Override
    public final IOException connectionTerminatedReadingMultiPartData() {
        final IOException result = new IOException(String.format(getLoggingLocale(), connectionTerminatedReadingMultiPartData$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToParsePath = "UT000037: Failed to parse path in HTTP request";
    protected String failedToParsePath$str() {
        return failedToParsePath;
    }
    @Override
    public final RuntimeException failedToParsePath() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToParsePath$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String authenticationFailed = "UT000038: Authentication failed, requested user name '%s'";
    protected String authenticationFailed$str() {
        return authenticationFailed;
    }
    @Override
    public final String authenticationFailed(final String userName) {
        return String.format(getLoggingLocale(), authenticationFailed$str(), userName);
    }
    private static final String tooManyQueryParameters = "UT000039: Too many query parameters, cannot have more than %s query parameters";
    protected String tooManyQueryParameters$str() {
        return tooManyQueryParameters;
    }
    @Override
    public final BadRequestException tooManyQueryParameters(final int noParams) {
        final BadRequestException result = new BadRequestException(String.format(getLoggingLocale(), tooManyQueryParameters$str(), noParams));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String tooManyHeaders = "UT000040: Too many headers, cannot have more than %s header";
    protected String tooManyHeaders$str() {
        return tooManyHeaders;
    }
    @Override
    public final String tooManyHeaders(final int noParams) {
        return String.format(getLoggingLocale(), tooManyHeaders$str(), noParams);
    }
    private static final String channelIsClosed = "UT000041: Channel is closed";
    protected String channelIsClosed$str() {
        return channelIsClosed;
    }
    @Override
    public final ClosedChannelException channelIsClosed() {
        final ClosedChannelException result = new ClosedChannelException();
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String couldNotDecodeTrailers = "UT000042: Could not decode trailers in HTTP request";
    protected String couldNotDecodeTrailers$str() {
        return couldNotDecodeTrailers;
    }
    @Override
    public final IOException couldNotDecodeTrailers() {
        final IOException result = new IOException(String.format(getLoggingLocale(), couldNotDecodeTrailers$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String dataAlreadyQueued = "UT000043: Data is already being sent. You must wait for the completion callback to be be invoked before calling send() again";
    protected String dataAlreadyQueued$str() {
        return dataAlreadyQueued;
    }
    @Override
    public final IllegalStateException dataAlreadyQueued() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), dataAlreadyQueued$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String moreThanOnePredicateWithName = "UT000044: More than one predicate with name %s. Builder class %s and %s";
    protected String moreThanOnePredicateWithName$str() {
        return moreThanOnePredicateWithName;
    }
    @Override
    public final IllegalStateException moreThanOnePredicateWithName(final String name, final Class<? extends io.undertow.predicate.PredicateBuilder> aClass, final Class<? extends io.undertow.predicate.PredicateBuilder> existing) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), moreThanOnePredicateWithName$str(), name, aClass, existing));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String errorParsingPredicateString = "UT000045: Error parsing predicated handler string %s:%n%s";
    protected String errorParsingPredicateString$str() {
        return errorParsingPredicateString;
    }
    @Override
    public final IllegalArgumentException errorParsingPredicateString(final String reason, final String s) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), errorParsingPredicateString$str(), reason, s));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String tooManyCookies = "UT000046: The number of cookies sent exceeded the maximum of %s";
    protected String tooManyCookies$str() {
        return tooManyCookies;
    }
    @Override
    public final IllegalStateException tooManyCookies(final int maxCookies) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), tooManyCookies$str(), maxCookies));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String tooManyParameters = "UT000047: The number of parameters exceeded the maximum of %s";
    protected String tooManyParameters$str() {
        return tooManyParameters;
    }
    @Override
    public final ParameterLimitException tooManyParameters(final int maxValues) {
        final ParameterLimitException result = new ParameterLimitException(String.format(getLoggingLocale(), tooManyParameters$str(), maxValues));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noRequestActive = "UT000048: No request is currently active";
    protected String noRequestActive$str() {
        return noRequestActive;
    }
    @Override
    public final IllegalStateException noRequestActive() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noRequestActive$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String authMechanismOutcomeNull = "UT000050: AuthenticationMechanism Outcome is null";
    protected String authMechanismOutcomeNull$str() {
        return authMechanismOutcomeNull;
    }
    @Override
    public final IllegalStateException authMechanismOutcomeNull() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), authMechanismOutcomeNull$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String notAValidIpPattern = "UT000051: Not a valid IP pattern %s";
    protected String notAValidIpPattern$str() {
        return notAValidIpPattern;
    }
    @Override
    public final IllegalArgumentException notAValidIpPattern(final String peer) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAValidIpPattern$str(), peer));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noSessionData = "UT000052: Session data requested when non session based authentication in use";
    protected String noSessionData$str() {
        return noSessionData;
    }
    @Override
    public final IllegalStateException noSessionData() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noSessionData$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String listenerAlreadyRegistered = "UT000053: Listener %s already registered";
    protected String listenerAlreadyRegistered$str() {
        return listenerAlreadyRegistered;
    }
    @Override
    public final IllegalArgumentException listenerAlreadyRegistered(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), listenerAlreadyRegistered$str(), name));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String maxFileSizeExceeded = "UT000054: The maximum size %s for an individual file in a multipart request was exceeded";
    protected String maxFileSizeExceeded$str() {
        return maxFileSizeExceeded;
    }
    @Override
    public final FileTooLargeException maxFileSizeExceeded(final long maxIndividualFileSize) {
        final FileTooLargeException result = new FileTooLargeException(String.format(getLoggingLocale(), maxFileSizeExceeded$str(), maxIndividualFileSize));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String couldNotSetAttribute = "UT000055: Could not set attribute %s to %s as it is read only";
    protected String couldNotSetAttribute$str() {
        return couldNotSetAttribute;
    }
    @Override
    public final String couldNotSetAttribute(final String attributeName, final String newValue) {
        return String.format(getLoggingLocale(), couldNotSetAttribute$str(), attributeName, newValue);
    }
    private static final String couldNotParseUriTemplate = "UT000056: Could not parse URI template %s, exception at char %s";
    protected String couldNotParseUriTemplate$str() {
        return couldNotParseUriTemplate;
    }
    @Override
    public final RuntimeException couldNotParseUriTemplate(final String path, final int i) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotParseUriTemplate$str(), path, i));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String mismatchedBraces = "UT000057: Mismatched braces in attribute string %s";
    protected String mismatchedBraces$str() {
        return mismatchedBraces;
    }
    @Override
    public final RuntimeException mismatchedBraces(final String valueString) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), mismatchedBraces$str(), valueString));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String moreThanOneHandlerWithName = "UT000058: More than one handler with name %s. Builder class %s and %s";
    protected String moreThanOneHandlerWithName$str() {
        return moreThanOneHandlerWithName;
    }
    @Override
    public final IllegalStateException moreThanOneHandlerWithName(final String name, final Class<? extends io.undertow.server.handlers.builder.HandlerBuilder> aClass, final Class<? extends io.undertow.server.handlers.builder.HandlerBuilder> existing) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), moreThanOneHandlerWithName$str(), name, aClass, existing));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String outOfBandResponseOnlyAllowedFor100Continue = "UT000061: Out of band responses only allowed for 100-continue requests";
    protected String outOfBandResponseOnlyAllowedFor100Continue$str() {
        return outOfBandResponseOnlyAllowedFor100Continue;
    }
    @Override
    public final IllegalArgumentException outOfBandResponseOnlyAllowedFor100Continue() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), outOfBandResponseOnlyAllowedFor100Continue$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String sslWasNull = "UT000065: SSL must be specified to connect to a https URL";
    protected String sslWasNull$str() {
        return sslWasNull;
    }
    @Override
    public final IOException sslWasNull() {
        final IOException result = new IOException(String.format(getLoggingLocale(), sslWasNull$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String wrongMagicNumber = "UT000066: Incorrect magic number %s for AJP packet header";
    protected String wrongMagicNumber$str() {
        return wrongMagicNumber;
    }
    @Override
    public final IOException wrongMagicNumber(final int number) {
        final IOException result = new IOException(String.format(getLoggingLocale(), wrongMagicNumber$str(), number));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String peerUnverified = "UT000067: No client cert was provided";
    protected String peerUnverified$str() {
        return peerUnverified;
    }
    @Override
    public final SSLPeerUnverifiedException peerUnverified() {
        final SSLPeerUnverifiedException result = new SSLPeerUnverifiedException(String.format(getLoggingLocale(), peerUnverified$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String servletPathMatchFailed = "UT000068: Servlet path match failed";
    protected String servletPathMatchFailed$str() {
        return servletPathMatchFailed;
    }
    @Override
    public final IllegalArgumentException servletPathMatchFailed() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), servletPathMatchFailed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String couldNotParseCookie = "UT000069: Could not parse set cookie header %s";
    protected String couldNotParseCookie$str() {
        return couldNotParseCookie;
    }
    @Override
    public final IllegalArgumentException couldNotParseCookie(final String headerValue) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), couldNotParseCookie$str(), headerValue));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String canOnlyBeCalledByIoThread = "UT000070: method can only be called by IO thread";
    protected String canOnlyBeCalledByIoThread$str() {
        return canOnlyBeCalledByIoThread;
    }
    @Override
    public final IllegalStateException canOnlyBeCalledByIoThread() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), canOnlyBeCalledByIoThread$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String matcherAlreadyContainsTemplate = "UT000071: Cannot add path template %s, matcher already contains an equivalent pattern %s";
    protected String matcherAlreadyContainsTemplate$str() {
        return matcherAlreadyContainsTemplate;
    }
    @Override
    public final IllegalStateException matcherAlreadyContainsTemplate(final String templateString, final String templateString1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), matcherAlreadyContainsTemplate$str(), templateString, templateString1));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToDecodeURL = "UT000072: Failed to decode url %s to charset %s";
    protected String failedToDecodeURL$str() {
        return failedToDecodeURL;
    }
    @Override
    public final IllegalArgumentException failedToDecodeURL(final String s, final String enc, final Exception e) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedToDecodeURL$str(), s, enc), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String resourceChangeListenerNotSupported = "UT000073: Resource change listeners are not supported";
    protected String resourceChangeListenerNotSupported$str() {
        return resourceChangeListenerNotSupported;
    }
    @Override
    public final IllegalArgumentException resourceChangeListenerNotSupported() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), resourceChangeListenerNotSupported$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String objectWasFreed = "UT000075: Object was freed";
    protected String objectWasFreed$str() {
        return objectWasFreed;
    }
    @Override
    public final IllegalStateException objectWasFreed() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), objectWasFreed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String handlerNotShutdown = "UT000076: Handler not shutdown";
    protected String handlerNotShutdown$str() {
        return handlerNotShutdown;
    }
    @Override
    public final IllegalStateException handlerNotShutdown() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), handlerNotShutdown$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String upgradeNotSupported = "UT000077: The underlying transport does not support HTTP upgrade";
    protected String upgradeNotSupported$str() {
        return upgradeNotSupported;
    }
    @Override
    public final IllegalStateException upgradeNotSupported() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), upgradeNotSupported$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String renegotiationNotSupported = "UT000078: Renegotiation not supported";
    protected String renegotiationNotSupported$str() {
        return renegotiationNotSupported;
    }
    @Override
    public final IOException renegotiationNotSupported() {
        final IOException result = new IOException(String.format(getLoggingLocale(), renegotiationNotSupported$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String notAValidRegularExpressionPattern = "UT000080: Not a valid regular expression pattern %s";
    protected String notAValidRegularExpressionPattern$str() {
        return notAValidRegularExpressionPattern;
    }
    @Override
    public final IllegalArgumentException notAValidRegularExpressionPattern(final String pattern) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAValidRegularExpressionPattern$str(), pattern));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String badRequest = "UT000081: Bad request";
    protected String badRequest$str() {
        return badRequest;
    }
    @Override
    public final BadRequestException badRequest() {
        final BadRequestException result = new BadRequestException(String.format(getLoggingLocale(), badRequest$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String hostAlreadyRegistered = "UT000082: Host %s already registered";
    protected String hostAlreadyRegistered$str() {
        return hostAlreadyRegistered;
    }
    @Override
    public final RuntimeException hostAlreadyRegistered(final Object host) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), hostAlreadyRegistered$str(), host));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String hostHasNotBeenRegistered = "UT000083: Host %s has not been registered";
    protected String hostHasNotBeenRegistered$str() {
        return hostHasNotBeenRegistered;
    }
    @Override
    public final RuntimeException hostHasNotBeenRegistered(final Object host) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), hostHasNotBeenRegistered$str(), host));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String extraDataWrittenAfterChunkEnd = "UT000084: Attempted to write additional data after the last chunk";
    protected String extraDataWrittenAfterChunkEnd$str() {
        return extraDataWrittenAfterChunkEnd;
    }
    @Override
    public final IOException extraDataWrittenAfterChunkEnd() {
        final IOException result = new IOException(String.format(getLoggingLocale(), extraDataWrittenAfterChunkEnd$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String couldNotGenerateUniqueSessionId = "UT000085: Could not generate unique session id";
    protected String couldNotGenerateUniqueSessionId$str() {
        return couldNotGenerateUniqueSessionId;
    }
    @Override
    public final RuntimeException couldNotGenerateUniqueSessionId() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotGenerateUniqueSessionId$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String controlFrameCannotHaveBodyContent = "UT000088: SPDY control frames cannot have body content";
    protected String controlFrameCannotHaveBodyContent$str() {
        return controlFrameCannotHaveBodyContent;
    }
    @Override
    public final IOException controlFrameCannotHaveBodyContent() {
        final IOException result = new IOException(String.format(getLoggingLocale(), controlFrameCannotHaveBodyContent$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String bufferAlreadyFreed = "UT000091: Buffer has already been freed";
    protected String bufferAlreadyFreed$str() {
        return bufferAlreadyFreed;
    }
    @Override
    public final IllegalStateException bufferAlreadyFreed() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), bufferAlreadyFreed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String awaitCalledFromIoThread = "UT000094: Blocking await method called from IO thread. Blocking IO must be dispatched to a worker thread or deadlocks will result.";
    protected String awaitCalledFromIoThread$str() {
        return awaitCalledFromIoThread;
    }
    @Override
    public final IOException awaitCalledFromIoThread() {
        final IOException result = new IOException(String.format(getLoggingLocale(), awaitCalledFromIoThread$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String recursiveCallToFlushingSenders = "UT000095: Recursive call to flushSenders()";
    protected String recursiveCallToFlushingSenders$str() {
        return recursiveCallToFlushingSenders;
    }
    @Override
    public final RuntimeException recursiveCallToFlushingSenders() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), recursiveCallToFlushingSenders$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String fixedLengthOverflow = "UT000096: More data was written to the channel than specified in the content-length";
    protected String fixedLengthOverflow$str() {
        return fixedLengthOverflow;
    }
    @Override
    public final IllegalStateException fixedLengthOverflow() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), fixedLengthOverflow$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String ajpRequestAlreadyInProgress = "UT000097: AJP request already in progress";
    protected String ajpRequestAlreadyInProgress$str() {
        return ajpRequestAlreadyInProgress;
    }
    @Override
    public final IllegalStateException ajpRequestAlreadyInProgress() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), ajpRequestAlreadyInProgress$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String httpPingDataMustBeLength8 = "UT000098: HTTP ping data must be 8 bytes in length";
    protected String httpPingDataMustBeLength8$str() {
        return httpPingDataMustBeLength8;
    }
    @Override
    public final String httpPingDataMustBeLength8() {
        return String.format(getLoggingLocale(), httpPingDataMustBeLength8$str());
    }
    private static final String invalidPingSize = "UT000099: Received a ping of size other than 8";
    protected String invalidPingSize$str() {
        return invalidPingSize;
    }
    @Override
    public final String invalidPingSize() {
        return String.format(getLoggingLocale(), invalidPingSize$str());
    }
    private static final String streamIdMustBeZeroForFrameType = "UT000100: stream id must be zero for frame type %s";
    protected String streamIdMustBeZeroForFrameType$str() {
        return streamIdMustBeZeroForFrameType;
    }
    @Override
    public final String streamIdMustBeZeroForFrameType(final int frameType) {
        return String.format(getLoggingLocale(), streamIdMustBeZeroForFrameType$str(), frameType);
    }
    private static final String streamIdMustNotBeZeroForFrameType = "UT000101: stream id must not be zero for frame type %s";
    protected String streamIdMustNotBeZeroForFrameType$str() {
        return streamIdMustNotBeZeroForFrameType;
    }
    @Override
    public final String streamIdMustNotBeZeroForFrameType(final int frameType) {
        return String.format(getLoggingLocale(), streamIdMustNotBeZeroForFrameType$str(), frameType);
    }
    private static final String http2StreamWasReset = "UT000103: Http2 stream was reset";
    protected String http2StreamWasReset$str() {
        return http2StreamWasReset;
    }
    @Override
    public final IOException http2StreamWasReset() {
        final IOException result = new IOException(String.format(getLoggingLocale(), http2StreamWasReset$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String incorrectHttp2Preface = "UT000104: Incorrect HTTP2 preface";
    protected String incorrectHttp2Preface$str() {
        return incorrectHttp2Preface;
    }
    @Override
    public final IOException incorrectHttp2Preface() {
        final IOException result = new IOException(String.format(getLoggingLocale(), incorrectHttp2Preface$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String http2FrameTooLarge = "UT000105: HTTP2 frame to large";
    protected String http2FrameTooLarge$str() {
        return http2FrameTooLarge;
    }
    @Override
    public final IOException http2FrameTooLarge() {
        final IOException result = new IOException(String.format(getLoggingLocale(), http2FrameTooLarge$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String http2ContinuationFrameNotExpected = "UT000106: HTTP2 continuation frame received without a corresponding headers or push promise frame";
    protected String http2ContinuationFrameNotExpected$str() {
        return http2ContinuationFrameNotExpected;
    }
    @Override
    public final IOException http2ContinuationFrameNotExpected() {
        final IOException result = new IOException(String.format(getLoggingLocale(), http2ContinuationFrameNotExpected$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String huffmanEncodedHpackValueDidNotEndWithEOS = "UT000107: Huffman encoded value in HPACK headers did not end with EOS padding";
    protected String huffmanEncodedHpackValueDidNotEndWithEOS$str() {
        return huffmanEncodedHpackValueDidNotEndWithEOS;
    }
    @Override
    public final HpackException huffmanEncodedHpackValueDidNotEndWithEOS() {
        final HpackException result = new HpackException();
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String integerEncodedOverTooManyOctets = "UT000108: HPACK variable length integer encoded over too many octects, max is %s";
    protected String integerEncodedOverTooManyOctets$str() {
        return integerEncodedOverTooManyOctets;
    }
    @Override
    public final HpackException integerEncodedOverTooManyOctets(final int maxIntegerOctets) {
        final HpackException result = new HpackException();
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String zeroNotValidHeaderTableIndex = "UT000109: Zero is not a valid header table index";
    protected String zeroNotValidHeaderTableIndex$str() {
        return zeroNotValidHeaderTableIndex;
    }
    @Override
    public final HpackException zeroNotValidHeaderTableIndex() {
        final HpackException result = new HpackException();
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String cannotSendContinueResponse = "UT000110: Cannot send 100-Continue, getResponseChannel() has already been called";
    protected String cannotSendContinueResponse$str() {
        return cannotSendContinueResponse;
    }
    @Override
    public final IOException cannotSendContinueResponse() {
        final IOException result = new IOException(String.format(getLoggingLocale(), cannotSendContinueResponse$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String parserDidNotMakeProgress = "UT000111: Parser did not make progress";
    protected String parserDidNotMakeProgress$str() {
        return parserDidNotMakeProgress;
    }
    @Override
    public final IOException parserDidNotMakeProgress() {
        final IOException result = new IOException(String.format(getLoggingLocale(), parserDidNotMakeProgress$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String headersStreamCanOnlyBeCreatedByClient = "UT000112: Only client side can call createStream, if you wish to send a PUSH_PROMISE frame use createPushPromiseStream instead";
    protected String headersStreamCanOnlyBeCreatedByClient$str() {
        return headersStreamCanOnlyBeCreatedByClient;
    }
    @Override
    public final IOException headersStreamCanOnlyBeCreatedByClient() {
        final IOException result = new IOException(String.format(getLoggingLocale(), headersStreamCanOnlyBeCreatedByClient$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String pushPromiseCanOnlyBeCreatedByServer = "UT000113: Only the server side can send a push promise stream";
    protected String pushPromiseCanOnlyBeCreatedByServer$str() {
        return pushPromiseCanOnlyBeCreatedByServer;
    }
    @Override
    public final IOException pushPromiseCanOnlyBeCreatedByServer() {
        final IOException result = new IOException(String.format(getLoggingLocale(), pushPromiseCanOnlyBeCreatedByServer$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidAclRule = "UT000114: Invalid IP access control rule %s. Format is: [ip-match] allow|deny";
    protected String invalidAclRule$str() {
        return invalidAclRule;
    }
    @Override
    public final IllegalArgumentException invalidAclRule(final String rule) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidAclRule$str(), rule));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String serverReceivedPushPromise = "UT000115: Server received PUSH_PROMISE frame from client";
    protected String serverReceivedPushPromise$str() {
        return serverReceivedPushPromise;
    }
    @Override
    public final IOException serverReceivedPushPromise() {
        final IOException result = new IOException(String.format(getLoggingLocale(), serverReceivedPushPromise$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String connectNotSupported = "UT000116: CONNECT not supported by this connector";
    protected String connectNotSupported$str() {
        return connectNotSupported;
    }
    @Override
    public final IllegalStateException connectNotSupported() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), connectNotSupported$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String notAConnectRequest = "UT000117: Request was not a CONNECT request";
    protected String notAConnectRequest$str() {
        return notAConnectRequest;
    }
    @Override
    public final IllegalStateException notAConnectRequest() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notAConnectRequest$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String cannotResetBuffer = "UT000118: Cannot reset buffer, response has already been commited";
    protected String cannotResetBuffer$str() {
        return cannotResetBuffer;
    }
    @Override
    public final IllegalStateException cannotResetBuffer() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotResetBuffer$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String http2PriRequestFailed = "UT000119: HTTP2 via prior knowledge failed";
    protected String http2PriRequestFailed$str() {
        return http2PriRequestFailed;
    }
    @Override
    public final IOException http2PriRequestFailed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), http2PriRequestFailed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String outOfBandResponseNotSupported = "UT000120: Out of band responses are not allowed for this connector";
    protected String outOfBandResponseNotSupported$str() {
        return outOfBandResponseNotSupported;
    }
    @Override
    public final IllegalStateException outOfBandResponseNotSupported() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), outOfBandResponseNotSupported$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String tooManySessions = "UT000121: Session was rejected as the maximum number of sessions (%s) has been hit";
    protected String tooManySessions$str() {
        return tooManySessions;
    }
    @Override
    public final IllegalStateException tooManySessions(final int maxSessions) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), tooManySessions$str(), maxSessions));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String proxyConnectionFailed = "UT000122: CONNECT attempt failed as target proxy returned %s";
    protected String proxyConnectionFailed$str() {
        return proxyConnectionFailed;
    }
    @Override
    public final IOException proxyConnectionFailed(final int responseCode) {
        final IOException result = new IOException(String.format(getLoggingLocale(), proxyConnectionFailed$str(), responseCode));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String mcmpMessageRejectedDueToSuspiciousCharacters = "UT000123: MCMP message %s rejected due to suspicious characters";
    protected String mcmpMessageRejectedDueToSuspiciousCharacters$str() {
        return mcmpMessageRejectedDueToSuspiciousCharacters;
    }
    @Override
    public final RuntimeException mcmpMessageRejectedDueToSuspiciousCharacters(final String data) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), mcmpMessageRejectedDueToSuspiciousCharacters$str(), data));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String rengotiationTimedOut = "UT000124: renegotiation timed out";
    protected String rengotiationTimedOut$str() {
        return rengotiationTimedOut;
    }
    @Override
    public final IllegalStateException rengotiationTimedOut() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), rengotiationTimedOut$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String requestBodyAlreadyRead = "UT000125: Request body already read";
    protected String requestBodyAlreadyRead$str() {
        return requestBodyAlreadyRead;
    }
    @Override
    public final IllegalStateException requestBodyAlreadyRead() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), requestBodyAlreadyRead$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String blockingIoFromIOThread = "UT000126: Attempted to do blocking IO from the IO thread. This is prohibited as it may result in deadlocks";
    protected String blockingIoFromIOThread$str() {
        return blockingIoFromIOThread;
    }
    @Override
    public final IllegalStateException blockingIoFromIOThread() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), blockingIoFromIOThread$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String responseComplete = "UT000127: Response has already been sent";
    protected String responseComplete$str() {
        return responseComplete;
    }
    @Override
    public final IllegalStateException responseComplete() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), responseComplete$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String couldNotReadContentLengthData = "UT000128: Remote peer closed connection before all data could be read";
    protected String couldNotReadContentLengthData$str() {
        return couldNotReadContentLengthData;
    }
    @Override
    public final IOException couldNotReadContentLengthData() {
        final IOException result = new IOException(String.format(getLoggingLocale(), couldNotReadContentLengthData$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToSendAfterBeingSafe = "UT000129: Failed to send after being safe to send";
    protected String failedToSendAfterBeingSafe$str() {
        return failedToSendAfterBeingSafe;
    }
    @Override
    public final IllegalStateException failedToSendAfterBeingSafe() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToSendAfterBeingSafe$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String reasonPhraseToLargeForBuffer = "UT000130: HTTP reason phrase was too large for the buffer. Either provide a smaller message or a bigger buffer. Phrase: %s";
    protected String reasonPhraseToLargeForBuffer$str() {
        return reasonPhraseToLargeForBuffer;
    }
    @Override
    public final IllegalStateException reasonPhraseToLargeForBuffer(final String phrase) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), reasonPhraseToLargeForBuffer$str(), phrase));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String poolIsClosed = "UT000131: Buffer pool is closed";
    protected String poolIsClosed$str() {
        return poolIsClosed;
    }
    @Override
    public final IllegalStateException poolIsClosed() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), poolIsClosed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String hpackFailed = "UT000132: HPACK decode failed";
    protected String hpackFailed$str() {
        return hpackFailed;
    }
    @Override
    public final HpackException hpackFailed() {
        final HpackException result = new HpackException();
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String notAnUpgradeRequest = "UT000133: Request did not contain an Upgrade header, upgrade is not permitted";
    protected String notAnUpgradeRequest$str() {
        return notAnUpgradeRequest;
    }
    @Override
    public final IllegalStateException notAnUpgradeRequest() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notAnUpgradeRequest$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String authenticationPropertyNotSet = "UT000134: Authentication mechanism %s requires property %s to be set";
    protected String authenticationPropertyNotSet$str() {
        return authenticationPropertyNotSet;
    }
    @Override
    public final IllegalStateException authenticationPropertyNotSet(final String name, final String header) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), authenticationPropertyNotSet$str(), name, header));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String rengotiationFailed = "UT000135: renegotiation failed";
    protected String rengotiationFailed$str() {
        return rengotiationFailed;
    }
    @Override
    public final IllegalStateException rengotiationFailed() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), rengotiationFailed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String userAgentCharsetMustHaveEvenNumberOfItems = "UT000136: User agent charset string must have an even number of items, in the form pattern,charset,pattern,charset,... Instead got: %s";
    protected String userAgentCharsetMustHaveEvenNumberOfItems$str() {
        return userAgentCharsetMustHaveEvenNumberOfItems;
    }
    @Override
    public final IllegalArgumentException userAgentCharsetMustHaveEvenNumberOfItems(final String supplied) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), userAgentCharsetMustHaveEvenNumberOfItems$str(), supplied));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String datasourceNotFound = "UT000137: Could not find the datasource called %s";
    protected String datasourceNotFound$str() {
        return datasourceNotFound;
    }
    @Override
    public final IllegalArgumentException datasourceNotFound(final String ds) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), datasourceNotFound$str(), ds));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String serverNotStarted = "UT000138: Server not started";
    protected String serverNotStarted$str() {
        return serverNotStarted;
    }
    @Override
    public final IllegalStateException serverNotStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverNotStarted$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String exchangeAlreadyComplete = "UT000139: Exchange already complete";
    protected String exchangeAlreadyComplete$str() {
        return exchangeAlreadyComplete;
    }
    @Override
    public final IllegalStateException exchangeAlreadyComplete() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), exchangeAlreadyComplete$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String notHandshakeRecord = "UT000140: Initial SSL/TLS data is not a handshake record";
    protected String notHandshakeRecord$str() {
        return notHandshakeRecord;
    }
    @Override
    public final SSLHandshakeException notHandshakeRecord() {
        final SSLHandshakeException result = new SSLHandshakeException(String.format(getLoggingLocale(), notHandshakeRecord$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidHandshakeRecord = "UT000141: Initial SSL/TLS handshake record is invalid";
    protected String invalidHandshakeRecord$str() {
        return invalidHandshakeRecord;
    }
    @Override
    public final SSLHandshakeException invalidHandshakeRecord() {
        final SSLHandshakeException result = new SSLHandshakeException(String.format(getLoggingLocale(), invalidHandshakeRecord$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String multiRecordSSLHandshake = "UT000142: Initial SSL/TLS handshake spans multiple records";
    protected String multiRecordSSLHandshake$str() {
        return multiRecordSSLHandshake;
    }
    @Override
    public final SSLHandshakeException multiRecordSSLHandshake() {
        final SSLHandshakeException result = new SSLHandshakeException(String.format(getLoggingLocale(), multiRecordSSLHandshake$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String expectedClientHello = "UT000143: Expected \"client hello\" record";
    protected String expectedClientHello$str() {
        return expectedClientHello;
    }
    @Override
    public final SSLHandshakeException expectedClientHello() {
        final SSLHandshakeException result = new SSLHandshakeException(String.format(getLoggingLocale(), expectedClientHello$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String expectedServerHello = "UT000144: Expected server hello";
    protected String expectedServerHello$str() {
        return expectedServerHello;
    }
    @Override
    public final SSLHandshakeException expectedServerHello() {
        final SSLHandshakeException result = new SSLHandshakeException(String.format(getLoggingLocale(), expectedServerHello$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String tooManyRedirects = "UT000145: Too many redirects";
    protected String tooManyRedirects$str() {
        return tooManyRedirects;
    }
    @Override
    public final IOException tooManyRedirects(final IOException exception) {
        final IOException result = new IOException(String.format(getLoggingLocale(), tooManyRedirects$str()), exception);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String resumedAndDispatched = "UT000146: HttpServerExchange cannot have both async IO resumed and dispatch() called in the same cycle";
    protected String resumedAndDispatched$str() {
        return resumedAndDispatched;
    }
    @Override
    public final IllegalStateException resumedAndDispatched() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), resumedAndDispatched$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noHostInHttp11Request = "UT000147: No host header in a HTTP/1.1 request";
    protected String noHostInHttp11Request$str() {
        return noHostInHttp11Request;
    }
    @Override
    public final IOException noHostInHttp11Request() {
        final IOException result = new IOException(String.format(getLoggingLocale(), noHostInHttp11Request$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidHpackEncoding = "UT000148: Invalid HPack encoding. First byte: %s";
    protected String invalidHpackEncoding$str() {
        return invalidHpackEncoding;
    }
    @Override
    public final HpackException invalidHpackEncoding(final byte b) {
        final HpackException result = new HpackException();
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String newlineNotSupportedInHttpString = "UT000149: HttpString is not allowed to contain newlines. value: %s";
    protected String newlineNotSupportedInHttpString$str() {
        return newlineNotSupportedInHttpString;
    }
    @Override
    public final IllegalArgumentException newlineNotSupportedInHttpString(final String value) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), newlineNotSupportedInHttpString$str(), value));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String pseudoHeaderInWrongOrder = "UT000150: Pseudo header %s received after receiving normal headers. Pseudo headers must be the first headers in a HTTP/2 header block.";
    protected String pseudoHeaderInWrongOrder$str() {
        return pseudoHeaderInWrongOrder;
    }
    @Override
    public final String pseudoHeaderInWrongOrder(final HttpString header) {
        return String.format(getLoggingLocale(), pseudoHeaderInWrongOrder$str(), header);
    }
    private static final String expectedContinuationFrame = "UT000151: Expected to receive a continuation frame";
    protected String expectedContinuationFrame$str() {
        return expectedContinuationFrame;
    }
    @Override
    public final String expectedContinuationFrame() {
        return String.format(getLoggingLocale(), expectedContinuationFrame$str());
    }
    private static final String incorrectFrameSize = "UT000152: Incorrect frame size";
    protected String incorrectFrameSize$str() {
        return incorrectFrameSize;
    }
    @Override
    public final String incorrectFrameSize() {
        return String.format(getLoggingLocale(), incorrectFrameSize$str());
    }
    private static final String streamNotRegistered = "UT000153: Stream id not registered";
    protected String streamNotRegistered$str() {
        return streamNotRegistered;
    }
    @Override
    public final IllegalStateException streamNotRegistered() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), streamNotRegistered$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String sendChallengeReturnedNull = "UT000154: Mechanism %s returned a null result from sendChallenge()";
    protected String sendChallengeReturnedNull$str() {
        return sendChallengeReturnedNull;
    }
    @Override
    public final NullPointerException sendChallengeReturnedNull(final AuthenticationMechanism mechanism) {
        final NullPointerException result = new NullPointerException(String.format(getLoggingLocale(), sendChallengeReturnedNull$str(), mechanism));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String bodyIsSetAndNotReadyForFlush = "UT000155: Framed channel body was set when it was not ready for flush";
    protected String bodyIsSetAndNotReadyForFlush$str() {
        return bodyIsSetAndNotReadyForFlush;
    }
    @Override
    public final IllegalStateException bodyIsSetAndNotReadyForFlush() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), bodyIsSetAndNotReadyForFlush$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidGzipHeader = "UT000156: Invalid GZIP header";
    protected String invalidGzipHeader$str() {
        return invalidGzipHeader;
    }
    @Override
    public final IOException invalidGzipHeader() {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidGzipHeader$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidGZIPFooter = "UT000157: Invalid GZIP footer";
    protected String invalidGZIPFooter$str() {
        return invalidGZIPFooter;
    }
    @Override
    public final IOException invalidGZIPFooter() {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidGZIPFooter$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String responseTooLargeToBuffer = "UT000158: Response of length %s is too large to buffer";
    protected String responseTooLargeToBuffer$str() {
        return responseTooLargeToBuffer;
    }
    @Override
    public final IllegalStateException responseTooLargeToBuffer(final Long length) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), responseTooLargeToBuffer$str(), length));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String headerBlockTooLarge = "UT000161: HTTP/2 header block is too large";
    protected String headerBlockTooLarge$str() {
        return headerBlockTooLarge;
    }
    @Override
    public final String headerBlockTooLarge() {
        return String.format(getLoggingLocale(), headerBlockTooLarge$str());
    }
    private static final String invalidSameSiteMode = "UT000162: Same-site attribute %s is invalid. It must be Strict or Lax";
    protected String invalidSameSiteMode$str() {
        return invalidSameSiteMode;
    }
    @Override
    public final IllegalArgumentException invalidSameSiteMode(final String mode) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidSameSiteMode$str(), mode));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidToken = "UT000163: Invalid token %s";
    protected String invalidToken$str() {
        return invalidToken;
    }
    @Override
    public final IllegalArgumentException invalidToken(final byte c) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidToken$str(), c));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidHeaders = "UT000164: Request contained invalid headers";
    protected String invalidHeaders$str() {
        return invalidHeaders;
    }
    @Override
    public final IllegalArgumentException invalidHeaders() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidHeaders$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidCharacterInRequestTarget = "UT000165: Invalid character %s in request-target";
    protected String invalidCharacterInRequestTarget$str() {
        return invalidCharacterInRequestTarget;
    }
    @Override
    public final String invalidCharacterInRequestTarget(final char next) {
        return String.format(getLoggingLocale(), invalidCharacterInRequestTarget$str(), next);
    }
    private static final String objectIsClosed = "UT000166: Pooled object is closed";
    protected String objectIsClosed$str() {
        return objectIsClosed;
    }
    @Override
    public final IllegalStateException objectIsClosed() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), objectIsClosed$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String moreThanOneHostHeader = "UT000167: More than one host header in request";
    protected String moreThanOneHostHeader$str() {
        return moreThanOneHostHeader;
    }
    @Override
    public final IOException moreThanOneHostHeader() {
        final IOException result = new IOException(String.format(getLoggingLocale(), moreThanOneHostHeader$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidCookieValue = "UT000168: An invalid character [ASCII code: %s] was present in the cookie value";
    protected String invalidCookieValue$str() {
        return invalidCookieValue;
    }
    @Override
    public final IllegalArgumentException invalidCookieValue(final String value) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCookieValue$str(), value));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidCookieDomain = "UT000169: An invalid domain [%s] was specified for this cookie";
    protected String invalidCookieDomain$str() {
        return invalidCookieDomain;
    }
    @Override
    public final IllegalArgumentException invalidCookieDomain(final String value) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCookieDomain$str(), value));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidCookiePath = "UT000170: An invalid path [%s] was specified for this cookie";
    protected String invalidCookiePath$str() {
        return invalidCookiePath;
    }
    @Override
    public final IllegalArgumentException invalidCookiePath(final String value) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCookiePath$str(), value));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidControlCharacter = "UT000173: An invalid control character [%s] was present in the cookie value or attribute";
    protected String invalidControlCharacter$str() {
        return invalidControlCharacter;
    }
    @Override
    public final IllegalArgumentException invalidControlCharacter(final String value) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidControlCharacter$str(), value));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidEscapeCharacter = "UT000174: An invalid escape character in cookie value";
    protected String invalidEscapeCharacter$str() {
        return invalidEscapeCharacter;
    }
    @Override
    public final IllegalArgumentException invalidEscapeCharacter() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidEscapeCharacter$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidHpackIndex = "UT000175: Invalid Hpack index %s";
    protected String invalidHpackIndex$str() {
        return invalidHpackIndex;
    }
    @Override
    public final HpackException invalidHpackIndex(final int index) {
        final HpackException result = new HpackException();
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String bufferPoolTooSmall = "UT000178: Buffer pool is too small, min size is %s";
    protected String bufferPoolTooSmall$str() {
        return bufferPoolTooSmall;
    }
    @Override
    public final IllegalArgumentException bufferPoolTooSmall(final int minSize) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), bufferPoolTooSmall$str(), minSize));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidProxyHeader = "UT000179: Invalid PROXY protocol header";
    protected String invalidProxyHeader$str() {
        return invalidProxyHeader;
    }
    @Override
    public final IOException invalidProxyHeader() {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidProxyHeader$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String headerSizeToLarge = "UT000180: PROXY protocol header exceeded max size of 107 bytes";
    protected String headerSizeToLarge$str() {
        return headerSizeToLarge;
    }
    @Override
    public final IOException headerSizeToLarge() {
        final IOException result = new IOException(String.format(getLoggingLocale(), headerSizeToLarge$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String http2TrailerToLargeForSingleBuffer = "UT000181: HTTP/2 trailers too large for single buffer";
    protected String http2TrailerToLargeForSingleBuffer$str() {
        return http2TrailerToLargeForSingleBuffer;
    }
    @Override
    public final RuntimeException http2TrailerToLargeForSingleBuffer() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), http2TrailerToLargeForSingleBuffer$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String pingNotSupported = "UT000182: Ping not supported";
    protected String pingNotSupported$str() {
        return pingNotSupported;
    }
    @Override
    public final IOException pingNotSupported() {
        final IOException result = new IOException(String.format(getLoggingLocale(), pingNotSupported$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String pingTimeout = "UT000183: Ping timed out";
    protected String pingTimeout$str() {
        return pingTimeout;
    }
    @Override
    public final IOException pingTimeout() {
        final IOException result = new IOException(String.format(getLoggingLocale(), pingTimeout$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String streamLimitExceeded = "UT000184: Stream limit exceeded";
    protected String streamLimitExceeded$str() {
        return streamLimitExceeded;
    }
    @Override
    public final IOException streamLimitExceeded() {
        final IOException result = new IOException(String.format(getLoggingLocale(), streamLimitExceeded$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidIpAddress = "UT000185: Invalid IP address %s";
    protected String invalidIpAddress$str() {
        return invalidIpAddress;
    }
    @Override
    public final IOException invalidIpAddress(final String addressString) {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidIpAddress$str(), addressString));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
}
