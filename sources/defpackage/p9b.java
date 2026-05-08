package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p9b<E> extends r3<E> {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public p9b(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (!(a() > 32)) {
            gib.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] l(Object[] objArr, int i, int i2, Object obj, qq2 qq2Var) {
        int iD = zte.d(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iD == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            pyd.j(objArr, iD + 1, objArrCopyOf, iD, 31);
            qq2Var.a = objArr[31];
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iD];
        obj2.getClass();
        objArrCopyOf2[iD] = l((Object[]) obj2, i3, i2, obj, qq2Var);
        while (true) {
            iD++;
            if (iD >= 32 || objArrCopyOf2[iD] == null) {
                break;
            }
            Object obj3 = objArr[iD];
            obj3.getClass();
            objArrCopyOf2[iD] = l((Object[]) obj3, i3, 0, qq2Var.a, qq2Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] o(Object[] objArr, int i, int i2, qq2 qq2Var) {
        Object[] objArrO;
        int iD = zte.d(i2, i);
        if (i == 5) {
            qq2Var.a = objArr[iD];
            objArrO = null;
        } else {
            Object obj = objArr[iD];
            obj.getClass();
            objArrO = o((Object[]) obj, i - 5, i2, qq2Var);
        }
        if (objArrO == null && iD == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iD] = objArrO;
        return objArrCopyOf;
    }

    public static Object[] w(Object obj, int i, Object[] objArr, int i2) {
        int iD = zte.d(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iD];
        obj2.getClass();
        objArrCopyOf[iD] = w(obj, i - 5, (Object[]) obj2, i2);
        return objArrCopyOf;
    }

    @Override // defpackage.l1
    public final int a() {
        return this.c;
    }

    @Override // defpackage.r3
    public final r3 b(int i, E e) {
        int i2 = this.c;
        c0h.n(i, i2);
        if (i == i2) {
            return d(e);
        }
        int iU = u();
        Object[] objArr = this.a;
        if (i >= iU) {
            return n(e, objArr, i - iU);
        }
        qq2 qq2Var = new qq2((Object) null);
        return n(qq2Var.a, l(objArr, this.d, i, e, qq2Var), 0);
    }

    @Override // defpackage.r3
    public final r3 d(E e) {
        int iU = u();
        int i = this.c;
        int i2 = i - iU;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = e;
            return new p9b(objArr, objArrCopyOf, i + 1, this.d);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e;
        return q(objArr, objArr2, objArr3);
    }

    @Override // defpackage.r3
    public final q9b g() {
        return new q9b(this, this.a, this.b, this.d);
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr;
        c0h.m(i, a());
        if (u() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[zte.d(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // defpackage.r3
    public final r3 i(q3 q3Var) {
        q9b q9bVar = new q9b(this, this.a, this.b, this.d);
        q9bVar.E(q3Var);
        return q9bVar.d();
    }

    @Override // defpackage.r3
    public final r3 j(int i) {
        c0h.m(i, this.c);
        int iU = u();
        int i2 = this.d;
        Object[] objArr = this.a;
        return i >= iU ? t(objArr, iU, i2, i - iU) : t(s(objArr, i2, i, new qq2(this.b[0])), iU, i2, 0);
    }

    @Override // defpackage.r3
    public final r3 k(int i, E e) {
        int i2 = this.c;
        c0h.m(i, i2);
        int iU = u();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i3 = this.d;
        if (iU > i) {
            return new p9b(w(e, i3, objArr, i), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = e;
        return new p9b(objArr, objArrCopyOf, i2, i3);
    }

    @Override // defpackage.w2, java.util.List
    public final ListIterator<E> listIterator(int i) {
        c0h.n(i, this.c);
        return new r9b(this.a, i, this.b, this.c, (this.d / 5) + 1);
    }

    public final p9b n(Object obj, Object[] objArr, int i) {
        int iU = u();
        int i2 = this.c;
        int i3 = i2 - iU;
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            pyd.j(objArr2, i + 1, objArrCopyOf, i, i3);
            objArrCopyOf[i] = obj;
            return new p9b(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        pyd.j(objArr2, i + 1, objArrCopyOf, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return q(objArr, objArrCopyOf, objArr3);
    }

    public final p9b<E> q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 <= (1 << i3)) {
            return new p9b<>(r(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new p9b<>(r(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] r(int i, Object[] objArr, Object[] objArr2) {
        int iD = zte.d(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iD] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iD] = r(i - 5, (Object[]) objArrCopyOf[iD], objArr2);
        return objArrCopyOf;
    }

    public final Object[] s(Object[] objArr, int i, int i2, qq2 qq2Var) {
        int iD = zte.d(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iD == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            pyd.j(objArr, iD, objArrCopyOf, iD + 1, 32);
            objArrCopyOf[31] = qq2Var.a;
            qq2Var.a = objArr[iD];
            return objArrCopyOf;
        }
        int iD2 = objArr[31] == null ? zte.d(u() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iD + 1;
        if (i4 <= iD2) {
            while (true) {
                Object obj = objArrCopyOf2[iD2];
                obj.getClass();
                objArrCopyOf2[iD2] = s((Object[]) obj, i3, 0, qq2Var);
                if (iD2 == i4) {
                    break;
                }
                iD2--;
            }
        }
        Object obj2 = objArrCopyOf2[iD];
        obj2.getClass();
        objArrCopyOf2[iD] = s((Object[]) obj2, i3, i2, qq2Var);
        return objArrCopyOf2;
    }

    public final r3 t(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                pyd.j(objArr2, i3, objArrCopyOf, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new p9b(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new ike(objArr);
        }
        qq2 qq2Var = new qq2((Object) null);
        Object[] objArrO = o(objArr, i2, i - 1, qq2Var);
        objArrO.getClass();
        Object obj = qq2Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrO[1] != null) {
            return new p9b(objArrO, objArr3, i, i2);
        }
        Object obj2 = objArrO[0];
        obj2.getClass();
        return new p9b((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int u() {
        return (this.c - 1) & (-32);
    }
}
