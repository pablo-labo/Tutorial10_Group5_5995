package com.google.android.recaptcha.internal;

import defpackage.k20;

/* JADX INFO: loaded from: classes2.dex */
final class zzoy extends zzpn {
    private final Object zza;
    private boolean zzb;

    public zzoy(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            k20.p();
            return null;
        }
        this.zzb = true;
        return this.zza;
    }
}
