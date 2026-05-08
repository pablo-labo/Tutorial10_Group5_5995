package okhttp3.internal.http;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.je6;
import defpackage.u63;
import defpackage.uqc;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BridgeInterceptor implements Interceptor {
    public final CookieJar a;

    public BridgeInterceptor(CookieJar cookieJar) {
        cookieJar.getClass();
        this.a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        boolean z;
        String str;
        ResponseBody responseBody;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.e;
        Request.Builder builderB = request.b();
        HttpUrl httpUrl = request.a;
        Headers headers = request.c;
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            MediaType a = requestBody.getC();
            if (a != null) {
                builderB.d(TracingInterceptor.HEADER_CT, a.a);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                builderB.d("Content-Length", String.valueOf(jContentLength));
                builderB.c.g("Transfer-Encoding");
            } else {
                builderB.d("Transfer-Encoding", "chunked");
                builderB.c.g("Content-Length");
            }
        }
        int i = 0;
        if (headers.a("Host") == null) {
            builderB.d("Host", Util.w(httpUrl, false));
        }
        if (headers.a("Connection") == null) {
            builderB.d("Connection", "Keep-Alive");
        }
        if (headers.a("Accept-Encoding") == null && headers.a("Range") == null) {
            builderB.d("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        CookieJar cookieJar = this.a;
        List<Cookie> listB = cookieJar.b(httpUrl);
        if (listB.isEmpty()) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (Object obj : listB) {
                int i2 = i + 1;
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                Cookie cookie = (Cookie) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(cookie.a);
                sb.append('=');
                sb.append(cookie.b);
                i = i2;
            }
            str = null;
            builderB.d("Cookie", sb.toString());
        }
        if (headers.a(DataOkHttpUploader.HEADER_USER_AGENT) == null) {
            builderB.d(DataOkHttpUploader.HEADER_USER_AGENT, "okhttp/4.12.0");
        }
        Response responseB = realInterceptorChain.b(builderB.b());
        Headers headers2 = responseB.f;
        HttpHeaders.d(cookieJar, httpUrl, headers2);
        Response.Builder builderP = responseB.p();
        builderP.a = request;
        if (z) {
            String strA = headers2.a("Content-Encoding");
            if (strA == null) {
                strA = str;
            }
            if ("gzip".equalsIgnoreCase(strA) && HttpHeaders.a(responseB) && (responseBody = responseB.V) != null) {
                je6 je6Var = new je6(responseBody.getE());
                Headers.Builder builderD = headers2.d();
                builderD.g("Content-Encoding");
                builderD.g("Content-Length");
                builderP.f = builderD.e().d();
                String strA2 = headers2.a(TracingInterceptor.HEADER_CT);
                builderP.g = new RealResponseBody(strA2 == null ? str : strA2, -1L, new uqc(je6Var));
            }
        }
        return builderP.a();
    }
}
