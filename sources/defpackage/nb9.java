package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class nb9<K, V> implements Map.Entry<K, V>, ze8 {
    public final K a;
    public final V b;

    public nb9(K k, V v) {
        this.a = k;
        this.b = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && wl7.b(entry.getKey(), this.a) && wl7.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.a;
        int iHashCode = k != null ? k.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
