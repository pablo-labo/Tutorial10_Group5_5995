package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzado {
    private final zzadm zza;

    private zzado(zzadm zzadmVar) {
        this.zza = zzadmVar;
    }

    public static zzado zzb(byte[] bArr, zzra zzraVar) {
        return new zzado(zzadm.zzb(bArr));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzc(zzra zzraVar) {
        return this.zza.zzd();
    }
}
