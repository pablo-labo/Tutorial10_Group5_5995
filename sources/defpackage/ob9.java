package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ob9<K, V> implements Map.Entry<K, V> {
    public String a;
    public V b;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.b;
        this.b = v;
        return v2;
    }
}
