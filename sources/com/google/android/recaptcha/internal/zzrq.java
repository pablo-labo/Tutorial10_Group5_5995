package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzrq {
    final zzrp zza;
    final long[] zzb;

    public zzrq() {
        this(new zzrp(), new long[10]);
    }

    public static /* bridge */ /* synthetic */ zzrq zza(zzrq zzrqVar, zzro zzroVar) {
        zzb(zzrqVar, zzroVar);
        return zzrqVar;
    }

    private static zzrq zzb(zzrq zzrqVar, zzro zzroVar) {
        zzrp zzrpVar = zzroVar.zza;
        zzrp zzrpVar2 = zzrqVar.zza;
        long[] jArr = zzrpVar2.zza;
        long[] jArr2 = zzrpVar.zza;
        long[] jArr3 = zzroVar.zzb;
        zzsa.zza(jArr, jArr2, jArr3);
        long[] jArr4 = zzrpVar2.zzb;
        long[] jArr5 = zzrpVar.zzb;
        long[] jArr6 = zzrpVar.zzc;
        zzsa.zza(jArr4, jArr5, jArr6);
        zzsa.zza(zzrpVar2.zzc, jArr6, jArr3);
        zzsa.zza(zzrqVar.zzb, jArr2, jArr5);
        return zzrqVar;
    }

    public zzrq(zzrp zzrpVar, long[] jArr) {
        this.zza = zzrpVar;
        this.zzb = jArr;
    }

    public zzrq(zzro zzroVar) {
        this();
        zzb(this, zzroVar);
    }
}
