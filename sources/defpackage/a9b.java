package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a9b<K, V> extends n3<K> {
    public final w8b<K, V> a;

    public a9b(w8b<K, V> w8bVar) {
        this.a = w8bVar;
    }

    @Override // defpackage.n3
    public final int a() {
        w8b<K, V> w8bVar = this.a;
        w8bVar.getClass();
        return w8bVar.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        ttf[] ttfVarArr = new ttf[8];
        for (int i = 0; i < 8; i++) {
            ttfVarArr[i] = new vtf();
        }
        return new b9b(this.a, ttfVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        w8b<K, V> w8bVar = this.a;
        if (!w8bVar.containsKey(obj)) {
            return false;
        }
        w8bVar.remove(obj);
        return true;
    }
}
