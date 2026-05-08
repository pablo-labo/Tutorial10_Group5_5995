package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j3<K, V> implements d2a<K, V> {
    public transient Set<K> a;
    public transient Collection<V> b;
    public transient Map<K, Collection<V>> c;

    public class a extends AbstractCollection<V> {
        public final /* synthetic */ d3 a;

        public a(d3 d3Var) {
            this.a = d3Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.a.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<Collection<V>> it = this.a.asMap().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new c3();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.a.e;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2a) {
            return asMap().equals(((d2a) obj).asMap());
        }
        return false;
    }

    public final int hashCode() {
        return asMap().hashCode();
    }

    public final String toString() {
        return asMap().toString();
    }
}
