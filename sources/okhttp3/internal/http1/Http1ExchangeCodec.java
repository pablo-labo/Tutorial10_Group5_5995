package okhttp3.internal.http1;

import defpackage.fie;
import defpackage.h5;
import defpackage.hq5;
import defpackage.kmf;
import defpackage.o6;
import defpackage.pne;
import defpackage.r6;
import defpackage.ro1;
import defpackage.to1;
import defpackage.tqc;
import defpackage.u40;
import defpackage.uqc;
import defpackage.zn1;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http1ExchangeCodec implements ExchangeCodec {
    public final OkHttpClient a;
    public final RealConnection b;
    public final to1 c;
    public final ro1 d;
    public int e;
    public final HeadersReader f;
    public Headers g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lpne;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public abstract class AbstractSource implements pne {
        public final hq5 a;
        public boolean b;

        public AbstractSource() {
            this.a = new hq5(Http1ExchangeCodec.this.c.g());
        }

        public final void a() {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            int i = http1ExchangeCodec.e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                o6.i(http1ExchangeCodec.e, "state: ");
            } else {
                Http1ExchangeCodec.i(http1ExchangeCodec, this.a);
                http1ExchangeCodec.e = 6;
            }
        }

        @Override // defpackage.pne
        public long f1(zn1 zn1Var, long j) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            zn1Var.getClass();
            try {
                return http1ExchangeCodec.c.f1(zn1Var, j);
            } catch (IOException e) {
                http1ExchangeCodec.b.k();
                this.a();
                throw e;
            }
        }

        @Override // defpackage.pne
        public final kmf g() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lfie;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ChunkedSink implements fie {
        public final hq5 a;
        public boolean b;

        public ChunkedSink() {
            this.a = new hq5(Http1ExchangeCodec.this.d.g());
        }

        @Override // defpackage.fie
        public final void I1(zn1 zn1Var, long j) {
            ro1 ro1Var = Http1ExchangeCodec.this.d;
            zn1Var.getClass();
            if (this.b) {
                r6.g("closed");
            } else {
                if (j == 0) {
                    return;
                }
                ro1Var.q1(j);
                ro1Var.Y("\r\n");
                ro1Var.I1(zn1Var, j);
                ro1Var.Y("\r\n");
            }
        }

        @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            Http1ExchangeCodec.this.d.Y("0\r\n\r\n");
            Http1ExchangeCodec.i(Http1ExchangeCodec.this, this.a);
            Http1ExchangeCodec.this.e = 3;
        }

        @Override // defpackage.fie, java.io.Flushable
        public final synchronized void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.this.d.flush();
        }

        @Override // defpackage.fie
        public final kmf g() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ChunkedSource extends AbstractSource {
        public final /* synthetic */ Http1ExchangeCodec V;
        public final HttpUrl d;
        public long e;
        public boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            httpUrl.getClass();
            this.V = http1ExchangeCodec;
            this.d = httpUrl;
            this.e = -1L;
            this.f = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zU;
            if (this.b) {
                return;
            }
            if (this.f) {
                byte[] bArr = Util.a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    zU = Util.u(this, 100);
                } catch (IOException unused) {
                    zU = false;
                }
                if (!zU) {
                    this.V.b.k();
                    a();
                }
            }
            this.b = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        
            if (r11.f == false) goto L31;
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.pne
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long f1(defpackage.zn1 r12, long r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.f1(zn1, long):long");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FixedLengthSource extends AbstractSource {
        public long d;

        public FixedLengthSource(long j) {
            super();
            this.d = j;
            if (j == 0) {
                a();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zU;
            if (this.b) {
                return;
            }
            if (this.d != 0) {
                byte[] bArr = Util.a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    zU = Util.u(this, 100);
                } catch (IOException unused) {
                    zU = false;
                }
                if (!zU) {
                    Http1ExchangeCodec.this.b.k();
                    a();
                }
            }
            this.b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.pne
        public final long f1(zn1 zn1Var, long j) throws IOException {
            zn1Var.getClass();
            if (j < 0) {
                h5.k(r6.c(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.b) {
                r6.g("closed");
                return 0L;
            }
            long j2 = this.d;
            if (j2 == 0) {
                return -1L;
            }
            long jF1 = super.f1(zn1Var, Math.min(j2, j));
            if (jF1 == -1) {
                Http1ExchangeCodec.this.b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            long j3 = this.d - jF1;
            this.d = j3;
            if (j3 == 0) {
                a();
            }
            return jF1;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lfie;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class KnownLengthSink implements fie {
        public final hq5 a;
        public boolean b;

        public KnownLengthSink() {
            this.a = new hq5(Http1ExchangeCodec.this.d.g());
        }

        @Override // defpackage.fie
        public final void I1(zn1 zn1Var, long j) {
            zn1Var.getClass();
            if (this.b) {
                r6.g("closed");
                return;
            }
            long j2 = zn1Var.b;
            byte[] bArr = Util.a;
            if (j < 0 || 0 > j2 || j2 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            Http1ExchangeCodec.this.d.I1(zn1Var, j);
        }

        @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            hq5 hq5Var = this.a;
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            Http1ExchangeCodec.i(http1ExchangeCodec, hq5Var);
            http1ExchangeCodec.e = 3;
        }

        @Override // defpackage.fie, java.io.Flushable
        public final void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.this.d.flush();
        }

        @Override // defpackage.fie
        public final kmf g() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class UnknownLengthSource extends AbstractSource {
        public boolean d;

        public UnknownLengthSource() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            if (!this.d) {
                a();
            }
            this.b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.pne
        public final long f1(zn1 zn1Var, long j) throws IOException {
            zn1Var.getClass();
            if (j < 0) {
                h5.k(r6.c(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.b) {
                r6.g("closed");
                return 0L;
            }
            if (this.d) {
                return -1L;
            }
            long jF1 = super.f1(zn1Var, j);
            if (jF1 != -1) {
                return jF1;
            }
            this.d = true;
            a();
            return -1L;
        }
    }

    static {
        new Companion(0);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, uqc uqcVar, tqc tqcVar) {
        uqcVar.getClass();
        tqcVar.getClass();
        this.a = okHttpClient;
        this.b = realConnection;
        this.c = uqcVar;
        this.d = tqcVar;
        this.f = new HeadersReader(uqcVar);
    }

    public static final void i(Http1ExchangeCodec http1ExchangeCodec, hq5 hq5Var) {
        kmf kmfVar = hq5Var.e;
        kmf.a aVar = kmf.d;
        aVar.getClass();
        hq5Var.e = aVar;
        kmfVar.a();
        kmfVar.b();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        this.d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final pne b(Response response) {
        if (!HttpHeaders.a(response)) {
            return j(0L);
        }
        String strA = response.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            HttpUrl httpUrl = response.a.a;
            if (this.e == 4) {
                this.e = 5;
                return new ChunkedSource(this, httpUrl);
            }
            u40.m(this.e, "state: ");
            return null;
        }
        long j = Util.j(response);
        if (j != -1) {
            return j(j);
        }
        if (this.e != 4) {
            u40.m(this.e, "state: ");
            return null;
        }
        this.e = 5;
        this.b.k();
        return new UnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RealConnection getA() {
        return this.b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            Util.d(socket);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long d(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        String strA = response.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return Util.j(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final fie e(Request request, long j) throws ProtocolException {
        request.getClass();
        RequestBody requestBody = request.d;
        if (requestBody != null && requestBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.c.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new ChunkedSink();
            }
            u40.m(this.e, "state: ");
            return null;
        }
        if (j == -1) {
            r6.g("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.e == 1) {
            this.e = 2;
            return new KnownLengthSink();
        }
        u40.m(this.e, "state: ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f(Request request) {
        request.getClass();
        RequestLine requestLine = RequestLine.a;
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        requestLine.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(request.b);
        sb.append(' ');
        HttpUrl httpUrl = request.a;
        if (httpUrl.j || type != Proxy.Type.HTTP) {
            sb.append(RequestLine.a(httpUrl));
        } else {
            sb.append(httpUrl);
        }
        sb.append(" HTTP/1.1");
        l(request.c, sb.toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder g(boolean z) {
        HeadersReader headersReader = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            u40.m(this.e, "state: ");
            return null;
        }
        try {
            StatusLine.Companion companion = StatusLine.d;
            String strS = headersReader.a.S(headersReader.b);
            headersReader.b -= (long) strS.length();
            companion.getClass();
            StatusLine statusLineA = StatusLine.Companion.a(strS);
            int i2 = statusLineA.b;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = statusLineA.a;
            protocol.getClass();
            builder.b = protocol;
            builder.c = i2;
            String str = statusLineA.c;
            str.getClass();
            builder.d = str;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String strS2 = headersReader.a.S(headersReader.b);
                headersReader.b -= (long) strS2.length();
                if (strS2.length() == 0) {
                    break;
                }
                builder2.b(strS2);
            }
            builder.f = builder2.e().d();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return builder;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return builder;
            }
            this.e = 3;
            return builder;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.i.g()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void h() {
        this.d.flush();
    }

    public final pne j(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new FixedLengthSource(j);
        }
        u40.m(this.e, "state: ");
        return null;
    }

    public final void k(Response response) {
        long j = Util.j(response);
        if (j == -1) {
            return;
        }
        pne pneVarJ = j(j);
        Util.u(pneVarJ, Integer.MAX_VALUE);
        ((FixedLengthSource) pneVarJ).close();
    }

    public final void l(Headers headers, String str) {
        if (this.e != 0) {
            u40.m(this.e, "state: ");
            return;
        }
        ro1 ro1Var = this.d;
        ro1Var.Y(str).Y("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            ro1Var.Y(headers.b(i)).Y(": ").Y(headers.g(i)).Y("\r\n");
        }
        ro1Var.Y("\r\n");
        this.e = 1;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "NO_CHUNK_YET", "", "STATE_CLOSED", "", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
