package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.hh1;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import defpackage.wl7;
import defpackage.yd2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzht extends c1f implements Function2 {
    final /* synthetic */ zzhu zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzht(zzhu zzhuVar, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzhuVar;
        this.zzb = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzht zzhtVar = new zzht(this.zza, this.zzb, lu2Var);
        zzhtVar.zzc = obj;
        return zzhtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzht) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zziu zziuVar = (zziu) this.zzc;
        zzhu zzhuVar = this.zza;
        if (wl7.b(zzhuVar.zzd(), zzga.zzb) || wl7.b(zzhuVar.zzd(), zzga.zzc)) {
            return j6g.a;
        }
        if (wl7.b(zzhuVar.zzd(), zzga.zzd) && !zzhu.zzn(zzhuVar, zzhuVar.zzc)) {
            return j6g.a;
        }
        zzhuVar.zze = zzga.zzc;
        yd2 yd2VarE = hh1.e();
        zzhuVar.zzb = yd2VarE;
        u63.Y(zzhuVar.zzf.zza(), null, null, new zzhs(zzhuVar, yd2VarE, zziuVar, this.zzb, null), 3);
        return j6g.a;
    }
}
