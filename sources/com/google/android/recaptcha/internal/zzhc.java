package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhc extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhj zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhc(zzhj zzhjVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhjVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzhc zzhcVar = new zzhc(this.zzb, lu2Var);
        zzhcVar.zzc = obj;
        return zzhcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhc) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zziu zziuVar = (zziu) this.zzc;
        zzhj zzhjVar = this.zzb;
        v03 coroutineContext = zzhjVar.zzj.zza().getCoroutineContext();
        zzhb zzhbVar = new zzhb(zzhjVar, zziuVar, null);
        this.zza = 1;
        Object objQ0 = u63.q0(coroutineContext, zzhbVar, this);
        g13 g13Var = g13.a;
        return objQ0 == g13Var ? g13Var : objQ0;
    }
}
