package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzze {
    public static final zzze zza = new zzze("TINK");
    public static final zzze zzb = new zzze("CRUNCHY");
    public static final zzze zzc = new zzze("LEGACY");
    public static final zzze zzd = new zzze("NO_PREFIX");
    private final String zze;

    private zzze(String str) {
        this.zze = str;
    }

    public final String toString() {
        return this.zze;
    }
}
