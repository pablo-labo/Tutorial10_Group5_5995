package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.xd2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhs extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhu zzb;
    final /* synthetic */ xd2 zzc;
    final /* synthetic */ zziu zzd;
    final /* synthetic */ long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhs(zzhu zzhuVar, xd2 xd2Var, zziu zziuVar, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhuVar;
        this.zzc = xd2Var;
        this.zzd = zziuVar;
        this.zze = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzhs(this.zzb, this.zzc, this.zzd, this.zze, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhs) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Exception {
        zzeg zzegVar;
        zzhs zzhsVar;
        zzeg e;
        if (this.zza != 0) {
            try {
                r7d.b(obj);
                zzhsVar = this;
            } catch (zzeg e2) {
                zzegVar = e2;
                zzhsVar = this;
                zzhsVar.zzb.zze = zzga.zzd;
                zzhsVar.zzc.h0(zzegVar);
            }
        } else {
            r7d.b(obj);
            try {
                zzeq zzeqVar = zzeq.zza;
                zzhu zzhuVar = this.zzb;
                zzhp zzhpVar = new zzhp(zzhuVar);
                zzhr zzhrVar = new zzhr(this.zzd, zzhuVar, this.zze, this.zzc, null);
                this.zza = 1;
                zzhsVar = this;
                try {
                    obj = zzeqVar.zzb(zzhpVar, 100L, 1000L, 2.0d, zzhrVar, zzhsVar);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } catch (zzeg e3) {
                    e = e3;
                    zzegVar = e;
                    zzhsVar.zzb.zze = zzga.zzd;
                    zzhsVar.zzc.h0(zzegVar);
                }
            } catch (zzeg e4) {
                e = e4;
                zzhsVar = this;
                zzegVar = e;
                zzhsVar.zzb.zze = zzga.zzd;
                zzhsVar.zzc.h0(zzegVar);
            }
        }
        ((Boolean) obj).getClass();
        return j6g.a;
    }
}
