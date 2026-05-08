package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class sph extends mnh {
    final /* synthetic */ uph zza;

    public sph(uph uphVar) {
        this.zza = uphVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        uph uphVar = this.zza;
        zlh.a(i, uphVar.e);
        Object[] objArr = uphVar.d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.e;
    }
}
