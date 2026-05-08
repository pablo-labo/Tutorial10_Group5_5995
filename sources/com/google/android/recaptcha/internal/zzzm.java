package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzm extends zzaas {
    private final zzzg zza;
    private final BigInteger zzb;
    private final zzadm zzc;
    private final Integer zzd;

    public /* synthetic */ zzzm(zzzg zzzgVar, BigInteger bigInteger, zzadm zzadmVar, Integer num, zzzl zzzlVar) {
        this.zza = zzzgVar;
        this.zzb = bigInteger;
        this.zzc = zzadmVar;
        this.zzd = num;
    }

    public static zzzk zzd() {
        return new zzzk(null);
    }

    @Override // com.google.android.recaptcha.internal.zzaas, com.google.android.recaptcha.internal.zzqp
    public final /* synthetic */ zzqw zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzqp
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzzg zzc() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaas
    public final zzadm zze() {
        return this.zzc;
    }

    public final BigInteger zzf() {
        return this.zzb;
    }
}
