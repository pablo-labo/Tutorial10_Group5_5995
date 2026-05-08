package okhttp3.internal.connection;

import defpackage.dxa;
import defpackage.fne;
import defpackage.hf7;
import defpackage.kmf;
import defpackage.ppa;
import defpackage.sve;
import defpackage.tqc;
import defpackage.uqc;
import defpackage.vr1;
import defpackage.wl7;
import defpackage.wv0;
import defpackage.xv0;
import defpackage.z92;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public final Route b;
    public Socket c;
    public Socket d;
    public Handshake e;
    public Protocol f;
    public Http2Connection g;
    public uqc h;
    public tqc i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        realConnectionPool.getClass();
        route.getClass();
        this.b = route;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient okHttpClient, Route route, IOException iOException) {
        okHttpClient.getClass();
        route.getClass();
        iOException.getClass();
        if (route.b.type() != Proxy.Type.DIRECT) {
            Address address = route.a;
            address.h.connectFailed(address.i.i(), route.b.address(), iOException);
        }
        RouteDatabase routeDatabase = okHttpClient.r0;
        synchronized (routeDatabase) {
            routeDatabase.a.add(route);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final synchronized void a(Http2Connection http2Connection, Settings settings) {
        settings.getClass();
        this.o = (settings.a & 16) != 0 ? settings.b[4] : Integer.MAX_VALUE;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) {
        http2Stream.c(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[PHI: r1
  0x0079: PHI (r1v7 java.lang.Object) = (r1v23 java.lang.Object), (r1v24 java.lang.Object) binds: [B:21:0x006b, B:23:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v0, types: [okhttp3.internal.connection.RealConnection] */
    /* JADX WARN: Type inference failed for: r1v11, types: [okhttp3.EventListener] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.EventListener] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r13, int r14, int r15, boolean r16, okhttp3.Call r17, okhttp3.EventListener r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.c(int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void e(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Route route = this.b;
        Proxy proxy = route.b;
        Address address = route.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : WhenMappings.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = address.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        eventListener.connectStart(call, this.b.c, proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            Platform.a.getClass();
            Platform.b.e(socketCreateSocket, this.b.c, i);
            try {
                Logger logger = ppa.a;
                fne fneVar = new fne(socketCreateSocket);
                InputStream inputStream = socketCreateSocket.getInputStream();
                inputStream.getClass();
                this.h = new uqc(new xv0(fneVar, new hf7(inputStream, fneVar)));
                fne fneVar2 = new fne(socketCreateSocket);
                OutputStream outputStream = socketCreateSocket.getOutputStream();
                outputStream.getClass();
                this.i = new tqc(new wv0(fneVar2, new dxa(outputStream, fneVar2)));
            } catch (NullPointerException e) {
                if (wl7.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x013c, code lost:
    
        if (r4 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013f, code lost:
    
        r7 = r17.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0141, code lost:
    
        if (r7 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0143, code lost:
    
        okhttp3.internal.Util.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0146, code lost:
    
        r7 = null;
        r17.c = null;
        r17.i = null;
        r17.h = null;
        r22.connectEnd(r21, r5.c, r5.b, null);
        r12 = r16 + 1;
        r1 = r19;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r18, int r19, int r20, okhttp3.Call r21, okhttp3.EventListener r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.f(int, int, int, okhttp3.Call, okhttp3.EventListener):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(ConnectionSpecSelector connectionSpecSelector, Call call, EventListener eventListener) throws Throwable {
        Protocol protocolA;
        Address address = this.b.a;
        if (address.c == null) {
            List<Protocol> list = address.j;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean zContains = list.contains(protocol);
            Socket socket = this.c;
            if (!zContains) {
                this.d = socket;
                this.f = Protocol.HTTP_1_1;
                return;
            } else {
                this.d = socket;
                this.f = protocol;
                l();
                return;
            }
        }
        eventListener.secureConnectStart(call);
        Address address2 = this.b.a;
        SSLSocketFactory sSLSocketFactory = address2.c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            HttpUrl httpUrl = address2.i;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, httpUrl.d, httpUrl.e, true);
            socketCreateSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecA = connectionSpecSelector.a(sSLSocket2);
                if (connectionSpecA.b) {
                    Platform.a.getClass();
                    Platform.b.d(sSLSocket2, address2.i.d, address2.j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.e;
                session.getClass();
                companion.getClass();
                Handshake handshakeA = Handshake.Companion.a(session);
                HostnameVerifier hostnameVerifier = address2.d;
                hostnameVerifier.getClass();
                if (!hostnameVerifier.verify(address2.i.d, session)) {
                    List<Certificate> listA = handshakeA.a();
                    if (listA.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + address2.i.d + " not verified (no certificates)");
                    }
                    Certificate certificate = listA.get(0);
                    certificate.getClass();
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(address2.i.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    CertificatePinner.c.getClass();
                    StringBuilder sb2 = new StringBuilder("sha256/");
                    vr1 vr1Var = vr1.c;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    encoded.getClass();
                    sb2.append(vr1.a.d(encoded).e("SHA-256").a());
                    sb.append(sb2.toString());
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    OkHostnameVerifier.a.getClass();
                    sb.append(z92.h1(OkHostnameVerifier.a(x509Certificate, 7), OkHostnameVerifier.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(sve.x(sb.toString()));
                }
                CertificatePinner certificatePinner = address2.e;
                certificatePinner.getClass();
                this.e = new Handshake(handshakeA.a, handshakeA.b, handshakeA.c, new RealConnection$connectTls$1(certificatePinner, handshakeA, address2));
                certificatePinner.b(address2.i.d, new RealConnection$connectTls$2(this));
                if (connectionSpecA.b) {
                    Platform.a.getClass();
                    strF = Platform.b.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = ppa.a;
                fne fneVar = new fne(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new uqc(new xv0(fneVar, new hf7(inputStream, fneVar)));
                fne fneVar2 = new fne(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new tqc(new wv0(fneVar2, new dxa(outputStream, fneVar2)));
                if (strF != null) {
                    Protocol.a.getClass();
                    protocolA = Protocol.Companion.a(strF);
                } else {
                    protocolA = Protocol.HTTP_1_1;
                }
                this.f = protocolA;
                Platform.a.getClass();
                Platform.b.a(sSLSocket2);
                eventListener.secureConnectEnd(call, this.e);
                if (this.f == Protocol.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.a.getClass();
                    Platform.b.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(okhttp3.Address r10, java.util.List<okhttp3.Route> r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.h(okhttp3.Address, java.util.List):boolean");
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = Util.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.g;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f) {
                    return false;
                }
                if (http2Connection.d0 < http2Connection.c0) {
                    if (jNanoTime >= http2Connection.e0) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.W0();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final ExchangeCodec j(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        okHttpClient.getClass();
        int i = realInterceptorChain.g;
        Socket socket = this.d;
        socket.getClass();
        uqc uqcVar = this.h;
        uqcVar.getClass();
        tqc tqcVar = this.i;
        tqcVar.getClass();
        Http2Connection http2Connection = this.g;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(i);
        kmf kmfVarG = uqcVar.a.g();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kmfVarG.g(j, timeUnit);
        tqcVar.a.g().g(realInterceptorChain.h, timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, uqcVar, tqcVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws SocketException {
        Socket socket = this.d;
        socket.getClass();
        uqc uqcVar = this.h;
        uqcVar.getClass();
        tqc tqcVar = this.i;
        tqcVar.getClass();
        socket.setSoTimeout(0);
        TaskRunner taskRunner = TaskRunner.i;
        Http2Connection.Builder builder = new Http2Connection.Builder(taskRunner);
        String str = this.b.a.i.d;
        str.getClass();
        builder.b = socket;
        builder.c = Util.g + ' ' + str;
        builder.d = uqcVar;
        builder.e = tqcVar;
        builder.f = this;
        Http2Connection http2Connection = new Http2Connection(builder);
        this.g = http2Connection;
        Http2Connection.p0.getClass();
        Settings settings = Http2Connection.q0;
        this.o = (settings.a & 16) != 0 ? settings.b[4] : Integer.MAX_VALUE;
        Http2Writer http2Writer = http2Connection.m0;
        synchronized (http2Writer) {
            try {
                if (http2Writer.d) {
                    throw new IOException("closed");
                }
                Logger logger = Http2Writer.f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.h(">> CONNECTION " + Http2.b.m(), new Object[0]));
                }
                http2Writer.a.v0(Http2.b);
                http2Writer.a.flush();
            } finally {
            }
        }
        Http2Writer http2Writer2 = http2Connection.m0;
        Settings settings2 = http2Connection.f0;
        synchronized (http2Writer2) {
            try {
                settings2.getClass();
                if (http2Writer2.d) {
                    throw new IOException("closed");
                }
                http2Writer2.p(0, Integer.bitCount(settings2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & settings2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        http2Writer2.a.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        http2Writer2.a.writeInt(settings2.b[i]);
                    }
                    i++;
                }
                http2Writer2.a.flush();
            } finally {
            }
        }
        if (http2Connection.f0.a() != 65535) {
            http2Connection.m0.P(0, r9 - 65535);
        }
        TaskQueue taskQueueE = taskRunner.e();
        final String str2 = http2Connection.c;
        final Http2Connection.ReaderRunnable readerRunnable = http2Connection.n0;
        taskQueueE.c(new Task(str2) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                readerRunnable.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.b;
        sb.append(route.a.i.d);
        sb.append(':');
        sb.append(route.a.i.e);
        sb.append(", proxy=");
        sb.append(route.b);
        sb.append(" hostAddress=");
        sb.append(route.c);
        sb.append(" cipherSuite=");
        Handshake handshake = this.e;
        sb.append(handshake != null ? handshake.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "<init>", "()V", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
