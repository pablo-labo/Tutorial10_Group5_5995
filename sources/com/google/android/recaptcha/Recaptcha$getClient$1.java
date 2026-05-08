package com.google.android.recaptcha;

import defpackage.g13;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
public final class Recaptcha$getClient$1 extends pu2 {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, lu2 lu2Var) {
        super(lu2Var);
        this.zzb = recaptcha;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM22getClientBWLJW6A = this.zzb.m22getClientBWLJW6A(null, null, 0L, this);
        return objM22getClientBWLJW6A == g13.a ? objM22getClientBWLJW6A : new o7d(objM22getClientBWLJW6A);
    }
}
