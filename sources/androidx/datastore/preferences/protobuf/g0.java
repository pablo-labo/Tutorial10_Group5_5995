package androidx.datastore.preferences.protobuf;

import defpackage.r6;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class g0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int V = 0;
    public final int a;
    public List<g0<K, V>.b> b = Collections.EMPTY_LIST;
    public Map<K, V> c;
    public boolean d;
    public volatile g0<K, V>.d e;
    public Map<K, V> f;

    public static class a {
        public static final C0031a a = new C0031a();
        public static final b b = new b();

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g0$a$a, reason: collision with other inner class name */
        public static class C0031a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<g0<K, V>.b> {
        public final K a;
        public V b;

        public b() {
            throw null;
        }

        public b(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.a.compareTo(((b) obj).a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k = this.a;
                    if (k == null ? key == null : k.equals(key)) {
                        V v = this.b;
                        Object value = entry.getValue();
                        if (v == null ? value == null : v.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.b;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = g0.V;
            g0.this.b();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public final String toString() {
            return this.a + "=" + this.b;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {
        public int a = -1;
        public boolean b;
        public Iterator<Map.Entry<K, V>> c;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = g0.this.c.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.a + 1;
            g0 g0Var = g0.this;
            return i < g0Var.b.size() || (!g0Var.c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            g0 g0Var = g0.this;
            return i < g0Var.b.size() ? g0Var.b.get(this.a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.b) {
                r6.g("remove() was called before next()");
                return;
            }
            this.b = false;
            int i = g0.V;
            g0 g0Var = g0.this;
            g0Var.b();
            if (this.a >= g0Var.b.size()) {
                a().remove();
                return;
            }
            int i2 = this.a;
            this.a = i2 - 1;
            g0Var.j(i2);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            g0.this.i((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            g0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = g0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            g0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return g0.this.size();
        }
    }

    public g0(int i) {
        this.a = i;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(K r5) {
        /*
            r4 = this;
            java.util.List<androidx.datastore.preferences.protobuf.g0<K, V>$b> r0 = r4.b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List<androidx.datastore.preferences.protobuf.g0<K, V>$b> r2 = r4.b
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.g0$b r2 = (androidx.datastore.preferences.protobuf.g0.b) r2
            K extends java.lang.Comparable<K> r2 = r2.a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r4 = -r0
            return r4
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<androidx.datastore.preferences.protobuf.g0<K, V>$b> r3 = r4.b
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.g0$b r3 = (androidx.datastore.preferences.protobuf.g0.b) r3
            K extends java.lang.Comparable<K> r3 = r3.a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.g0.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.d) {
            defpackage.b0.l();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new d();
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        int size = size();
        if (size == g0Var.size()) {
            int size2 = this.b.size();
            if (size2 != g0Var.b.size()) {
                return ((AbstractSet) entrySet()).equals(g0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (d(i).equals(g0Var.d(i))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(g0Var.c);
            }
            return true;
        }
        return false;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.c.isEmpty() ? a.b : this.c.entrySet();
    }

    public final SortedMap<K, V> g() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.b.get(iA).b : this.c.get(comparable);
    }

    public void h() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.b.get(i).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    public final V i(K k, V v) {
        b();
        int iA = a(k);
        if (iA >= 0) {
            return this.b.get(iA).setValue(v);
        }
        b();
        boolean zIsEmpty = this.b.isEmpty();
        int i = this.a;
        if (zIsEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return g().put(k, v);
        }
        if (this.b.size() == i) {
            g0<K, V>.b bVarRemove = this.b.remove(i - 1);
            g().put(bVarRemove.a, bVarRemove.b);
        }
        this.b.add(i2, new b(k, v));
        return null;
    }

    public final V j(int i) {
        b();
        V v = this.b.remove(i).b;
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<g0<K, V>.b> list = this.b;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return j(iA);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
