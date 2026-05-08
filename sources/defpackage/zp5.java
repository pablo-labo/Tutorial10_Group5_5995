package defpackage;

import androidx.media3.datasource.d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zp5<K, V> extends h91 implements Map<K, V> {
    @Override // java.util.Map
    public final void clear() {
        ((d.b) this).b.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) ((d.b) this).b.entrySet();
    }

    public boolean isEmpty() {
        return ((d.b) this).b.isEmpty();
    }

    public Set<K> keySet() {
        return (Set<K>) ((d.b) this).b.keySet();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) ((d.b) this).b.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        ((d.b) this).b.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return (V) ((d.b) this).b.remove(obj);
    }

    public int size() {
        return ((d.b) this).b.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) ((d.b) this).b.values();
    }
}
