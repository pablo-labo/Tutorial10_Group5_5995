package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ljd<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> a;
    public c<K, V> b;
    public final WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();
    public int d = 0;

    public static class a<K, V> extends e<K, V> {
        @Override // ljd.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // ljd.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.c;
        }
    }

    public static class b<K, V> extends e<K, V> {
        @Override // ljd.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // ljd.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {
        public final K a;
        public final V b;
        public c<K, V> c;
        public c<K, V> d;

        public c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.b.hashCode() ^ this.a.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.a + "=" + this.b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> a;
        public boolean b = true;

        public d() {
        }

        @Override // ljd.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.d;
                this.a = cVar3;
                this.b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b) {
                return ljd.this.a != null;
            }
            c<K, V> cVar = this.a;
            return (cVar == null || cVar.c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.b) {
                this.b = false;
                this.a = ljd.this.a;
            } else {
                c<K, V> cVar = this.a;
                this.a = cVar != null ? cVar.c : null;
            }
            return this.a;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> a;
        public c<K, V> b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        @Override // ljd.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            c<K, V> cVar2 = this.a;
            if (cVar2 == cVar) {
                this.a = b(cVar2);
            }
            c<K, V> cVar3 = this.b;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.a;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.b = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.a;
            this.b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.a;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public V b(K k) {
        c<K, V> cVarA = a(k);
        if (cVarA == null) {
            return null;
        }
        this.d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        c<K, V> cVar = cVarA.d;
        c<K, V> cVar2 = cVarA.c;
        if (cVar != null) {
            cVar.c = cVar2;
        } else {
            this.a = cVar2;
        }
        c<K, V> cVar3 = cVarA.c;
        if (cVar3 != null) {
            cVar3.d = cVar;
        } else {
            this.b = cVar;
        }
        cVarA.c = null;
        cVarA.d = null;
        return cVarA.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((ljd.e) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.ljd
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ljd r6 = (defpackage.ljd) r6
            int r1 = r5.d
            int r3 = r6.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            ljd$e r1 = (ljd.e) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            ljd$e r3 = (ljd.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            ljd$e r6 = (ljd.e) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.a, this.b);
        this.c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
