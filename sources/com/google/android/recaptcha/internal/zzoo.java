package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzoo<K, V> extends zzni<K, V> implements Serializable {
    final transient zzol<K, ? extends zzof<V>> map;
    final transient int size;

    public zzoo(zzol zzolVar, int i) {
        this.map = zzolVar;
        this.size = i;
    }

    @Override // com.google.android.recaptcha.internal.zznh, com.google.android.recaptcha.internal.zzpb
    public /* synthetic */ Map zza() {
        return this.map;
    }
}
