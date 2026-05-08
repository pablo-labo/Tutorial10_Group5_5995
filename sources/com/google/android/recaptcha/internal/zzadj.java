package com.google.android.recaptcha.internal;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadj implements zzqz {
    static final zzrz zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        zzrx zzrxVarZza = zzrz.zza();
        zzrxVarZza.zza(zzacz.SHA256, zzzs.zza);
        zzrxVarZza.zza(zzacz.SHA384, zzzs.zzb);
        zzrxVarZza.zza(zzacz.SHA512, zzzs.zzc);
        zza = zzrxVarZza.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzqz zzb(zzaab zzaabVar) {
        try {
            return zzace.zzb(zzaabVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzacq.zzc.zza("RSA")).generatePublic(new RSAPublicKeySpec(zzaabVar.zzf(), zzaabVar.zzc().zzg()));
            zzzv zzzvVarZzc = zzaabVar.zzc();
            zzrz zzrzVar = zza;
            return new zzadh(rSAPublicKey, (zzacz) zzrzVar.zzb(zzzvVarZzc.zze()), (zzacz) zzrzVar.zzb(zzzvVarZzc.zzd()), zzzvVarZzc.zzb(), zzaabVar.zze().zzd(), zzaabVar.zzc().zzf().equals(zzzt.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
