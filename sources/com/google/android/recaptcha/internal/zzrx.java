package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrx {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzrx() {
    }

    public final zzrx zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzrz zzb() {
        return new zzrz(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzrx(zzry zzryVar) {
    }
}
