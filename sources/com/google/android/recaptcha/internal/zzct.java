package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzct extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzda zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzda zzdaVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzdaVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzct(this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            zzcs zzcsVar = new zzcs(this.zzb, null);
            this.zza = 1;
            Object objD = f13.d(zzcsVar, this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
                return g13Var;
            }
        }
        return j6g.a;
    }
}
