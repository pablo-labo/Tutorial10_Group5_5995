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
final class zzha extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhj zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzamf zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzha(zzhj zzhjVar, long j, zzamf zzamfVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhjVar;
        this.zzc = j;
        this.zzd = zzamfVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzha zzhaVar = new zzha(this.zzb, this.zzc, this.zzd, lu2Var);
        zzhaVar.zze = obj;
        return zzhaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzha) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zzif zzifVar = (zzif) this.zze;
        zzhj zzhjVar = this.zzb;
        v03 coroutineContext = zzhjVar.zzj.zza().getCoroutineContext();
        zzgz zzgzVar = new zzgz(this.zzc, zzhjVar, zzifVar, this.zzd, null);
        this.zza = 1;
        Object objQ0 = u63.q0(coroutineContext, zzgzVar, this);
        g13 g13Var = g13.a;
        return objQ0 == g13Var ? g13Var : objQ0;
    }
}
