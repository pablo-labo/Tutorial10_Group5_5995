package com.google.android.recaptcha.internal;

import defpackage.l5;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzags implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzagv) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzahl) {
            return ((zzagv) this.zza.getValue()).zzc((zzahl) obj);
        }
        l5.q("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }

    public final zzagv zza() {
        return (zzagv) this.zza.getValue();
    }
}
