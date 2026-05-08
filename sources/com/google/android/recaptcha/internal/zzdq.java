package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdq extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ zzdw zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdq(zziu zziuVar, zzdw zzdwVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zziuVar;
        this.zzd = zzdwVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzdq(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdq) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        zziu zziuVar;
        int i = this.zzb;
        g13 g13Var = g13.a;
        if (i == 0) {
            r7d.b(obj);
            zziuVar = this.zzc;
            zzdw zzdwVar = this.zzd;
            this.zza = zziuVar;
            this.zzb = 1;
            obj = new zzip(49, new zzdv(zzdwVar, null), null);
            if (obj != g13Var) {
            }
        }
        if (i != 1) {
            r7d.b(obj);
            return obj;
        }
        zziuVar = (zziu) this.zza;
        r7d.b(obj);
        this.zza = null;
        this.zzb = 2;
        Object objZza = ((zzip) obj).zza(zziuVar, this);
        return objZza == g13Var ? g13Var : objZza;
    }
}
