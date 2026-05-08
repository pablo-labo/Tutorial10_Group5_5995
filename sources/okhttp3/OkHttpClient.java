package okhttp3;

import defpackage.g9;
import defpackage.l5;
import defpackage.n9a;
import defpackage.r40;
import defpackage.r6;
import defpackage.v40;
import defpackage.w92;
import defpackage.wl7;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "<init>", "()V", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion s0 = new Companion(0);
    public static final List<Protocol> t0 = Util.k(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<ConnectionSpec> u0 = Util.k(ConnectionSpec.f, ConnectionSpec.g);
    public final Authenticator V;
    public final boolean W;
    public final boolean X;
    public final CookieJar Y;
    public final Cache Z;
    public final Dispatcher a;
    public final Dns a0;
    public final ConnectionPool b;
    public final Proxy b0;
    public final List<Interceptor> c;
    public final ProxySelector c0;
    public final List<Interceptor> d;
    public final Authenticator d0;
    public final g9 e;
    public final SocketFactory e0;
    public final boolean f;
    public final SSLSocketFactory f0;
    public final X509TrustManager g0;
    public final List<ConnectionSpec> h0;
    public final List<Protocol> i0;
    public final HostnameVerifier j0;
    public final CertificatePinner k0;
    public final CertificateChainCleaner l0;
    public final int m0;
    public final int n0;
    public final int o0;
    public final int p0;
    public final long q0;
    public final RouteDatabase r0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public int A;
        public long B;
        public RouteDatabase C;
        public Dispatcher a = new Dispatcher();
        public ConnectionPool b = new ConnectionPool();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public g9 e;
        public boolean f;
        public Authenticator g;
        public boolean h;
        public boolean i;
        public CookieJar j;
        public Cache k;
        public Dns l;
        public Proxy m;
        public ProxySelector n;
        public Authenticator o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List<ConnectionSpec> s;
        public List<? extends Protocol> t;
        public HostnameVerifier u;
        public CertificatePinner v;
        public CertificateChainCleaner w;
        public int x;
        public int y;
        public int z;

        public Builder() {
            EventListener eventListener = EventListener.NONE;
            byte[] bArr = Util.a;
            eventListener.getClass();
            this.e = new g9(eventListener, 12);
            this.f = true;
            Authenticator authenticator = Authenticator.a;
            this.g = authenticator;
            this.h = true;
            this.i = true;
            this.j = CookieJar.a;
            this.l = Dns.a;
            this.o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            socketFactory.getClass();
            this.p = socketFactory;
            OkHttpClient.s0.getClass();
            this.s = OkHttpClient.u0;
            this.t = OkHttpClient.t0;
            this.u = OkHostnameVerifier.a;
            this.v = CertificatePinner.d;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 1024L;
        }

        public final void a(n9a n9aVar) {
            n9aVar.getClass();
            this.c.add(n9aVar);
        }

        public final void b(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.x = Util.b(j, timeUnit);
        }

        public final void c(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.y = Util.b(j, timeUnit);
        }

        public final void d(List list) {
            list.getClass();
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                v40.n(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                v40.n(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return;
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                v40.n(arrayList, "protocols must not contain http/1.0: ");
                return;
            }
            if (arrayList.contains(null)) {
                l5.q("protocols must not contain null");
                return;
            }
            arrayList.remove(Protocol.SPDY_3);
            if (!arrayList.equals(this.t)) {
                this.C = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
            this.t = listUnmodifiableList;
        }

        public final void e(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.z = Util.b(j, timeUnit);
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.a = builder.a;
        this.b = builder.b;
        this.c = Util.x(builder.c);
        this.d = Util.x(builder.d);
        this.e = builder.e;
        this.f = builder.f;
        this.V = builder.g;
        this.W = builder.h;
        this.X = builder.i;
        this.Y = builder.j;
        this.Z = builder.k;
        this.a0 = builder.l;
        Proxy proxy = builder.m;
        this.b0 = proxy;
        if (proxy != null) {
            proxySelector = NullProxySelector.a;
        } else {
            proxySelector = builder.n;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.a;
            }
        }
        this.c0 = proxySelector;
        this.d0 = builder.o;
        this.e0 = builder.p;
        List<ConnectionSpec> list = builder.s;
        this.h0 = list;
        this.i0 = builder.t;
        this.j0 = builder.u;
        this.m0 = builder.x;
        this.n0 = builder.y;
        this.o0 = builder.z;
        this.p0 = builder.A;
        this.q0 = builder.B;
        RouteDatabase routeDatabase = builder.C;
        this.r0 = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List<ConnectionSpec> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f0 = null;
            this.l0 = null;
            this.g0 = null;
            this.k0 = CertificatePinner.d;
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = builder.q;
                    if (sSLSocketFactory != null) {
                        this.f0 = sSLSocketFactory;
                        CertificateChainCleaner certificateChainCleaner = builder.w;
                        certificateChainCleaner.getClass();
                        this.l0 = certificateChainCleaner;
                        X509TrustManager x509TrustManager = builder.r;
                        x509TrustManager.getClass();
                        this.g0 = x509TrustManager;
                        CertificatePinner certificatePinner = builder.v;
                        certificatePinner.getClass();
                        this.k0 = wl7.b(certificatePinner.b, certificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.a, certificateChainCleaner);
                    } else {
                        Platform.Companion companion = Platform.a;
                        companion.getClass();
                        X509TrustManager x509TrustManagerN = Platform.b.n();
                        this.g0 = x509TrustManagerN;
                        this.f0 = Platform.b.m(x509TrustManagerN);
                        CertificateChainCleaner.a.getClass();
                        companion.getClass();
                        CertificateChainCleaner certificateChainCleanerB = Platform.b.b(x509TrustManagerN);
                        this.l0 = certificateChainCleanerB;
                        CertificatePinner certificatePinner2 = builder.v;
                        certificatePinner2.getClass();
                        this.k0 = wl7.b(certificatePinner2.b, certificateChainCleanerB) ? certificatePinner2 : new CertificatePinner(certificatePinner2.a, certificateChainCleanerB);
                    }
                }
            }
            this.f0 = null;
            this.l0 = null;
            this.g0 = null;
            this.k0 = CertificatePinner.d;
        }
        X509TrustManager x509TrustManager2 = this.g0;
        CertificateChainCleaner certificateChainCleaner2 = this.l0;
        SSLSocketFactory sSLSocketFactory2 = this.f0;
        List<Interceptor> list3 = this.d;
        List<Interceptor> list4 = this.c;
        list4.getClass();
        if (list4.contains(null)) {
            r40.g(list4, "Null interceptor: ");
            throw null;
        }
        list3.getClass();
        if (list3.contains(null)) {
            r40.g(list3, "Null network interceptor: ");
            throw null;
        }
        List<ConnectionSpec> list5 = this.h0;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator<T> it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        r6.g("sslSocketFactory == null");
                        throw null;
                    }
                    if (certificateChainCleaner2 == null) {
                        r6.g("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager2 != null) {
                        return;
                    }
                    r6.g("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            r6.g("Check failed.");
            throw null;
        }
        if (certificateChainCleaner2 != null) {
            r6.g("Check failed.");
            throw null;
        }
        if (x509TrustManager2 != null) {
            r6.g("Check failed.");
            throw null;
        }
        if (wl7.b(this.k0, CertificatePinner.d)) {
            return;
        }
        r6.g("Check failed.");
        throw null;
    }

    @Override // okhttp3.Call.Factory
    public final RealCall c(Request request) {
        request.getClass();
        return new RealCall(this, request, false);
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // okhttp3.WebSocket.Factory
    public final RealWebSocket d(Request request, WebSocketListener webSocketListener) {
        final RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.i, request, webSocketListener, new Random(), 0L, this.q0);
        if (request.c.a("Sec-WebSocket-Extensions") != null) {
            realWebSocket.i(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return realWebSocket;
        }
        Builder builderE = e();
        EventListener eventListener = EventListener.NONE;
        eventListener.getClass();
        byte[] bArr = Util.a;
        builderE.e = new g9(eventListener, 12);
        builderE.d(RealWebSocket.w);
        OkHttpClient okHttpClient = new OkHttpClient(builderE);
        Request.Builder builderB = request.b();
        builderB.d("Upgrade", "websocket");
        builderB.d("Connection", "Upgrade");
        builderB.d("Sec-WebSocket-Key", realWebSocket.f);
        builderB.d("Sec-WebSocket-Version", "13");
        builderB.d("Sec-WebSocket-Extensions", "permessage-deflate");
        final Request requestB = builderB.b();
        RealCall realCall = new RealCall(okHttpClient, requestB, true);
        realWebSocket.g = realCall;
        realCall.R0(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public final void h(Call call, IOException iOException) {
                realWebSocket.i(iOException, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[PHI: r10 r12 r14
  0x00a7: PHI (r10v5 java.lang.Integer) = (r10v4 java.lang.Integer), (r10v9 java.lang.Integer) binds: [B:48:0x00d2, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x00a7: PHI (r12v8 java.lang.Integer) = (r12v6 java.lang.Integer), (r12v4 java.lang.Integer) binds: [B:48:0x00d2, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x00a7: PHI (r14v17 boolean) = (r14v11 boolean), (r14v20 boolean) binds: [B:48:0x00d2, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
            @Override // okhttp3.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void p(okhttp3.Call r20, okhttp3.Response r21) {
                /*
                    Method dump skipped, instruction units count: 389
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket$connect$1.p(okhttp3.Call, okhttp3.Response):void");
            }
        });
        return realWebSocket;
    }

    public final Builder e() {
        Builder builder = new Builder();
        builder.a = this.a;
        builder.b = this.b;
        w92.w0(builder.c, this.c);
        w92.w0(builder.d, this.d);
        builder.e = this.e;
        builder.f = this.f;
        builder.g = this.V;
        builder.h = this.W;
        builder.i = this.X;
        builder.j = this.Y;
        builder.k = this.Z;
        builder.l = this.a0;
        builder.m = this.b0;
        builder.n = this.c0;
        builder.o = this.d0;
        builder.p = this.e0;
        builder.q = this.f0;
        builder.r = this.g0;
        builder.s = this.h0;
        builder.t = this.i0;
        builder.u = this.j0;
        builder.v = this.k0;
        builder.w = this.l0;
        builder.x = this.m0;
        builder.y = this.n0;
        builder.z = this.o0;
        builder.A = this.p0;
        builder.B = this.q0;
        builder.C = this.r0;
        return builder;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
