package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zztx implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zztx(zzub zzubVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzubVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zztz(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
