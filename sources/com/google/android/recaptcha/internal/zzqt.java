package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqt {
    private static final zzqs zzf = new Object() { // from class: com.google.android.recaptcha.internal.zzqs
    };
    private final zzqp zza;
    private final zzqr zzb;
    private final int zzc;
    private final boolean zzd;
    private final boolean zze;
    private final int zzg;

    public /* synthetic */ zzqt(zzqp zzqpVar, int i, int i2, boolean z, boolean z2, zzqs zzqsVar, zzqu zzquVar) {
        this.zza = zzqpVar;
        this.zzg = i;
        int i3 = i - 2;
        this.zzb = i3 != 1 ? i3 != 3 ? zzqr.zzb : zzqr.zzc : zzqr.zza;
        this.zzc = i2;
        this.zzd = z;
        this.zze = z2;
    }

    public final int zza() {
        return this.zzc;
    }

    public final zzqp zzb() {
        return this.zza;
    }

    public final zzqr zzc() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
