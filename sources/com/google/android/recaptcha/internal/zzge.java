package com.google.android.recaptcha.internal;

import defpackage.g13;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzge extends pu2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgk zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzge(zzgk zzgkVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzb = zzgkVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo24executegIAlus = this.zzb.mo24executegIAlus(null, this);
        return objMo24executegIAlus == g13.a ? objMo24executegIAlus : new o7d(objMo24executegIAlus);
    }
}
