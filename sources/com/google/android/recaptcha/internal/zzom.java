package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzom extends zzpn {
    final Iterator zza;
    Object zzb;
    Iterator zzc;
    final /* synthetic */ zzoo zzd;

    public zzom(zzoo zzooVar) {
        Objects.requireNonNull(zzooVar);
        this.zzd = zzooVar;
        this.zza = zzooVar.map.entrySet().zzh().listIterator(0);
        this.zzb = null;
        this.zzc = zzox.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzof) entry.getValue()).iterator();
        }
        Object obj = this.zzb;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.zzc.next());
    }
}
