package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m3<K, V> extends AbstractMap<K, V> implements Map<K, V>, cf8 {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new y8b((w8b) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new a9b((w8b) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((w8b) this).f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new c9b((w8b) this);
    }
}
