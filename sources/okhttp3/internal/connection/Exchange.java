package okhttp3.internal.connection;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.eq5;
import defpackage.fie;
import defpackage.fq5;
import defpackage.pne;
import defpackage.r6;
import defpackage.tqc;
import defpackage.uqc;
import defpackage.w40;
import defpackage.zn1;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import kotlin.Metadata;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Exchange {
    public final RealCall a;
    public final EventListener b;
    public final ExchangeFinder c;
    public final ExchangeCodec d;
    public boolean e;
    public boolean f;
    public final RealConnection g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Leq5;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RequestBodySink extends eq5 {
        public final long b;
        public boolean c;
        public long d;
        public boolean e;
        public final /* synthetic */ Exchange f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, fie fieVar, long j) {
            super(fieVar);
            fieVar.getClass();
            this.f = exchange;
            this.b = j;
        }

        @Override // defpackage.eq5, defpackage.fie
        public final void I1(zn1 zn1Var, long j) throws IOException {
            zn1Var.getClass();
            if (this.e) {
                r6.g("closed");
                return;
            }
            long j2 = this.b;
            if (j2 != -1 && this.d + j > j2) {
                StringBuilder sbI = w40.i(j2, "expected ", " bytes but received ");
                sbI.append(this.d + j);
                throw new ProtocolException(sbI.toString());
            }
            try {
                this.a.I1(zn1Var, j);
                this.d += j;
            } catch (IOException e) {
                throw a(e);
            }
        }

        public final <E extends IOException> E a(E e) {
            if (this.c) {
                return e;
            }
            this.c = true;
            return (E) this.f.a(this.d, false, true, e);
        }

        @Override // defpackage.eq5, defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.e) {
                return;
            }
            this.e = true;
            long j = this.b;
            if (j != -1 && this.d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.eq5, defpackage.fie, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lfq5;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ResponseBodySource extends fq5 {
        public final /* synthetic */ Exchange V;
        public final long b;
        public long c;
        public boolean d;
        public boolean e;
        public boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, pne pneVar, long j) {
            super(pneVar);
            pneVar.getClass();
            this.V = exchange;
            this.b = j;
            this.d = true;
            if (j == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e) {
            if (this.e) {
                return e;
            }
            this.e = true;
            Exchange exchange = this.V;
            if (e == null && this.d) {
                this.d = false;
                exchange.b.responseBodyStart(exchange.a);
            }
            return (E) exchange.a(this.c, true, false, e);
        }

        @Override // defpackage.fq5, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f) {
                return;
            }
            this.f = true;
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.fq5, defpackage.pne
        public final long f1(zn1 zn1Var, long j) throws IOException {
            zn1Var.getClass();
            if (this.f) {
                r6.g("closed");
                return 0L;
            }
            try {
                long jF1 = this.a.f1(zn1Var, j);
                if (this.d) {
                    this.d = false;
                    Exchange exchange = this.V;
                    exchange.b.responseBodyStart(exchange.a);
                }
                if (jF1 == -1) {
                    a(null);
                    return -1L;
                }
                long j2 = this.c + jF1;
                long j3 = this.b;
                if (j3 == -1 || j2 <= j3) {
                    this.c = j2;
                    if (j2 == j3) {
                        a(null);
                    }
                    return jF1;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw a(e);
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        eventListener.getClass();
        exchangeFinder.getClass();
        this.a = realCall;
        this.b = eventListener;
        this.c = exchangeFinder;
        this.d = exchangeCodec;
        this.g = exchangeCodec.getA();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E extends IOException> E a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            f(e);
        }
        EventListener eventListener = this.b;
        RealCall realCall = this.a;
        if (z2) {
            if (e != null) {
                eventListener.requestFailed(realCall, e);
            } else {
                eventListener.requestBodyEnd(realCall, j);
            }
        }
        if (z) {
            if (e != null) {
                eventListener.responseFailed(realCall, e);
            } else {
                eventListener.responseBodyEnd(realCall, j);
            }
        }
        return (E) realCall.h(this, z2, z, e);
    }

    public final fie b(Request request, boolean z) {
        request.getClass();
        this.e = z;
        RequestBody requestBody = request.d;
        requestBody.getClass();
        long jContentLength = requestBody.contentLength();
        this.b.requestBodyStart(this.a);
        return new RequestBodySink(this, this.d.e(request, jContentLength), jContentLength);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnection$newWebSocketStreams$1] */
    public final RealConnection$newWebSocketStreams$1 c() throws SocketException {
        this.a.k();
        RealConnection realConnectionC = this.d.getA();
        realConnectionC.getClass();
        Socket socket = realConnectionC.d;
        socket.getClass();
        final uqc uqcVar = realConnectionC.h;
        uqcVar.getClass();
        final tqc tqcVar = realConnectionC.i;
        tqcVar.getClass();
        socket.setSoTimeout(0);
        realConnectionC.k();
        return new RealWebSocket.Streams(uqcVar, tqcVar) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.a(-1L, true, true, null);
            }
        };
    }

    public final RealResponseBody d(Response response) throws IOException {
        ExchangeCodec exchangeCodec = this.d;
        try {
            String strA = response.f.a(TracingInterceptor.HEADER_CT);
            if (strA == null) {
                strA = null;
            }
            long jD = exchangeCodec.d(response);
            return new RealResponseBody(strA, jD, new uqc(new ResponseBodySource(this, exchangeCodec.b(response), jD)));
        } catch (IOException e) {
            this.b.responseFailed(this.a, e);
            f(e);
            throw e;
        }
    }

    public final Response.Builder e(boolean z) throws IOException {
        try {
            Response.Builder builderG = this.d.g(z);
            if (builderG == null) {
                return builderG;
            }
            builderG.m = this;
            return builderG;
        } catch (IOException e) {
            this.b.responseFailed(this.a, e);
            f(e);
            throw e;
        }
    }

    public final void f(IOException iOException) {
        this.f = true;
        this.c.b(iOException);
        RealConnection realConnectionC = this.d.getA();
        RealCall realCall = this.a;
        synchronized (realConnectionC) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(realConnectionC.g != null) || (iOException instanceof ConnectionShutdownException)) {
                        realConnectionC.j = true;
                        if (realConnectionC.m == 0) {
                            RealConnection.d(realCall.a, realConnectionC.b, iOException);
                            realConnectionC.l++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = realConnectionC.n + 1;
                    realConnectionC.n = i;
                    if (i > 1) {
                        realConnectionC.j = true;
                        realConnectionC.l++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.e0) {
                    realConnectionC.j = true;
                    realConnectionC.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
