package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdv extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzdw zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzdw zzdwVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzdwVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzdv zzdvVar = new zzdv(this.zzb, lu2Var);
        zzdvVar.zzc = obj;
        return zzdvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdv) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Exception {
        try {
            if (this.zza != 0) {
                r7d.b(obj);
            } else {
                r7d.b(obj);
                zzif zzifVar = (zzif) this.zzc;
                zzeq zzeqVar = zzeq.zza;
                zzdw zzdwVar = this.zzb;
                zzds zzdsVar = new zzds(zzdwVar);
                zzdu zzduVar = new zzdu(zzifVar, zzdwVar, null);
                this.zza = 1;
                obj = zzeqVar.zzb(zzdsVar, 100L, 1000L, 2.0d, zzduVar, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            }
            return (String) obj;
        } catch (Exception e) {
            if (e instanceof zzeg) {
                throw e;
            }
            throw new zzeg(zzee.zzb, zzed.zzbc, e.getMessage(), null, 8, null);
        }
    }
}
