package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xtf<K, V> extends ttf<K, V, Map.Entry<K, V>> {
    public final z8b<K, V> d;

    public xtf(z8b<K, V> z8bVar) {
        this.d = z8bVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new n3a(this.d, objArr[i], objArr[i + 1]);
    }
}
