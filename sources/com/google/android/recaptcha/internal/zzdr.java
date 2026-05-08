package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import defpackage.xr3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdr extends c1f implements Function2 {
    final /* synthetic */ zzdw zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzdw zzdwVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzdwVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzdr zzdrVar = new zzdr(this.zza, lu2Var);
        zzdrVar.zzb = obj;
        return zzdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdr) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        xr3 xr3Var;
        r7d.b(obj);
        zziu zziuVar = (zziu) this.zzb;
        zzdw zzdwVar = this.zza;
        synchronized (zziuVar) {
            try {
                if (zzdwVar.zzb == null || ((xr3Var = zzdwVar.zzb) != null && xr3Var.o0())) {
                    zzdwVar.zzb = u63.l(zzdwVar.zzf().zza(), null, new zzdq(zziuVar, zzdwVar, null), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j6g.a;
    }
}
