package com.google.android.recaptcha.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zznp extends AbstractSet {
    final /* synthetic */ zznt zza;

    public /* synthetic */ zznp(zznt zzntVar, zzns zznsVar) {
        Objects.requireNonNull(zzntVar);
        this.zza = zzntVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zznt zzntVar = this.zza;
        Map mapZzl = zzntVar.zzl();
        return mapZzl != null ? mapZzl.keySet().iterator() : new zznk(zzntVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zznt zzntVar = this.zza;
        Map mapZzl = zzntVar.zzl();
        return mapZzl != null ? mapZzl.keySet().remove(obj) : zzntVar.zzx(obj) != zznt.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
