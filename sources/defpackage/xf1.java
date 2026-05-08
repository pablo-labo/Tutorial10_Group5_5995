package defpackage;

import defpackage.w2;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xf1 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List<Integer> e;

    public xf1(int... iArr) {
        List<Integer> listZ1;
        this.a = iArr;
        Integer numN0 = ut0.n0(0, iArr);
        this.b = numN0 != null ? numN0.intValue() : -1;
        Integer numN02 = ut0.n0(1, iArr);
        this.c = numN02 != null ? numN02.intValue() : -1;
        Integer numN03 = ut0.n0(2, iArr);
        this.d = numN03 != null ? numN03.intValue() : -1;
        if (iArr.length <= 3) {
            listZ1 = zr4.a;
        } else {
            if (iArr.length > 1024) {
                l5.q(k6.h(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, JwtParser.SEPARATOR_CHAR));
                throw null;
            }
            listZ1 = z92.z1(new w2.d(new tt0(iArr), 3, iArr.length));
        }
        this.e = listZ1;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        xf1 xf1Var = (xf1) obj;
        return this.b == xf1Var.b && this.c == xf1Var.c && this.d == xf1Var.d && wl7.b(this.e, xf1Var.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : z92.W0(arrayList, ".", null, null, null, 62);
    }
}
