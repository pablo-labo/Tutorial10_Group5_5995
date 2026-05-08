package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaba implements zzqy {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzaba(ECPrivateKey eCPrivateKey, zzacz zzaczVar, zzacj zzacjVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzrg.zza(2)) {
            zzadk.zzb(zzaczVar);
        } else {
            l6.m("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            throw null;
        }
    }

    public static zzqy zzb(zzxo zzxoVar) {
        Provider providerZza = zzrk.zza();
        return new zzaba((ECPrivateKey) (providerZza != null ? KeyFactory.getInstance("EC", providerZza) : (KeyFactory) zzacq.zzc.zza("EC")).generatePrivate(new ECPrivateKeySpec(zzxoVar.zzf().zzb(zzqo.zza()), zzack.zza((zzaci) zzabb.zzc.zzb(zzxoVar.zzc().zzb())))), (zzacz) zzabb.zza.zzb(zzxoVar.zzc().zzc()), (zzacj) zzabb.zzb.zzb(zzxoVar.zzc().zzd()), zzxoVar.zze().zze().zzd(), zzxoVar.zzc().zze().equals(zzxj.zzc) ? zzb : zza, providerZza);
    }

    @Override // com.google.android.recaptcha.internal.zzqy
    public final byte[] zza(byte[] bArr) {
        throw null;
    }
}
