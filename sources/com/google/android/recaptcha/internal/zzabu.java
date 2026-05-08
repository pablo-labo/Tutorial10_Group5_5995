package com.google.android.recaptcha.internal;

import defpackage.ja;
import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabu implements zzqy {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};
    Provider zza;
    private final RSAPrivateCrtKey zze;
    private final String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final zzqz zzi;

    private zzabu(RSAPrivateCrtKey rSAPrivateCrtKey, zzzd zzzdVar, byte[] bArr, byte[] bArr2, zzqz zzqzVar, Provider provider) throws GeneralSecurityException {
        if (!zzrg.zza(2)) {
            l6.m("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (zzzdVar != zzzd.zza && zzzdVar != zzzd.zzb && zzzdVar != zzzd.zzc) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzzdVar)));
        }
        zzadl.zza(rSAPrivateCrtKey.getModulus().bitLength());
        zzadl.zzb(rSAPrivateCrtKey.getPublicExponent());
        this.zze = rSAPrivateCrtKey;
        this.zzf = zzabv.zzd(zzzdVar);
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = zzqzVar;
        this.zza = provider;
    }

    public static zzqy zzb(zzzj zzzjVar) {
        Provider providerZze = zzabv.zze();
        zzabu zzabuVar = new zzabu((RSAPrivateCrtKey) (providerZze != null ? KeyFactory.getInstance("RSA", providerZze) : (KeyFactory) zzacq.zzc.zza("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzzjVar.zze().zzf(), zzzjVar.zzc().zze(), zzzjVar.zzk().zzb(zzqo.zza()), zzzjVar.zzi().zzb(zzqo.zza()), zzzjVar.zzj().zzb(zzqo.zza()), zzzjVar.zzg().zzb(zzqo.zza()), zzzjVar.zzh().zzb(zzqo.zza()), zzzjVar.zzf().zzb(zzqo.zza()))), zzzjVar.zzc().zzc(), zzzjVar.zze().zze().zzd(), zzzjVar.zzc().zzd().equals(zzze.zzc) ? zzc : zzb, providerZze != null ? zzabv.zzc(zzzjVar.zze(), providerZze) : zzadd.zzb(zzzjVar.zze()), providerZze);
        zzabuVar.zza(zzd);
        return zzabuVar;
    }

    @Override // com.google.android.recaptcha.internal.zzqy
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Provider provider = this.zza;
        String str = this.zzf;
        Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) zzacq.zza.zza(str);
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            bArrSign = zzacf.zza(bArr3, bArrSign);
        }
        try {
            this.zzi.zza(bArrSign, bArr);
            return bArrSign;
        } catch (GeneralSecurityException e) {
            ja.m("RSA signature computation error", e);
            return null;
        }
    }
}
