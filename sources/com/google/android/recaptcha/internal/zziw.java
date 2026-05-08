package com.google.android.recaptcha.internal;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class zziw {
    private final zzjk zza;

    public zziw(zzjk zzjkVar) {
        this.zza = zzjkVar;
    }

    public final zziv zza(String str) throws zzeg {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty(TracingInterceptor.HEADER_CT, "application/x-protobuffer");
            return new zziv(httpURLConnectionZza);
        } catch (zzeg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzeg(zzee.zzc, zzed.zzai, e2.getMessage(), null, 8, null);
        }
    }
}
