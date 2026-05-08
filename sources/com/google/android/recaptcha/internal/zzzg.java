package com.google.android.recaptcha.internal;

import defpackage.u40;
import defpackage.w20;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzg extends zzaaq {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzze zzd;
    private final zzzd zze;

    public /* synthetic */ zzzg(int i, BigInteger bigInteger, zzze zzzeVar, zzzd zzzdVar, zzzf zzzfVar) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzzeVar;
        this.zze = zzzdVar;
    }

    public static zzzc zzb() {
        return new zzzc(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzzg)) {
            return false;
        }
        zzzg zzzgVar = (zzzg) obj;
        return zzzgVar.zzb == this.zzb && Objects.equals(zzzgVar.zzc, this.zzc) && zzzgVar.zzd == this.zzd && zzzgVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzzg.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzzd zzzdVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzzdVar);
        String strValueOf3 = String.valueOf(bigInteger);
        StringBuilder sbF = u40.f("RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2, ", publicExponent: ");
        sbF.append(strValueOf3);
        sbF.append(", and ");
        return w20.k(sbF, this.zzb, "-bit modulus)");
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzzd zzc() {
        return this.zze;
    }

    public final zzze zzd() {
        return this.zzd;
    }

    public final BigInteger zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzd != zzze.zzd;
    }
}
