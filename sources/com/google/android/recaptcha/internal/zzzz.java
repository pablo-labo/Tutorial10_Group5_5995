package com.google.android.recaptcha.internal;

import defpackage.k20;
import defpackage.l6;
import defpackage.r6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzz {
    private zzzv zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzzz() {
    }

    public final zzzz zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzzz zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzzz zzc(zzzv zzzvVar) {
        this.zza = zzzvVar;
        return this;
    }

    public final zzaab zzd() throws GeneralSecurityException {
        zzadm zzadmVarZza;
        if (this.zza == null) {
            l6.m("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            l6.m("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        int iZza = this.zza.zza();
        if (iBitLength != iZza) {
            throw new GeneralSecurityException(k20.l("Got modulus size ", iBitLength, iZza, ", but parameters requires modulus size "));
        }
        if (this.zza.zzh() && this.zzc == null) {
            l6.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.zza.zzh() && this.zzc != null) {
            l6.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.zza.zzf() == zzzt.zzd) {
            zzadmVarZza = zzto.zza;
        } else if (this.zza.zzf() == zzzt.zzc || this.zza.zzf() == zzzt.zzb) {
            zzadmVarZza = zzto.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzzt.zza) {
                r6.g("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                return null;
            }
            zzadmVarZza = zzto.zzb(this.zzc.intValue());
        }
        return new zzaab(this.zza, this.zzb, zzadmVarZza, this.zzc, null);
    }

    public /* synthetic */ zzzz(zzaaa zzaaaVar) {
    }
}
