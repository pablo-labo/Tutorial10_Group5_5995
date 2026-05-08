package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabj implements zzqy {
    private static final byte[] zza = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    private zzabj(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!zzrg.zza(1)) {
            l6.m("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            l5.q("Given private key's length is not 32");
            throw null;
        }
        KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(zzacf.zza(zza, bArr)));
    }

    public static zzqy zzb(zzxy zzxyVar) throws NoSuchProviderException {
        Provider providerZza = zzrk.zza();
        if (providerZza != null) {
            return new zzabj(zzxyVar.zzf().zzc(zzqo.zza()), zzxyVar.zze().zze().zzd(), zzxyVar.zzc().zza().equals(zzxw.zzc) ? new byte[]{0} : new byte[0], providerZza);
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    @Override // com.google.android.recaptcha.internal.zzqy
    public final byte[] zza(byte[] bArr) {
        throw null;
    }
}
