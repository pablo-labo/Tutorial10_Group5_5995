package com.google.android.recaptcha.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzrd implements zzrf {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzrd(boolean z) {
    }

    @Override // com.google.android.recaptcha.internal.zzrf
    public final boolean zza() {
        return this.zza.get();
    }
}
