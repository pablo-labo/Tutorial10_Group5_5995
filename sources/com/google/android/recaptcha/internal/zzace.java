package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzace implements zzqz {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final PSSParameterSpec zze;
    private final byte[] zzf;
    private final byte[] zzg;
    private final Provider zzh;

    private zzace(RSAPublicKey rSAPublicKey, zzzs zzzsVar, zzzs zzzsVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzrg.zza(2)) {
            l6.m("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (!zzzsVar.equals(zzzsVar2)) {
            l6.m("sigHash and mgf1Hash must be the same");
            throw null;
        }
        zzadl.zza(rSAPublicKey.getModulus().bitLength());
        zzadl.zzb(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzzsVar);
        this.zze = zze(zzzsVar, zzzsVar2, i);
        this.zzf = bArr;
        this.zzg = bArr2;
        this.zzh = provider;
    }

    public static zzqz zzb(zzaab zzaabVar) throws NoSuchProviderException {
        Provider providerZzd = zzd();
        if (providerZzd == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerZzd).generatePublic(new RSAPublicKeySpec(zzaabVar.zzf(), zzaabVar.zzc().zzg()));
        zzzv zzzvVarZzc = zzaabVar.zzc();
        return new zzace(rSAPublicKey, zzzvVarZzc.zze(), zzzvVarZzc.zzd(), zzzvVarZzc.zzb(), zzaabVar.zze().zzd(), zzaabVar.zzc().zzf().equals(zzzt.zzc) ? zzb : zza, providerZzd);
    }

    public static String zzc(zzzs zzzsVar) {
        if (zzzsVar == zzzs.zza) {
            return "SHA256withRSA/PSS";
        }
        if (zzzsVar == zzzs.zzb) {
            return "SHA384withRSA/PSS";
        }
        if (zzzsVar == zzzs.zzc) {
            return "SHA512withRSA/PSS";
        }
        l5.q("Unsupported hash: ".concat(String.valueOf(zzzsVar)));
        return null;
    }

    public static Provider zzd() {
        if (!zzuy.zzc() || zzuy.zzb().intValue() > 23) {
            return zzrk.zza();
        }
        return null;
    }

    public static PSSParameterSpec zze(zzzs zzzsVar, zzzs zzzsVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzzs zzzsVar3 = zzzs.zza;
        if (zzzsVar == zzzsVar3) {
            str = "SHA-256";
        } else if (zzzsVar == zzzs.zzb) {
            str = "SHA-384";
        } else {
            if (zzzsVar != zzzs.zzc) {
                l5.q("Unsupported MD hash: ".concat(String.valueOf(zzzsVar)));
                return null;
            }
            str = "SHA-512";
        }
        if (zzzsVar2 == zzzsVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzzsVar2 == zzzs.zzb) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzzsVar2 != zzzs.zzc) {
                l5.q("Unsupported MGF1 hash: ".concat(String.valueOf(zzzsVar2)));
                return null;
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (!zzuy.zzd(bArr3, bArr)) {
            l6.m("Invalid signature (output prefix mismatch)");
            return;
        }
        String str = this.zzd;
        Provider provider = this.zzh;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.zze);
        signature.update(bArr2);
        byte[] bArr4 = this.zzg;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (signature.verify(bArr, length2, length - length2)) {
            return;
        }
        l6.m("signature verification failed");
    }
}
