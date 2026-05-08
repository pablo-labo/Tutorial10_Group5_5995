package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcm extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzco zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcm(zzco zzcoVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzcoVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzcm zzcmVar = new zzcm(this.zzb, lu2Var);
        zzcmVar.zzc = obj;
        return zzcmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcm) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zzcl zzclVar = new zzcl((zziu) this.zzc, this.zzb, null);
        this.zza = 1;
        Object objD = f13.d(zzclVar, this);
        g13 g13Var = g13.a;
        return objD == g13Var ? g13Var : objD;
    }
}
