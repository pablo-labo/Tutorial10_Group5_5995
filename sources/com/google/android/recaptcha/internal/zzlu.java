package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlu {
    private static final zzlt zza;
    private final zzlt zzb;
    private long zzc;

    static {
        long jPow = (long) Math.pow(2.0d, 32.0d);
        zza = new zzlt(11L, 20919936621L ^ jPow, (long) Math.pow(2.0d, 48.0d));
    }

    public zzlu(long j, long j2, zzlt zzltVar) {
        this.zzb = zzltVar;
        this.zzc = Math.abs(j);
    }

    public final long zza() {
        zzlt zzltVar = this.zzb;
        long jLongValue = (BigInteger.valueOf(zzltVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzltVar.zza())).longValue() + 11) % zzltVar.zza();
        this.zzc = jLongValue;
        return jLongValue % 255;
    }
}
