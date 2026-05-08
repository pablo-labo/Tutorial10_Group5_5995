package com.google.android.recaptcha.internal;

import defpackage.g13;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgd extends pu2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgk zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(zzgk zzgkVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzb = zzgkVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo23execute0E7RQCE = this.zzb.mo23execute0E7RQCE(null, 0L, this);
        return objMo23execute0E7RQCE == g13.a ? objMo23execute0E7RQCE : new o7d(objMo23execute0E7RQCE);
    }
}
