package com.google.android.recaptcha.internal;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadd implements zzqz {
    static final zzrz zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzrx zzrxVarZza = zzrz.zza();
        zzrxVarZza.zza(zzacz.SHA256, zzzd.zza);
        zzrxVarZza.zza(zzacz.SHA384, zzzd.zzb);
        zzrxVarZza.zza(zzacz.SHA512, zzzd.zzc);
        zza = zzrxVarZza.zzb();
    }

    public static zzqz zzb(zzzm zzzmVar) {
        try {
            return zzabv.zzb(zzzmVar);
        } catch (NoSuchProviderException unused) {
            return new zzadb((RSAPublicKey) ((KeyFactory) zzacq.zzc.zza("RSA")).generatePublic(new RSAPublicKeySpec(zzzmVar.zzf(), zzzmVar.zzc().zze())), (zzacz) zza.zzb(zzzmVar.zzc().zzc()), zzzmVar.zze().zzd(), zzzmVar.zzc().zzd().equals(zzze.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
