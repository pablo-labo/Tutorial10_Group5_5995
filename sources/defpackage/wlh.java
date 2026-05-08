package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wlh extends gkh {
    final /* synthetic */ ylh zza;

    public wlh(ylh ylhVar) {
        this.zza = ylhVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.zza.zza.c.e.get(i), this.zza.zza.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.d.size();
    }
}
