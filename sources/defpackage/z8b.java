package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z8b<K, V> implements Iterator<Map.Entry<K, V>>, ze8 {
    public final x8b<K, V, Map.Entry<K, V>> a;

    public z8b(w8b<K, V> w8bVar) {
        ttf[] ttfVarArr = new ttf[8];
        for (int i = 0; i < 8; i++) {
            ttfVarArr[i] = new xtf(this);
        }
        this.a = new x8b<>(w8bVar, ttfVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
