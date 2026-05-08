package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeu extends Exception {
    private final Throwable zza;
    private final zzamt zzb;
    private final int zzc;
    private final int zzd;

    public zzeu(int i, int i2, Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zzamt zzamtVarZza = zzamu.zza();
        zzamtVarZza.zzc(i2);
        zzamtVarZza.zzd(i);
        this.zzb = zzamtVarZza;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzamt zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
