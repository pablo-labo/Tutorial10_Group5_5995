package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ey8<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a a = new a();
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private ey8<K, V>.b entrySet;
    final e<K, V> header;
    private ey8<K, V>.c keySet;
    int modCount;
    e<K, V> root;
    int size;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends ey8<K, V>.d<Map.Entry<K, V>> {
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            ey8.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L29
                ey8 r3 = defpackage.ey8.this
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                r2 = 0
                if (r0 == 0) goto L15
                ey8$e r3 = r3.a(r0, r1)     // Catch: java.lang.ClassCastException -> L15
                goto L16
            L15:
                r3 = r2
            L16:
                if (r3 == 0) goto L25
                V r0 = r3.W
                java.lang.Object r4 = r4.getValue()
                boolean r4 = java.util.Objects.equals(r0, r4)
                if (r4 == 0) goto L25
                r2 = r3
            L25:
                if (r2 == 0) goto L29
                r3 = 1
                return r3
            L29:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ey8.b.contains(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean remove(java.lang.Object r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                goto L28
            L6:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                ey8 r4 = defpackage.ey8.this
                r2 = 0
                if (r0 == 0) goto L16
                ey8$e r0 = r4.a(r0, r1)     // Catch: java.lang.ClassCastException -> L16
                goto L17
            L16:
                r0 = r2
            L17:
                if (r0 == 0) goto L26
                V r3 = r0.W
                java.lang.Object r5 = r5.getValue()
                boolean r5 = java.util.Objects.equals(r3, r5)
                if (r5 == 0) goto L26
                r2 = r0
            L26:
                if (r2 != 0) goto L29
            L28:
                return r1
            L29:
                r5 = 1
                r4.d(r2, r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ey8.b.remove(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ey8.this.size;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends ey8<K, V>.d<K> {
            @Override // ey8.d, java.util.Iterator
            public final K next() {
                return a().f;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            ey8.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return ey8.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            ey8 ey8Var = ey8.this;
            e<K, V> eVarA = null;
            if (obj != null) {
                try {
                    eVarA = ey8Var.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVarA != null) {
                ey8Var.d(eVarA, true);
            }
            return eVarA != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ey8.this.size;
        }
    }

    public abstract class d<T> implements Iterator<T> {
        public e<K, V> a;
        public e<K, V> b = null;
        public int c;

        public d() {
            this.a = ey8.this.header.d;
            this.c = ey8.this.modCount;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.a;
            ey8 ey8Var = ey8.this;
            if (eVar == ey8Var.header) {
                k20.p();
                return null;
            }
            if (ey8Var.modCount != this.c) {
                q6.h();
                return null;
            }
            this.a = eVar.d;
            this.b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != ey8.this.header;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.b;
            if (eVar == null) {
                bg.h();
                return;
            }
            ey8 ey8Var = ey8.this;
            ey8Var.d(eVar, true);
            this.b = null;
            this.c = ey8Var.modCount;
        }
    }

    public ey8(boolean z) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = a;
        this.allowNullValues = z;
        this.header = new e<>(z);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final e<K, V> a(K k, boolean z) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.comparator;
        e<K, V> eVar2 = this.root;
        a aVar = a;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f;
                iCompareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.b : eVar2.c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z) {
            return null;
        }
        e<K, V> eVar5 = this.header;
        if (eVar4 != null) {
            eVar = new e<>(this.allowNullValues, eVar4, k, eVar5, eVar5.e);
            if (iCompareTo < 0) {
                eVar4.b = eVar;
            } else {
                eVar4.c = eVar;
            }
            b(eVar4, true);
        } else {
            if (comparator == aVar && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(this.allowNullValues, eVar4, k, eVar5, eVar5.e);
            this.root = eVar;
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    public final void b(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.b;
            e<K, V> eVar3 = eVar.c;
            int i = eVar2 != null ? eVar2.X : 0;
            int i2 = eVar3 != null ? eVar3.X : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.b;
                e<K, V> eVar5 = eVar3.c;
                int i4 = (eVar4 != null ? eVar4.X : 0) - (eVar5 != null ? eVar5.X : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    g(eVar);
                } else {
                    h(eVar3);
                    g(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.b;
                e<K, V> eVar7 = eVar2.c;
                int i5 = (eVar6 != null ? eVar6.X : 0) - (eVar7 != null ? eVar7.X : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    h(eVar);
                } else {
                    g(eVar2);
                    h(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.X = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.X = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.e = eVar;
        eVar.d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVarA = null;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVarA != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i;
        if (z) {
            e<K, V> eVar4 = eVar.e;
            eVar4.d = eVar.d;
            eVar.d.e = eVar4;
        }
        e<K, V> eVar5 = eVar.b;
        e<K, V> eVar6 = eVar.c;
        e<K, V> eVar7 = eVar.a;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                f(eVar, eVar5);
                eVar.b = null;
            } else if (eVar6 != null) {
                f(eVar, eVar6);
                eVar.c = null;
            } else {
                f(eVar, null);
            }
            b(eVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (eVar5.X > eVar6.X) {
            e<K, V> eVar8 = eVar5.c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.c;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.b;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.b;
                }
            }
            eVar3 = eVar2;
        }
        d(eVar3, false);
        e<K, V> eVar11 = eVar.b;
        if (eVar11 != null) {
            i = eVar11.X;
            eVar3.b = eVar11;
            eVar11.a = eVar3;
            eVar.b = null;
        } else {
            i = 0;
        }
        e<K, V> eVar12 = eVar.c;
        if (eVar12 != null) {
            i2 = eVar12.X;
            eVar3.c = eVar12;
            eVar12.a = eVar3;
            eVar.c = null;
        }
        eVar3.X = Math.max(i, i2) + 1;
        f(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ey8<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        ey8<K, V>.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.a;
        eVar.a = null;
        if (eVar2 != null) {
            eVar2.a = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.b == eVar) {
            eVar3.b = eVar2;
        } else {
            eVar3.c = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar3.b;
        e<K, V> eVar5 = eVar3.c;
        eVar.c = eVar4;
        if (eVar4 != null) {
            eVar4.a = eVar;
        }
        f(eVar, eVar3);
        eVar3.b = eVar;
        eVar.a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.X : 0, eVar4 != null ? eVar4.X : 0) + 1;
        eVar.X = iMax;
        eVar3.X = Math.max(iMax, eVar5 != null ? eVar5.X : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        e<K, V> eVarA;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
                eVarA = null;
            }
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            return eVarA.W;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar2.b;
        e<K, V> eVar5 = eVar2.c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.a = eVar;
        }
        f(eVar, eVar2);
        eVar2.c = eVar;
        eVar.a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.X : 0, eVar5 != null ? eVar5.X : 0) + 1;
        eVar.X = iMax;
        eVar2.X = Math.max(iMax, eVar4 != null ? eVar4.X : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        ey8<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        ey8<K, V>.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            ja.k("key == null");
            return null;
        }
        if (v == null && !this.allowNullValues) {
            ja.k("value == null");
            return null;
        }
        e<K, V> eVarA = a(k, true);
        V v2 = eVarA.W;
        eVarA.W = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e<K, V> eVarA;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
                eVarA = null;
            }
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            d(eVarA, true);
        }
        if (eVarA != null) {
            return eVarA.W;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    public static final class e<K, V> implements Map.Entry<K, V> {
        public final boolean V;
        public V W;
        public int X;
        public e<K, V> a;
        public e<K, V> b;
        public e<K, V> c;
        public e<K, V> d;
        public e<K, V> e;
        public final K f;

        public e(boolean z, e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.a = eVar;
            this.f = k;
            this.V = z;
            this.X = 1;
            this.d = eVar2;
            this.e = eVar3;
            eVar3.d = this;
            eVar2.e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.W;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.W;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.W;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (v == null && !this.V) {
                ja.k("value == null");
                return null;
            }
            V v2 = this.W;
            this.W = v;
            return v2;
        }

        public final String toString() {
            return this.f + "=" + this.W;
        }

        public e(boolean z) {
            this.f = null;
            this.V = z;
            this.e = this;
            this.d = this;
        }
    }

    public ey8() {
        this(true);
    }
}
