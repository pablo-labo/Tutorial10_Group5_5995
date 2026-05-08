package com.google.android.recaptcha.internal;

import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxr extends zzaas {
    private final zzxl zza;
    private final ECPoint zzb;
    private final zzadm zzc;
    private final Integer zzd;

    public /* synthetic */ zzxr(zzxl zzxlVar, ECPoint eCPoint, zzadm zzadmVar, Integer num, zzxq zzxqVar) {
        this.zza = zzxlVar;
        this.zzb = eCPoint;
        this.zzc = zzadmVar;
        this.zzd = num;
    }

    public static zzxp zzd() {
        return new zzxp(null);
    }

    @Override // com.google.android.recaptcha.internal.zzaas, com.google.android.recaptcha.internal.zzqp
    public final /* synthetic */ zzqw zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzqp
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzxl zzc() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaas
    public final zzadm zze() {
        return this.zzc;
    }

    public final ECPoint zzf() {
        return this.zzb;
    }
}
