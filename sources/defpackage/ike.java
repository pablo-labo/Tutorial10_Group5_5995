package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ike<E> extends r3<E> implements c47<E> {
    public static final ike b = new ike(new Object[0]);
    public final Object[] a;

    public ike(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.l1
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.r3
    public final r3 b(int i, E e) {
        Object[] objArr = this.a;
        c0h.n(i, objArr.length);
        if (i == objArr.length) {
            return d(e);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            pyd.l(objArr, 0, objArr2, i, 6);
            pyd.j(objArr, i + 1, objArr2, i, objArr.length);
            objArr2[i] = e;
            return new ike(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        pyd.j(objArr, i + 1, objArrCopyOf, i, objArr.length - 1);
        objArrCopyOf[i] = e;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new p9b(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.r3
    public final r3 d(E e) {
        Object[] objArr = this.a;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = e;
            return new ike(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new p9b(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.r3
    public final r3 f(Collection<? extends E> collection) {
        Object[] objArr = this.a;
        if (collection.size() + objArr.length > 32) {
            q9b q9bVarG = g();
            q9bVarG.addAll(collection);
            return q9bVarG.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new ike(objArrCopyOf);
    }

    @Override // defpackage.r3
    public final q9b g() {
        return new q9b(this, null, this.a, 0);
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr = this.a;
        c0h.m(i, objArr.length);
        return (E) objArr[i];
    }

    @Override // defpackage.r3
    public final r3 i(q3 q3Var) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) q3Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? b : new ike(pyd.n(objArrCopyOf, 0, length));
    }

    @Override // defpackage.w2, java.util.List
    public final int indexOf(Object obj) {
        return ut0.p0(obj, this.a);
    }

    @Override // defpackage.r3
    public final r3 j(int i) {
        Object[] objArr = this.a;
        c0h.m(i, objArr.length);
        if (objArr.length == 1) {
            return b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        pyd.j(objArr, i, objArrCopyOf, i + 1, objArr.length);
        return new ike(objArrCopyOf);
    }

    @Override // defpackage.r3
    public final r3 k(int i, E e) {
        Object[] objArr = this.a;
        c0h.m(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = e;
        return new ike(objArrCopyOf);
    }

    @Override // defpackage.w2, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.a;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.w2, java.util.List
    public final ListIterator<E> listIterator(int i) {
        Object[] objArr = this.a;
        c0h.n(i, objArr.length);
        return new bo1(objArr, i, objArr.length);
    }
}
