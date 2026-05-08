package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class vvd extends ve4 {
    public static final BigInteger e = uvd.h;
    public int[] d;

    public vvd() {
        this.d = new int[12];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[12];
        if (ka6.F(12, this.d, ((vvd) ve4Var).d, iArr) != 0 || (iArr[11] == -1 && ka6.o0(12, iArr, mh2.c0))) {
            mh2.f(iArr);
        }
        return new vvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[12];
        if (ka6.r0(12, this.d, iArr) != 0 || (iArr[11] == -1 && ka6.o0(12, iArr, mh2.c0))) {
            mh2.f(iArr);
        }
        return new vvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[12];
        ka6.w0(mh2.c0, ((vvd) ve4Var).d, iArr);
        mh2.r(iArr, this.d, iArr);
        return new vvd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vvd) {
            return ka6.a0(12, this.d, ((vvd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[12];
        ka6.w0(mh2.c0, this.d, iArr);
        return new vvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return ka6.x0(12, this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return ka6.B0(12, this.d);
    }

    public final int hashCode() {
        return st0.c(12, this.d) ^ e.hashCode();
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        int[] iArr = new int[12];
        mh2.r(this.d, ((vvd) ve4Var).d, iArr);
        return new vvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[12];
        int[] iArr2 = this.d;
        if (ka6.B0(12, iArr2)) {
            for (int i = 0; i < 12; i++) {
                iArr[i] = 0;
            }
        } else {
            ka6.l1(12, mh2.c0, iArr2, iArr);
        }
        return new vvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (ka6.B0(12, iArr) || ka6.x0(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        mh2.A(iArr, iArr2);
        mh2.r(iArr2, iArr, iArr2);
        mh2.B(2, iArr2, iArr3);
        mh2.r(iArr3, iArr2, iArr3);
        mh2.A(iArr3, iArr3);
        mh2.r(iArr3, iArr, iArr3);
        mh2.B(5, iArr3, iArr4);
        mh2.r(iArr4, iArr3, iArr4);
        mh2.B(5, iArr4, iArr5);
        mh2.r(iArr5, iArr3, iArr5);
        mh2.B(15, iArr5, iArr3);
        mh2.r(iArr3, iArr5, iArr3);
        mh2.B(2, iArr3, iArr4);
        mh2.r(iArr2, iArr4, iArr2);
        mh2.B(28, iArr4, iArr4);
        mh2.r(iArr3, iArr4, iArr3);
        mh2.B(60, iArr3, iArr4);
        mh2.r(iArr4, iArr3, iArr4);
        mh2.B(120, iArr4, iArr3);
        mh2.r(iArr3, iArr4, iArr3);
        mh2.B(15, iArr3, iArr3);
        mh2.r(iArr3, iArr5, iArr3);
        mh2.B(33, iArr3, iArr3);
        mh2.r(iArr3, iArr2, iArr3);
        mh2.B(64, iArr3, iArr3);
        mh2.r(iArr3, iArr, iArr3);
        mh2.B(30, iArr3, iArr2);
        mh2.A(iArr2, iArr3);
        if (ka6.a0(12, iArr, iArr3)) {
            return new vvd(iArr2);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[12];
        mh2.A(this.d, iArr);
        return new vvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[12];
        mh2.C(this.d, ((vvd) ve4Var).d, iArr);
        return new vvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return ka6.l0(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return ka6.u1(12, this.d);
    }

    public vvd(int[] iArr) {
        this.d = iArr;
    }
}
