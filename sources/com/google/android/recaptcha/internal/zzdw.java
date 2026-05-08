package com.google.android.recaptcha.internal;

import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.xr3;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdw {
    private final zzfn zza;
    private xr3 zzb;
    private final zzjf zzc;
    private final zzfa zzd;

    public zzdw(zzjf zzjfVar, zzfn zzfnVar, zzfa zzfaVar) {
        this.zzc = zzjfVar;
        this.zza = zzfnVar;
        this.zzd = zzfaVar;
    }

    public final zzfn zza() {
        return this.zza;
    }

    public final Object zzb(lu2 lu2Var) {
        xr3 xr3Var;
        zzfn zzfnVar = this.zza;
        synchronized (zzfnVar) {
            String strZza = zzfnVar.zza("orcas_verification_key");
            if (strZza != null) {
                return strZza;
            }
            j6g j6gVar = j6g.a;
            synchronized (this) {
                xr3Var = this.zzb;
            }
            if (xr3Var == null) {
                return null;
            }
            Object objN1 = xr3Var.n1(lu2Var);
            return objN1 == g13.a ? objN1 : (String) objN1;
        }
    }

    public final Object zzc(lu2 lu2Var) {
        return new zziq(new zzdr(this, null));
    }

    public final zzfa zzf() {
        return this.zzd;
    }

    public final zzjf zzg() {
        return this.zzc;
    }
}
