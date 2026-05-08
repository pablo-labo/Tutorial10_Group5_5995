package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jfe<K, V> {
    public int[] a;
    public Object[] b;
    public int c;

    public jfe(int i) {
        this.a = i == 0 ? pyd.d : new int[i];
        this.b = i == 0 ? pyd.f : new Object[i << 1];
    }

    public final int a(V v) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (v.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, i);
            this.b = Arrays.copyOf(this.b, i * 2);
        }
        if (this.c == i2) {
            return;
        }
        q6.h();
    }

    public void clear() {
        if (this.c > 0) {
            this.a = pyd.d;
            this.b = pyd.f;
            this.c = 0;
        }
        if (this.c <= 0) {
            return;
        }
        q6.h();
    }

    public boolean containsKey(K k) {
        return f(k) >= 0;
    }

    public boolean containsValue(V v) {
        return a(v) >= 0;
    }

    public final int d(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int iA = pyd.a(i2, i, this.a);
        if (iA < 0 || wl7.b(obj, this.b[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (wl7.b(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (wl7.b(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof jfe) {
                int i = this.c;
                if (i != ((jfe) obj).c) {
                    return false;
                }
                jfe jfeVar = (jfe) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    K kH = h(i2);
                    V vL = l(i2);
                    Object obj2 = jfeVar.get(kH);
                    if (vL == null) {
                        if (obj2 != null || !jfeVar.containsKey(kH)) {
                            return false;
                        }
                    } else if (!vL.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                K kH2 = h(i4);
                V vL2 = l(i4);
                Object obj3 = ((Map) obj).get(kH2);
                if (vL2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kH2)) {
                        return false;
                    }
                } else if (!vL2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f(K k) {
        return k == null ? g() : d(k.hashCode(), k);
    }

    public final int g() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int iA = pyd.a(i, 0, this.a);
        if (iA < 0 || this.b[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public V get(K k) {
        int iF = f(k);
        if (iF >= 0) {
            return (V) this.b[(iF << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v) {
        int iF = f(obj);
        return iF >= 0 ? (V) this.b[(iF << 1) + 1] : v;
    }

    public final K h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (z) {
            return (K) this.b[i << 1];
        }
        l5.q(p6.c(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public void i(jfe<? extends K, ? extends V> jfeVar) {
        jfeVar.getClass();
        int i = jfeVar.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(jfeVar.h(i2), jfeVar.l(i2));
            }
        } else if (i > 0) {
            pyd.h(0, 0, i, jfeVar.a, this.a);
            pyd.j(jfeVar.b, 0, this.b, 0, i << 1);
            this.c = i;
        }
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public V j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            l5.q(p6.c(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.b;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i4 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                pyd.h(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                pyd.j(objArr2, i3, objArr2, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.a = Arrays.copyOf(iArr, i7);
            this.b = Arrays.copyOf(this.b, i7 << 1);
            if (i2 != this.c) {
                q6.h();
                return null;
            }
            if (i > 0) {
                pyd.h(0, 0, i, iArr, this.a);
                pyd.j(objArr, 0, this.b, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                pyd.h(i, i8, i2, iArr, this.a);
                pyd.j(objArr, i3, this.b, i8 << 1, i2 << 1);
            }
        }
        if (i2 == this.c) {
            this.c = i4;
            return v;
        }
        q6.h();
        return null;
    }

    public V k(int i, V v) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (!z) {
            l5.q(p6.c(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final V l(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (z) {
            return (V) this.b[(i << 1) + 1];
        }
        l5.q(p6.c(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public V put(K k, V v) {
        int i = this.c;
        int iHashCode = k != null ? k.hashCode() : 0;
        int iD = k != null ? d(iHashCode, k) : g();
        if (iD >= 0) {
            int i2 = (iD << 1) + 1;
            Object[] objArr = this.b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iD;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.a = Arrays.copyOf(iArr, i4);
            this.b = Arrays.copyOf(this.b, i4 << 1);
            if (i != this.c) {
                q6.h();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            pyd.h(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.b;
            pyd.j(objArr2, i5 << 1, objArr2, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.c = i6 + 1;
                return null;
            }
        }
        q6.h();
        return null;
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public final boolean remove(K k, V v) {
        int iF = f(k);
        if (iF < 0 || !wl7.b(v, l(iF))) {
            return false;
        }
        j(iF);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iF = f(k);
        if (iF < 0 || !wl7.b(v, l(iF))) {
            return false;
        }
        k(iF, v2);
        return true;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kH = h(i2);
            if (kH != sb) {
                sb.append(kH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vL = l(i2);
            if (vL != sb) {
                sb.append(vL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V remove(K k) {
        int iF = f(k);
        if (iF >= 0) {
            return j(iF);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int iF = f(k);
        if (iF >= 0) {
            return k(iF, v);
        }
        return null;
    }

    public jfe() {
        this(0);
    }
}
