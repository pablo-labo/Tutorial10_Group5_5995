package com.google.android.recaptcha.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zznn extends AbstractSet {
    final /* synthetic */ zznt zza;

    public /* synthetic */ zznn(zznt zzntVar, zzns zznsVar) {
        Objects.requireNonNull(zzntVar);
        this.zza = zzntVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zznt zzntVar = this.zza;
        Map mapZzl = zzntVar.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzv = zzntVar.zzv(entry.getKey());
            if (iZzv != -1 && Objects.equals(zznt.zzj(zzntVar, iZzv), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zznt zzntVar = this.zza;
        Map mapZzl = zzntVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new zznl(zzntVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iZzu;
        int iZzb;
        zznt zzntVar = this.zza;
        Map mapZzl = zzntVar.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzntVar.zzq() || (iZzb = zznu.zzb(entry.getKey(), entry.getValue(), (iZzu = zzntVar.zzu()), zznt.zzi(zzntVar), zzntVar.zzz(), zzntVar.zzA(), zzntVar.zzB())) == -1) {
            return false;
        }
        zzntVar.zzp(iZzb, iZzu);
        zzntVar.zzg--;
        zzntVar.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
