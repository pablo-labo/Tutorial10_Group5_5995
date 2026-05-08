package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import defpackage.z3;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzach implements zzqz {
    private final zzadm zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzach(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!zzrg.zza(1)) {
            z3.q(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
            throw null;
        }
        if (bArr.length != 32) {
            l5.q("Given public key's length is not 32.");
            throw null;
        }
        this.zza = zzadm.zzb(bArr);
        this.zzb = bArr2;
        this.zzc = bArr3;
        zzrr.zzb();
    }

    public static zzqz zzb(zzye zzyeVar) throws GeneralSecurityException {
        if (zzrg.zza(1)) {
            try {
                return zzabk.zzb(zzyeVar);
            } catch (GeneralSecurityException unused) {
                return new zzach(zzyeVar.zzf().zzd(), zzyeVar.zze().zzd(), zzyeVar.zzc().zza().equals(zzxw.zzc) ? new byte[]{0} : new byte[0]);
            }
        }
        l6.m("Can not use Ed25519 in FIPS-mode.");
        return null;
    }

    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            l6.m("The length of the signature is not 64.");
        } else {
            if (zzrr.zzd(bArr2, bArr, this.zza.zzd())) {
                return;
            }
            l6.m("Signature check failed.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            zzc(bArr, bArr2);
            return;
        }
        if (!zzuy.zzd(bArr3, bArr)) {
            l6.m("Invalid signature (output prefix mismatch)");
            return;
        }
        byte[] bArr4 = this.zzc;
        if (bArr4.length != 0) {
            bArr2 = zzacf.zza(bArr2, bArr4);
        }
        zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
