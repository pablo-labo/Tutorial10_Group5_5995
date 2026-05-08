package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbq extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzalq zzb;
    final /* synthetic */ zzbr zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzalq zzalqVar, zzbr zzbrVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzalqVar;
        this.zzc = zzbrVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzbq(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbq) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            zzalq zzalqVar = this.zzb;
            int length = zzalqVar.zzg().length();
            zzbr zzbrVar = this.zzc;
            if (length == 0) {
                zzbrVar.zzb(false);
                throw new zzeg(zzee.zzb, zzed.zzab, null, null, 12, null);
            }
            zzfq zzfqVar = zzbrVar.zzb;
            String strZzg = zzalqVar.zzg();
            this.zza = 1;
            Object objZzb = zzfo.zzb(zzfqVar, strZzg, this);
            g13 g13Var = g13.a;
            if (objZzb == g13Var) {
                return g13Var;
            }
        }
        return j6g.a;
    }
}
