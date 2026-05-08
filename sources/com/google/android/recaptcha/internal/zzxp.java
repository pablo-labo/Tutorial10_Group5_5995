package com.google.android.recaptcha.internal;

import defpackage.l6;
import defpackage.r6;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxp {
    private zzxl zza = null;
    private ECPoint zzb = null;
    private Integer zzc = null;

    private zzxp() {
    }

    public final zzxp zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzxp zzb(zzxl zzxlVar) {
        this.zza = zzxlVar;
        return this;
    }

    public final zzxp zzc(ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final zzxr zzd() throws GeneralSecurityException {
        zzadm zzadmVarZza;
        zzxl zzxlVar = this.zza;
        if (zzxlVar == null) {
            l6.m("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            l6.m("Cannot build without public point");
            return null;
        }
        zzrw.zzf(eCPoint, zzxlVar.zzb().zza().getCurve());
        if (this.zza.zzf() && this.zzc == null) {
            l6.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.zza.zzf() && this.zzc != null) {
            l6.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.zza.zze() == zzxj.zzd) {
            zzadmVarZza = zzto.zza;
        } else if (this.zza.zze() == zzxj.zzc || this.zza.zze() == zzxj.zzb) {
            zzadmVarZza = zzto.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzxj.zza) {
                r6.g("Unknown EcdsaParameters.Variant: ".concat(this.zza.zze().toString()));
                return null;
            }
            zzadmVarZza = zzto.zzb(this.zzc.intValue());
        }
        return new zzxr(this.zza, this.zzb, zzadmVarZza, this.zzc, null);
    }

    public /* synthetic */ zzxp(zzxq zzxqVar) {
    }
}
