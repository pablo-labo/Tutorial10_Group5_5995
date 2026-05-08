package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class y37<K, V> extends g3<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    public y37(K k, V v) {
        this.key = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
