package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class pvd extends ve4 {
    public static final BigInteger e = ovd.h;
    public int[] d;

    public pvd() {
        this.d = new int[8];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[8];
        if (ka6.H(this.d, ((pvd) ve4Var).d, iArr) != 0 || (iArr[7] == -1 && ka6.q0(iArr, ak2.X))) {
            ka6.I(8, 977, iArr);
        }
        return new pvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[8];
        if (ka6.r0(8, this.d, iArr) != 0 || (iArr[7] == -1 && ka6.q0(iArr, ak2.X))) {
            ka6.I(8, 977, iArr);
        }
        return new pvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[8];
        ka6.w0(ak2.X, ((pvd) ve4Var).d, iArr);
        ak2.v(iArr, this.d, iArr);
        return new pvd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pvd) {
            return ka6.c0(this.d, ((pvd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[8];
        ka6.w0(ak2.X, this.d, iArr);
        return new pvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return ka6.z0(this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return ka6.D0(this.d);
    }

    public final int hashCode() {
        return st0.c(8, this.d) ^ e.hashCode();
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        int[] iArr = new int[8];
        ak2.v(this.d, ((pvd) ve4Var).d, iArr);
        return new pvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[8];
        int[] iArr2 = this.d;
        if (ka6.D0(iArr2)) {
            ka6.z1(iArr);
        } else {
            ka6.o1(ak2.X, iArr2, iArr);
        }
        return new pvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (ka6.D0(iArr) || ka6.z0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        ak2.G(iArr, iArr2);
        ak2.v(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        ak2.G(iArr2, iArr3);
        ak2.v(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        ak2.H(3, iArr3, iArr4);
        ak2.v(iArr4, iArr3, iArr4);
        ak2.H(3, iArr4, iArr4);
        ak2.v(iArr4, iArr3, iArr4);
        ak2.H(2, iArr4, iArr4);
        ak2.v(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        ak2.H(11, iArr4, iArr5);
        ak2.v(iArr5, iArr4, iArr5);
        ak2.H(22, iArr5, iArr4);
        ak2.v(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        ak2.H(44, iArr4, iArr6);
        ak2.v(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        ak2.H(88, iArr6, iArr7);
        ak2.v(iArr7, iArr6, iArr7);
        ak2.H(44, iArr7, iArr6);
        ak2.v(iArr6, iArr4, iArr6);
        ak2.H(3, iArr6, iArr4);
        ak2.v(iArr4, iArr3, iArr4);
        ak2.H(23, iArr4, iArr4);
        ak2.v(iArr4, iArr5, iArr4);
        ak2.H(6, iArr4, iArr4);
        ak2.v(iArr4, iArr2, iArr4);
        ak2.H(2, iArr4, iArr4);
        ak2.G(iArr4, iArr2);
        if (ka6.c0(iArr, iArr2)) {
            return new pvd(iArr4);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[8];
        ak2.G(this.d, iArr);
        return new pvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[8];
        ak2.K(this.d, ((pvd) ve4Var).d, iArr);
        return new pvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return ka6.k0(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return ka6.w1(this.d);
    }

    public pvd(int[] iArr) {
        this.d = iArr;
    }
}
