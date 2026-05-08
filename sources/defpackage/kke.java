package defpackage;

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

/* JADX INFO: loaded from: classes3.dex */
public class kke<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int f = 0;
    public final int a;
    public List<kke<K, V>.b> b = Collections.EMPTY_LIST;
    public Map<K, V> c = Collections.EMPTY_MAP;
    public boolean d;
    public volatile kke<K, V>.d e;

    public static class a {
        public static final C0294a a = new C0294a();
        public static final b b = new b();

        /* JADX INFO: renamed from: kke$a$a, reason: collision with other inner class name */
        public static class C0294a implements Iterator<Object> {
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

    public class b implements Comparable<kke<K, V>.b>, Map.Entry<K, V> {
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
            int i = kke.f;
            kke.this.b();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.a);
            String strValueOf2 = String.valueOf(this.b);
            return m6.h(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
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
                this.c = kke.this.c.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a + 1 < kke.this.b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            kke kkeVar = kke.this;
            return i < kkeVar.b.size() ? kkeVar.b.get(this.a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.b) {
                r6.g("remove() was called before next()");
                return;
            }
            this.b = false;
            int i = kke.f;
            kke kkeVar = kke.this;
            kkeVar.b();
            if (this.a >= kkeVar.b.size()) {
                a().remove();
                return;
            }
            int i2 = this.a;
            this.a = i2 - 1;
            kkeVar.h(i2);
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
            kke.this.g((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            kke.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = kke.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            kke.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return kke.this.size();
        }
    }

    public kke(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(K r5) {
        /*
            r4 = this;
            java.util.List<kke<K, V>$b> r0 = r4.b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List<kke<K, V>$b> r2 = r4.b
            java.lang.Object r2 = r2.get(r1)
            kke$b r2 = (kke.b) r2
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
            java.util.List<kke<K, V>$b> r3 = r4.b
            java.lang.Object r3 = r3.get(r2)
            kke$b r3 = (kke.b) r3
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kke.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.d) {
            b0.l();
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

    public final Iterable<Map.Entry<K, V>> d() {
        return this.c.isEmpty() ? a.b : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new d();
        }
        return this.e;
    }

    public final SortedMap<K, V> f() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    public final V g(K k, V v) {
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
            return f().put(k, v);
        }
        if (this.b.size() == i) {
            kke<K, V>.b bVarRemove = this.b.remove(i - 1);
            f().put(bVarRemove.a, bVarRemove.b);
        }
        this.b.add(i2, new b(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.b.get(iA).b : this.c.get(comparable);
    }

    public final V h(int i) {
        b();
        V v = this.b.remove(i).b;
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<kke<K, V>.b> list = this.b;
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
            return h(iA);
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
