package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmt extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzmu zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmt(zzmu zzmuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzmuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzmt zzmtVar = new zzmt(this.zzb, lu2Var);
        zzmtVar.zzc = obj;
        return zzmtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmt) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            zzms zzmsVar = new zzms(this.zzb, (zzif) this.zzc, null);
            this.zza = 1;
            Object objD = f13.d(zzmsVar, this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
                return g13Var;
            }
        }
        return j6g.a;
    }
}
