package com.google.android.recaptcha.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsx {
    public static final zzsx zza = new zzsv().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzsx) {
            return this.zzb.equals(((zzsx) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
