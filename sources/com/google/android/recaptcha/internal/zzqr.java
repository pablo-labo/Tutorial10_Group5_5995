package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqr {
    public static final zzqr zza = new zzqr("ENABLED");
    public static final zzqr zzb = new zzqr("DISABLED");
    public static final zzqr zzc = new zzqr("DESTROYED");
    private final String zzd;

    private zzqr(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
