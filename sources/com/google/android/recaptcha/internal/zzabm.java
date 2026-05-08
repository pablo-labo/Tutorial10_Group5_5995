package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabm implements zzqz {
    private final zzqz zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzabm(zzqz zzqzVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzqzVar;
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzqz zzb(zzst zzstVar) {
        zzum zzumVarZzc = zzstVar.zzc(zzqo.zza());
        return new zzabm((zzqz) zzse.zzb().zza(zzumVarZzc.zzg(), zzqz.class).zzb(zzumVarZzc.zze()), zzd(zzumVarZzc), zzc(zzumVarZzc));
    }

    public static byte[] zzc(zzum zzumVar) {
        return zzumVar.zzc().equals(zzwj.LEGACY) ? new byte[]{0} : new byte[0];
    }

    public static byte[] zzd(zzum zzumVar) throws GeneralSecurityException {
        int iOrdinal = zzumVar.zzc().ordinal();
        if (iOrdinal == 1) {
            return zzto.zzb(zzumVar.zzf().intValue()).zzd();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzto.zza.zzd();
            }
            if (iOrdinal != 4) {
                l6.m("unknown output prefix type");
                return null;
            }
        }
        return zzto.zza(zzumVar.zzf().intValue()).zzd();
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            this.zza.zza(bArr, bArr2);
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
        this.zza.zza(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
