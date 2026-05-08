package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzpg extends zzoq {
    private final transient zzol zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzpg(zzol zzolVar, Object[] objArr, int i, int i2) {
        this.zza = zzolVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzh().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zza(Object[] objArr, int i) {
        return zzh().zza(objArr, 0);
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof
    /* JADX INFO: renamed from: zzd */
    public final zzpn iterator() {
        return zzh().listIterator(0);
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final zzoi zzi() {
        return new zzpf(this);
    }
}
