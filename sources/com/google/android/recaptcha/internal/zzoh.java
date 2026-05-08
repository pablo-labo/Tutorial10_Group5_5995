package com.google.android.recaptcha.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzoh extends zzoi {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzoi zzc;

    public zzoh(zzoi zzoiVar, int i, int i2) {
        Objects.requireNonNull(zzoiVar);
        this.zzc = zzoiVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzmz.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final Object[] zzf() {
        return this.zzc.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzoi, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzoi subList(int i, int i2) {
        zzmz.zzf(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
