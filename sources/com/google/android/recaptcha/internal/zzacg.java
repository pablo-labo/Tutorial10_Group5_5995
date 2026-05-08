package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacg implements zzqy {
    private final byte[] zza;

    private zzacg(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzrg.zza(1)) {
            l6.m("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            l5.q("Given private key's length is not 32");
            throw null;
        }
        byte[] bArrZze = zzrr.zze(bArr);
        this.zza = bArrZze;
        zzrr.zzf(bArrZze);
    }

    public static zzqy zzb(zzxy zzxyVar) throws GeneralSecurityException {
        if (zzrg.zza(1)) {
            try {
                return zzabj.zzb(zzxyVar);
            } catch (GeneralSecurityException unused) {
                return new zzacg(zzxyVar.zzf().zzc(zzqo.zza()), zzxyVar.zze().zze().zzd(), zzxyVar.zzc().zza().equals(zzxw.zzc) ? new byte[]{0} : new byte[0]);
            }
        }
        l6.m("Can not use Ed25519 in FIPS-mode.");
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzqy
    public final byte[] zza(byte[] bArr) {
        throw null;
    }
}
