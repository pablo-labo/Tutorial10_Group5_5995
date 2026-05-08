package defpackage;

import defpackage.jc9;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d3<K, V> extends j3<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> d;
    public transient int e;

    public class a extends jc9.d<K, Collection<V>> {
        public final transient Map<K, Collection<V>> c;

        /* JADX INFO: renamed from: d3$a$a, reason: collision with other inner class name */
        public class C0204a extends jc9.a<K, Collection<V>> {
            public C0204a() {
            }

            @Override // jc9.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = a.this.c.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collectionRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d3 d3Var = d3.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = d3Var.d;
                map.getClass();
                try {
                    collectionRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collectionRemove = null;
                }
                Collection<V> collection = collectionRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                d3Var.e -= size;
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator<Map.Entry<K, Collection<V>>> a;
            public Collection<V> b;

            public b() {
                this.a = a.this.c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.a.next();
                this.b = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                pnb.w("no calls to next() since the last call to remove()", this.b != null);
                this.a.remove();
                d3.this.e -= this.b.size();
                this.b.clear();
                this.b = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.c = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final y37 a(Map.Entry entry) {
            Object key = entry.getKey();
            return new y37(key, d3.this.e(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            d3 d3Var = d3.this;
            if (this.c == d3Var.d) {
                d3Var.a();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.c;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.c;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            return d3.this.e(obj, collection2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            d3 d3Var = d3.this;
            Set<K> set = d3Var.a;
            if (set != null) {
                return set;
            }
            Set<K> setD = d3Var.d();
            d3Var.a = setD;
            return setD;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> collectionRemove = this.c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            d3 d3Var = d3.this;
            Collection<V> collectionC = d3Var.c();
            collectionC.addAll(collectionRemove);
            d3Var.e -= collectionRemove.size();
            collectionRemove.clear();
            return collectionC;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.c.toString();
        }
    }

    public abstract class b<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> a;
        public K b = null;
        public Collection<V> c = null;
        public Iterator<V> d = no7.a;

        public b() {
            this.a = d3.this.d.entrySet().iterator();
        }

        public abstract T a(K k, V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.a.next();
                this.b = next.getKey();
                Collection<V> value = next.getValue();
                this.c = value;
                this.d = value.iterator();
            }
            return this.d.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.d.remove();
            Collection<V> collection = this.c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.a.remove();
            }
            d3 d3Var = d3.this;
            d3Var.e--;
        }
    }

    public class c extends jc9.b<K, Collection<V>> {

        public class a implements Iterator<K> {
            public Map.Entry<K, Collection<V>> a;
            public final /* synthetic */ Iterator b;
            public final /* synthetic */ c c;

            public a(c cVar, Iterator it) {
                this.b = it;
                this.c = cVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.b.next();
                this.a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                pnb.w("no calls to next() since the last call to remove()", this.a != null);
                Collection<V> value = this.a.getValue();
                this.b.remove();
                d3.this.e -= value.size();
                value.clear();
                this.a = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this, this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.a.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                d3.this.e -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public class f extends d3<K, V>.j implements RandomAccess {
    }

    public class g extends d3<K, V>.a implements SortedMap<K, Collection<V>> {
        public SortedSet<K> e;
        public final /* synthetic */ f2a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f2a f2aVar, SortedMap sortedMap) {
            super(sortedMap);
            this.f = f2aVar;
        }

        public SortedSet<K> b() {
            return new h(this.f, f());
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return f().comparator();
        }

        @Override // d3.a, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetB = b();
            this.e = sortedSetB;
            return sortedSetB;
        }

        public SortedMap<K, Collection<V>> f() {
            return (SortedMap) this.c;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return f().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new g(this.f, f().headMap(k));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return f().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new g(this.f, f().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new g(this.f, f().tailMap(k));
        }
    }

    public class h extends d3<K, V>.c implements SortedSet<K> {
        public final /* synthetic */ f2a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f2a f2aVar, SortedMap sortedMap) {
            super(sortedMap);
            this.c = f2aVar;
        }

        public SortedMap<K, Collection<V>> a() {
            return (SortedMap) this.a;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return a().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return a().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new h(this.c, a().headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return a().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new h(this.c, a().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new h(this.c, a().tailMap(k));
        }
    }

    public final void a() {
        Iterator<Collection<V>> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.d.clear();
        this.e = 0;
    }

    public abstract Map<K, Collection<V>> b();

    public abstract Collection<V> c();

    public abstract Set<K> d();

    public abstract Collection<V> e(K k, Collection<V> collection);

    public class j extends d3<K, V>.i implements List<V> {
        public j(K k, List<V> list, d3<K, V>.i iVar) {
            super(k, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            b();
            boolean zIsEmpty = this.b.isEmpty();
            ((List) this.b).add(i, v);
            d3.this.e++;
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.b).addAll(i, collection);
            if (zAddAll) {
                d3.this.e += this.b.size() - size;
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final V get(int i) {
            b();
            return (V) ((List) this.b).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            b();
            return ((List) this.b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            b();
            return ((List) this.b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            b();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i) {
            b();
            V v = (V) ((List) this.b).remove(i);
            d3 d3Var = d3.this;
            d3Var.e--;
            c();
            return v;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            b();
            return (V) ((List) this.b).set(i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            b();
            List listSubList = ((List) this.b).subList(i, i2);
            d3<K, V>.i iVar = this.c;
            if (iVar == null) {
                iVar = this;
            }
            boolean z = listSubList instanceof RandomAccess;
            d3 d3Var = d3.this;
            K k = this.a;
            return z ? new f(k, listSubList, iVar) : new j(k, listSubList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            b();
            return new a(i);
        }

        public class a extends d3<K, V>.i.a implements ListIterator<V> {
            public a(int i) {
                super(j.this, ((List) j.this.b).listIterator(i));
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                j jVar = j.this;
                boolean zIsEmpty = jVar.isEmpty();
                b().add(v);
                d3.this.e++;
                if (zIsEmpty) {
                    jVar.a();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.a;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                b().set(v);
            }

            public a() {
                super();
            }
        }
    }

    public final class d extends d3<K, V>.g implements NavigableMap<K, Collection<V>> {
        public final /* synthetic */ f2a V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f2a f2aVar, NavigableMap navigableMap) {
            super(f2aVar, navigableMap);
            this.V = f2aVar;
        }

        @Override // d3.g
        public final SortedSet b() {
            return new e(this.V, f());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = f().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return f().ceilingKey(k);
        }

        @Override // d3.g
        /* JADX INFO: renamed from: d */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(this.V, f().descendingMap());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = f().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = f().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return f().floorKey(k);
        }

        public final y37 g(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionC = this.V.c();
            collectionC.addAll((Collection) entry.getValue());
            it.remove();
            return new y37(entry.getKey(), Collections.unmodifiableList((List) collectionC));
        }

        @Override // d3.g
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> f() {
            return (NavigableMap) ((SortedMap) this.c);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new d(this.V, f().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = f().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return f().higherKey(k);
        }

        @Override // d3.g, d3.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = f().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = f().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return f().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return g(((a.C0204a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return g(((a.C0204a) ((jc9.d) descendingMap()).entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new d(this.V, f().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new d(this.V, f().tailMap(k, z));
        }

        @Override // d3.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // d3.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // d3.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    public final class e extends d3<K, V>.h implements NavigableSet<K> {
        public final /* synthetic */ f2a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f2a f2aVar, NavigableMap navigableMap) {
            super(f2aVar, navigableMap);
            this.d = f2aVar;
        }

        @Override // d3.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> a() {
            return (NavigableMap) ((SortedMap) this.a);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return a().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(this.d, a().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return a().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new e(this.d, a().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return a().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return a().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k = (K) aVar.next();
            aVar.remove();
            return k;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            Iterator<K> itDescendingIterator = descendingIterator();
            if (!itDescendingIterator.hasNext()) {
                return null;
            }
            K next = itDescendingIterator.next();
            itDescendingIterator.remove();
            return next;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new e(this.d, a().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new e(this.d, a().tailMap(k, z));
        }

        @Override // d3.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // d3.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // d3.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    public class i extends AbstractCollection<V> {
        public final K a;
        public Collection<V> b;
        public final d3<K, V>.i c;
        public final Collection<V> d;

        public i(K k, Collection<V> collection, d3<K, V>.i iVar) {
            this.a = k;
            this.b = collection;
            this.c = iVar;
            this.d = iVar == null ? null : iVar.b;
        }

        public final void a() {
            d3<K, V>.i iVar = this.c;
            if (iVar != null) {
                iVar.a();
            } else {
                d3.this.d.put(this.a, this.b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            b();
            boolean zIsEmpty = this.b.isEmpty();
            boolean zAdd = this.b.add(v);
            if (zAdd) {
                d3.this.e++;
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.b.addAll(collection);
            if (zAddAll) {
                d3.this.e += this.b.size() - size;
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        public final void b() {
            Collection<V> collection;
            d3<K, V>.i iVar = this.c;
            if (iVar != null) {
                iVar.b();
                if (iVar.b == this.d) {
                    return;
                }
                q6.h();
                return;
            }
            if (!this.b.isEmpty() || (collection = d3.this.d.get(this.a)) == null) {
                return;
            }
            this.b = collection;
        }

        public final void c() {
            d3<K, V>.i iVar = this.c;
            if (iVar != null) {
                iVar.c();
            } else if (this.b.isEmpty()) {
                d3.this.d.remove(this.a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            d3.this.e -= size;
            c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            b();
            return this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            b();
            return this.b.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            b();
            return this.b.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            b();
            return this.b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            b();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            b();
            boolean zRemove = this.b.remove(obj);
            if (zRemove) {
                d3 d3Var = d3.this;
                d3Var.e--;
                c();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.b.removeAll(collection);
            if (zRemoveAll) {
                d3.this.e += this.b.size() - size;
                c();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.b.retainAll(collection);
            if (zRetainAll) {
                d3.this.e += this.b.size() - size;
                c();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            b();
            return this.b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            b();
            return this.b.toString();
        }

        public class a implements Iterator<V> {
            public final Iterator<V> a;
            public final Collection<V> b;

            public a() {
                Collection<V> collection = i.this.b;
                this.b = collection;
                this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                i iVar = i.this;
                iVar.b();
                if (iVar.b == this.b) {
                    return;
                }
                q6.h();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                a();
                return this.a.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.a.remove();
                i iVar = i.this;
                d3 d3Var = d3.this;
                d3Var.e--;
                iVar.c();
            }

            public a(j jVar, ListIterator listIterator) {
                i.this = jVar;
                this.b = jVar.b;
                this.a = listIterator;
            }
        }
    }
}
