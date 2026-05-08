package com.google.android.recaptcha.internal;

import android.webkit.URLUtil;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class zzim {
    private final zzer zza;

    public zzim(zzer zzerVar) {
        this.zza = zzerVar;
    }

    public final boolean zza(zzakm zzakmVar) throws IOException {
        HttpURLConnection httpURLConnection;
        String strZzc = this.zza.zzc();
        if (URLUtil.isHttpUrl(strZzc)) {
            URLConnection uRLConnectionOpenConnection = new URL(strZzc).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } else {
            if (!URLUtil.isHttpsUrl(strZzc)) {
                throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
            }
            URLConnection uRLConnectionOpenConnection2 = new URL(strZzc).openConnection();
            uRLConnectionOpenConnection2.getClass();
            httpURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection2;
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(TracingInterceptor.HEADER_CT, "application/x-protobuffer");
        httpURLConnection.connect();
        httpURLConnection.getOutputStream().write(zzakmVar.zzy());
        return httpURLConnection.getResponseCode() == 200;
    }
}
