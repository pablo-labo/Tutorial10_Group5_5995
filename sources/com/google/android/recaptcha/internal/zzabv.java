package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabv implements zzqz {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final Provider zzg;

    private zzabv(RSAPublicKey rSAPublicKey, zzzd zzzdVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzrg.zza(2)) {
            l6.m("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        zzadl.zza(rSAPublicKey.getModulus().bitLength());
        zzadl.zzb(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzd(zzzdVar);
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = provider;
    }

    public static zzqz zzb(zzzm zzzmVar) throws NoSuchProviderException {
        Provider providerZze = zze();
        if (providerZze != null) {
            return zzc(zzzmVar, providerZze);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static zzqz zzc(zzzm zzzmVar, Provider provider) {
        return new zzabv((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(zzzmVar.zzf(), zzzmVar.zzc().zze())), zzzmVar.zzc().zzc(), zzzmVar.zze().zzd(), zzzmVar.zzc().zzd().equals(zzze.zzc) ? zzb : zza, provider);
    }

    public static String zzd(zzzd zzzdVar) throws GeneralSecurityException {
        if (zzzdVar == zzzd.zza) {
            return "SHA256withRSA";
        }
        if (zzzdVar == zzzd.zzb) {
            return "SHA384withRSA";
        }
        if (zzzdVar == zzzd.zzc) {
            return "SHA512withRSA";
        }
        l6.m("unknown hash type");
        return null;
    }

    public static Provider zze() {
        if (zzuy.zzc()) {
            zzuy.zzb().getClass();
        }
        return zzrk.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!zzuy.zzd(bArr3, bArr)) {
            l6.m("Invalid signature (output prefix mismatch)");
            return;
        }
        String str = this.zzd;
        Provider provider = this.zzg;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.zzf;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        l6.m("Invalid signature");
    }
}
