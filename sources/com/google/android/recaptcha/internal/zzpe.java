package com.google.android.recaptcha.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpe extends zzoi {
    static final zzoi zza = new zzpe(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzpe(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzmz.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzoi, com.google.android.recaptcha.internal.zzof
    public final int zza(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final Object[] zzf() {
        return this.zzb;
    }
}
