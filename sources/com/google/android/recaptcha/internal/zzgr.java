package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgr extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzgu zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzfv zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgu zzguVar, String str, long j, zzfv zzfvVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzguVar;
        this.zzc = str;
        this.zzd = j;
        this.zze = zzfvVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzgr zzgrVar = new zzgr(this.zzb, this.zzc, this.zzd, this.zze, lu2Var);
        zzgrVar.zzf = obj;
        return zzgrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgr) create((zzir) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zzir zzirVar = (zzir) this.zzf;
        zzgq zzgqVar = new zzgq(this.zzb, this.zzc, this.zzd, this.zze, zzirVar, null);
        this.zza = 1;
        Object objZza = zzirVar.zza(zzgqVar, this);
        g13 g13Var = g13.a;
        return objZza == g13Var ? g13Var : objZza;
    }
}
