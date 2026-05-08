package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjg extends pu2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzji zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjg(zzji zzjiVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzb = zzjiVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzb(null, null, this);
    }
}
