package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjb extends c1f implements Function2 {
    final /* synthetic */ zzje zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjb(zzje zzjeVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzjeVar;
        this.zzb = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzjb(this.zza, this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjb) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        r7d.b(obj);
        zzje zzjeVar = this.zza;
        zzfn zzfnVar = zzjeVar.zza;
        String str = this.zzb;
        if (!zzfnVar.zze("js_".concat(String.valueOf(str)))) {
            throw new zzeg(zzee.zzk, zzed.zzS, null, null, 12, null);
        }
        try {
            String strZza = zzjeVar.zza.zza("js_".concat(String.valueOf(str)));
            if (strZza != null) {
                return strZza;
            }
            throw new zzeg(zzee.zzk, zzed.zzS, null, null, 12, null);
        } catch (Exception e) {
            throw new zzeg(zzee.zzk, zzed.zzR, e.getMessage(), null, 8, null);
        }
    }
}
