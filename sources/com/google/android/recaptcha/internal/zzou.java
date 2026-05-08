package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzou implements Iterator {
    boolean zza;
    final /* synthetic */ Iterator zzb;

    public zzou(zzov zzovVar, Iterator it) {
        this.zzb = it;
        Objects.requireNonNull(zzovVar);
        this.zza = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.zzb.next();
        this.zza = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzmz.zzg(!this.zza, "no calls to next() since the last call to remove()");
        this.zzb.remove();
    }
}
