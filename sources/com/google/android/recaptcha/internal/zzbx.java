package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbx extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzalo zzb;
    final /* synthetic */ zzby zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbx(zzalo zzaloVar, zzby zzbyVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzaloVar;
        this.zzc = zzbyVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzbx zzbxVar = new zzbx(this.zzb, this.zzc, lu2Var);
        zzbxVar.zzd = obj;
        return zzbxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zzbw zzbwVar = new zzbw(this.zzb, this.zzc, (zziu) this.zzd, null);
        this.zza = 1;
        Object objD = f13.d(zzbwVar, this);
        g13 g13Var = g13.a;
        return objD == g13Var ? g13Var : objD;
    }
}
