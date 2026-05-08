package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3<E extends Map.Entry<? extends K, ? extends V>, K, V> extends n3<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        w8b<K, V> w8bVar = ((y8b) this).a;
        V v = w8bVar.get(key);
        return v != null ? v.equals(entry.getValue()) : entry.getValue() == null && w8bVar.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((y8b) this).a.remove(entry.getKey(), entry.getValue());
    }
}
