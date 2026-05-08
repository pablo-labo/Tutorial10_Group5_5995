package defpackage;

import com.google.j2objc.annotations.Weak;
import d3.a.C0204a;
import defpackage.abe;
import defpackage.d3;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jc9 {

    public static abstract class a<K, V> extends abe.c<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            d3.a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return d3.a.this.isEmpty();
        }

        @Override // abe.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return abe.e(this, collection);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean zRemove = false;
                while (it.hasNext()) {
                    zRemove |= ((d3.a.C0204a) this).remove(it.next());
                }
                return zRemove;
            }
        }

        @Override // abe.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(jc9.a(collection.size()));
                for (Object obj : collection) {
                    if (this.contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return d3.a.this.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return d3.a.this.c.size();
        }
    }

    public static class b<K, V> extends abe.c<K> {

        @Weak
        public final Map<K, V> a;

        public b(Map<K, V> map) {
            map.getClass();
            this.a = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.a.size();
        }
    }

    public static class c<K, V> extends AbstractCollection<V> {

        @Weak
        public final d a;

        public c(d dVar) {
            this.a = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((d3.a) this.a).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new ic9(this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                d dVar = this.a;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (ojh.l(obj, entry.getValue())) {
                        ((d3.a) dVar).remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                d dVar = this.a;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return dVar.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                d dVar = this.a;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return dVar.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((d3.a) this.a).c.size();
        }
    }

    public static abstract class d<K, V> extends AbstractMap<K, V> {
        public transient d3.a.C0204a a;
        public transient c b;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            d3.a.C0204a c0204a = this.a;
            if (c0204a != null) {
                return c0204a;
            }
            d3.a.C0204a c0204a2 = ((d3.a) this).new C0204a();
            this.a = c0204a2;
            return c0204a2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            c cVar = this.b;
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c(this);
            this.b = cVar2;
            return cVar2;
        }
    }

    public static int a(int i) {
        if (i < 3) {
            wg2.o(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
