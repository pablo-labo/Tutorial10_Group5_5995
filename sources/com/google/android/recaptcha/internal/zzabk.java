package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabk implements zzqz {
    private static final byte[] zza = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    private final PublicKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final Provider zze;

    private zzabk(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!zzrg.zza(1)) {
            l6.m("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            l5.q("Given public key's length is not 32.");
            throw null;
        }
        this.zzb = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(zzacf.zza(zza, bArr)));
        this.zzc = bArr2;
        this.zzd = bArr3;
        this.zze = provider;
    }

    public static zzqz zzb(zzye zzyeVar) throws GeneralSecurityException {
        Provider providerZza = zzrk.zza();
        if (providerZza == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (zzrg.zza(1)) {
            return new zzabk(zzyeVar.zzf().zzd(), zzyeVar.zze().zzd(), zzyeVar.zzc().zza().equals(zzxw.zzc) ? new byte[]{0} : new byte[0], providerZza);
        }
        l6.m("Can not use Ed25519 in FIPS-mode.");
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            l6.m("Invalid signature length: 64");
            return;
        }
        if (!zzuy.zzd(bArr3, bArr)) {
            l6.m("Invalid signature (output prefix mismatch)");
            return;
        }
        Provider provider = this.zze;
        PublicKey publicKey = this.zzb;
        Signature signature = Signature.getInstance("Ed25519", provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        signature.update(this.zzd);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        l6.m("Signature check failed.");
    }
}
