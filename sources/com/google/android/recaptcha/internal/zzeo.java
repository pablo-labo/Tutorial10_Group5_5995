package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzeo extends pu2 {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzeq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzeq zzeqVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzg = zzeqVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zzb(null, 0L, 0L, 0.0d, null, this);
    }
}
