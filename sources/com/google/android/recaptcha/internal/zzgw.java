package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgw extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhj zzb;
    final /* synthetic */ zzamf zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgw(zzhj zzhjVar, zzamf zzamfVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhjVar;
        this.zzc = zzamfVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzgw(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgw) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zzgv zzgvVar = new zzgv(this.zzb, this.zzc, null);
        this.zza = 1;
        Object objD = f13.d(zzgvVar, this);
        g13 g13Var = g13.a;
        return objD == g13Var ? g13Var : objD;
    }
}
