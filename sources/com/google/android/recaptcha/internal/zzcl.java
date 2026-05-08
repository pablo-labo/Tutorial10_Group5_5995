package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcl extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ zzco zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcl(zziu zziuVar, zzco zzcoVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zziuVar;
        this.zzd = zzcoVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzcl(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcl) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        zziu zziuVar;
        int i = this.zzb;
        g13 g13Var = g13.a;
        try {
            if (i == 0) {
                r7d.b(obj);
                zziuVar = this.zzc;
                zzco zzcoVar = this.zzd;
                zzda zzdaVar = zzcoVar.zzb;
                String str = zzcoVar.zzd;
                this.zza = zziuVar;
                this.zzb = 1;
                obj = new zziq(new zzcp(zzdaVar, str, null));
                if (obj != g13Var) {
                }
                return g13Var;
            }
            if (i != 1) {
                r7d.b(obj);
                zzco zzcoVar2 = this.zzd;
                zzamv zzamvVarZza = zzamy.zza();
                zzamw zzamwVarZza = zzamx.zza();
                zzamwVarZza.zzw((String) obj);
                zzamvVarZza.zzb((zzamx) zzamwVarZza.zzq());
                return zzch.zzb(zzcoVar2, (zzamy) zzamvVarZza.zzq());
            }
            zziuVar = (zziu) this.zza;
            r7d.b(obj);
            this.zza = null;
            this.zzb = 2;
            obj = ((zziq) obj).zza(zziuVar, this);
            if (obj == g13Var) {
                return g13Var;
            }
            zzco zzcoVar22 = this.zzd;
            zzamv zzamvVarZza2 = zzamy.zza();
            zzamw zzamwVarZza2 = zzamx.zza();
            zzamwVarZza2.zzw((String) obj);
            zzamvVarZza2.zzb((zzamx) zzamwVarZza2.zzq());
            return zzch.zzb(zzcoVar22, (zzamy) zzamvVarZza2.zzq());
        } catch (Exception e) {
            throw new zzeg(zzee.zzb, zzed.zzaa, e.getMessage(), e);
        }
    }
}
