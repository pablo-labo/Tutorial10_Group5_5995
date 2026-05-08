package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzrm {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzrm(zzrm zzrmVar) {
        this.zza = Arrays.copyOf(zzrmVar.zza, 10);
        this.zzb = Arrays.copyOf(zzrmVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzrmVar.zzc, 10);
    }

    public final void zza(zzrm zzrmVar, int i) {
        zzrl.zza(this.zza, zzrmVar.zza, i);
        zzrl.zza(this.zzb, zzrmVar.zzb, i);
        zzrl.zza(this.zzc, zzrmVar.zzc, i);
    }

    public void zzb(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public zzrm() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzrm(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }
}
