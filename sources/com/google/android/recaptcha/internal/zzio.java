package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzio extends pu2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzip zzb;
    int zzc;
    zzif zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzio(zzip zzipVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzb = zzipVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zza(null, this);
    }
}
