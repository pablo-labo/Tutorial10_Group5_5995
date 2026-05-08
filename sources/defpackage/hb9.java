package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hb9<K, V> implements Map<K, V>, Serializable, cf8 {
    public static final hb9 a;
    private ib9<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private jb9<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private kb9<V> valuesView;

    public static final class a {
    }

    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, ze8 {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i = this.b;
            hb9<K, V> hb9Var = this.a;
            if (i >= ((hb9) hb9Var).length) {
                k20.p();
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            this.c = i2;
            c cVar = new c(hb9Var, i2);
            b();
            return cVar;
        }
    }

    public static final class c<K, V> implements Map.Entry<K, V>, ze8 {
        public final hb9<K, V> a;
        public final int b;
        public final int c;

        public c(hb9<K, V> hb9Var, int i) {
            hb9Var.getClass();
            this.a = hb9Var;
            this.b = i;
            this.c = ((hb9) hb9Var).modCount;
        }

        public final void a() {
            if (((hb9) this.a).modCount != this.c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return wl7.b(entry.getKey(), getKey()) && wl7.b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            a();
            return (K) ((hb9) this.a).keysArray[this.b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            a();
            Object[] objArr = ((hb9) this.a).valuesArray;
            objArr.getClass();
            return (V) objArr[this.b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            a();
            hb9<K, V> hb9Var = this.a;
            hb9Var.k();
            V[] vArrI = hb9Var.i();
            int i = this.b;
            V v2 = vArrI[i];
            vArrI[i] = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class d<K, V> {
        public final hb9<K, V> a;
        public int b;
        public int c;
        public int d;

        public d(hb9<K, V> hb9Var) {
            hb9Var.getClass();
            this.a = hb9Var;
            this.c = -1;
            this.d = ((hb9) hb9Var).modCount;
            b();
        }

        public final void a() {
            if (((hb9) this.a).modCount == this.d) {
                return;
            }
            q6.h();
        }

        public final void b() {
            while (true) {
                int i = this.b;
                hb9<K, V> hb9Var = this.a;
                if (i >= ((hb9) hb9Var).length) {
                    return;
                }
                int[] iArr = ((hb9) hb9Var).presenceArray;
                int i2 = this.b;
                if (iArr[i2] >= 0) {
                    return;
                } else {
                    this.b = i2 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.b < ((hb9) this.a).length;
        }

        public final void remove() {
            a();
            if (this.c == -1) {
                r6.g("Call next() before removing element from the iterator.");
                return;
            }
            hb9<K, V> hb9Var = this.a;
            hb9Var.k();
            hb9Var.x(this.c);
            this.c = -1;
            this.d = ((hb9) hb9Var).modCount;
        }
    }

    public static final class e<K, V> extends d<K, V> implements Iterator<K>, ze8 {
        @Override // java.util.Iterator
        public final K next() {
            a();
            int i = this.b;
            hb9<K, V> hb9Var = this.a;
            if (i >= ((hb9) hb9Var).length) {
                k20.p();
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            this.c = i2;
            K k = (K) ((hb9) hb9Var).keysArray[this.c];
            b();
            return k;
        }
    }

    public static final class f<K, V> extends d<K, V> implements Iterator<V>, ze8 {
        @Override // java.util.Iterator
        public final V next() {
            a();
            int i = this.b;
            hb9<K, V> hb9Var = this.a;
            if (i >= ((hb9) hb9Var).length) {
                k20.p();
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            this.c = i2;
            Object[] objArr = ((hb9) hb9Var).valuesArray;
            objArr.getClass();
            V v = (V) objArr[this.c];
            b();
            return v;
        }
    }

    static {
        hb9 hb9Var = new hb9(0);
        hb9Var.isReadOnly = true;
        a = hb9Var;
    }

    public hb9(int i) {
        if (i < 0) {
            l5.q("capacity must be non-negative.");
            throw null;
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = kArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[iHighestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new a8e(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public final void clear() {
        k();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ygg.u(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ygg.u(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return r(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return s(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ib9<K, V> ib9Var = this.entriesView;
        if (ib9Var != null) {
            return ib9Var;
        }
        ib9<K, V> ib9Var2 = new ib9<>(this);
        this.entriesView = ib9Var2;
        return ib9Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.size == map.size() && n(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iR = r(obj);
        if (iR < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        vArr.getClass();
        return vArr[iR];
    }

    public final int h(K k) {
        k();
        while (true) {
            int iT = t(k);
            int i = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[iT];
                if (i3 <= 0) {
                    int i4 = this.length;
                    K[] kArr = this.keysArray;
                    if (i4 < kArr.length) {
                        int i5 = i4 + 1;
                        this.length = i5;
                        kArr[i4] = k;
                        this.presenceArray[i4] = iT;
                        iArr[iT] = i5;
                        this.size++;
                        this.modCount++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    q(1);
                } else {
                    if (wl7.b(this.keysArray[i3 - 1], k)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        v(this.hashArray.length * 2);
                        break;
                    }
                    iT = iT == 0 ? this.hashArray.length - 1 : iT - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i2 = bVar.b;
            hb9<K, V> hb9Var = bVar.a;
            if (i2 >= hb9Var.length) {
                k20.p();
                return 0;
            }
            int i3 = bVar.b;
            bVar.b = i3 + 1;
            bVar.c = i3;
            Object obj = hb9Var.keysArray[bVar.c];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = hb9Var.valuesArray;
            objArr.getClass();
            Object obj2 = objArr[bVar.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            bVar.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final V[] i() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        int length = this.keysArray.length;
        if (length < 0) {
            l5.q("capacity must be non-negative.");
            return null;
        }
        V[] vArr2 = (V[]) new Object[length];
        this.valuesArray = vArr2;
        return vArr2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final hb9 j() {
        k();
        this.isReadOnly = true;
        if (this.size > 0) {
            return this;
        }
        hb9 hb9Var = a;
        hb9Var.getClass();
        return hb9Var;
    }

    public final void k() {
        if (this.isReadOnly) {
            b0.l();
        }
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        jb9<K> jb9Var = this.keysView;
        if (jb9Var != null) {
            return jb9Var;
        }
        jb9<K> jb9Var2 = new jb9<>(this);
        this.keysView = jb9Var2;
        return jb9Var2;
    }

    public final void l(boolean z) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ygg.u(this.keysArray, i3, i);
        if (vArr != null) {
            ygg.u(vArr, i3, this.length);
        }
        this.length = i3;
    }

    public final boolean n(Collection<?> collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!o((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean o(Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        int iR = r(entry.getKey());
        if (iR < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        vArr.getClass();
        return wl7.b(vArr[iR], entry.getValue());
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        k();
        int iH = h(k);
        V[] vArrI = i();
        if (iH >= 0) {
            vArrI[iH] = v;
            return null;
        }
        int i = (-iH) - 1;
        V v2 = vArrI[i];
        vArrI[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        k();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        q(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iH = h(entry.getKey());
            V[] vArrI = i();
            if (iH >= 0) {
                vArrI[iH] = entry.getValue();
            } else {
                int i = (-iH) - 1;
                if (!wl7.b(entry.getValue(), vArrI[i])) {
                    vArrI[i] = entry.getValue();
                }
            }
        }
    }

    public final void q(int i) {
        K[] kArr = this.keysArray;
        int length = kArr.length;
        int i2 = this.length;
        int i3 = length - i2;
        int i4 = i2 - this.size;
        if (i3 < i && i3 + i4 >= i && i4 >= kArr.length / 4) {
            l(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > kArr.length) {
            int length2 = kArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.keysArray = (K[]) Arrays.copyOf(kArr, i6);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) Arrays.copyOf(vArr, i6) : null;
            this.presenceArray = Arrays.copyOf(this.presenceArray, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.hashArray.length) {
                v(iHighestOneBit);
            }
        }
    }

    public final int r(K k) {
        int iT = t(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[iT];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (wl7.b(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iT = iT == 0 ? this.hashArray.length - 1 : iT - 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        k();
        int iR = r(obj);
        if (iR < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        vArr.getClass();
        V v = vArr[iR];
        x(iR);
        return v;
    }

    public final int s(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                vArr.getClass();
                if (wl7.b(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    public final int t(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.size * 3) + 2);
        sb.append("{");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = bVar.b;
            hb9<K, V> hb9Var = bVar.a;
            if (i2 >= hb9Var.length) {
                k20.p();
                return null;
            }
            int i3 = bVar.b;
            bVar.b = i3 + 1;
            bVar.c = i3;
            Object obj = hb9Var.keysArray[bVar.c];
            if (obj == hb9Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = hb9Var.valuesArray;
            objArr.getClass();
            Object obj2 = objArr[bVar.c];
            if (obj2 == hb9Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            bVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return this.isReadOnly;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.presenceArray[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(int r6) {
        /*
            r5 = this;
            int r0 = r5.modCount
            int r0 = r0 + 1
            r5.modCount = r0
            int r0 = r5.length
            int r1 = r5.size
            r2 = 0
            if (r0 <= r1) goto L10
            r5.l(r2)
        L10:
            int[] r0 = new int[r6]
            r5.hashArray = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.hashShift = r6
        L1c:
            int r6 = r5.length
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            K[] r0 = r5.keysArray
            r0 = r0[r2]
            int r0 = r5.t(r0)
            int r1 = r5.maxProbeDistance
        L2c:
            int[] r3 = r5.hashArray
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.presenceArray
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.r6.g(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb9.v(int):void");
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        kb9<V> kb9Var = this.valuesView;
        if (kb9Var != null) {
            return kb9Var;
        }
        kb9<V> kb9Var2 = new kb9<>(this);
        this.valuesView = kb9Var2;
        return kb9Var2;
    }

    public final boolean w(Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        k();
        int iR = r(entry.getKey());
        if (iR < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        vArr.getClass();
        if (!wl7.b(vArr[iR], entry.getValue())) {
            return false;
        }
        x(iR);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0022->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.keysArray
            r0.getClass()
            r1 = 0
            r0[r12] = r1
            V[] r0 = r11.valuesArray
            if (r0 == 0) goto Le
            r0[r12] = r1
        Le:
            int[] r0 = r11.presenceArray
            r0 = r0[r12]
            int r1 = r11.maxProbeDistance
            int r1 = r1 * 2
            int[] r2 = r11.hashArray
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1e
            r1 = r2
        L1e:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L22:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2c
            int[] r0 = r11.hashArray
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2d
        L2c:
            r0 = r5
        L2d:
            int r4 = r4 + 1
            int r5 = r11.maxProbeDistance
            int[] r6 = r11.hashArray
            r7 = -1
            if (r4 <= r5) goto L39
            r6[r1] = r2
            goto L68
        L39:
            r5 = r6[r0]
            if (r5 != 0) goto L40
            r6[r1] = r2
            goto L68
        L40:
            if (r5 >= 0) goto L47
            r6[r1] = r7
        L44:
            r1 = r0
            r4 = r2
            goto L61
        L47:
            K[] r6 = r11.keysArray
            int r8 = r5 + (-1)
            r6 = r6[r8]
            int r6 = r11.t(r6)
            int r6 = r6 - r0
            int[] r9 = r11.hashArray
            int r10 = r9.length
            int r10 = r10 + (-1)
            r6 = r6 & r10
            if (r6 < r4) goto L61
            r9[r1] = r5
            int[] r4 = r11.presenceArray
            r4[r8] = r1
            goto L44
        L61:
            int r3 = r3 + r7
            if (r3 >= 0) goto L22
            int[] r0 = r11.hashArray
            r0[r1] = r7
        L68:
            int[] r0 = r11.presenceArray
            r0[r12] = r7
            int r12 = r11.size
            int r12 = r12 + r7
            r11.size = r12
            int r12 = r11.modCount
            int r12 = r12 + 1
            r11.modCount = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb9.x(int):void");
    }

    public hb9() {
        this(8);
    }
}
