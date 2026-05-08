package defpackage;

import defpackage.oz8;
import defpackage.ur1;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import oz8.a;

/* JADX INFO: loaded from: classes3.dex */
public final class rfd extends ur1 {
    public static final int[] W;
    public int V = 0;
    public final int b;
    public final ur1 c;
    public final ur1 d;
    public final int e;
    public final int f;

    public static class a {
        public final Stack<ur1> a = new Stack<>();

        public final void a(ur1 ur1Var) {
            if (!ur1Var.f()) {
                if (!(ur1Var instanceof rfd)) {
                    String strValueOf = String.valueOf(ur1Var.getClass());
                    l5.q(l6.i(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                    return;
                } else {
                    rfd rfdVar = (rfd) ur1Var;
                    a(rfdVar.c);
                    a(rfdVar.d);
                    return;
                }
            }
            int size = ur1Var.size();
            int[] iArr = rfd.W;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i = iArr[iBinarySearch + 1];
            Stack<ur1> stack = this.a;
            if (stack.isEmpty() || stack.peek().size() >= i) {
                stack.push(ur1Var);
                return;
            }
            int i2 = iArr[iBinarySearch];
            ur1 ur1VarPop = stack.pop();
            while (!stack.isEmpty() && stack.peek().size() < i2) {
                ur1VarPop = new rfd(stack.pop(), ur1VarPop);
            }
            rfd rfdVar2 = new rfd(ur1VarPop, ur1Var);
            while (!stack.isEmpty()) {
                int[] iArr2 = rfd.W;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, rfdVar2.b);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (stack.peek().size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    rfdVar2 = new rfd(stack.pop(), rfdVar2);
                }
            }
            stack.push(rfdVar2);
        }
    }

    public static class b implements Iterator<oz8> {
        public final Stack<rfd> a = new Stack<>();
        public oz8 b;

        public b(ur1 ur1Var) {
            while (ur1Var instanceof rfd) {
                rfd rfdVar = (rfd) ur1Var;
                this.a.push(rfdVar);
                ur1Var = rfdVar.c;
            }
            this.b = (oz8) ur1Var;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final oz8 next() {
            oz8 oz8Var = this.b;
            oz8 oz8Var2 = null;
            if (oz8Var == null) {
                k20.p();
                return null;
            }
            while (true) {
                Stack<rfd> stack = this.a;
                if (!stack.isEmpty()) {
                    ur1 ur1Var = stack.pop().d;
                    while (ur1Var instanceof rfd) {
                        rfd rfdVar = (rfd) ur1Var;
                        stack.push(rfdVar);
                        ur1Var = rfdVar.c;
                    }
                    oz8 oz8Var3 = (oz8) ur1Var;
                    if (oz8Var3.b.length != 0) {
                        oz8Var2 = oz8Var3;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.b = oz8Var2;
            return oz8Var;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class c implements ur1.a {
        public final b a;
        public oz8.a b;
        public int c;

        public c(rfd rfdVar) {
            b bVar = new b(rfdVar);
            this.a = bVar;
            this.b = bVar.next().new a();
            this.c = rfdVar.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            if (!this.b.hasNext()) {
                this.b = this.a.next().new a();
            }
            this.c--;
            return Byte.valueOf(this.b.a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        W = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = W;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public rfd(ur1 ur1Var, ur1 ur1Var2) {
        this.c = ur1Var;
        this.d = ur1Var2;
        int size = ur1Var.size();
        this.e = size;
        this.b = ur1Var2.size() + size;
        this.f = Math.max(ur1Var.e(), ur1Var2.e()) + 1;
    }

    @Override // defpackage.ur1
    public final void d(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        ur1 ur1Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            ur1Var.d(i, i2, i3, bArr);
            return;
        }
        ur1 ur1Var2 = this.d;
        if (i >= i5) {
            ur1Var2.d(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        ur1Var.d(i, i2, i6, bArr);
        ur1Var2.d(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // defpackage.ur1
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        int iM;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ur1) {
            ur1 ur1Var = (ur1) obj;
            int size = ur1Var.size();
            int i = this.b;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.V == 0 || (iM = ur1Var.m()) == 0 || this.V == iM) {
                    b bVar = new b(this);
                    oz8 next = bVar.next();
                    b bVar2 = new b(ur1Var);
                    oz8 next2 = bVar2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = next.b.length - i2;
                        int length2 = next2.b.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? next.r(next2, i3, iMin) : next2.r(next, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            bg.h();
                            return false;
                        }
                        if (iMin == length) {
                            next = bVar.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            next2 = bVar2.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ur1
    public final boolean f() {
        return this.b >= W[this.f];
    }

    @Override // defpackage.ur1
    public final boolean g() {
        int iL = this.c.l(0, 0, this.e);
        ur1 ur1Var = this.d;
        return ur1Var.l(iL, 0, ur1Var.size()) == 0;
    }

    public final int hashCode() {
        int iK = this.V;
        if (iK == 0) {
            int i = this.b;
            iK = k(i, 0, i);
            if (iK == 0) {
                iK = 1;
            }
            this.V = iK;
        }
        return iK;
    }

    @Override // defpackage.ur1
    /* JADX INFO: renamed from: i */
    public final ur1.a iterator() {
        return new c(this);
    }

    @Override // defpackage.ur1, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new c(this);
    }

    @Override // defpackage.ur1
    public final int k(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ur1 ur1Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return ur1Var.k(i, i2, i3);
        }
        ur1 ur1Var2 = this.d;
        if (i2 >= i5) {
            return ur1Var2.k(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return ur1Var2.k(ur1Var.k(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.ur1
    public final int l(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ur1 ur1Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return ur1Var.l(i, i2, i3);
        }
        ur1 ur1Var2 = this.d;
        if (i2 >= i5) {
            return ur1Var2.l(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return ur1Var2.l(ur1Var.l(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.ur1
    public final int m() {
        return this.V;
    }

    @Override // defpackage.ur1
    public final String n() {
        byte[] bArr;
        int i = this.b;
        if (i == 0) {
            bArr = pi7.a;
        } else {
            byte[] bArr2 = new byte[i];
            d(0, 0, i, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // defpackage.ur1
    public final void q(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        ur1 ur1Var = this.c;
        int i4 = this.e;
        if (i3 <= i4) {
            ur1Var.q(outputStream, i, i2);
            return;
        }
        ur1 ur1Var2 = this.d;
        if (i >= i4) {
            ur1Var2.q(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        ur1Var.q(outputStream, i, i5);
        ur1Var2.q(outputStream, 0, i2 - i5);
    }

    @Override // defpackage.ur1
    public final int size() {
        return this.b;
    }
}
