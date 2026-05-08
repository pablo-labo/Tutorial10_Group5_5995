package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxj {
    public static final zzxj zza = new zzxj("TINK");
    public static final zzxj zzb = new zzxj("CRUNCHY");
    public static final zzxj zzc = new zzxj("LEGACY");
    public static final zzxj zzd = new zzxj("NO_PREFIX");
    private final String zze;

    private zzxj(String str) {
        this.zze = str;
    }

    public final String toString() {
        return this.zze;
    }
}
