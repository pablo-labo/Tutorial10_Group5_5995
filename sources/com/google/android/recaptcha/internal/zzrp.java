package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzrp {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzrp(zzrp zzrpVar) {
        this.zza = Arrays.copyOf(zzrpVar.zza, 10);
        this.zzb = Arrays.copyOf(zzrpVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzrpVar.zzc, 10);
    }

    public static zzrp zza(zzrp zzrpVar, zzro zzroVar) {
        zzrp zzrpVar2 = zzroVar.zza;
        long[] jArr = zzrpVar.zza;
        long[] jArr2 = zzrpVar2.zza;
        long[] jArr3 = zzroVar.zzb;
        zzsa.zza(jArr, jArr2, jArr3);
        long[] jArr4 = zzrpVar.zzb;
        long[] jArr5 = zzrpVar2.zzb;
        long[] jArr6 = zzrpVar2.zzc;
        zzsa.zza(jArr4, jArr5, jArr6);
        zzsa.zza(zzrpVar.zzc, jArr6, jArr3);
        return zzrpVar;
    }

    public final byte[] zzb() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.zzc;
        zzsa.zzd(jArr4, jArr14);
        zzsa.zzd(jArr13, jArr4);
        zzsa.zzd(jArr12, jArr13);
        zzsa.zza(jArr5, jArr12, jArr14);
        zzsa.zza(jArr6, jArr5, jArr4);
        zzsa.zzd(jArr12, jArr6);
        zzsa.zza(jArr7, jArr12, jArr5);
        zzsa.zzd(jArr12, jArr7);
        zzsa.zzd(jArr13, jArr12);
        zzsa.zzd(jArr12, jArr13);
        zzsa.zzd(jArr13, jArr12);
        zzsa.zzd(jArr12, jArr13);
        zzsa.zza(jArr8, jArr12, jArr7);
        zzsa.zzd(jArr12, jArr8);
        zzsa.zzd(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            zzsa.zzd(jArr12, jArr13);
            zzsa.zzd(jArr13, jArr12);
        }
        zzsa.zza(jArr9, jArr13, jArr8);
        zzsa.zzd(jArr12, jArr9);
        zzsa.zzd(jArr13, jArr12);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            zzsa.zzd(jArr12, jArr13);
            zzsa.zzd(jArr13, jArr12);
        }
        zzsa.zza(jArr12, jArr13, jArr9);
        zzsa.zzd(jArr13, jArr12);
        zzsa.zzd(jArr12, jArr13);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            zzsa.zzd(jArr13, jArr12);
            zzsa.zzd(jArr12, jArr13);
        }
        zzsa.zza(jArr10, jArr12, jArr8);
        zzsa.zzd(jArr12, jArr10);
        zzsa.zzd(jArr13, jArr12);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            zzsa.zzd(jArr12, jArr13);
            zzsa.zzd(jArr13, jArr12);
        }
        zzsa.zza(jArr11, jArr13, jArr10);
        zzsa.zzd(jArr13, jArr11);
        zzsa.zzd(jArr12, jArr13);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            zzsa.zzd(jArr13, jArr12);
            zzsa.zzd(jArr12, jArr13);
        }
        zzsa.zza(jArr13, jArr12, jArr11);
        zzsa.zzd(jArr12, jArr13);
        zzsa.zzd(jArr13, jArr12);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            zzsa.zzd(jArr12, jArr13);
            zzsa.zzd(jArr13, jArr12);
        }
        zzsa.zza(jArr12, jArr13, jArr10);
        zzsa.zzd(jArr13, jArr12);
        zzsa.zzd(jArr12, jArr13);
        zzsa.zzd(jArr13, jArr12);
        zzsa.zzd(jArr12, jArr13);
        zzsa.zzd(jArr13, jArr12);
        zzsa.zza(jArr, jArr13, jArr6);
        zzsa.zza(jArr2, this.zza, jArr);
        zzsa.zza(jArr3, this.zzb, jArr);
        byte[] bArrZzg = zzsa.zzg(jArr3);
        bArrZzg[31] = (byte) (bArrZzg[31] ^ (zzrr.zza(jArr2) << 7));
        return bArrZzg;
    }

    public zzrp() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzrp(zzro zzroVar) {
        this();
        zza(this, zzroVar);
    }

    public zzrp(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }
}
