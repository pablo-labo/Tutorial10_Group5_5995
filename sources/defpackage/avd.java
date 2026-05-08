package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class avd extends ve4 {
    public static final BigInteger e = zud.h;
    public final int[] d;

    public avd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(e) >= 0) {
            l5.q("x value invalid for SecP160R2FieldElement");
            throw null;
        }
        int[] iArrF0 = ka6.f0(bigInteger);
        if (iArrF0[4] == -1) {
            int[] iArr = pyd.Z;
            if (ka6.p0(iArrF0, iArr)) {
                ka6.s1(iArr, iArrF0);
            }
        }
        this.d = iArrF0;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[5];
        if (ka6.G(this.d, ((avd) ve4Var).d, iArr) != 0 || (iArr[4] == -1 && ka6.p0(iArr, pyd.Z))) {
            ka6.I(5, 21389, iArr);
        }
        return new avd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[5];
        if (ka6.r0(5, this.d, iArr) != 0 || (iArr[4] == -1 && ka6.p0(iArr, pyd.Z))) {
            ka6.I(5, 21389, iArr);
        }
        return new avd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[5];
        ka6.w0(pyd.Z, ((avd) ve4Var).d, iArr);
        pyd.H(iArr, this.d, iArr);
        return new avd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avd) {
            return ka6.b0(this.d, ((avd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[5];
        ka6.w0(pyd.Z, this.d, iArr);
        return new avd(iArr);
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
        pyd.H(this.d, ((avd) ve4Var).d, iArr);
        return new avd(iArr);
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
            ka6.m1(pyd.Z, iArr2, iArr);
        }
        return new avd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (ka6.C0(iArr) || ka6.y0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        pyd.S(iArr, iArr2);
        pyd.H(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        pyd.S(iArr2, iArr3);
        pyd.H(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        pyd.S(iArr3, iArr4);
        pyd.H(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        pyd.U(3, iArr4, iArr5);
        pyd.H(iArr5, iArr3, iArr5);
        pyd.U(7, iArr5, iArr4);
        pyd.H(iArr4, iArr5, iArr4);
        pyd.U(3, iArr4, iArr5);
        pyd.H(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        pyd.U(14, iArr5, iArr6);
        pyd.H(iArr6, iArr4, iArr6);
        pyd.U(31, iArr6, iArr4);
        pyd.H(iArr4, iArr6, iArr4);
        pyd.U(62, iArr4, iArr6);
        pyd.H(iArr6, iArr4, iArr6);
        pyd.U(3, iArr6, iArr4);
        pyd.H(iArr4, iArr3, iArr4);
        pyd.U(18, iArr4, iArr4);
        pyd.H(iArr4, iArr5, iArr4);
        pyd.U(2, iArr4, iArr4);
        pyd.H(iArr4, iArr, iArr4);
        pyd.U(3, iArr4, iArr4);
        pyd.H(iArr4, iArr2, iArr4);
        pyd.U(6, iArr4, iArr4);
        pyd.H(iArr4, iArr3, iArr4);
        pyd.U(2, iArr4, iArr4);
        pyd.H(iArr4, iArr, iArr4);
        pyd.S(iArr4, iArr2);
        if (ka6.b0(iArr, iArr2)) {
            return new avd(iArr4);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[5];
        pyd.S(this.d, iArr);
        return new avd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[5];
        pyd.Y(this.d, ((avd) ve4Var).d, iArr);
        return new avd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return ka6.j0(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return ka6.v1(this.d);
    }

    public avd() {
        this.d = new int[5];
    }

    public avd(int[] iArr) {
        this.d = iArr;
    }
}
