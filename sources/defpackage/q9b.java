package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q9b<E> extends l3<E> implements Collection, bf8 {
    public Object[] V;
    public int W;
    public r3 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public bf9 e = new bf9();
    public Object[] f;

    public q9b(r3 r3Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = r3Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.V = objArr2;
        this.W = r3Var.size();
    }

    public static void f(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(int i, Object[] objArr, Object[] objArr2) {
        int iD = zte.d(a() - 1, i);
        Object[] objArrO = o(objArr);
        if (i == 5) {
            objArrO[iD] = objArr2;
            return objArrO;
        }
        objArrO[iD] = A(i - 5, (Object[]) objArrO[iD], objArr2);
        return objArrO;
    }

    public final int B(Function1 function1, Object[] objArr, int i, int i2, qq2 qq2Var, ArrayList arrayList, ArrayList arrayList2) {
        if (l(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = qq2Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        qq2Var.a = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int C(Function1<? super E, Boolean> function1, Object[] objArr, int i, qq2 qq2Var) {
        Object[] objArrO = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrO = o(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrO[i2] = obj;
                i2++;
            }
        }
        qq2Var.a = objArrO;
        return i2;
    }

    public final int D(Function1<? super E, Boolean> function1, int i, qq2 qq2Var) {
        int iC = C(function1, this.V, i, qq2Var);
        Object obj = qq2Var.a;
        if (iC == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iC, i, (Object) null);
        this.V = objArr;
        this.W -= i - iC;
        return iC;
    }

    public final boolean E(Function1<? super E, Boolean> function1) {
        int i;
        Function1<? super E, Boolean> function12 = function1;
        int iL = L();
        Object[] objArrT = null;
        qq2 qq2Var = new qq2((Object) null);
        boolean z = false;
        if (this.f != null) {
            x2 x2VarN = n(0);
            int iC = 32;
            while (iC == 32 && x2VarN.hasNext()) {
                iC = C(function12, (Object[]) x2VarN.next(), 32, qq2Var);
            }
            if (iC == 32) {
                int iD = D(function12, iL, qq2Var);
                if (iD == 0) {
                    w(this.f, this.W, this.d);
                }
                if (iD != iL) {
                }
            } else {
                int i2 = (x2VarN.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iB = iC;
                while (x2VarN.hasNext()) {
                    iB = B(function12, (Object[]) x2VarN.next(), 32, iB, qq2Var, arrayList2, arrayList);
                    function12 = function1;
                }
                int iB2 = B(function1, this.V, iL, iB, qq2Var, arrayList2, arrayList);
                Object obj = qq2Var.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iB2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrX = this.f;
                if (zIsEmpty) {
                    objArrX.getClass();
                } else {
                    objArrX = x(objArrX, i2, this.d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    gib.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        Object[] objArr2 = objArrX[0];
                        objArr2.getClass();
                        objArrX = objArr2;
                    }
                    objArrT = t(objArrX, i3, i);
                }
                this.f = objArrT;
                this.V = objArr;
                this.W = size + iB2;
            }
            z = true;
        } else if (D(function12, iL, qq2Var) != iL) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] F(Object[] objArr, int i, int i2, qq2 qq2Var) {
        int iD = zte.d(i2, i);
        if (i == 0) {
            Object obj = objArr[iD];
            Object[] objArrO = o(objArr);
            pyd.j(objArr, iD, objArrO, iD + 1, 32);
            objArrO[31] = qq2Var.a;
            qq2Var.a = obj;
            return objArrO;
        }
        int iD2 = objArr[31] == null ? zte.d(I() - 1, i) : 31;
        Object[] objArrO2 = o(objArr);
        int i3 = i - 5;
        int i4 = iD + 1;
        if (i4 <= iD2) {
            while (true) {
                Object obj2 = objArrO2[iD2];
                obj2.getClass();
                objArrO2[iD2] = F((Object[]) obj2, i3, 0, qq2Var);
                if (iD2 == i4) {
                    break;
                }
                iD2--;
            }
        }
        Object obj3 = objArrO2[iD];
        obj3.getClass();
        objArrO2[iD] = F((Object[]) obj3, i3, i2, qq2Var);
        return objArrO2;
    }

    public final Object H(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.W - i;
        Object[] objArr2 = this.V;
        if (i4 == 1) {
            Object obj = objArr2[0];
            w(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrO = o(objArr2);
        pyd.j(objArr2, i3, objArrO, i3 + 1, i4);
        objArrO[i4 - 1] = null;
        this.f = objArr;
        this.V = objArrO;
        this.W = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int I() {
        int i = this.W;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] J(Object[] objArr, int i, int i2, E e, qq2 qq2Var) {
        int iD = zte.d(i2, i);
        Object[] objArrO = o(objArr);
        if (i != 0) {
            Object obj = objArrO[iD];
            obj.getClass();
            objArrO[iD] = J((Object[]) obj, i - 5, i2, e, qq2Var);
            return objArrO;
        }
        if (objArrO != objArr) {
            ((AbstractList) this).modCount++;
        }
        qq2Var.a = objArrO[iD];
        objArrO[iD] = e;
        return objArrO;
    }

    public final void K(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 < 1) {
            gib.a("requires at least one nullBuffer");
        }
        Object[] objArrO = o(objArr);
        objArr2[0] = objArrO;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            pyd.j(objArrO, size + 1, objArr3, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrO;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i7 = i2 - i6;
            pyd.j(objArrO, 0, objArr3, i7, i2);
            pyd.j(objArrO, size + 1, objArrR, i4, i7);
            objArr3 = objArrR;
        }
        Iterator<? extends E> it = collection.iterator();
        f(objArrO, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrR2 = r();
            f(objArrR2, 0, it);
            objArr2[i8] = objArrR2;
        }
        f(objArr3, 0, it);
    }

    public final int L() {
        int i = this.W;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.l3
    public final int a() {
        return this.W;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        c0h.n(i, a());
        if (i == a()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        if (i >= I) {
            k(e, this.f, i - I);
            return;
        }
        qq2 qq2Var = new qq2((Object) null);
        Object[] objArr = this.f;
        objArr.getClass();
        k(qq2Var.a, j(objArr, this.d, i, e, qq2Var), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        Object[] objArrR;
        c0h.n(i, this.W);
        if (i == this.W) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.W - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.V;
            Object[] objArrO = o(objArr);
            pyd.j(objArr, size2 + 1, objArrO, i3, L());
            f(objArrO, i3, collection.iterator());
            this.V = objArrO;
            this.W = collection.size() + this.W;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iL = L();
        int size3 = collection.size() + this.W;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= I()) {
            objArrR = r();
            collection2 = collection;
            K(collection2, i, this.V, iL, objArr2, size, objArrR);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.V;
            if (size3 > iL) {
                int i4 = size3 - iL;
                Object[] objArrQ = q(i4, objArr3);
                i(collection2, i, i4, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrR = objArrQ;
            } else {
                objArrR = r();
                int i5 = iL - size3;
                pyd.j(objArr3, 0, objArrR, i5, iL);
                int i6 = 32 - i5;
                Object[] objArrQ2 = q(i6, this.V);
                int i7 = size - 1;
                objArr2[i7] = objArrQ2;
                i(collection2, i, i6, objArr2, i7, objArrQ2);
                collection2 = collection2;
            }
        }
        this.f = y(this.f, i2, objArr2);
        this.V = objArrR;
        this.W = collection2.size() + this.W;
        return true;
    }

    @Override // defpackage.l3
    public final E b(int i) {
        c0h.m(i, a());
        ((AbstractList) this).modCount++;
        int I = I();
        if (i >= I) {
            return (E) H(this.f, I, this.d, i - I);
        }
        qq2 qq2Var = new qq2(this.V[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        H(F(objArr, this.d, i, qq2Var), I, this.d, 0);
        return (E) qq2Var.a;
    }

    public final r3 d() {
        r3 ikeVar;
        Object[] objArr = this.f;
        if (objArr == this.b && this.V == this.c) {
            ikeVar = this.a;
        } else {
            this.e = new bf9();
            this.b = objArr;
            Object[] objArr2 = this.V;
            this.c = objArr2;
            ikeVar = objArr == null ? objArr2.length == 0 ? ike.b : new ike(Arrays.copyOf(objArr2, this.W)) : new p9b(objArr, objArr2, this.W, this.d);
        }
        this.a = ikeVar;
        return ikeVar;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        c0h.m(i, a());
        if (I() <= i) {
            objArr = this.V;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[zte.d(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    public final void i(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            r6.g("root is null");
            return;
        }
        int i4 = i >> 5;
        x2 x2VarN = n(I() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (x2VarN.a - 1 != i4) {
            Object[] objArr3 = (Object[]) x2VarN.previous();
            pyd.j(objArr3, 0, objArrQ, 32 - i2, 32);
            objArrQ = q(i2, objArr3);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) x2VarN.previous();
        int I = i3 - (((I() >> 5) - 1) - i4);
        if (I < i3) {
            objArr2 = objArr[I];
            objArr2.getClass();
        }
        K(collection, i, objArr4, 32, objArr, I, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i, int i2, Object obj, qq2 qq2Var) {
        Object obj2;
        int iD = zte.d(i2, i);
        if (i == 0) {
            qq2Var.a = objArr[31];
            Object[] objArrO = o(objArr);
            pyd.j(objArr, iD + 1, objArrO, iD, 31);
            objArrO[iD] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i3 = i - 5;
        Object obj3 = objArrO2[iD];
        obj3.getClass();
        objArrO2[iD] = j((Object[]) obj3, i3, i2, obj, qq2Var);
        while (true) {
            iD++;
            if (iD >= 32 || (obj2 = objArrO2[iD]) == null) {
                break;
            }
            objArrO2[iD] = j((Object[]) obj2, i3, 0, qq2Var.a, qq2Var);
        }
        return objArrO2;
    }

    public final void k(Object obj, Object[] objArr, int i) {
        int iL = L();
        Object[] objArrO = o(this.V);
        Object[] objArr2 = this.V;
        if (iL >= 32) {
            Object obj2 = objArr2[31];
            pyd.j(objArr2, i + 1, objArrO, i, 31);
            objArrO[i] = obj;
            z(objArr, objArrO, s(obj2));
            return;
        }
        pyd.j(objArr2, i + 1, objArrO, i, iL);
        objArrO[i] = obj;
        this.f = objArr;
        this.V = objArrO;
        this.W++;
    }

    public final boolean l(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        c0h.n(i, this.W);
        return new s9b(this, i);
    }

    public final x2 n(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            r6.g("Invalid root");
            return null;
        }
        int I = I() >> 5;
        c0h.n(i, I);
        int i2 = this.d;
        return i2 == 0 ? new tge(objArr, i) : new rtf(objArr, i, I, i2 / 5);
    }

    public final Object[] o(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (l(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        pyd.l(objArr, 0, objArrR, length, 6);
        return objArrR;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (l(objArr)) {
            pyd.j(objArr, i, objArr, 0, 32 - i);
            return objArr;
        }
        Object[] objArrR = r();
        pyd.j(objArr, i, objArrR, 0, 32 - i);
        return objArrR;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        return E(new cu(collection, 11));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        c0h.m(i, a());
        if (I() > i) {
            qq2 qq2Var = new qq2((Object) null);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = J(objArr, this.d, i, e, qq2Var);
            return (E) qq2Var.a;
        }
        Object[] objArrO = o(this.V);
        if (objArrO != this.V) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrO[i2];
        objArrO[i2] = e;
        this.V = objArrO;
        return e2;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            gib.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iD = zte.d(i, i2);
        Object obj = objArr[iD];
        obj.getClass();
        Object objT = t((Object[]) obj, i, i2 - 5);
        if (iD < 31) {
            int i3 = iD + 1;
            if (objArr[i3] != null) {
                if (l(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrR = r();
                pyd.j(objArr, 0, objArrR, 0, i3);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iD]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[iD] = objT;
        return objArrO;
    }

    public final Object[] u(Object[] objArr, int i, int i2, qq2 qq2Var) {
        Object[] objArrU;
        int iD = zte.d(i2 - 1, i);
        if (i == 5) {
            qq2Var.a = objArr[iD];
            objArrU = null;
        } else {
            Object obj = objArr[iD];
            obj.getClass();
            objArrU = u((Object[]) obj, i - 5, i2, qq2Var);
        }
        if (objArrU == null && iD == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[iD] = objArrU;
        return objArrO;
    }

    public final void w(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.V = objArr;
            this.W = i;
            this.d = i2;
            return;
        }
        qq2 qq2Var = new qq2((Object) null);
        objArr.getClass();
        Object[] objArrU = u(objArr, i2, i, qq2Var);
        objArrU.getClass();
        Object obj = qq2Var.a;
        obj.getClass();
        this.V = (Object[]) obj;
        this.W = i;
        if (objArrU[1] == null) {
            this.f = (Object[]) objArrU[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrU;
            this.d = i2;
        }
    }

    public final Object[] x(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            gib.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            gib.a("negative shift");
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrO = o(objArr);
        int iD = zte.d(i, i2);
        int i3 = i2 - 5;
        objArrO[iD] = x((Object[]) objArrO[iD], i, i3, it);
        while (true) {
            iD++;
            if (iD >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[iD] = x((Object[]) objArrO[iD], 0, i3, it);
        }
        return objArrO;
    }

    public final Object[] y(Object[] objArr, int i, Object[][] objArr2) {
        ct0 ct0Var = new ct0(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrX = i2 < (1 << i3) ? x(objArr, i, i3, ct0Var) : o(objArr);
        while (ct0Var.hasNext()) {
            this.d += 5;
            objArrX = s(objArrX);
            int i4 = this.d;
            x(objArrX, 1 << i4, i4, ct0Var);
        }
        return objArrX;
    }

    public final void z(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.W;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = A(this.d + 5, s(objArr), objArr2);
            this.V = objArr3;
            this.d += 5;
            this.W++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.V = objArr3;
            this.W = i + 1;
        } else {
            this.f = A(i3, objArr, objArr2);
            this.V = objArr3;
            this.W++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iL = L();
        if (iL < 32) {
            Object[] objArrO = o(this.V);
            objArrO[iL] = e;
            this.V = objArrO;
            this.W = a() + 1;
        } else {
            z(this.f, this.V, s(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iL >= collection.size()) {
            Object[] objArrO = o(this.V);
            f(objArrO, iL, it);
            this.V = objArrO;
            this.W = collection.size() + this.W;
            return true;
        }
        int size = ((collection.size() + iL) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrO2 = o(this.V);
        f(objArrO2, iL, it);
        objArr[0] = objArrO2;
        for (int i = 1; i < size; i++) {
            Object[] objArrR = r();
            f(objArrR, 0, it);
            objArr[i] = objArrR;
        }
        this.f = y(this.f, I(), objArr);
        Object[] objArrR2 = r();
        f(objArrR2, 0, it);
        this.V = objArrR2;
        this.W = collection.size() + this.W;
        return true;
    }
}
