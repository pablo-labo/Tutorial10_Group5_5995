package okhttp3;

import defpackage.h5;
import defpackage.k20;
import defpackage.r6;
import defpackage.u40;
import defpackage.uqc;
import defpackage.zn1;
import java.io.Closeable;
import java.io.EOFException;
import kotlin.Metadata;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Response implements Closeable {
    public final ResponseBody V;
    public final Response W;
    public final Response X;
    public final Response Y;
    public final long Z;
    public final Request a;
    public final long a0;
    public final Protocol b;
    public final Exchange b0;
    public final String c;
    public CacheControl c0;
    public final int d;
    public final Handshake e;
    public final Headers f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {
        public Request a;
        public Protocol b;
        public String d;
        public Handshake e;
        public ResponseBody g;
        public Response h;
        public Response i;
        public Response j;
        public long k;
        public long l;
        public Exchange m;
        public int c = -1;
        public Headers.Builder f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.V != null) {
                    h5.k(str.concat(".body != null"));
                    return;
                }
                if (response.W != null) {
                    h5.k(str.concat(".networkResponse != null"));
                } else if (response.X != null) {
                    h5.k(str.concat(".cacheResponse != null"));
                } else {
                    if (response.Y == null) {
                        return;
                    }
                    h5.k(str.concat(".priorResponse != null"));
                }
            }
        }

        public final Response a() {
            int i = this.c;
            if (i < 0) {
                u40.m(this.c, "code < 0: ");
                return null;
            }
            Request request = this.a;
            if (request == null) {
                r6.g("request == null");
                return null;
            }
            Protocol protocol = this.b;
            if (protocol == null) {
                r6.g("protocol == null");
                return null;
            }
            String str = this.d;
            if (str != null) {
                return new Response(request, protocol, str, i, this.e, this.f.e(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            r6.g("message == null");
            return null;
        }
    }

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
        request.getClass();
        protocol.getClass();
        str.getClass();
        this.a = request;
        this.b = protocol;
        this.c = str;
        this.d = i;
        this.e = handshake;
        this.f = headers;
        this.V = responseBody;
        this.W = response;
        this.X = response2;
        this.Y = response3;
        this.Z = j;
        this.a0 = j2;
        this.b0 = exchange;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.c0;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.n.getClass();
        CacheControl cacheControlA = CacheControl.Companion.a(this.f);
        this.c0 = cacheControlA;
        return cacheControlA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.V;
        if (responseBody != null) {
            responseBody.close();
        } else {
            r6.g("response is not eligible for a body and must not be closed");
        }
    }

    public final boolean h() {
        int i = this.d;
        return 200 <= i && i < 300;
    }

    public final Builder p() {
        Builder builder = new Builder();
        builder.a = this.a;
        builder.b = this.b;
        builder.c = this.d;
        builder.d = this.c;
        builder.e = this.e;
        builder.f = this.f.d();
        builder.g = this.V;
        builder.h = this.W;
        builder.i = this.X;
        builder.j = this.Y;
        builder.k = this.Z;
        builder.l = this.a0;
        builder.m = this.b0;
        return builder;
    }

    public final ResponseBody$Companion$asResponseBody$1 s() throws EOFException {
        ResponseBody responseBody = this.V;
        responseBody.getClass();
        uqc uqcVarPeek = responseBody.getE().peek();
        zn1 zn1Var = new zn1();
        uqcVarPeek.request(33554432L);
        long jMin = Math.min(33554432L, uqcVarPeek.b.b);
        while (jMin > 0) {
            long jF1 = uqcVarPeek.f1(zn1Var, jMin);
            if (jF1 == -1) {
                k20.n();
                return null;
            }
            jMin -= jF1;
        }
        ResponseBody.Companion companion = ResponseBody.b;
        MediaType mediaTypeS = responseBody.getC();
        long j = zn1Var.b;
        companion.getClass();
        return new ResponseBody$Companion$asResponseBody$1(mediaTypeS, j, zn1Var);
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
