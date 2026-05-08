package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzd {
    public static final zzzd zza = new zzzd("SHA256");
    public static final zzzd zzb = new zzzd("SHA384");
    public static final zzzd zzc = new zzzd("SHA512");
    private final String zzd;

    private zzzd(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
