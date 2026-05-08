package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
final class zzdu extends c1f implements Function1 {
    int zza;
    final /* synthetic */ zzif zzb;
    final /* synthetic */ zzdw zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzif zzifVar, zzdw zzdwVar, lu2 lu2Var) {
        super(1, lu2Var);
        this.zzb = zzifVar;
        this.zzc = zzdwVar;
    }

    @Override // defpackage.x81
    public final lu2 create(lu2 lu2Var) {
        return new zzdu(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdu) create((lu2) obj)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zzif zzifVar = this.zzb;
        zzdt zzdtVar = new zzdt(this.zzc, null);
        this.zza = 1;
        Object objZzd = zzifVar.zzd(54, null, zzdtVar, this);
        g13 g13Var = g13.a;
        return objZzd == g13Var ? g13Var : objZzd;
    }
}
