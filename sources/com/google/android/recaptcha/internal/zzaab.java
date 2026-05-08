package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaab extends zzaas {
    private final zzzv zza;
    private final BigInteger zzb;
    private final zzadm zzc;
    private final Integer zzd;

    public /* synthetic */ zzaab(zzzv zzzvVar, BigInteger bigInteger, zzadm zzadmVar, Integer num, zzaaa zzaaaVar) {
        this.zza = zzzvVar;
        this.zzb = bigInteger;
        this.zzc = zzadmVar;
        this.zzd = num;
    }

    public static zzzz zzd() {
        return new zzzz(null);
    }

    @Override // com.google.android.recaptcha.internal.zzaas, com.google.android.recaptcha.internal.zzqp
    public final /* synthetic */ zzqw zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzqp
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzzv zzc() {
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
