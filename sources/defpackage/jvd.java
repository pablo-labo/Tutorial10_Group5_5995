package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class jvd extends ve4 {
    public static final BigInteger e = ivd.h;
    public static final int[] f = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public int[] d;

    public jvd() {
        this.d = new int[7];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[7];
        if (h91.h(this.d, ((jvd) ve4Var).d, iArr) != 0 || (iArr[6] == -1 && h91.z(iArr, c0h.j0))) {
            ka6.I(7, 6803, iArr);
        }
        return new jvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[7];
        if (ka6.r0(7, this.d, iArr) != 0 || (iArr[6] == -1 && h91.z(iArr, c0h.j0))) {
            ka6.I(7, 6803, iArr);
        }
        return new jvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[7];
        ka6.w0(c0h.j0, ((jvd) ve4Var).d, iArr);
        c0h.J(iArr, this.d, iArr);
        return new jvd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvd) {
            return h91.u(this.d, ((jvd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[7];
        ka6.w0(c0h.j0, this.d, iArr);
        return new jvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return h91.C(this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return h91.E(this.d);
    }

    public final int hashCode() {
        return st0.c(7, this.d) ^ e.hashCode();
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        int[] iArr = new int[7];
        c0h.J(this.d, ((jvd) ve4Var).d, iArr);
        return new jvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[7];
        int[] iArr2 = this.d;
        if (h91.E(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            iArr[6] = 0;
        } else {
            h91.P(c0h.j0, iArr2, iArr);
        }
        return new jvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (h91.E(iArr) || h91.C(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        c0h.T(iArr, iArr2);
        c0h.J(iArr2, iArr, iArr2);
        c0h.T(iArr2, iArr2);
        c0h.J(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        c0h.T(iArr2, iArr3);
        c0h.J(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        c0h.U(4, iArr3, iArr4);
        c0h.J(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        c0h.U(3, iArr4, iArr5);
        c0h.J(iArr5, iArr2, iArr5);
        c0h.U(8, iArr5, iArr5);
        c0h.J(iArr5, iArr4, iArr5);
        c0h.U(4, iArr5, iArr4);
        c0h.J(iArr4, iArr3, iArr4);
        c0h.U(19, iArr4, iArr3);
        c0h.J(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        c0h.U(42, iArr3, iArr6);
        c0h.J(iArr6, iArr3, iArr6);
        c0h.U(23, iArr6, iArr3);
        c0h.J(iArr3, iArr4, iArr3);
        c0h.U(84, iArr3, iArr4);
        c0h.J(iArr4, iArr6, iArr4);
        c0h.U(20, iArr4, iArr4);
        c0h.J(iArr4, iArr5, iArr4);
        c0h.U(3, iArr4, iArr4);
        c0h.J(iArr4, iArr, iArr4);
        c0h.U(2, iArr4, iArr4);
        c0h.J(iArr4, iArr, iArr4);
        c0h.U(4, iArr4, iArr4);
        c0h.J(iArr4, iArr2, iArr4);
        c0h.T(iArr4, iArr4);
        c0h.T(iArr4, iArr6);
        if (h91.u(iArr, iArr6)) {
            return new jvd(iArr4);
        }
        c0h.J(iArr4, f, iArr4);
        c0h.T(iArr4, iArr6);
        if (h91.u(iArr, iArr6)) {
            return new jvd(iArr4);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[7];
        c0h.T(this.d, iArr);
        return new jvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[7];
        c0h.V(this.d, ((jvd) ve4Var).d, iArr);
        return new jvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return h91.w(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return h91.Q(this.d);
    }

    public jvd(int[] iArr) {
        this.d = iArr;
    }
}
