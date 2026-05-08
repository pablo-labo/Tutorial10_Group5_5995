package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzuf {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzuf(Class cls, Class cls2, zzue zzueVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzuf zzb(zzud zzudVar, Class cls, Class cls2) {
        return new zzuc(cls, cls2, zzudVar);
    }

    public abstract Object zza(zzqp zzqpVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
