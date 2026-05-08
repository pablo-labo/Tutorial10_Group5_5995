package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzin {
    public static final zzaks zza(zzel zzelVar, zzel zzelVar2) {
        zzakq zzakqVarZza = zzaks.zza();
        zzakqVarZza.zzc(zzaje.zzb(zzelVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzakqVarZza.zzd(zzajc.zza(zzelVar.zza(timeUnit)));
        zzakqVarZza.zza(zzaje.zzb(zzelVar2.zzb()));
        zzakqVarZza.zzb(zzajc.zza(zzelVar2.zza(timeUnit)));
        return (zzaks) zzakqVarZza.zzq();
    }
}
