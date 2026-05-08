package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class om6 extends h91 {

    public static class a extends FilterInputStream {
        public final HttpURLConnection a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(HttpURLConnection httpURLConnection) {
            InputStream errorStream;
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpURLConnection.getErrorStream();
            }
            super(errorStream);
            this.a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.a.disconnect();
        }
    }

    public static void R(HttpURLConnection httpURLConnection, m3d m3dVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey(TracingInterceptor.HEADER_CT)) {
            httpURLConnection.setRequestProperty(TracingInterceptor.HEADER_CT, m3dVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static ArrayList S(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new pg6((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void U(HttpURLConnection httpURLConnection, m3d m3dVar) throws IOException {
        switch (m3dVar.getMethod()) {
            case -1:
                byte[] postBody = m3dVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    R(httpURLConnection, m3dVar, postBody);
                }
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] body = m3dVar.getBody();
                if (body != null) {
                    R(httpURLConnection, m3dVar, body);
                }
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] body2 = m3dVar.getBody();
                if (body2 != null) {
                    R(httpURLConnection, m3dVar, body2);
                }
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] body3 = m3dVar.getBody();
                if (body3 != null) {
                    R(httpURLConnection, m3dVar, body3);
                }
                break;
            default:
                r6.g("Unknown method type.");
                break;
        }
    }

    public final cm6 T(m3d<?> m3dVar, Map<String, String> map) throws Throwable {
        String url = m3dVar.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(m3dVar.getHeaders());
        URL url2 = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int timeoutMs = m3dVar.getTimeoutMs();
        httpURLConnection.setConnectTimeout(timeoutMs);
        httpURLConnection.setReadTimeout(timeoutMs);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url2.getProtocol());
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            U(httpURLConnection, m3dVar);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (m3dVar.getMethod() == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                cm6 cm6Var = new cm6(responseCode, S(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return cm6Var;
            }
            try {
                return new cm6(responseCode, S(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new a(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
