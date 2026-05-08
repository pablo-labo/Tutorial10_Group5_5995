package defpackage;

import android.content.Context;
import android.net.Uri;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.linecorp.linesdk.LineApiError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class l22 {
    public static final byte[] e = new byte[0];
    public final zig a;
    public final ee3 b = new ee3(29);
    public final int c = 90000;
    public final int d = 90000;

    public l22(Context context) {
        this.a = new zig(context);
    }

    public static <T> ww8<T> b(HttpURLConnection httpURLConnection, n6d<T> n6dVar, n6d<String> n6dVar2) throws IOException {
        InputStream inputStream = httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (list.get(i).equalsIgnoreCase("gzip")) {
                    inputStream = new GZIPInputStream(inputStream);
                    break;
                }
                i++;
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        try {
            return (responseCode == 200 || responseCode == 204) ? n6dVar == null ? (ww8<T>) ww8.d : ww8.b(n6dVar.e(inputStream)) : ww8.a(xw8.d, new LineApiError(responseCode, n6dVar2.e(inputStream), LineApiError.b.c));
        } catch (IOException e2) {
            return ww8.a(xw8.f, new LineApiError(e2, LineApiError.b.b));
        }
    }

    public static HttpURLConnection e(Uri uri) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
        if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
            return (HttpURLConnection) uRLConnectionOpenConnection;
        }
        l5.q(p6.d(uri, "The scheme of the server url must be https."));
        return null;
    }

    public static void h(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public final <T> ww8<T> a(Uri uri, Map<String, String> map, Map<String, String> map2, n6d<T> n6dVar) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        thg.a(builderBuildUpon, map2);
        HttpURLConnection httpURLConnectionD = null;
        try {
            try {
                httpURLConnectionD = d(builderBuildUpon.build());
                h(httpURLConnectionD, map);
                httpURLConnectionD.connect();
                ww8<T> ww8VarB = b(httpURLConnectionD, n6dVar, this.b);
                httpURLConnectionD.disconnect();
                return ww8VarB;
            } catch (IOException e2) {
                ww8<T> ww8VarA = ww8.a(xw8.c, new LineApiError(e2));
                if (httpURLConnectionD != null) {
                    httpURLConnectionD.disconnect();
                }
                return ww8VarA;
            }
        } catch (Throwable th) {
            if (httpURLConnectionD != null) {
                httpURLConnectionD.disconnect();
            }
            throw th;
        }
    }

    public final HttpURLConnection c(int i, Uri uri) throws IOException {
        HttpURLConnection httpURLConnectionE = e(uri);
        httpURLConnectionE.setInstanceFollowRedirects(true);
        httpURLConnectionE.setRequestProperty(DataOkHttpUploader.HEADER_USER_AGENT, this.a.a());
        httpURLConnectionE.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnectionE.setRequestProperty(TracingInterceptor.HEADER_CT, "application/json");
        httpURLConnectionE.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnectionE.setConnectTimeout(this.c);
        httpURLConnectionE.setReadTimeout(this.d);
        httpURLConnectionE.setRequestMethod("POST");
        httpURLConnectionE.setDoOutput(true);
        return httpURLConnectionE;
    }

    public final HttpURLConnection d(Uri uri) throws IOException {
        HttpURLConnection httpURLConnectionE = e(uri);
        httpURLConnectionE.setInstanceFollowRedirects(true);
        httpURLConnectionE.setRequestProperty(DataOkHttpUploader.HEADER_USER_AGENT, this.a.a());
        httpURLConnectionE.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnectionE.setConnectTimeout(this.c);
        httpURLConnectionE.setReadTimeout(this.d);
        httpURLConnectionE.setRequestMethod("GET");
        return httpURLConnectionE;
    }

    public final HttpURLConnection f(int i, Uri uri) throws IOException {
        HttpURLConnection httpURLConnectionE = e(uri);
        httpURLConnectionE.setInstanceFollowRedirects(true);
        httpURLConnectionE.setRequestProperty(DataOkHttpUploader.HEADER_USER_AGENT, this.a.a());
        httpURLConnectionE.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnectionE.setRequestProperty(TracingInterceptor.HEADER_CT, "application/x-www-form-urlencoded");
        httpURLConnectionE.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnectionE.setConnectTimeout(this.c);
        httpURLConnectionE.setReadTimeout(this.d);
        httpURLConnectionE.setRequestMethod("POST");
        httpURLConnectionE.setDoOutput(true);
        return httpURLConnectionE;
    }

    public final ww8 g(Uri uri, LinkedHashMap linkedHashMap, n6d n6dVar) {
        byte[] bytes;
        Map map = Collections.EMPTY_MAP;
        HttpURLConnection httpURLConnectionF = null;
        if (linkedHashMap.isEmpty()) {
            bytes = e;
        } else {
            Uri.Builder builderBuildUpon = Uri.parse("").buildUpon();
            thg.a(builderBuildUpon, linkedHashMap);
            try {
                bytes = builderBuildUpon.build().getEncodedQuery().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e2) {
                l5.r(e2);
                return null;
            }
        }
        try {
            try {
                httpURLConnectionF = f(bytes.length, uri);
                h(httpURLConnectionF, map);
                httpURLConnectionF.connect();
                OutputStream outputStream = httpURLConnectionF.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                ww8 ww8VarB = b(httpURLConnectionF, n6dVar, this.b);
                httpURLConnectionF.disconnect();
                return ww8VarB;
            } catch (IOException e3) {
                ww8 ww8VarA = ww8.a(xw8.c, new LineApiError(e3));
                if (httpURLConnectionF != null) {
                    httpURLConnectionF.disconnect();
                }
                return ww8VarA;
            }
        } catch (Throwable th) {
            if (httpURLConnectionF != null) {
                httpURLConnectionF.disconnect();
            }
            throw th;
        }
    }
}
