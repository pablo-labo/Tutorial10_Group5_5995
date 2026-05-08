package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzrn extends zzrm {
    private final long[] zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrn(zzrq zzrqVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        zzrp zzrpVar = zzrqVar.zza;
        zzsa.zzf(jArr2, zzrpVar.zzb, zzrpVar.zza);
        long[] jArr3 = this.zzb;
        zzrp zzrpVar2 = zzrqVar.zza;
        zzsa.zze(jArr3, zzrpVar2.zzb, zzrpVar2.zza);
        System.arraycopy(zzrqVar.zza.zzc, 0, jArr, 0, 10);
        zzsa.zza(this.zzc, zzrqVar.zzb, zzru.zzb);
    }

    @Override // com.google.android.recaptcha.internal.zzrm
    public final void zzb(long[] jArr, long[] jArr2) {
        zzsa.zza(jArr, jArr2, this.zzd);
    }

    public zzrn() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }
}
