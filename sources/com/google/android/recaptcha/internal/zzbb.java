package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.f13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbb extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzbf zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(zzbf zzbfVar, String str, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzbfVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzbb zzbbVar = new zzbb(this.zzb, this.zzc, this.zzd, lu2Var);
        zzbbVar.zze = obj;
        return zzbbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i != 0) {
            return obj;
        }
        zzba zzbaVar = new zzba(this.zzb, this.zzc, (zzif) this.zze, this.zzd, null);
        this.zza = 1;
        Object objD = f13.d(zzbaVar, this);
        g13 g13Var = g13.a;
        return objD == g13Var ? g13Var : objD;
    }
}
