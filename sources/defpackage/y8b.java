package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y8b<K, V> extends e3<Map.Entry<K, V>, K, V> {
    public final w8b<K, V> a;

    public y8b(w8b<K, V> w8bVar) {
        this.a = w8bVar;
    }

    @Override // defpackage.n3
    public final int a() {
        w8b<K, V> w8bVar = this.a;
        w8bVar.getClass();
        return w8bVar.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new z8b(this.a);
    }
}
