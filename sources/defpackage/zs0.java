package defpackage;

import defpackage.w2;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zs0<E> extends l3<E> {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public zs0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else {
            if (i <= 0) {
                l5.q(p6.c(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    @Override // defpackage.l3
    public final int a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int length;
        int i2 = this.c;
        if (i < 0 || i > i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        o();
        f(this.c + 1);
        int iN = n(this.a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            if (iN == 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iN - 1;
            }
            int length2 = this.a;
            if (length2 == 0) {
                Object[] objArr2 = this.b;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.a;
            Object[] objArr3 = this.b;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                pyd.j(objArr3, i5, objArr3, i5 + 1, length + 1);
            } else {
                pyd.j(objArr3, i5 - 1, objArr3, i5, objArr3.length);
                Object[] objArr4 = this.b;
                objArr4[objArr4.length - 1] = objArr4[0];
                pyd.j(objArr4, 0, objArr4, 1, length + 1);
            }
            this.b[length] = e;
            this.a = i4;
        } else {
            int iN2 = n(i3 + this.a);
            Object[] objArr5 = this.b;
            if (iN < iN2) {
                pyd.j(objArr5, iN + 1, objArr5, iN, iN2);
            } else {
                pyd.j(objArr5, 1, objArr5, 0, iN2);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                pyd.j(objArr6, iN + 1, objArr6, iN, objArr6.length - 1);
            }
            this.b[iN] = e;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        o();
        f(collection.size() + this.c);
        int iN = n(this.c + this.a);
        int iN2 = n(this.a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i3 = iN2 + size;
            Object[] objArr = this.b;
            if (iN2 < iN) {
                int i4 = size + iN;
                if (i4 <= objArr.length) {
                    pyd.j(objArr, i3, objArr, iN2, iN);
                } else if (i3 >= objArr.length) {
                    pyd.j(objArr, i3 - objArr.length, objArr, iN2, iN);
                } else {
                    int length = iN - (i4 - objArr.length);
                    pyd.j(objArr, 0, objArr, length, iN);
                    Object[] objArr2 = this.b;
                    pyd.j(objArr2, i3, objArr2, iN2, length);
                }
            } else {
                pyd.j(objArr, size, objArr, 0, iN);
                Object[] objArr3 = this.b;
                if (i3 >= objArr3.length) {
                    pyd.j(objArr3, i3 - objArr3.length, objArr3, iN2, objArr3.length);
                } else {
                    pyd.j(objArr3, 0, objArr3, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.b;
                    pyd.j(objArr4, i3, objArr4, iN2, objArr4.length - size);
                }
            }
            d(iN2, collection);
            return true;
        }
        int i5 = this.a;
        int length2 = i5 - size;
        Object[] objArr5 = this.b;
        if (iN2 < i5) {
            pyd.j(objArr5, length2, objArr5, i5, objArr5.length);
            Object[] objArr6 = this.b;
            if (size >= iN2) {
                pyd.j(objArr6, objArr6.length - size, objArr6, 0, iN2);
            } else {
                pyd.j(objArr6, objArr6.length - size, objArr6, 0, size);
                Object[] objArr7 = this.b;
                pyd.j(objArr7, 0, objArr7, size, iN2);
            }
        } else if (length2 >= 0) {
            pyd.j(objArr5, length2, objArr5, i5, iN2);
        } else {
            length2 += objArr5.length;
            int i6 = iN2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                pyd.j(objArr5, length2, objArr5, i5, iN2);
            } else {
                pyd.j(objArr5, length2, objArr5, i5, i5 + length3);
                Object[] objArr8 = this.b;
                pyd.j(objArr8, 0, objArr8, this.a + length3, iN2);
            }
        }
        this.a = length2;
        d(k(iN2 - size), collection);
        return true;
    }

    public final void addFirst(E e) {
        o();
        f(this.c + 1);
        int length = this.a;
        if (length == 0) {
            Object[] objArr = this.b;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.a = i;
        this.b[i] = e;
        this.c++;
    }

    public final void addLast(E e) {
        o();
        f(a() + 1);
        this.b[n(a() + this.a)] = e;
        this.c = a() + 1;
    }

    @Override // defpackage.l3
    public final E b(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iN = n(this.a + i);
        Object[] objArr = this.b;
        E e = (E) objArr[iN];
        int i3 = this.c >> 1;
        int i4 = this.a;
        if (i < i3) {
            if (iN >= i4) {
                pyd.j(objArr, i4 + 1, objArr, i4, iN);
            } else {
                pyd.j(objArr, 1, objArr, 0, iN);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.a;
                pyd.j(objArr2, i5 + 1, objArr2, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.b;
            int i6 = this.a;
            objArr3[i6] = null;
            this.a = i(i6);
        } else {
            int iN2 = n((a() - 1) + i4);
            Object[] objArr4 = this.b;
            if (iN <= iN2) {
                pyd.j(objArr4, iN, objArr4, iN + 1, iN2 + 1);
            } else {
                pyd.j(objArr4, iN, objArr4, iN + 1, objArr4.length);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                pyd.j(objArr5, 0, objArr5, 1, iN2 + 1);
            }
            this.b[iN2] = null;
        }
        this.c--;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            l(this.a, n(a() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void f(int i) {
        if (i < 0) {
            r6.g("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        pyd.j(objArr, 0, objArr2, this.a, objArr.length);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        pyd.j(objArr3, length2 - i3, objArr2, 0, i3);
        this.a = 0;
        this.b = objArr2;
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.b[this.a];
        }
        s6.j("ArrayDeque is empty.");
        return null;
    }

    public final E g() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.b[this.a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int iA = a();
        if (i >= 0 && i < iA) {
            return (E) this.b[n(this.a + i)];
        }
        l5.s(k20.l("index: ", i, iA, ", size: "));
        return null;
    }

    public final int i(int i) {
        this.b.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iN = n(a() + this.a);
        int length = this.a;
        if (length < iN) {
            while (length < iN) {
                if (wl7.b(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iN) {
            return -1;
        }
        int length2 = this.b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iN; i2++) {
                    if (wl7.b(obj, this.b[i2])) {
                        length = i2 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (wl7.b(obj, this.b[length])) {
                i = this.a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final E j() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.b[n((size() - 1) + this.a)];
    }

    public final int k(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final void l(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            pyd.q(null, i, objArr, i2);
        } else {
            pyd.q(null, i, objArr, objArr.length);
            pyd.q(null, 0, this.b, i2);
        }
    }

    public final E last() {
        if (isEmpty()) {
            s6.j("ArrayDeque is empty.");
            return null;
        }
        return (E) this.b[n((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iN = n(this.c + this.a);
        int i2 = this.a;
        if (i2 < iN) {
            length = iN - 1;
            if (i2 <= length) {
                while (!wl7.b(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iN) {
            while (true) {
                iN--;
                Object[] objArr = this.b;
                if (-1 >= iN) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!wl7.b(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                } else if (wl7.b(obj, objArr[iN])) {
                    length = iN + this.b.length;
                    i = this.a;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final int n(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int iN;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iN2 = n(a() + this.a);
            int i = this.a;
            if (i < iN2) {
                iN = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iN2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[iN] = obj;
                        iN++;
                    }
                    i++;
                }
                pyd.q(null, iN, objArr, iN2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[iN] = obj3;
                        iN = i(iN);
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.c = k(iN - this.a);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            s6.j("ArrayDeque is empty.");
            return null;
        }
        o();
        Object[] objArr = this.b;
        int i = this.a;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.a = i(i);
        this.c = a() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            s6.j("ArrayDeque is empty.");
            return null;
        }
        o();
        int iN = n((size() - 1) + this.a);
        Object[] objArr = this.b;
        E e = (E) objArr[iN];
        objArr[iN] = null;
        this.c = a() - 1;
        return e;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        w2.a.b(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        o();
        int i4 = this.c - i2;
        int i5 = this.a;
        if (i < i4) {
            int iN = n((i - 1) + i5);
            int iN2 = n(this.a + (i2 - 1));
            while (i > 0) {
                int i6 = iN + 1;
                int iMin = Math.min(i, Math.min(i6, iN2 + 1));
                Object[] objArr = this.b;
                int i7 = iN2 - iMin;
                int i8 = iN - iMin;
                pyd.j(objArr, i7 + 1, objArr, i8 + 1, i6);
                iN = k(i8);
                iN2 = k(i7);
                i -= iMin;
            }
            int iN3 = n(this.a + i3);
            l(this.a, iN3);
            this.a = iN3;
        } else {
            int iN4 = n(i5 + i2);
            int iN5 = n(this.a + i);
            int i9 = this.c;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i9, Math.min(objArr2.length - iN4, objArr2.length - iN5));
                Object[] objArr3 = this.b;
                int i10 = iN4 + i2;
                pyd.j(objArr3, iN5, objArr3, iN4, i10);
                iN4 = n(i10);
                iN5 = n(iN5 + i2);
            }
            int iN6 = n(this.c + this.a);
            l(k(iN6 - i3), iN6);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        int iN;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iN2 = n(a() + this.a);
            int i = this.a;
            if (i < iN2) {
                iN = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iN2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[iN] = obj;
                        iN++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                pyd.q(null, iN, objArr, iN2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iN] = obj3;
                        iN = i(iN);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.c = k(iN - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int iA = a();
        if (i < 0 || i >= iA) {
            l5.s(k20.l("index: ", i, iA, ", size: "));
            return null;
        }
        int iN = n(this.a + i);
        Object[] objArr = this.b;
        E e2 = (E) objArr[iN];
        objArr[iN] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iN = n(this.c + this.a);
        int i2 = this.a;
        if (i2 < iN) {
            pyd.l(this.b, i2, tArr, iN, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            pyd.j(objArr, 0, tArr, this.a, objArr.length);
            Object[] objArr2 = this.b;
            pyd.j(objArr2, objArr2.length - this.a, tArr, 0, iN);
        }
        int i3 = this.c;
        if (i3 < tArr.length) {
            tArr[i3] = null;
        }
        return tArr;
    }

    public zs0() {
        this.b = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        o();
        f(collection.size() + a());
        d(n(a() + this.a), collection);
        return true;
    }
}
