package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpf extends zzoi {
    final /* synthetic */ zzpg zza;

    public zzpf(zzpg zzpgVar) {
        Objects.requireNonNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzpg zzpgVar = this.zza;
        zzmz.zza(i, zzpgVar.zzc, "index");
        int i2 = i + i;
        Object obj = zzpgVar.zzb[i2];
        Objects.requireNonNull(obj);
        Object obj2 = zzpgVar.zzb[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        throw null;
    }
}
