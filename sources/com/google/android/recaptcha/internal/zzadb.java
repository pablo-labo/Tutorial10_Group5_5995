package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzadb implements zzqz {
    private final RSAPublicKey zza;
    private final zzacz zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public /* synthetic */ zzadb(RSAPublicKey rSAPublicKey, zzacz zzaczVar, byte[] bArr, byte[] bArr2, zzadc zzadcVar) throws GeneralSecurityException {
        if (zzrh.zzb()) {
            l6.m("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
            throw null;
        }
        zzadl.zzc(zzaczVar);
        zzadl.zza(rSAPublicKey.getModulus().bitLength());
        zzadl.zzb(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzaczVar;
        this.zzc = bArr;
        this.zzd = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int i;
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            l6.m("invalid signature's length");
            return;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            l6.m("signature out of range");
            return;
        }
        byte[] bArrZzb = zzrj.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength);
        zzacz zzaczVar = this.zzb;
        zzadl.zzc(zzaczVar);
        MessageDigest messageDigest = (MessageDigest) zzacq.zzb.zza(zzadk.zza(zzaczVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzd;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = zzaczVar.ordinal();
        int i2 = 2;
        if (iOrdinal == 2) {
            bArrZza = zzada.zza("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrZza = zzada.zza("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zzaczVar.toString()));
            }
            bArrZza = zzada.zza("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrZza.length + bArrDigest.length + 11) {
            l6.m("intended encoded message length too short");
            return;
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (iBitLength - r3) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length = bArrZza.length;
        System.arraycopy(bArrZza, 0, bArr4, i, length);
        System.arraycopy(bArrDigest, 0, bArr4, i + length, bArrDigest.length);
        if (MessageDigest.isEqual(bArrZzb, bArr4)) {
            return;
        }
        l6.m("invalid signature");
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else if (zzuy.zzd(bArr3, bArr)) {
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        } else {
            l6.m("Invalid signature (output prefix mismatch)");
        }
    }
}
