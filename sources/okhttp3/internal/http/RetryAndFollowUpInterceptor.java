package okhttp3.internal.http;

import defpackage.boa;
import defpackage.j6g;
import defpackage.pxc;
import defpackage.r6;
import defpackage.z92;
import defpackage.zr4;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public final OkHttpClient a;

    static {
        new Companion(0);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = okHttpClient;
    }

    public static int c(Response response, int i) {
        String strA = response.f.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        if (!new pxc("\\d+").d(strA)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Request a(okhttp3.Response r11, okhttp3.internal.connection.Exchange r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.a(okhttp3.Response, okhttp3.internal.connection.Exchange):okhttp3.Request");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.io.IOException r3, okhttp3.internal.connection.RealCall r4, okhttp3.Request r5, boolean r6) {
        /*
            r2 = this;
            okhttp3.OkHttpClient r2 = r2.a
            boolean r2 = r2.f
            r0 = 0
            if (r2 != 0) goto L9
            goto La5
        L9:
            if (r6 == 0) goto L1a
            okhttp3.RequestBody r2 = r5.d
            if (r2 == 0) goto L15
            boolean r2 = r2.isOneShot()
            if (r2 != 0) goto La5
        L15:
            boolean r2 = r3 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L1a
            return r0
        L1a:
            boolean r2 = r3 instanceof java.net.ProtocolException
            if (r2 == 0) goto L1f
            return r0
        L1f:
            boolean r2 = r3 instanceof java.io.InterruptedIOException
            if (r2 == 0) goto L2a
            boolean r2 = r3 instanceof java.net.SocketTimeoutException
            if (r2 == 0) goto La5
            if (r6 != 0) goto La5
            goto L3d
        L2a:
            boolean r2 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r2 == 0) goto L38
            java.lang.Throwable r2 = r3.getCause()
            boolean r2 = r2 instanceof java.security.cert.CertificateException
            if (r2 == 0) goto L38
            goto La5
        L38:
            boolean r2 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 == 0) goto L3d
            return r0
        L3d:
            okhttp3.internal.connection.ExchangeFinder r2 = r4.X
            r2.getClass()
            int r3 = r2.g
            r4 = 1
            if (r3 != 0) goto L51
            int r5 = r2.h
            if (r5 != 0) goto L51
            int r5 = r2.i
            if (r5 != 0) goto L51
            r2 = r0
            goto La3
        L51:
            okhttp3.Route r5 = r2.j
            if (r5 == 0) goto L56
            goto L9e
        L56:
            r5 = 0
            if (r3 > r4) goto L89
            int r3 = r2.h
            if (r3 > r4) goto L89
            int r3 = r2.i
            if (r3 <= 0) goto L62
            goto L89
        L62:
            okhttp3.internal.connection.RealCall r3 = r2.c
            okhttp3.internal.connection.RealConnection r3 = r3.Y
            if (r3 != 0) goto L69
            goto L89
        L69:
            monitor-enter(r3)
            int r6 = r3.l     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto L70
            monitor-exit(r3)
            goto L89
        L70:
            okhttp3.Route r6 = r3.b     // Catch: java.lang.Throwable -> L86
            okhttp3.Address r6 = r6.a     // Catch: java.lang.Throwable -> L86
            okhttp3.HttpUrl r6 = r6.i     // Catch: java.lang.Throwable -> L86
            okhttp3.Address r1 = r2.b     // Catch: java.lang.Throwable -> L86
            okhttp3.HttpUrl r1 = r1.i     // Catch: java.lang.Throwable -> L86
            boolean r6 = okhttp3.internal.Util.a(r6, r1)     // Catch: java.lang.Throwable -> L86
            if (r6 != 0) goto L82
            monitor-exit(r3)
            goto L89
        L82:
            okhttp3.Route r5 = r3.b     // Catch: java.lang.Throwable -> L86
            monitor-exit(r3)
            goto L89
        L86:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L89:
            if (r5 == 0) goto L8f
            r2.j = r5
        L8d:
            r2 = r4
            goto La3
        L8f:
            okhttp3.internal.connection.RouteSelector$Selection r3 = r2.e
            if (r3 == 0) goto L9a
            boolean r3 = r3.a()
            if (r3 != r4) goto L9a
            goto L9e
        L9a:
            okhttp3.internal.connection.RouteSelector r2 = r2.f
            if (r2 != 0) goto L9f
        L9e:
            goto L8d
        L9f:
            boolean r2 = r2.a()
        La3:
            if (r2 != 0) goto La6
        La5:
            return r0
        La6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.b(java.io.IOException, okhttp3.internal.connection.RealCall, okhttp3.Request, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r18v1, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [okhttp3.CertificatePinner] */
    /* JADX WARN: Type inference failed for: r19v2 */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Exchange exchange;
        ?? r19;
        ?? r18;
        ?? r17;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.e;
        RealCall realCall = realInterceptorChain.a;
        Response response = null;
        List listG1 = zr4.a;
        Response response2 = null;
        int i = 0;
        Request requestA = request;
        boolean z = true;
        while (true) {
            requestA.getClass();
            if (realCall.a0 != null) {
                r6.g("Check failed.");
                return null;
            }
            synchronized (realCall) {
                if (realCall.c0) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                if (realCall.b0) {
                    throw new IllegalStateException("Check failed.");
                }
                j6g j6gVar = j6g.a;
            }
            if (z) {
                RealConnectionPool realConnectionPool = realCall.d;
                HttpUrl httpUrl = requestA.a;
                OkHttpClient okHttpClient = realCall.a;
                if (httpUrl.j) {
                    SSLSocketFactory sSLSocketFactory = okHttpClient.f0;
                    if (sSLSocketFactory == null) {
                        r6.g("CLEARTEXT-only client");
                        return response;
                    }
                    HostnameVerifier hostnameVerifier = okHttpClient.j0;
                    r19 = okHttpClient.k0;
                    r17 = sSLSocketFactory;
                    r18 = hostnameVerifier;
                } else {
                    Response response3 = response;
                    Response response4 = response3;
                    r19 = response4;
                    r17 = response3;
                    r18 = response4;
                }
                realCall.X = new ExchangeFinder(realConnectionPool, new Address(httpUrl.d, httpUrl.e, okHttpClient.a0, okHttpClient.e0, r17, r18, r19, okHttpClient.d0, okHttpClient.b0, okHttpClient.i0, okHttpClient.h0, okHttpClient.c0), realCall, realCall.e);
            }
            try {
                if (realCall.e0) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        Response responseB = realInterceptorChain.b(requestA);
                        if (response2 != null) {
                            Response.Builder builderP = responseB.p();
                            Response.Builder builderP2 = response2.p();
                            builderP2.g = null;
                            Response responseA = builderP2.a();
                            if (responseA.V != null) {
                                throw new IllegalArgumentException("priorResponse.body != null");
                            }
                            builderP.j = responseA;
                            responseB = builderP.a();
                        }
                        response2 = responseB;
                        exchange = realCall.a0;
                        requestA = a(response2, exchange);
                    } catch (IOException e) {
                        if (!b(e, realCall, requestA, !(e instanceof ConnectionShutdownException))) {
                            Iterator it = listG1.iterator();
                            while (it.hasNext()) {
                                boa.h(e, (Exception) it.next());
                            }
                            throw e;
                        }
                        listG1 = z92.g1(e, listG1);
                        realCall.f(true);
                        z = false;
                    }
                } catch (RouteException e2) {
                    if (!b(e2.getLastConnectException(), realCall, requestA, false)) {
                        IOException firstConnectException = e2.getFirstConnectException();
                        firstConnectException.getClass();
                        Iterator it2 = listG1.iterator();
                        while (it2.hasNext()) {
                            boa.h(firstConnectException, (Exception) it2.next());
                        }
                        throw firstConnectException;
                    }
                    listG1 = z92.g1(e2.getFirstConnectException(), listG1);
                    realCall.f(true);
                    z = false;
                }
                if (requestA == null) {
                    if (exchange != null && exchange.e) {
                        realCall.k();
                    }
                    realCall.f(false);
                    return response2;
                }
                RequestBody requestBody = requestA.d;
                if (requestBody != null && requestBody.isOneShot()) {
                    realCall.f(false);
                    return response2;
                }
                ResponseBody responseBody = response2.V;
                if (responseBody != null) {
                    Util.c(responseBody);
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
                realCall.f(true);
                z = true;
                response = null;
            } catch (Throwable th) {
                realCall.f(true);
                throw th;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
