package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzos extends zzoq {
    private final transient zzot zza;

    public zzos(zzot zzotVar) {
        this.zza = zzotVar;
    }

    @Override // com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzot zzotVar = this.zza;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) zzotVar.zza().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzom(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof
    /* JADX INFO: renamed from: zzd */
    public final zzpn iterator() {
        return new zzom(this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        return false;
    }
}
