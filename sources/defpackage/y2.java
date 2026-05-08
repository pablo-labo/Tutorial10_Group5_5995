package defpackage;

import defpackage.d3;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y2<K, V> extends d3<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public y2(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.d = map;
        } else {
            o6.h();
            throw null;
        }
    }

    @Override // defpackage.d2a
    public final Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapB = b();
        this.c = mapB;
        return mapB;
    }

    @Override // defpackage.d3
    public final Collection<V> e(K k, Collection<V> collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new d3.f(k, list, null) : new d3.j(k, list, null);
    }
}
