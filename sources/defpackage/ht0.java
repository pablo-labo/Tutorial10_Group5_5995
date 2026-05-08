package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ht0<K, V> extends jfe<K, V> implements Map<K, V> {
    public ht0<K, V>.a d;
    public ht0<K, V>.c e;
    public ht0<K, V>.e f;

    public final class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ht0.this.c;
        }
    }

    public final class b extends ha7<K> {
        public b() {
            super(ht0.this.c);
        }

        @Override // defpackage.ha7
        public final K a(int i) {
            return ht0.this.h(i);
        }

        @Override // defpackage.ha7
        public final void b(int i) {
            ht0.this.j(i);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int a;
        public int b = -1;
        public boolean c;

        public d() {
            this.a = ht0.this.c - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.c) {
                r6.g("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.b;
                ht0 ht0Var = ht0.this;
                if (wl7.b(key, ht0Var.h(i)) && wl7.b(entry.getValue(), ht0Var.l(this.b))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.c) {
                return ht0.this.h(this.b);
            }
            r6.g("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.c) {
                return ht0.this.l(this.b);
            }
            r6.g("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.c) {
                r6.g("This container does not support retaining Map.Entry objects");
                return 0;
            }
            int i = this.b;
            ht0 ht0Var = ht0.this;
            K kH = ht0Var.h(i);
            V vL = ht0Var.l(this.b);
            return (kH == null ? 0 : kH.hashCode()) ^ (vL != null ? vL.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                k20.p();
                return null;
            }
            this.b++;
            this.c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.c) {
                bg.h();
                return;
            }
            ht0.this.j(this.b);
            this.b--;
            this.a--;
            this.c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.c) {
                return ht0.this.k(this.b, v);
            }
            r6.g("This container does not support retaining Map.Entry objects");
            return null;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class f extends ha7<V> {
        public f() {
            super(ht0.this.c);
        }

        @Override // defpackage.ha7
        public final V a(int i) {
            return ht0.this.l(i);
        }

        @Override // defpackage.ha7
        public final void b(int i) {
            ht0.this.j(i);
        }
    }

    public ht0(ht0 ht0Var) {
        super(0);
        if (ht0Var != null) {
            i(ht0Var);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ht0<K, V>.a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        ht0<K, V>.a aVar2 = new a();
        this.d = aVar2;
        return aVar2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        ht0<K, V>.c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        ht0<K, V>.c cVar2 = new c();
        this.e = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(Collection<?> collection) {
        int i = this.c;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    public final boolean p(Collection<?> collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(h(i2))) {
                j(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        ht0<K, V>.e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        ht0<K, V>.e eVar2 = new e();
        this.f = eVar2;
        return eVar2;
    }

    public ht0() {
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ht0.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ht0.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return ht0.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            ht0 ht0Var = ht0.this;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                if (ht0Var.c == set.size()) {
                    return ht0Var.n(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ht0 ht0Var = ht0.this;
            int iHashCode = 0;
            for (int i = ht0Var.c - 1; i >= 0; i--) {
                K kH = ht0Var.h(i);
                iHashCode += kH == null ? 0 : kH.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ht0.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ht0 ht0Var = ht0.this;
            int iF = ht0Var.f(obj);
            if (iF < 0) {
                return false;
            }
            ht0Var.j(iF);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return ht0.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return ht0.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ht0.this.c;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            ht0 ht0Var = ht0.this;
            int i = ht0Var.c;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = ht0Var.h(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ht0 ht0Var = ht0.this;
            int i = ht0Var.c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = ht0Var.h(i2);
            }
            return objArr;
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ht0.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ht0.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ht0.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ht0 ht0Var = ht0.this;
            int iA = ht0Var.a(obj);
            if (iA < 0) {
                return false;
            }
            ht0Var.j(iA);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            ht0 ht0Var = ht0.this;
            int i = ht0Var.c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(ht0Var.l(i2))) {
                    ht0Var.j(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            ht0 ht0Var = ht0.this;
            int i = ht0Var.c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(ht0Var.l(i2))) {
                    ht0Var.j(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return ht0.this.c;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            ht0 ht0Var = ht0.this;
            int i = ht0Var.c;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = ht0Var.l(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            ht0 ht0Var = ht0.this;
            int i = ht0Var.c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = ht0Var.l(i2);
            }
            return objArr;
        }
    }
}
