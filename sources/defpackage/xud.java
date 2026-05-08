package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class xud extends ve4 {
    public static final BigInteger e = wud.h;
    public int[] d;

    public xud() {
        this.d = new int[5];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[5];
        if (ka6.G(this.d, ((xud) ve4Var).d, iArr) != 0 || (iArr[4] == -1 && ka6.p0(iArr, ypd.W))) {
            ka6.R(5, -2147483647, iArr);
        }
        return new xud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[5];
        if (ka6.r0(5, this.d, iArr) != 0 || (iArr[4] == -1 && ka6.p0(iArr, ypd.W))) {
            ka6.R(5, -2147483647, iArr);
        }
        return new xud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[5];
        ka6.w0(ypd.W, ((xud) ve4Var).d, iArr);
        ypd.G(iArr, this.d, iArr);
        return new xud(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xud) {
            return ka6.b0(this.d, ((xud) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[5];
        ka6.w0(ypd.W, this.d, iArr);
        return new xud(iArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return ka6.y0(this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return ka6.C0(this.d);
    }

    public final int hashCode() {
        return st0.c(5, this.d) ^ e.hashCode();
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        int[] iArr = new int[5];
        ypd.G(this.d, ((xud) ve4Var).d, iArr);
        return new xud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[5];
        int[] iArr2 = this.d;
        if (ka6.C0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
        } else {
            ka6.m1(ypd.W, iArr2, iArr);
        }
        return new xud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (ka6.C0(iArr) || ka6.y0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        ypd.T(iArr, iArr2);
        ypd.G(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        ypd.U(2, iArr2, iArr3);
        ypd.G(iArr3, iArr2, iArr3);
        ypd.U(4, iArr3, iArr2);
        ypd.G(iArr2, iArr3, iArr2);
        ypd.U(8, iArr2, iArr3);
        ypd.G(iArr3, iArr2, iArr3);
        ypd.U(16, iArr3, iArr2);
        ypd.G(iArr2, iArr3, iArr2);
        ypd.U(32, iArr2, iArr3);
        ypd.G(iArr3, iArr2, iArr3);
        ypd.U(64, iArr3, iArr2);
        ypd.G(iArr2, iArr3, iArr2);
        ypd.T(iArr2, iArr3);
        ypd.G(iArr3, iArr, iArr3);
        ypd.U(29, iArr3, iArr3);
        ypd.T(iArr3, iArr2);
        if (ka6.b0(iArr, iArr2)) {
            return new xud(iArr3);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[5];
        ypd.T(this.d, iArr);
        return new xud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[5];
        ypd.V(this.d, ((xud) ve4Var).d, iArr);
        return new xud(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return ka6.j0(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return ka6.v1(this.d);
    }

    public xud(int[] iArr) {
        this.d = iArr;
    }
}
