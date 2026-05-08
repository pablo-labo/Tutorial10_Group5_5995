package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzit extends pu2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zziu zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzit(zziu zziuVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzb = zziuVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzb(null, this);
    }
}
