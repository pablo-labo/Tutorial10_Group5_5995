package com.google.android.recaptcha.internal;

import defpackage.r6;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsv {
    private HashMap zza = new HashMap();

    public final zzsx zza() {
        if (this.zza == null) {
            r6.g("cannot call build() twice");
            return null;
        }
        zzsx zzsxVar = new zzsx(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzsxVar;
    }
}
