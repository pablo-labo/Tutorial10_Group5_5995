package com.google.android.recaptcha.internal;

import defpackage.g13;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgf extends pu2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgk zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgf(zzgk zzgkVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzb = zzgkVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzd = this.zzb.zzd(null, 0L, this);
        return objZzd == g13.a ? objZzd : new o7d(objZzd);
    }
}
