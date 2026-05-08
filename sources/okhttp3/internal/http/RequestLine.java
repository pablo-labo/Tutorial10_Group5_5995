package okhttp3.internal.http;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.g7;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestLine {
    public static final RequestLine a = new RequestLine();

    private RequestLine() {
    }

    public static String a(HttpUrl httpUrl) {
        httpUrl.getClass();
        String strB = httpUrl.b();
        String strD = httpUrl.d();
        return strD != null ? g7.e(TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR, strB, strD) : strB;
    }
}
