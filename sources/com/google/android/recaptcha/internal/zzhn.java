package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.ewa;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
final class zzhn extends c1f implements Function1 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzhu zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhn(long j, zzhu zzhuVar, lu2 lu2Var) {
        super(1, lu2Var);
        this.zzb = j;
        this.zzc = zzhuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(lu2 lu2Var) {
        return new zzhn(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzhn) create((lu2) obj)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            long j = this.zzb;
            zzhm zzhmVar = new zzhm(this.zzc, null);
            this.zza = 1;
            Object objO = ewa.O(j, zzhmVar, this);
            g13 g13Var = g13.a;
            if (objO == g13Var) {
                return g13Var;
            }
        }
        return j6g.a;
    }
}
