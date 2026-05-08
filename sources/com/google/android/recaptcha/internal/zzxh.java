package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxh {
    public static final zzxh zza = new zzxh("SHA256");
    public static final zzxh zzb = new zzxh("SHA384");
    public static final zzxh zzc = new zzxh("SHA512");
    private final String zzd;

    private zzxh(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
