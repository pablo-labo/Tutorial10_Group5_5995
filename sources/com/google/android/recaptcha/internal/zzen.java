package com.google.android.recaptcha.internal;

import defpackage.kuc;
import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzen extends pu2 {
    long zza;
    double zzb;
    Object zzc;
    int zzd;
    int zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzeq zzg;
    int zzh;
    kuc zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzeq zzeqVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzg = zzeqVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zza(0, 0L, 0L, 0.0d, null, this);
    }
}
