package com.google.android.recaptcha.internal;

import defpackage.k20;
import defpackage.l6;
import defpackage.r6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzk {
    private zzzg zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzzk() {
    }

    public final zzzk zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzzk zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzzk zzc(zzzg zzzgVar) {
        this.zza = zzzgVar;
        return this;
    }

    public final zzzm zzd() throws GeneralSecurityException {
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
        if (this.zza.zzf() && this.zzc == null) {
            l6.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.zza.zzf() && this.zzc != null) {
            l6.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (this.zza.zzd() == zzze.zzd) {
            zzadmVarZza = zzto.zza;
        } else if (this.zza.zzd() == zzze.zzc || this.zza.zzd() == zzze.zzb) {
            zzadmVarZza = zzto.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzze.zza) {
                r6.g("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                return null;
            }
            zzadmVarZza = zzto.zzb(this.zzc.intValue());
        }
        return new zzzm(this.zza, this.zzb, zzadmVarZza, this.zzc, null);
    }

    public /* synthetic */ zzzk(zzzl zzzlVar) {
    }
}
