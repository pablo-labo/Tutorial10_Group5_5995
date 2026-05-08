package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzh {
    private zzzm zza = null;
    private zzadn zzb = null;
    private zzadn zzc = null;
    private zzadn zzd = null;
    private zzadn zze = null;
    private zzadn zzf = null;
    private zzadn zzg = null;

    private zzzh() {
    }

    public final zzzh zza(zzadn zzadnVar) {
        this.zzg = zzadnVar;
        return this;
    }

    public final zzzh zzb(zzadn zzadnVar, zzadn zzadnVar2) {
        this.zze = zzadnVar;
        this.zzf = zzadnVar2;
        return this;
    }

    public final zzzh zzc(zzadn zzadnVar, zzadn zzadnVar2) {
        this.zzc = zzadnVar;
        this.zzd = zzadnVar2;
        return this;
    }

    public final zzzh zzd(zzadn zzadnVar) {
        this.zzb = zzadnVar;
        return this;
    }

    public final zzzh zze(zzzm zzzmVar) {
        this.zza = zzzmVar;
        return this;
    }

    public final zzzj zzf() throws GeneralSecurityException {
        zzzm zzzmVar = this.zza;
        if (zzzmVar == null) {
            l6.m("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        if (this.zzc == null || this.zzd == null) {
            l6.m("Cannot build without prime factors");
            return null;
        }
        if (this.zzb == null) {
            l6.m("Cannot build without private exponent");
            return null;
        }
        if (this.zze == null || this.zzf == null) {
            l6.m("Cannot build without prime exponents");
            return null;
        }
        if (this.zzg == null) {
            l6.m("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigIntegerZze = zzzmVar.zzc().zze();
        BigInteger bigIntegerZzf = this.zza.zzf();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzqo.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzqo.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzqo.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzqo.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzqo.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzqo.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            l6.m("p is not a prime");
            return null;
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            l6.m("q is not a prime");
            return null;
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzf)) {
            l6.m("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(bigInteger);
        if (!bigIntegerZze.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
            l6.m("D is invalid.");
            return null;
        }
        if (!bigIntegerZze.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(bigInteger)) {
            l6.m("dP is invalid.");
            return null;
        }
        if (!bigIntegerZze.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(bigInteger)) {
            l6.m("dQ is invalid.");
            return null;
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(bigInteger)) {
            return new zzzj(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        l6.m("qInv is invalid.");
        return null;
    }

    public /* synthetic */ zzzh(zzzi zzziVar) {
    }
}
