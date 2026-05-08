package com.google.android.recaptcha.internal;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxg {
    public static final zzxg zza = new zzxg("NIST_P256", zzrw.zza);
    public static final zzxg zzb = new zzxg("NIST_P384", zzrw.zzb);
    public static final zzxg zzc = new zzxg("NIST_P521", zzrw.zzc);
    private final String zzd;
    private final ECParameterSpec zze;

    private zzxg(String str, ECParameterSpec eCParameterSpec) {
        this.zzd = str;
        this.zze = eCParameterSpec;
    }

    public final String toString() {
        return this.zzd;
    }

    public final ECParameterSpec zza() {
        return this.zze;
    }
}
