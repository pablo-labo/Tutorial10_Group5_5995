package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbp extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzbr zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbr zzbrVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzbrVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzbp(this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbp) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            zzfq zzfqVar = this.zzb.zzb;
            this.zza = 1;
            obj = zzfo.zza(zzfqVar, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        }
        zzbr zzbrVar = this.zzb;
        zzamv zzamvVarZza = zzamy.zza();
        zzamw zzamwVarZza = zzamx.zza();
        zzamwVarZza.zzw((String) obj);
        zzamvVarZza.zza(u63.Z(zzamwVarZza.zzq()));
        return zzch.zzb(zzbrVar, (zzamy) zzamvVarZza.zzq());
    }
}
