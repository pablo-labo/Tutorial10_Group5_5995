package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzru {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzrm[][] zzd;
    static final zzrm[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzg = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        zzh = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzi = bigIntegerModPow;
        zzrs zzrsVar = new zzrs(null);
        zzrsVar.zzb = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        BigInteger bigInteger2 = zzrsVar.zzb;
        BigInteger bigIntegerMultiply = bigInteger2.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigInteger2.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzrsVar.zza = bigIntegerModPow2;
        zza = zzsa.zzh(zzc(bigIntegerMod));
        zzb = zzsa.zzh(zzc(bigIntegerMod2));
        zzc = zzsa.zzh(zzc(bigIntegerModPow));
        zzd = (zzrm[][]) Array.newInstance((Class<?>) zzrm.class, 32, 8);
        zzrs zzrsVarZzb = zzrsVar;
        for (int i = 0; i < 32; i++) {
            zzrs zzrsVarZzb2 = zzrsVarZzb;
            for (int i2 = 0; i2 < 8; i2++) {
                zzd[i][i2] = zza(zzrsVarZzb2);
                zzrsVarZzb2 = zzb(zzrsVarZzb2, zzrsVarZzb);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                zzrsVarZzb = zzb(zzrsVarZzb, zzrsVarZzb);
            }
        }
        zzrs zzrsVarZzb3 = zzb(zzrsVar, zzrsVar);
        zze = new zzrm[8];
        for (int i4 = 0; i4 < 8; i4++) {
            zze[i4] = zza(zzrsVar);
            zzrsVar = zzb(zzrsVar, zzrsVarZzb3);
        }
    }

    private static zzrm zza(zzrs zzrsVar) {
        BigInteger bigIntegerAdd = zzrsVar.zzb.add(zzrsVar.zza);
        BigInteger bigInteger = zzf;
        return new zzrm(zzsa.zzh(zzc(bigIntegerAdd.mod(bigInteger))), zzsa.zzh(zzc(zzrsVar.zzb.subtract(zzrsVar.zza).mod(bigInteger))), zzsa.zzh(zzc(zzh.multiply(zzrsVar.zza).multiply(zzrsVar.zzb).mod(bigInteger))));
    }

    private static zzrs zzb(zzrs zzrsVar, zzrs zzrsVar2) {
        zzrs zzrsVar3 = new zzrs(null);
        BigInteger bigIntegerMultiply = zzg.multiply(zzrsVar.zza.multiply(zzrsVar2.zza).multiply(zzrsVar.zzb).multiply(zzrsVar2.zzb));
        BigInteger bigInteger = zzf;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = zzrsVar.zza.multiply(zzrsVar2.zzb).add(zzrsVar2.zza.multiply(zzrsVar.zzb));
        BigInteger bigInteger2 = BigInteger.ONE;
        zzrsVar3.zza = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        zzrsVar3.zzb = zzrsVar.zzb.multiply(zzrsVar2.zzb).add(zzrsVar.zza.multiply(zzrsVar2.zza)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return zzrsVar3;
    }

    private static byte[] zzc(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
