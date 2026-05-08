package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import defpackage.ke3;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lm6 implements ke3<InputStream> {
    public final p96 a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public static class a {
    }

    public lm6(p96 p96Var, int i) {
        this.a = p96Var;
        this.b = i;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // defpackage.ke3
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.ke3
    public final void b() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.ke3
    public final void cancel() {
        this.e = true;
    }

    @Override // defpackage.ke3
    public final void d(knb knbVar, ke3.a<? super InputStream> aVar) {
        p96 p96Var = this.a;
        int i = n39.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(f(p96Var.d(), 0, null, p96Var.b.a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + n39.a(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                aVar.c(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + n39.a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + n39.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // defpackage.ke3
    public final xe3 e() {
        return xe3.b;
    }

    public final InputStream f(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iC = c(this.c);
                int i3 = iC / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new xs2(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new HttpException("Failed to obtain InputStream", c(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iC == -1) {
                        throw new HttpException("Http request failed", iC, null);
                    }
                    try {
                        throw new HttpException(this.c.getResponseMessage(), iC, null);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", iC, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", iC, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(l5.l("Bad redirect url: ", headerField), iC, e3);
                }
            } catch (IOException e4) {
                throw new HttpException("Failed to connect or obtain data", c(this.c), e4);
            }
        } catch (IOException e5) {
            throw new HttpException("URL.openConnection threw", 0, e5);
        }
    }
}
