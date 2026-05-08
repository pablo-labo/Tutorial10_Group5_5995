package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsi {
    private final zzadm zza;
    private final Class zzb;

    public /* synthetic */ zzsi(zzadm zzadmVar, Class cls, zzsh zzshVar) {
        this.zza = zzadmVar;
        this.zzb = cls;
    }

    public static zzsi zzb(zzsg zzsgVar, zzadm zzadmVar, Class cls) {
        return new zzsf(zzadmVar, cls, zzsgVar);
    }

    public abstract zzqp zza(zzuq zzuqVar, zzra zzraVar);

    public final zzadm zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
