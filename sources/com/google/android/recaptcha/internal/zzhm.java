package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.xd2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhm extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(zzhu zzhuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzhm(this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhm) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            xd2 xd2Var = this.zzb.zzb;
            this.zza = 1;
            Object objN1 = xd2Var.n1(this);
            g13 g13Var = g13.a;
            if (objN1 == g13Var) {
                return g13Var;
            }
        }
        return j6g.a;
    }
}
