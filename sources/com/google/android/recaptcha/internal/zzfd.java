package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzfd extends pu2 {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzfe zzc;
    int zzd;
    zzmy zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(zzfe zzfeVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzc = zzfeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzc(null, this);
    }
}
