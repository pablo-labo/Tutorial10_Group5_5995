package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhl extends pu2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzhu zzb;
    int zzc;
    zzel zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhl(zzhu zzhuVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzb = zzhuVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzp(null, this);
    }
}
