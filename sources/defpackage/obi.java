package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class obi<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int V = 0;
    public final int a;
    public List<xbi> b = Collections.EMPTY_LIST;
    public Map<K, V> c;
    public boolean d;
    public volatile cci e;
    public Map<K, V> f;

    public obi(int i) {
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
            java.util.List<xbi> r0 = r4.b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List<xbi> r2 = r4.b
            java.lang.Object r2 = r2.get(r1)
            xbi r2 = (defpackage.xbi) r2
            java.lang.Comparable r2 = r2.a
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
            if (r0 > r1) goto L41
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<xbi> r3 = r4.b
            java.lang.Object r3 = r3.get(r2)
            xbi r3 = (defpackage.xbi) r3
            java.lang.Comparable r3 = r3.a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3b
            int r1 = r2 + (-1)
            goto L22
        L3b:
            if (r3 <= 0) goto L40
            int r0 = r2 + 1
            goto L22
        L40:
            return r2
        L41:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obi.a(java.lang.Comparable):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        i();
        int iA = a(k);
        if (iA >= 0) {
            return (V) this.b.get(iA).setValue(v);
        }
        i();
        boolean zIsEmpty = this.b.isEmpty();
        int i = this.a;
        if (zIsEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return j().put(k, v);
        }
        if (this.b.size() == i) {
            xbi xbiVarRemove = this.b.remove(i - 1);
            j().put(xbiVarRemove.a, xbiVarRemove.b);
        }
        this.b.add(i2, new xbi(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
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
            this.e = new cci(this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obi)) {
            return super.equals(obj);
        }
        obi obiVar = (obi) obj;
        int size = size();
        if (size == obiVar.size()) {
            int size2 = this.b.size();
            if (size2 != obiVar.b.size()) {
                return ((AbstractSet) entrySet()).equals(obiVar.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (d(i).equals(obiVar.d(i))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(obiVar.c);
            }
            return true;
        }
        return false;
    }

    public final V f(int i) {
        i();
        V v = (V) this.b.remove(i).b;
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = j().entrySet().iterator();
            List<xbi> list = this.b;
            Map.Entry<K, V> next = it.next();
            list.add(new xbi(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    public void g() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? (V) this.b.get(iA).b : this.c.get(comparable);
    }

    public final Iterable<Map.Entry<K, V>> h() {
        return this.c.isEmpty() ? nn2.Z : this.c.entrySet();
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

    public final void i() {
        if (this.d) {
            b0.l();
        }
    }

    public final SortedMap<K, V> j() {
        i();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
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
