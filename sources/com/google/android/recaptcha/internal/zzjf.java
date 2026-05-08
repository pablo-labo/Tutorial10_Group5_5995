package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.nn2;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjf {
    private final String zza = "https://www.gstatic.com/recaptcha/verify_key/orcas/prod/android/verify_key.txt";

    public zzjf(String str) {
    }

    public final Object zza(lu2 lu2Var) throws zzeg {
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.zza).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzeg(zzee.zzc, new zzed(httpURLConnection.getResponseCode()), null, null, 12, null);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    return nn2.y("gzip".equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(inputStream)) : new InputStreamReader(inputStream));
                } catch (Exception e) {
                    throw new zzeg(zzee.zzc, zzed.zzbf, e.getMessage(), null, 8, null);
                }
            } catch (Exception e2) {
                throw new zzeg(zzee.zzc, zzed.zzbe, e2.getMessage(), null, 8, null);
            }
        } catch (Exception e3) {
            throw new zzeg(zzee.zzb, zzed.zzbd, e3.getMessage(), null, 8, null);
        }
    }
}
