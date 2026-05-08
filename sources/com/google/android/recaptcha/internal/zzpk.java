package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzpk extends zzoq {
    static final zzpk zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzpk(objArr, 0, objArr, 0, 0);
    }

    public zzpk(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZzb = zzoc.zzb(obj);
                while (true) {
                    int i = iZzb & this.zzf;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZzb = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzoq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzh().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zza(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i2 = this.zzg;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof
    /* JADX INFO: renamed from: zzd */
    public final zzpn iterator() {
        return zzh().listIterator(0);
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final Object[] zzf() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final zzoi zzi() {
        return zzoi.zzh(this.zzb, this.zzg);
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final boolean zzm() {
        return true;
    }
}
