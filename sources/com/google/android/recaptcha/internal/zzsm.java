package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsm {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzsm(Class cls, Class cls2, zzsl zzslVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzsm zzb(zzsk zzskVar, Class cls, Class cls2) {
        return new zzsj(cls, cls2, zzskVar);
    }

    public abstract zzuq zza(zzqp zzqpVar, zzra zzraVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
