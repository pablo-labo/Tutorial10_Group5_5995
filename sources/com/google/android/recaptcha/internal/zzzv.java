package com.google.android.recaptcha.internal;

import defpackage.u40;
import defpackage.w20;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzv extends zzaaq {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzzt zzd;
    private final zzzs zze;
    private final zzzs zzf;
    private final int zzg;

    public /* synthetic */ zzzv(int i, BigInteger bigInteger, zzzt zzztVar, zzzs zzzsVar, zzzs zzzsVar2, int i2, zzzu zzzuVar) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzztVar;
        this.zze = zzzsVar;
        this.zzf = zzzsVar2;
        this.zzg = i2;
    }

    public static zzzr zzc() {
        return new zzzr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzzv)) {
            return false;
        }
        zzzv zzzvVar = (zzzv) obj;
        return zzzvVar.zzb == this.zzb && Objects.equals(zzzvVar.zzc, this.zzc) && Objects.equals(zzzvVar.zzd, this.zzd) && Objects.equals(zzzvVar.zze, this.zze) && Objects.equals(zzzvVar.zzf, this.zzf) && zzzvVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzzv.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzzs zzzsVar = this.zzf;
        zzzs zzzsVar2 = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzzsVar2);
        String strValueOf3 = String.valueOf(zzzsVar);
        String strValueOf4 = String.valueOf(bigInteger);
        StringBuilder sbF = u40.f("RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2, ", mgf1 hashType: ");
        sbF.append(strValueOf3);
        sbF.append(", saltLengthBytes: ");
        sbF.append(this.zzg);
        sbF.append(", publicExponent: ");
        sbF.append(strValueOf4);
        sbF.append(", and ");
        return w20.k(sbF, this.zzb, "-bit modulus)");
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final zzzs zzd() {
        return this.zzf;
    }

    public final zzzs zze() {
        return this.zze;
    }

    public final zzzt zzf() {
        return this.zzd;
    }

    public final BigInteger zzg() {
        return this.zzc;
    }

    public final boolean zzh() {
        return this.zzd != zzzt.zzd;
    }
}
