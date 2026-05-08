package okhttp3;

import defpackage.bs4;
import defpackage.ct0;
import defpackage.h5;
import defpackage.l5;
import defpackage.r6;
import defpackage.u63;
import defpackage.wve;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Request;", "", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Request {
    public final HttpUrl a;
    public final String b;
    public final Headers c;
    public final RequestBody d;
    public final Map<Class<?>, Object> e;
    public CacheControl f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {
        public HttpUrl a;
        public RequestBody d;
        public LinkedHashMap e = new LinkedHashMap();
        public String b = "GET";
        public Headers.Builder c = new Headers.Builder();

        public final void a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.c.a(str, str2);
        }

        public final Request b() {
            Map mapUnmodifiableMap;
            HttpUrl httpUrl = this.a;
            if (httpUrl == null) {
                r6.g("url == null");
                return null;
            }
            String str = this.b;
            Headers headersE = this.c.e();
            RequestBody requestBody = this.d;
            LinkedHashMap linkedHashMap = this.e;
            byte[] bArr = Util.a;
            linkedHashMap.getClass();
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = bs4.a;
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                mapUnmodifiableMap.getClass();
            }
            return new Request(httpUrl, str, headersE, requestBody, mapUnmodifiableMap);
        }

        public final void c(CacheControl cacheControl) {
            cacheControl.getClass();
            String string = cacheControl.toString();
            if (string.length() == 0) {
                this.c.g("Cache-Control");
            } else {
                d("Cache-Control", string);
            }
        }

        public final void d(String str, String str2) {
            str.getClass();
            str2.getClass();
            Headers.Builder builder = this.c;
            builder.getClass();
            Headers.b.getClass();
            Headers.Companion.b(str);
            Headers.Companion.c(str2, str);
            builder.g(str);
            builder.c(str, str2);
        }

        public final void e(String str, RequestBody requestBody) {
            str.getClass();
            if (str.length() <= 0) {
                l5.q("method.isEmpty() == true");
                return;
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.a;
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    h5.k(l5.m("method ", str, " must have a request body."));
                    return;
                }
            } else if (!HttpMethod.b(str)) {
                h5.k(l5.m("method ", str, " must not have a request body."));
                return;
            }
            this.b = str;
            this.d = requestBody;
        }

        public final void f(Class cls, Object obj) {
            cls.getClass();
            LinkedHashMap linkedHashMap = this.e;
            if (obj == null) {
                linkedHashMap.remove(cls);
                return;
            }
            if (linkedHashMap.isEmpty()) {
                this.e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap2 = this.e;
            Object objCast = cls.cast(obj);
            objCast.getClass();
            linkedHashMap2.put(cls, objCast);
        }

        public final void g(String str) {
            str.getClass();
            if (wve.K(str, "ws:", true)) {
                str = "http:".concat(str.substring(3));
            } else if (wve.K(str, "wss:", true)) {
                str = "https:".concat(str.substring(4));
            }
            HttpUrl.k.getClass();
            this.a = HttpUrl.Companion.c(str);
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        httpUrl.getClass();
        str.getClass();
        this.a = httpUrl;
        this.b = str;
        this.c = headers;
        this.d = requestBody;
        this.e = map;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.n.getClass();
        CacheControl cacheControlA = CacheControl.Companion.a(this.c);
        this.f = cacheControlA;
        return cacheControlA;
    }

    public final Builder b() {
        Builder builder = new Builder();
        builder.e = new LinkedHashMap();
        builder.a = this.a;
        builder.b = this.b;
        builder.d = this.d;
        Map<Class<?>, Object> map = this.e;
        builder.e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        builder.c = this.c.d();
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        Headers headers = this.c;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            Iterator<Pair<? extends String, ? extends String>> it = headers.iterator();
            int i = 0;
            while (true) {
                ct0 ct0Var = (ct0) it;
                if (!ct0Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = ct0Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                Pair pair = (Pair) next;
                String str = (String) pair.a();
                String str2 = (String) pair.b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        Map<Class<?>, Object> map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
