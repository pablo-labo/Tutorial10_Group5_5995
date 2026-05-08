package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzst extends zzqp {
    private final zzum zza;

    public zzst(zzum zzumVar, zzra zzraVar) {
        zze(zzumVar, zzraVar);
        this.zza = zzumVar;
    }

    private static void zze(zzum zzumVar, zzra zzraVar) {
        int i = zzsq.zzb[zzumVar.zzb().ordinal()];
    }

    @Override // com.google.android.recaptcha.internal.zzqp
    public final zzqw zza() {
        zzum zzumVar = this.zza;
        return new zzsr(zzumVar.zzg(), zzumVar.zzc(), null);
    }

    @Override // com.google.android.recaptcha.internal.zzqp
    public final Integer zzb() {
        throw null;
    }

    public final zzum zzc(zzra zzraVar) {
        zzum zzumVar = this.zza;
        zze(zzumVar, zzraVar);
        return zzumVar;
    }

    public final zzadm zzd() throws GeneralSecurityException {
        zzum zzumVar = this.zza;
        if (zzumVar.zzc().equals(zzwj.RAW)) {
            return zzadm.zzb(new byte[0]);
        }
        if (zzumVar.zzc().equals(zzwj.TINK)) {
            return zzto.zzb(zzumVar.zzf().intValue());
        }
        if (zzumVar.zzc().equals(zzwj.LEGACY) || zzumVar.zzc().equals(zzwj.CRUNCHY)) {
            return zzto.zza(zzumVar.zzf().intValue());
        }
        l6.m("Unknown output prefix type");
        return null;
    }
}
