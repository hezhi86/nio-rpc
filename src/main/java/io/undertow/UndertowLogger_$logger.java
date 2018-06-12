package io.undertow;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.logging.DelegatingBasicLogger;
import java.net.InetSocketAddress;
import io.undertow.protocols.ssl.SslConduit;
import java.lang.String;
import io.undertow.server.handlers.sse.ServerSentEventConnection.EventCallback;
import org.jboss.logging.Logger;
import java.net.URI;
import io.undertow.server.HttpServerExchange;
import java.lang.ReflectiveOperationException;
import io.undertow.util.HeaderMap;
import io.undertow.server.ServerConnection.CloseListener;
import org.jboss.logging.BasicLogger;
import java.net.SocketAddress;
import java.lang.IllegalArgumentException;
import java.nio.file.Path;
import javax.annotation.Generated;
import io.undertow.server.ServerConnection;
import java.io.IOException;
import java.lang.Exception;
import java.util.Date;
import org.xnio.ssl.SslConnection;
import java.lang.Throwable;
import java.util.Arrays;
import java.net.InetAddress;
import io.undertow.util.HttpString;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2018-05-25T09:28:40+1000")
public class UndertowLogger_$logger extends DelegatingBasicLogger implements UndertowLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = UndertowLogger_$logger.class.getName();
    public UndertowLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void exceptionProcessingRequest(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, exceptionProcessingRequest$str());
    }
    private static final String exceptionProcessingRequest = "UT005001: An exception occurred processing the request";
    protected String exceptionProcessingRequest$str() {
        return exceptionProcessingRequest;
    }
    @Override
    public final void ioExceptionReadingFromChannel(final IOException e) {
        super.log.logf(FQCN, ERROR, e, ioExceptionReadingFromChannel$str());
    }
    private static final String ioExceptionReadingFromChannel = "UT005003: IOException reading from channel";
    protected String ioExceptionReadingFromChannel$str() {
        return ioExceptionReadingFromChannel;
    }
    @Override
    public final void cannotRemoveUploadedFile(final Path file) {
        super.log.logf(FQCN, ERROR, null, cannotRemoveUploadedFile$str(), file);
    }
    private static final String cannotRemoveUploadedFile = "UT005005: Cannot remove uploaded file %s";
    protected String cannotRemoveUploadedFile$str() {
        return cannotRemoveUploadedFile;
    }
    @Override
    public final void requestHeaderWasTooLarge(final SocketAddress address, final int size) {
        super.log.logf(FQCN, DEBUG, null, requestHeaderWasTooLarge$str(), address, size);
    }
    private static final String requestHeaderWasTooLarge = "UT005006: Connection from %s terminated as request header was larger than %s";
    protected String requestHeaderWasTooLarge$str() {
        return requestHeaderWasTooLarge;
    }
    @Override
    public final void requestWasNotFullyConsumed() {
        super.log.logf(FQCN, DEBUG, null, requestWasNotFullyConsumed$str());
    }
    private static final String requestWasNotFullyConsumed = "UT005007: Request was not fully consumed";
    protected String requestWasNotFullyConsumed$str() {
        return requestWasNotFullyConsumed;
    }
    @Override
    public final void invalidTokenReceived(final String tokenName, final String tokenValue) {
        super.log.logf(FQCN, DEBUG, null, invalidTokenReceived$str(), tokenName, tokenValue);
    }
    private static final String invalidTokenReceived = "UT005008: An invalid token '%s' with value '%s' has been received.";
    protected String invalidTokenReceived$str() {
        return invalidTokenReceived;
    }
    @Override
    public final void missingAuthorizationToken(final String tokenName) {
        super.log.logf(FQCN, DEBUG, null, missingAuthorizationToken$str(), tokenName);
    }
    private static final String missingAuthorizationToken = "UT005009: A mandatory token %s is missing from the request.";
    protected String missingAuthorizationToken$str() {
        return missingAuthorizationToken;
    }
    @Override
    public final void authenticationFailed(final String userName, final String mechanism) {
        super.log.logf(FQCN, DEBUG, null, authenticationFailed$str(), userName, mechanism);
    }
    private static final String authenticationFailed = "UT005010: Verification of authentication tokens for user '%s' has failed using mechanism '%s'.";
    protected String authenticationFailed$str() {
        return authenticationFailed;
    }
    @Override
    public final void ignoringAjpRequestWithPrefixCode(final byte prefix) {
        super.log.logf(FQCN, ERROR, null, ignoringAjpRequestWithPrefixCode$str(), prefix);
    }
    private static final String ignoringAjpRequestWithPrefixCode = "UT005011: Ignoring AJP request with prefix %s";
    protected String ignoringAjpRequestWithPrefixCode$str() {
        return ignoringAjpRequestWithPrefixCode;
    }
    @Override
    public final void ioException(final IOException e) {
        super.log.logf(FQCN, DEBUG, e, ioException$str());
    }
    private static final String ioException = "UT005013: An IOException occurred";
    protected String ioException$str() {
        return ioException;
    }
    @Override
    public final void failedToParseRequest(final Throwable e) {
        super.log.logf(FQCN, DEBUG, e, failedToParseRequest$str());
    }
    private static final String failedToParseRequest = "UT005014: Failed to parse request";
    protected String failedToParseRequest$str() {
        return failedToParseRequest;
    }
    @Override
    public final void errorRotatingAccessLog(final IOException e) {
        super.log.logf(FQCN, ERROR, e, errorRotatingAccessLog$str());
    }
    private static final String errorRotatingAccessLog = "UT005015: Error rotating access log";
    protected String errorRotatingAccessLog$str() {
        return errorRotatingAccessLog;
    }
    @Override
    public final void errorWritingAccessLog(final IOException e) {
        super.log.logf(FQCN, ERROR, e, errorWritingAccessLog$str());
    }
    private static final String errorWritingAccessLog = "UT005016: Error writing access log";
    protected String errorWritingAccessLog$str() {
        return errorWritingAccessLog;
    }
    @Override
    public final void unknownVariable(final String token) {
        super.log.logf(FQCN, ERROR, null, unknownVariable$str(), token);
    }
    private static final String unknownVariable = "UT005017: Unknown variable %s. For the literal percent character use two percent characters: '%%'";
    protected String unknownVariable$str() {
        return unknownVariable;
    }
    @Override
    public final void exceptionInvokingCloseListener(final CloseListener l, final Throwable e) {
        super.log.logf(FQCN, ERROR, e, exceptionInvokingCloseListener$str(), l);
    }
    private static final String exceptionInvokingCloseListener = "UT005018: Exception invoking close listener %s";
    protected String exceptionInvokingCloseListener$str() {
        return exceptionInvokingCloseListener;
    }
    @Override
    public final void errorWritingJDBCLog(final Exception e) {
        super.log.logf(FQCN, ERROR, e, errorWritingJDBCLog$str());
    }
    private static final String errorWritingJDBCLog = "UT005020: Error writing JDBC log";
    protected String errorWritingJDBCLog$str() {
        return errorWritingJDBCLog;
    }
    @Override
    public final void exceptionGeneratingErrorPage(final Exception e, final String location) {
        super.log.logf(FQCN, ERROR, e, exceptionGeneratingErrorPage$str(), location);
    }
    private static final String exceptionGeneratingErrorPage = "UT005022: Exception generating error page %s";
    protected String exceptionGeneratingErrorPage$str() {
        return exceptionGeneratingErrorPage;
    }
    @Override
    public final void exceptionHandlingRequest(final Throwable t, final String requestURI) {
        super.log.logf(FQCN, ERROR, t, exceptionHandlingRequest$str(), requestURI);
    }
    private static final String exceptionHandlingRequest = "UT005023: Exception handling request to %s";
    protected String exceptionHandlingRequest$str() {
        return exceptionHandlingRequest;
    }
    @Override
    public final void couldNotRegisterChangeListener(final Exception e) {
        super.log.logf(FQCN, ERROR, e, couldNotRegisterChangeListener$str());
    }
    private static final String couldNotRegisterChangeListener = "UT005024: Could not register resource change listener for caching resource manager, automatic invalidation of cached resource will not work";
    protected String couldNotRegisterChangeListener$str() {
        return couldNotRegisterChangeListener;
    }
    @Override
    public final void timingOutRequest(final String requestURI) {
        super.log.logf(FQCN, ERROR, null, timingOutRequest$str(), requestURI);
    }
    private static final String timingOutRequest = "UT005027: Timing out request to %s";
    protected String timingOutRequest$str() {
        return timingOutRequest;
    }
    @Override
    public final void proxyRequestFailed(final String requestURI, final Exception e) {
        super.log.logf(FQCN, ERROR, e, proxyRequestFailed$str(), requestURI);
    }
    private static final String proxyRequestFailed = "UT005028: Proxy request to %s failed";
    protected String proxyRequestFailed$str() {
        return proxyRequestFailed;
    }
    @Override
    public final void proxyFailedToConnectToBackend(final String requestURI, final URI uri) {
        super.log.logf(FQCN, ERROR, null, proxyFailedToConnectToBackend$str(), requestURI, uri);
    }
    private static final String proxyFailedToConnectToBackend = "UT005031: Proxy request to %s could not connect to backend server %s";
    protected String proxyFailedToConnectToBackend$str() {
        return proxyFailedToConnectToBackend;
    }
    @Override
    public final void listenerNotProgressing() {
        super.log.logf(FQCN, ERROR, null, listenerNotProgressing$str());
    }
    private static final String listenerNotProgressing = "UT005032: Listener not making progress on framed channel, closing channel to prevent infinite loop";
    protected String listenerNotProgressing$str() {
        return listenerNotProgressing;
    }
    @Override
    public final void remoteEndpointFailedToSendInitialSettings(final int type) {
        super.log.logf(FQCN, ERROR, null, remoteEndpointFailedToSendInitialSettings$str(), type);
    }
    private static final String remoteEndpointFailedToSendInitialSettings = "UT005034: Remote endpoint failed to send initial settings frame in HTTP2 connection, frame type %s";
    protected String remoteEndpointFailedToSendInitialSettings$str() {
        return remoteEndpointFailedToSendInitialSettings;
    }
    @Override
    public final void parseRequestTimedOut(final SocketAddress remoteAddress) {
        super.log.logf(FQCN, DEBUG, null, parseRequestTimedOut$str(), remoteAddress);
    }
    private static final String parseRequestTimedOut = "UT005035: Closing channel because of parse timeout for remote address %s";
    protected String parseRequestTimedOut$str() {
        return parseRequestTimedOut;
    }
    @Override
    public final void noALPNFallback(final SocketAddress address) {
        super.log.logf(FQCN, ERROR, null, noALPNFallback$str(), address);
    }
    private static final String noALPNFallback = "UT005036: ALPN negotiation failed for %s and no fallback defined, closing connection";
    protected String noALPNFallback$str() {
        return noALPNFallback;
    }
    @Override
    public final void stickySessionCookieLengthTruncated(final String original, final String current) {
        super.log.logf(FQCN, WARN, null, stickySessionCookieLengthTruncated$str(), original, current);
    }
    private static final String stickySessionCookieLengthTruncated = "UT005037: Name of the cookie containing the session id, %s, had been too long and was truncated to: %s";
    protected String stickySessionCookieLengthTruncated$str() {
        return stickySessionCookieLengthTruncated;
    }
    @Override
    public final void balancerCreated(final int id, final String name, final boolean stickySession, final String stickySessionCookie, final String stickySessionPath, final boolean stickySessionRemove, final boolean stickySessionForce, final int waitWorker, final int maxattempts) {
        super.log.logf(FQCN, DEBUG, null, balancerCreated$str(), id, name, stickySession, stickySessionCookie, stickySessionPath, stickySessionRemove, stickySessionForce, waitWorker, maxattempts);
    }
    private static final String balancerCreated = "UT005038: Balancer created: id: %s, name: %s, stickySession: %s, stickySessionCookie: %s, stickySessionPath: %s, stickySessionRemove: %s, stickySessionForce: %s, waitWorker: %s, maxattempts: %s";
    protected String balancerCreated$str() {
        return balancerCreated;
    }
    @Override
    public final void proxyAdvertisementsStarted(final String address, final int frequency) {
        super.log.logf(FQCN, INFO, null, proxyAdvertisementsStarted$str(), address, frequency);
    }
    private static final String proxyAdvertisementsStarted = "UT005039: Undertow starts mod_cluster proxy advertisements on %s with frequency %s ms";
    protected String proxyAdvertisementsStarted$str() {
        return proxyAdvertisementsStarted;
    }
    @Override
    public final void proxyAdvertiseMessagePayload(final String payload) {
        super.log.logf(FQCN, DEBUG, null, proxyAdvertiseMessagePayload$str(), payload);
    }
    private static final String proxyAdvertiseMessagePayload = "UT005040: Gonna send payload:\n%s";
    protected String proxyAdvertiseMessagePayload$str() {
        return proxyAdvertiseMessagePayload;
    }
    @Override
    public final void proxyAdvertiseCannotSendMessage(final Exception e, final InetSocketAddress address) {
        super.log.logf(FQCN, ERROR, e, proxyAdvertiseCannotSendMessage$str(), address);
    }
    private static final String proxyAdvertiseCannotSendMessage = "UT005041: Cannot send advertise message. Address: %s";
    protected String proxyAdvertiseCannotSendMessage$str() {
        return proxyAdvertiseCannotSendMessage;
    }
    @Override
    public final void mcmpHandlerCreated() {
        super.log.logf(FQCN, DEBUG, null, mcmpHandlerCreated$str());
    }
    private static final String mcmpHandlerCreated = "UT005042: Undertow mod_cluster proxy MCMPHandler created";
    protected String mcmpHandlerCreated$str() {
        return mcmpHandlerCreated;
    }
    @Override
    public final void mcmpProcessingError(final String type, final String errString) {
        super.log.logf(FQCN, ERROR, null, mcmpProcessingError$str(), type, errString);
    }
    private static final String mcmpProcessingError = "UT005043: Error in processing MCMP commands: Type:%s, Mess: %s";
    protected String mcmpProcessingError$str() {
        return mcmpProcessingError;
    }
    @Override
    public final void removingNode(final String jvmRoute) {
        super.log.logf(FQCN, INFO, null, removingNode$str(), jvmRoute);
    }
    private static final String removingNode = "UT005044: Removing node %s";
    protected String removingNode$str() {
        return removingNode;
    }
    @Override
    public final void registeringContext(final String contextPath, final String jvmRoute) {
        super.log.logf(FQCN, INFO, null, registeringContext2$str(), contextPath, jvmRoute);
    }
    private static final String registeringContext2 = "UT005045: Registering context %s, for node %s";
    protected String registeringContext2$str() {
        return registeringContext2;
    }
    @Override
    public final void registeringContext(final String contextPath, final String jvmRoute, final java.util.List<String> aliases) {
        super.log.logf(FQCN, DEBUG, null, registeringContext3$str(), contextPath, jvmRoute, aliases);
    }
    private static final String registeringContext3 = "UT005046: Registering context %s, for node %s, with aliases %s";
    protected String registeringContext3$str() {
        return registeringContext3;
    }
    @Override
    public final void unregisteringContext(final String contextPath, final String jvmRoute) {
        super.log.logf(FQCN, INFO, null, unregisteringContext$str(), contextPath, jvmRoute);
    }
    private static final String unregisteringContext = "UT005047: Unregistering context %s, from node %s";
    protected String unregisteringContext$str() {
        return unregisteringContext;
    }
    @Override
    public final void nodeIsInError(final String jvmRoute) {
        super.log.logf(FQCN, DEBUG, null, nodeIsInError$str(), jvmRoute);
    }
    private static final String nodeIsInError = "UT005048: Node %s in error";
    protected String nodeIsInError$str() {
        return nodeIsInError;
    }
    @Override
    public final void nodeConfigCreated(final URI connectionURI, final String balancer, final String domain, final String jvmRoute, final boolean flushPackets, final int flushwait, final int ping, final long ttl, final int timeout, final int maxConnections, final int cacheConnections, final int requestQueueSize, final boolean queueNewRequests) {
        super.log.logf(FQCN, DEBUG, null, nodeConfigCreated$str(), connectionURI, balancer, domain, jvmRoute, flushPackets, flushwait, ping, ttl, timeout, maxConnections, cacheConnections, requestQueueSize, queueNewRequests);
    }
    private static final String nodeConfigCreated = "UT005049: NodeConfig created: connectionURI: %s, balancer: %s, load balancing group: %s, jvmRoute: %s, flushPackets: %s, flushwait: %s, ping: %s,ttl: %s, timeout: %s, maxConnections: %s, cacheConnections: %s, requestQueueSize: %s, queueNewRequests: %s";
    protected String nodeConfigCreated$str() {
        return nodeConfigCreated;
    }
    @Override
    public final void failedToProcessManagementReq(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToProcessManagementReq$str());
    }
    private static final String failedToProcessManagementReq = "UT005050: Failed to process management request";
    protected String failedToProcessManagementReq$str() {
        return failedToProcessManagementReq;
    }
    @Override
    public final void failedToSendPingResponse(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToSendPingResponse$str());
    }
    private static final String failedToSendPingResponse = "UT005051: Failed to send ping response";
    protected String failedToSendPingResponse$str() {
        return failedToSendPingResponse;
    }
    @Override
    public final void failedToSendPingResponseDBG(final Exception e, final String node, final String jvmRoute) {
        super.log.logf(FQCN, DEBUG, e, failedToSendPingResponseDBG$str(), node, jvmRoute);
    }
    private static final String failedToSendPingResponseDBG = "UT005052: Failed to send ping response, node.getJvmRoute(): %s, jvmRoute: %s";
    protected String failedToSendPingResponseDBG$str() {
        return failedToSendPingResponseDBG;
    }
    @Override
    public final void registeringNode(final String jvmRoute, final URI connectionURI) {
        super.log.logf(FQCN, INFO, null, registeringNode$str(), jvmRoute, connectionURI);
    }
    private static final String registeringNode = "UT005053: Registering node %s, connection: %s";
    protected String registeringNode$str() {
        return registeringNode;
    }
    @Override
    public final void mcmpKeyValue(final HttpString name, final String value) {
        super.log.logf(FQCN, DEBUG, null, mcmpKeyValue$str(), name, value);
    }
    private static final String mcmpKeyValue = "UT005054: MCMP processing, key: %s, value: %s";
    protected String mcmpKeyValue$str() {
        return mcmpKeyValue;
    }
    @Override
    public final void httpClientPingTask(final URI connection) {
        super.log.logf(FQCN, DEBUG, null, httpClientPingTask$str(), connection);
    }
    private static final String httpClientPingTask = "UT005055: HttpClientPingTask run for connection: %s";
    protected String httpClientPingTask$str() {
        return httpClientPingTask;
    }
    @Override
    public final void receivedNodeLoad(final String jvmRoute, final String loadValue) {
        super.log.logf(FQCN, DEBUG, null, receivedNodeLoad$str(), jvmRoute, loadValue);
    }
    private static final String receivedNodeLoad = "UT005056: Received node load in STATUS message, node jvmRoute: %s, load: %s";
    protected String receivedNodeLoad$str() {
        return receivedNodeLoad;
    }
    @Override
    public final void mcmpSendingResponse(final InetSocketAddress destination, final int status, final HeaderMap headers, final String response) {
        super.log.logf(FQCN, DEBUG, null, mcmpSendingResponse$str(), destination, status, headers, response);
    }
    private static final String mcmpSendingResponse = "UT005057: Sending MCMP response to destination: %s, HTTP status: %s, Headers: %s, response: %s";
    protected String mcmpSendingResponse$str() {
        return mcmpSendingResponse;
    }
    @Override
    public final void potentialCrossTalking(final InetAddress group, final String s, final String localizedMessage) {
        super.log.logf(FQCN, WARN, null, potentialCrossTalking$str(), group, s, localizedMessage);
    }
    private static final String potentialCrossTalking = "UT005058: Could not bind multicast socket to %s (%s address): %s; make sure your multicast address is of the same type as the IP stack (IPv4 or IPv6). Multicast socket will not be bound to an address, but this may lead to cross talking (see http://www.jboss.org/community/docs/DOC-9469 for details).";
    protected String potentialCrossTalking$str() {
        return potentialCrossTalking;
    }
    @Override
    public final void oldStylePredicateSyntax(final String string) {
        super.log.logf(FQCN, WARN, null, oldStylePredicateSyntax$str(), string);
    }
    private static final String oldStylePredicateSyntax = "UT005060: Predicate %s uses old style square braces to define predicates, which will be removed in a future release. predicate[value] should be changed to predicate(value)";
    protected String oldStylePredicateSyntax$str() {
        return oldStylePredicateSyntax;
    }
    private static final String maxRestartsExceeded = "UT005061: More than %s restarts detected, breaking assumed infinite loop";
    protected String maxRestartsExceeded$str() {
        return maxRestartsExceeded;
    }
    @Override
    public final IllegalStateException maxRestartsExceeded(final int maxRestarts) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), maxRestartsExceeded$str(), maxRestarts));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void extendedAccessLogPatternParseError(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, extendedAccessLogPatternParseError$str());
    }
    private static final String extendedAccessLogPatternParseError = "UT005062: Pattern parse error";
    protected String extendedAccessLogPatternParseError$str() {
        return extendedAccessLogPatternParseError;
    }
    @Override
    public final void extendedAccessLogUnknownToken(final String token) {
        super.log.logf(FQCN, ERROR, null, extendedAccessLogUnknownToken$str(), token);
    }
    private static final String extendedAccessLogUnknownToken = "UT005063: Unable to decode with rest of chars starting: %s";
    protected String extendedAccessLogUnknownToken$str() {
        return extendedAccessLogUnknownToken;
    }
    @Override
    public final void extendedAccessLogMissingClosing() {
        super.log.logf(FQCN, ERROR, null, extendedAccessLogMissingClosing$str());
    }
    private static final String extendedAccessLogMissingClosing = "UT005064: No closing ) found for in decode";
    protected String extendedAccessLogMissingClosing$str() {
        return extendedAccessLogMissingClosing;
    }
    @Override
    public final void extendedAccessLogCannotDecode(final String chars) {
        super.log.logf(FQCN, ERROR, null, extendedAccessLogCannotDecode$str(), chars);
    }
    private static final String extendedAccessLogCannotDecode = "UT005065: The next characters couldn't be decoded: %s";
    protected String extendedAccessLogCannotDecode$str() {
        return extendedAccessLogCannotDecode;
    }
    @Override
    public final void extendedAccessLogCannotDecodeXParamValue(final String value) {
        super.log.logf(FQCN, ERROR, null, extendedAccessLogCannotDecodeXParamValue$str(), value);
    }
    private static final String extendedAccessLogCannotDecodeXParamValue = "UT005066: X param for servlet request, couldn't decode value: %s";
    protected String extendedAccessLogCannotDecodeXParamValue$str() {
        return extendedAccessLogCannotDecodeXParamValue;
    }
    @Override
    public final void extendedAccessLogBadXParam() {
        super.log.logf(FQCN, ERROR, null, extendedAccessLogBadXParam$str());
    }
    private static final String extendedAccessLogBadXParam = "UT005067: X param in wrong format. Needs to be 'x-#(...)'";
    protected String extendedAccessLogBadXParam$str() {
        return extendedAccessLogBadXParam;
    }
    @Override
    public final void extendedAccessLogEmptyPattern() {
        super.log.logf(FQCN, INFO, null, extendedAccessLogEmptyPattern$str());
    }
    private static final String extendedAccessLogEmptyPattern = "UT005068: Pattern was just empty or whitespace";
    protected String extendedAccessLogEmptyPattern$str() {
        return extendedAccessLogEmptyPattern;
    }
    @Override
    public final void failedToWriteJdbcAccessLog(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToWriteJdbcAccessLog$str());
    }
    private static final String failedToWriteJdbcAccessLog = "UT005069: Failed to write JDBC access log";
    protected String failedToWriteJdbcAccessLog$str() {
        return failedToWriteJdbcAccessLog;
    }
    @Override
    public final void failedToWritePreCachedFile() {
        super.log.logf(FQCN, ERROR, null, failedToWritePreCachedFile$str());
    }
    private static final String failedToWritePreCachedFile = "UT005070: Failed to write pre-cached file";
    protected String failedToWritePreCachedFile$str() {
        return failedToWritePreCachedFile;
    }
    @Override
    public final void undertowRequestFailed(final Throwable t, final HttpServerExchange exchange) {
        super.log.logf(FQCN, ERROR, t, undertowRequestFailed$str(), exchange);
    }
    private static final String undertowRequestFailed = "UT005071: Undertow request failed %s";
    protected String undertowRequestFailed$str() {
        return undertowRequestFailed;
    }
    @Override
    public final void stuckThreadDetected(final String threadName, final long threadId, final long active, final Date start, final String requestUri, final int threshold, final int stuckCount, final Throwable stackTrace) {
        super.log.logf(FQCN, WARN, stackTrace, stuckThreadDetected$str(), threadName, threadId, active, start, requestUri, threshold, stuckCount);
    }
    private static final String stuckThreadDetected = "UT005072: Thread %s (id=%s) has been active for %s milliseconds (since %s) to serve the same request for %s and may be stuck (configured threshold for this StuckThreadDetectionValve is %s seconds). There is/are %s thread(s) in total that are monitored by this Valve and may be stuck.";
    protected String stuckThreadDetected$str() {
        return stuckThreadDetected;
    }
    @Override
    public final void stuckThreadCompleted(final String threadName, final long threadId, final long active, final int stuckCount) {
        super.log.logf(FQCN, WARN, null, stuckThreadCompleted$str(), threadName, threadId, active, stuckCount);
    }
    private static final String stuckThreadCompleted = "UT005073: Thread %s (id=%s) was previously reported to be stuck but has completed. It was active for approximately %s milliseconds. There is/are still %s thread(s) that are monitored by this Valve and may be stuck.";
    protected String stuckThreadCompleted$str() {
        return stuckThreadCompleted;
    }
    @Override
    public final void failedToInvokeFailedCallback(final EventCallback callback, final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToInvokeFailedCallback$str(), callback);
    }
    private static final String failedToInvokeFailedCallback = "UT005074: Failed to invoke error callback %s for SSE task";
    protected String failedToInvokeFailedCallback$str() {
        return failedToInvokeFailedCallback;
    }
    private static final String unableToResolveModClusterManagementHost = "UT005075: Unable to resolve mod_cluster management host's address for '%s'";
    protected String unableToResolveModClusterManagementHost$str() {
        return unableToResolveModClusterManagementHost;
    }
    @Override
    public final IllegalStateException unableToResolveModClusterManagementHost(final String providedHost) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToResolveModClusterManagementHost$str(), providedHost));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void sslReadLoopDetected(final SslConduit sslConduit) {
        super.log.logf(FQCN, ERROR, null, sslReadLoopDetected$str(), sslConduit);
    }
    private static final String sslReadLoopDetected = "UT005076: SSL read loop detected. This should not happen, please report this to the Undertow developers. Current state %s";
    protected String sslReadLoopDetected$str() {
        return sslReadLoopDetected;
    }
    @Override
    public final void sslBufferOverflow(final SslConduit sslConduit) {
        super.log.logf(FQCN, ERROR, null, sslBufferOverflow$str(), sslConduit);
    }
    private static final String sslBufferOverflow = "UT005077: SSL unwrap buffer overflow detected. This should not happen, please report this to the Undertow developers. Current state %s";
    protected String sslBufferOverflow$str() {
        return sslBufferOverflow;
    }
    @Override
    public final void alpnConnectionFailed(final SslConnection connection) {
        super.log.logf(FQCN, ERROR, null, alpnConnectionFailed$str(), connection);
    }
    private static final String alpnConnectionFailed = "UT005079: ALPN negotiation on %s failed";
    protected String alpnConnectionFailed$str() {
        return alpnConnectionFailed;
    }
    @Override
    public final void resumedAndDispatched() {
        super.log.logf(FQCN, ERROR, null, resumedAndDispatched$str());
    }
    private static final String resumedAndDispatched = "UT005080: HttpServerExchange cannot have both async IO resumed and dispatch() called in the same cycle";
    protected String resumedAndDispatched$str() {
        return resumedAndDispatched;
    }
    @Override
    public final void cannotProxyStartedRequest(final HttpServerExchange exchange) {
        super.log.logf(FQCN, ERROR, null, cannotProxyStartedRequest$str(), exchange);
    }
    private static final String cannotProxyStartedRequest = "UT005081: Response has already been started, cannot proxy request %s";
    protected String cannotProxyStartedRequest$str() {
        return cannotProxyStartedRequest;
    }
    private static final String cannotUseWildcardAddressAsModClusterManagementHost = "UT005082: Configured mod_cluster management host address cannot be a wildcard address (%s)!";
    protected String cannotUseWildcardAddressAsModClusterManagementHost$str() {
        return cannotUseWildcardAddressAsModClusterManagementHost;
    }
    @Override
    public final IllegalArgumentException cannotUseWildcardAddressAsModClusterManagementHost(final String providedAddress) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotUseWildcardAddressAsModClusterManagementHost$str(), providedAddress));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unexpectedEndOfCompressedInput = "UT005083: Unexpected end of compressed input";
    protected String unexpectedEndOfCompressedInput$str() {
        return unexpectedEndOfCompressedInput;
    }
    @Override
    public final IOException unexpectedEndOfCompressedInput() {
        final IOException result = new IOException(String.format(getLoggingLocale(), unexpectedEndOfCompressedInput$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String dataLargerThanContentLength = "UT005084: Attempted to write %s bytes however content-length has been set to %s";
    protected String dataLargerThanContentLength$str() {
        return dataLargerThanContentLength;
    }
    @Override
    public final IOException dataLargerThanContentLength(final long totalToWrite, final long responseContentLength) {
        final IOException result = new IOException(String.format(getLoggingLocale(), dataLargerThanContentLength$str(), totalToWrite, responseContentLength));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void responseWasNotTerminated(final ServerConnection connection, final HttpServerExchange exchange) {
        super.log.logf(FQCN, ERROR, null, responseWasNotTerminated$str(), connection, exchange);
    }
    private static final String responseWasNotTerminated = "UT005085: Connection %s for exchange %s was not closed cleanly, forcibly closing connection";
    protected String responseWasNotTerminated$str() {
        return responseWasNotTerminated;
    }
    @Override
    public final void failedToAcceptSSLRequest(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToAcceptSSLRequest$str());
    }
    private static final String failedToAcceptSSLRequest = "UT005086: Failed to accept SSL request";
    protected String failedToAcceptSSLRequest$str() {
        return failedToAcceptSSLRequest;
    }
    @Override
    public final void failedToUseServerOrder(final ReflectiveOperationException e) {
        super.log.logf(FQCN, ERROR, e, failedToUseServerOrder$str());
    }
    private static final String failedToUseServerOrder = "UT005087: Failed to use the server order";
    protected String failedToUseServerOrder$str() {
        return failedToUseServerOrder;
    }
    @Override
    public final void closeAsyncFailed(final IOException e) {
        super.log.logf(FQCN, ERROR, e, closeAsyncFailed$str());
    }
    private static final String closeAsyncFailed = "UT005088: Failed to execute ServletOutputStream.closeAsync() on IO thread";
    protected String closeAsyncFailed$str() {
        return closeAsyncFailed;
    }
    private static final String nullParameter = "UT005089: Method parameter '%s' cannot be null";
    protected String nullParameter$str() {
        return nullParameter;
    }
    @Override
    public final IllegalArgumentException nullParameter(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullParameter$str(), name));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void handleUnexpectedFailure(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, handleUnexpectedFailure$str());
    }
    private static final String handleUnexpectedFailure = "UT005090: Unexpected failure";
    protected String handleUnexpectedFailure$str() {
        return handleUnexpectedFailure;
    }
    @Override
    public final void directBufferDeallocatorInitializationFailed(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, directBufferDeallocatorInitializationFailed$str());
    }
    private static final String directBufferDeallocatorInitializationFailed = "UT005091: Failed to initialize DirectByteBufferDeallocator";
    protected String directBufferDeallocatorInitializationFailed$str() {
        return directBufferDeallocatorInitializationFailed;
    }
    @Override
    public final void directBufferDeallocationFailed(final Throwable t) {
        super.log.logf(FQCN, DEBUG, t, directBufferDeallocationFailed$str());
    }
    private static final String directBufferDeallocationFailed = "UT005092: Failed to free direct buffer";
    protected String directBufferDeallocationFailed$str() {
        return directBufferDeallocationFailed;
    }
}
