package com.google.android.recaptcha.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class zznh<K, V> implements zzpb<K, V> {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzpb) {
            return zza().equals(((zzpb) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza().toString();
    }

    @Override // com.google.android.recaptcha.internal.zzpb
    public Map zza() {
        throw null;
    }
}
