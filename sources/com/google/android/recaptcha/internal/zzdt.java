package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdt extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzdw zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdt(zzdw zzdwVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzdwVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzdt(this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdt) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        g13 g13Var = g13.a;
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            zzjf zzjfVarZzg = this.zzb.zzg();
            this.zza = 1;
            obj = zzjfVarZzg.zza(this);
            if (obj == g13Var) {
                return g13Var;
            }
        }
        zzdw zzdwVar = this.zzb;
        String str = (String) obj;
        synchronized (zzdwVar.zza()) {
            zzdwVar.zza().zzc("orcas_verification_key", str);
            j6g j6gVar = j6g.a;
        }
        return str;
    }
}
