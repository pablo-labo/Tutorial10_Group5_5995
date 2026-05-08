package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzep extends c1f implements Function2 {
    int zza;
    final /* synthetic */ Function1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(int i, long j, long j2, double d, Function1 function1, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = function1;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzep(20, 100L, 1000L, 2.0d, this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzep) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        Function1 function1 = this.zzb;
        zzeq zzeqVar = zzeq.zza;
        this.zza = 1;
        Object objZza = zzeqVar.zza(20, 100L, 1000L, 2.0d, function1, this);
        g13 g13Var = g13.a;
        return objZza == g13Var ? g13Var : objZza;
    }
}
