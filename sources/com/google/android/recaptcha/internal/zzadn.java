package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadn {
    private final BigInteger zza;

    private zzadn(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzadn zza(BigInteger bigInteger, zzra zzraVar) {
        return new zzadn(bigInteger);
    }

    public final BigInteger zzb(zzra zzraVar) {
        return this.zza;
    }
}
