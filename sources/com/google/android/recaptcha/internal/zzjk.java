package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjk {
    private final zzjj zza;

    public zzjk(zzjj zzjjVar) {
        this.zza = zzjjVar;
    }

    public final HttpURLConnection zza(String str) throws IOException, zzeg {
        if (!this.zza.zzb(str)) {
            throw new zzeg(zzee.zzc, zzed.zzQ, null, null, 12, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.getClass();
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
