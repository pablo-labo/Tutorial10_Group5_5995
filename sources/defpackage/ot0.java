package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ot0<E> implements Collection<E>, Set<E>, bf8, jf8 {
    public int[] a;
    public Object[] b;
    public int c;

    public final class a extends ha7<E> {
        public a() {
            super(ot0.this.c);
        }

        @Override // defpackage.ha7
        public final E a(int i) {
            return (E) ot0.this.b[i];
        }

        @Override // defpackage.ha7
        public final void b(int i) {
            ot0.this.a(i);
        }
    }

    public ot0(int i) {
        this.a = pyd.d;
        this.b = pyd.f;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    public final E a(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
            return e;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                pyd.h(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                pyd.j(objArr2, i, objArr2, i4, i2);
            }
            this.b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.a = iArr2;
            this.b = new Object[i5];
            if (i > 0) {
                pyd.k(0, i, 6, iArr, iArr2);
                pyd.l(objArr, 0, this.b, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                pyd.h(i, i6, i2, iArr, this.a);
                pyd.j(objArr, i, this.b, i6, i2);
            }
        }
        if (i2 == this.c) {
            this.c = i3;
            return e;
        }
        q6.h();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int iE;
        int i2 = this.c;
        if (e == null) {
            iE = zkd.E(this, null, 0);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iE = zkd.E(this, e, iHashCode);
        }
        if (iE >= 0) {
            return false;
        }
        int i3 = ~iE;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i2 != this.c) {
                q6.h();
                return false;
            }
            if (iArr2.length != 0) {
                pyd.k(0, iArr.length, 6, iArr, iArr2);
                pyd.l(objArr, 0, this.b, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            pyd.h(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.b;
            pyd.j(objArr2, i5, objArr2, i3, i2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = e;
                this.c = i6 + 1;
                return true;
            }
        }
        q6.h();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        int size = collection.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new Object[size];
            if (i > 0) {
                pyd.k(0, i, 6, iArr, iArr2);
                pyd.l(objArr, 0, this.b, this.c, 6);
            }
        }
        if (this.c != i) {
            q6.h();
            return false;
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = pyd.d;
            this.b = pyd.f;
            this.c = 0;
        }
        if (this.c == 0) {
            return;
        }
        q6.h();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? zkd.E(this, null, 0) : zkd.E(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iE = obj == null ? zkd.E(this, null, 0) : zkd.E(this, obj, obj.hashCode());
        if (iE < 0) {
            return false;
        }
        a(iE);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<? extends Object> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!z92.I0(collection, this.b[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int i = this.c;
        if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        pyd.j(this.b, 0, tArr, 0, this.c);
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return pyd.n(this.b, 0, this.c);
    }
}
