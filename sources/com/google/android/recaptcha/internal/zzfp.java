package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzfp extends pu2 {
    /* synthetic */ Object zza;
    int zzb;
    final /* synthetic */ zzfq zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfp(zzfq zzfqVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzc = zzfqVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return zzfo.zza(this.zzc, this);
    }
}
