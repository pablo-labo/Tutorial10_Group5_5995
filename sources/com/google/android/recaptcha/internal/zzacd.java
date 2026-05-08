package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacd implements zzqy {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzacd(RSAPrivateCrtKey rSAPrivateCrtKey, zzzs zzzsVar, zzzs zzzsVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzrg.zza(2)) {
            l6.m("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        zzadl.zza(rSAPrivateCrtKey.getModulus().bitLength());
        zzadl.zzb(rSAPrivateCrtKey.getPublicExponent());
        zzace.zzc(zzzsVar);
        zzace.zze(zzzsVar, zzzsVar2, i);
    }

    public static zzqy zzb(zzzy zzzyVar) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerZzd = zzace.zzd();
        if (providerZzd == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerZzd);
        zzzv zzzvVarZzc = zzzyVar.zzc();
        return new zzacd((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzzyVar.zze().zzf(), zzzvVarZzc.zzg(), zzzyVar.zzk().zzb(zzqo.zza()), zzzyVar.zzi().zzb(zzqo.zza()), zzzyVar.zzj().zzb(zzqo.zza()), zzzyVar.zzg().zzb(zzqo.zza()), zzzyVar.zzh().zzb(zzqo.zza()), zzzyVar.zzf().zzb(zzqo.zza()))), zzzvVarZzc.zze(), zzzvVarZzc.zzd(), zzzvVarZzc.zzb(), zzzyVar.zze().zze().zzd(), zzzvVarZzc.zzf().equals(zzzt.zzc) ? zzb : zza, providerZzd);
    }

    @Override // com.google.android.recaptcha.internal.zzqy
    public final byte[] zza(byte[] bArr) {
        throw null;
    }
}
