package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzph extends zzoq {
    private final transient zzol zza;
    private final transient zzoi zzb;

    public zzph(zzol zzolVar, zzoi zzoiVar) {
        this.zza = zzolVar;
        this.zzb = zzoiVar;
    }

    @Override // com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof
    /* JADX INFO: renamed from: zzd */
    public final zzpn iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        return true;
    }
}
