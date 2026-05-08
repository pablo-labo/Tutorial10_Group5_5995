package com.google.android.recaptcha.internal;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zznr extends AbstractCollection {
    final /* synthetic */ zznt zza;

    public /* synthetic */ zznr(zznt zzntVar, zzns zznsVar) {
        Objects.requireNonNull(zzntVar);
        this.zza = zzntVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zznt zzntVar = this.zza;
        Map mapZzl = zzntVar.zzl();
        return mapZzl != null ? mapZzl.values().iterator() : new zznm(zzntVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
