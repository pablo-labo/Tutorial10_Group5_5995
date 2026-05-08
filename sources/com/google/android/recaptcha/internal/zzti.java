package com.google.android.recaptcha.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzti {
    private static final zzti zza = new zzti();
    private static final zztg zzb = new zztg(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzti zzb() {
        return zza;
    }

    public final zzsz zza() {
        zzsz zzszVar = (zzsz) this.zzc.get();
        return zzszVar == null ? zzb : zzszVar;
    }
}
