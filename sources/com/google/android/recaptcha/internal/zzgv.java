package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgv extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhj zzb;
    final /* synthetic */ zzamf zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzhj zzhjVar, zzamf zzamfVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhjVar;
        this.zzc = zzamfVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzgv(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgv) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        try {
            if (this.zza != 0) {
                r7d.b(obj);
            } else {
                r7d.b(obj);
                zzhj zzhjVar = this.zzb;
                zzji zzjiVar = zzhjVar.zzh;
                zzer zzerVar = zzhjVar.zzc;
                zzamf zzamfVar = this.zzc;
                this.zza = 1;
                obj = zzjiVar.zzb(zzerVar, zzamfVar, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            }
            return (zzamh) obj;
        } catch (Exception e) {
            throw zzhj.zzd(this.zzb, e);
        }
    }
}
