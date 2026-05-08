package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgo extends pu2 {
    Object zza;
    Object zzb;
    long zzc;
    /* synthetic */ Object zzd;
    final /* synthetic */ zzgu zze;
    int zzf;
    zzfv zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgo(zzgu zzguVar, lu2 lu2Var) {
        super(lu2Var);
        this.zze = zzguVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zzd = obj;
        this.zzf |= Integer.MIN_VALUE;
        return this.zze.zzc(null, 0L, null, this);
    }
}
