package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbe extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzbf zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzalo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbe(zzbf zzbfVar, long j, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzbfVar;
        this.zzc = j;
        this.zzd = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzbe zzbeVar = new zzbe(this.zzb, this.zzc, this.zzd, lu2Var);
        zzbeVar.zze = obj;
        return zzbeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            zzbd zzbdVar = new zzbd(this.zzb, (zzif) this.zze, this.zzc, this.zzd, null);
            this.zza = 1;
            Object objD = f13.d(zzbdVar, this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
                return g13Var;
            }
        }
        return j6g.a;
    }
}
