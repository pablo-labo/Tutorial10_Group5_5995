package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzrv {
    static final zzrv zza;
    final BigInteger zzb;
    final BigInteger zzc;
    final BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzrv(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public zzrv(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    public final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
