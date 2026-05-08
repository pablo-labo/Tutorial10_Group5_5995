package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzro {
    final zzrp zza;
    final long[] zzb;

    public zzro(zzro zzroVar) {
        this.zza = new zzrp(zzroVar.zza);
        this.zzb = Arrays.copyOf(zzroVar.zzb, 10);
    }

    public zzro() {
        this(new zzrp(), new long[10]);
    }

    public zzro(zzrp zzrpVar, long[] jArr) {
        this.zza = zzrpVar;
        this.zzb = jArr;
    }
}
