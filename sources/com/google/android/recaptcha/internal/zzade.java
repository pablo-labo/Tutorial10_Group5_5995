package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: loaded from: classes2.dex */
final class zzade implements zzqy {
    public /* synthetic */ zzade(RSAPrivateCrtKey rSAPrivateCrtKey, zzacz zzaczVar, zzacz zzaczVar2, int i, byte[] bArr, byte[] bArr2, zzadf zzadfVar) throws GeneralSecurityException {
        if (zzrh.zzb()) {
            l6.m("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        zzadl.zzc(zzaczVar);
        if (!zzaczVar.equals(zzaczVar2)) {
            l6.m("sigHash and mgf1Hash must be the same");
            throw null;
        }
        zzadl.zza(rSAPrivateCrtKey.getModulus().bitLength());
        zzadl.zzb(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.recaptcha.internal.zzqy
    public final byte[] zza(byte[] bArr) {
        throw null;
    }
}
