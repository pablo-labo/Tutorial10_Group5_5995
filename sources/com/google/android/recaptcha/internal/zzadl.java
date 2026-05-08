package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadl {
    public static void zza(int i) throws GeneralSecurityException {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
        if (zzrh.zzb() && i != 2048 && i != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
        }
    }

    public static void zzb(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            l6.m("Public exponent must be odd.");
        } else {
            if (bigInteger.compareTo(BigInteger.valueOf(65536L)) > 0) {
                return;
            }
            l6.m("Public exponent must be greater than 65536.");
        }
    }

    public static void zzc(zzacz zzaczVar) throws GeneralSecurityException {
        int iOrdinal = zzaczVar.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzaczVar.name())));
        }
    }
}
