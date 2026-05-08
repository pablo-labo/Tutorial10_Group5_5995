package com.google.android.recaptcha.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpi extends zzoi {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzpi(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzmz.zza(i, this.zzc, "index");
        Object obj = this.zza[i + i + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        throw null;
    }
}
