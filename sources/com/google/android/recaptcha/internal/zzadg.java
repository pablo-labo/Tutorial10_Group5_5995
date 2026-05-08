package com.google.android.recaptcha.internal;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadg implements zzqy {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    public static zzqy zzb(zzzy zzzyVar) {
        try {
            return zzacd.zzb(zzzyVar);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) zzacq.zzc.zza("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzzyVar.zze().zzf(), zzzyVar.zzc().zzg(), zzzyVar.zzk().zzb(zzqo.zza()), zzzyVar.zzi().zzb(zzqo.zza()), zzzyVar.zzj().zzb(zzqo.zza()), zzzyVar.zzg().zzb(zzqo.zza()), zzzyVar.zzh().zzb(zzqo.zza()), zzzyVar.zzf().zzb(zzqo.zza())));
            zzzv zzzvVarZzc = zzzyVar.zzc();
            zzrz zzrzVar = zzadj.zza;
            return new zzade(rSAPrivateCrtKey, (zzacz) zzrzVar.zzb(zzzvVarZzc.zze()), (zzacz) zzrzVar.zzb(zzzvVarZzc.zzd()), zzzvVarZzc.zzb(), zzzyVar.zze().zze().zzd(), zzzyVar.zzc().zzf().equals(zzzt.zzc) ? zzb : zza, null);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqy
    public final byte[] zza(byte[] bArr) {
        throw null;
    }
}
