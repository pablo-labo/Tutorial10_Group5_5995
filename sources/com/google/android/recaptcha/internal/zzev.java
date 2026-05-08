package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.pu2;

/* JADX INFO: loaded from: classes2.dex */
final class zzev extends pu2 {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzew zzd;
    int zze;
    String zzf;
    String zzg;
    String zzh;
    String zzi;
    zzes zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzew zzewVar, lu2 lu2Var) {
        super(lu2Var);
        this.zzd = zzewVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zza(null, null, null, null, null, null, this);
    }
}
