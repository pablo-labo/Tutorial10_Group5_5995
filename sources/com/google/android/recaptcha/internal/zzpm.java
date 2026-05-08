package com.google.android.recaptcha.internal;

import defpackage.l5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzpm extends zzoq {
    final transient Object zza;

    public zzpm(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzoq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzoy(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return l5.m("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.recaptcha.internal.zzoq, com.google.android.recaptcha.internal.zzof
    /* JADX INFO: renamed from: zzd */
    public final zzpn iterator() {
        return new zzoy(this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zze() {
        return false;
    }
}
