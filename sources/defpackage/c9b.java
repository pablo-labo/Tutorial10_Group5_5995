package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c9b<K, V> extends k3<V> {
    public final w8b<K, V> a;

    public c9b(w8b<K, V> w8bVar) {
        this.a = w8bVar;
    }

    @Override // defpackage.k3
    public final int a() {
        w8b<K, V> w8bVar = this.a;
        w8bVar.getClass();
        return w8bVar.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        ttf[] ttfVarArr = new ttf[8];
        for (int i = 0; i < 8; i++) {
            ttfVarArr[i] = new ytf();
        }
        return new d9b(this.a, ttfVarArr);
    }
}
