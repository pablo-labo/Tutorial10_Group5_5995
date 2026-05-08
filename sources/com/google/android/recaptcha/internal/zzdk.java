package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdk extends c1f implements Function2 {
    final /* synthetic */ zzdn zza;
    final /* synthetic */ zzalo zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzdn zzdnVar, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzdnVar;
        this.zzb = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzdk zzdkVar = new zzdk(this.zza, this.zzb, lu2Var);
        zzdkVar.zzc = obj;
        return zzdkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdk) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zziu zziuVar = (zziu) this.zzc;
        zzdn zzdnVar = this.zza;
        zzdnVar.zzb = u63.l(zzdnVar.zzj.zza(), null, new zzdj(zziuVar, zzdnVar, this.zzb, null), 3);
        return j6g.a;
    }
}
