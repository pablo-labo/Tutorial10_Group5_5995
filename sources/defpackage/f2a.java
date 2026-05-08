package defpackage;

import defpackage.d3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f2a<K, V> extends y2<K, V> {
    private static final long serialVersionUID = 0;
    public transient fze<? extends List<V>> f;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f = (fze) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        Map<K, Collection<V>> map = (Map) object2;
        this.d = map;
        this.e = 0;
        for (Collection<V> collection : map.values()) {
            if (collection.isEmpty()) {
                o6.h();
                return;
            }
            this.e = collection.size() + this.e;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f);
        objectOutputStream.writeObject(this.d);
    }

    @Override // defpackage.d3
    public final Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.d;
        return map instanceof NavigableMap ? new d3.d(this, (NavigableMap) this.d) : map instanceof SortedMap ? new d3.g(this, (SortedMap) this.d) : new d3.a(this.d);
    }

    @Override // defpackage.d3
    public final Collection c() {
        return this.f.get();
    }

    @Override // defpackage.d3
    public final Set<K> d() {
        Map<K, Collection<V>> map = this.d;
        return map instanceof NavigableMap ? new d3.e(this, (NavigableMap) this.d) : map instanceof SortedMap ? new d3.h(this, (SortedMap) this.d) : new d3.c(this.d);
    }
}
