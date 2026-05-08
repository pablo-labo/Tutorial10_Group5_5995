package okhttp3.internal.http2;

import com.datadog.android.log.LogAttributes;
import defpackage.fie;
import defpackage.j6g;
import defpackage.pne;
import defpackage.r40;
import defpackage.r6;
import defpackage.vr1;
import defpackage.wl7;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2ExchangeCodec implements ExchangeCodec {
    public static final Companion g = new Companion(0);
    public static final List<String> h = Util.k("connection", LogAttributes.HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> i = Util.k("connection", LogAttributes.HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final RealConnection a;
    public final RealInterceptorChain b;
    public final Http2Connection c;
    public volatile Http2Stream d;
    public final Protocol e;
    public volatile boolean f;

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        okHttpClient.getClass();
        http2Connection.getClass();
        this.a = realConnection;
        this.b = realInterceptorChain;
        this.c = http2Connection;
        List<Protocol> list = okHttpClient.i0;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        http2Stream.f().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final pne b(Response response) {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream.i;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RealConnection getA() {
        return this.a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f = true;
        Http2Stream http2Stream = this.d;
        if (http2Stream != null) {
            http2Stream.e(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long d(Response response) {
        if (HttpHeaders.a(response)) {
            return Util.j(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final fie e(Request request, long j) {
        request.getClass();
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream.f();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f(Request request) throws IOException {
        int i2;
        Http2Stream http2Stream;
        boolean z;
        request.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = request.d != null;
        g.getClass();
        Headers headers = request.c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f, request.b));
        vr1 vr1Var = Header.g;
        RequestLine requestLine = RequestLine.a;
        HttpUrl httpUrl = request.a;
        requestLine.getClass();
        arrayList.add(new Header(vr1Var, RequestLine.a(httpUrl)));
        String strA = headers.a("Host");
        if (strA != null) {
            arrayList.add(new Header(Header.i, strA));
        }
        arrayList.add(new Header(Header.h, httpUrl.a));
        int size = headers.size();
        for (int i3 = 0; i3 < size; i3++) {
            String strB = headers.b(i3);
            Locale locale = Locale.US;
            String strF = r6.f(locale, strB, locale);
            if (!h.contains(strF) || (strF.equals("te") && wl7.b(headers.g(i3), "trailers"))) {
                arrayList.add(new Header(strF, headers.g(i3)));
            }
        }
        Http2Connection http2Connection = this.c;
        http2Connection.getClass();
        boolean z3 = !z2;
        synchronized (http2Connection.m0) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.e > 1073741823) {
                        http2Connection.v(ErrorCode.REFUSED_STREAM);
                    }
                    if (http2Connection.f) {
                        throw new ConnectionShutdownException();
                    }
                    i2 = http2Connection.e;
                    http2Connection.e = i2 + 2;
                    http2Stream = new Http2Stream(i2, http2Connection, z3, false, null);
                    z = !z2 || http2Connection.j0 >= http2Connection.k0 || http2Stream.e >= http2Stream.f;
                    if (http2Stream.h()) {
                        http2Connection.b.put(Integer.valueOf(i2), http2Stream);
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            http2Connection.m0.v(i2, arrayList, z3);
        }
        if (z) {
            http2Connection.m0.flush();
        }
        this.d = http2Stream;
        boolean z4 = this.f;
        Http2Stream http2Stream2 = this.d;
        if (z4) {
            http2Stream2.getClass();
            http2Stream2.e(ErrorCode.CANCEL);
            r40.h("Canceled");
            return;
        }
        http2Stream2.getClass();
        Http2Stream.StreamTimeout streamTimeout = http2Stream2.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.g(j, timeUnit);
        Http2Stream http2Stream3 = this.d;
        http2Stream3.getClass();
        http2Stream3.l.g(this.b.h, timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder g(boolean z) throws IOException {
        Headers headers;
        Http2Stream http2Stream = this.d;
        if (http2Stream == null) {
            r40.h("stream wasn't created");
            return null;
        }
        synchronized (http2Stream) {
            http2Stream.k.i();
            while (http2Stream.g.isEmpty() && http2Stream.m == null) {
                try {
                    try {
                        http2Stream.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    http2Stream.k.l();
                    throw th;
                }
            }
            http2Stream.k.l();
            if (http2Stream.g.isEmpty()) {
                IOException iOException = http2Stream.n;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = http2Stream.m;
                errorCode.getClass();
                throw new StreamResetException(errorCode);
            }
            Headers headersRemoveFirst = http2Stream.g.removeFirst();
            headersRemoveFirst.getClass();
            headers = headersRemoveFirst;
        }
        Companion companion = g;
        Protocol protocol = this.e;
        companion.getClass();
        protocol.getClass();
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLineA = null;
        for (int i2 = 0; i2 < size; i2++) {
            String strB = headers.b(i2);
            String strG = headers.g(i2);
            if (wl7.b(strB, ":status")) {
                StatusLine.d.getClass();
                statusLineA = StatusLine.Companion.a("HTTP/1.1 " + strG);
            } else if (!i.contains(strB)) {
                builder.c(strB, strG);
            }
        }
        if (statusLineA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.b = protocol;
        builder2.c = statusLineA.b;
        String str = statusLineA.c;
        str.getClass();
        builder2.d = str;
        builder2.f = builder.e().d();
        if (z && builder2.c == 100) {
            return null;
        }
        return builder2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void h() {
        this.c.flush();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "<init>", "()V", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
