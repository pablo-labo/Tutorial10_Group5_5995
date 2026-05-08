package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzs {
    public static final zzzs zza = new zzzs("SHA256");
    public static final zzzs zzb = new zzzs("SHA384");
    public static final zzzs zzc = new zzzs("SHA512");
    private final String zzd;

    private zzzs(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
