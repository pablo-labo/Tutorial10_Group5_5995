package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class xhd extends ve4 {
    public static final BigInteger e = whd.h;
    public int[] d;

    public xhd() {
        this.d = new int[8];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[8];
        hh2.f(this.d, ((xhd) ve4Var).d, iArr);
        return new xhd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[8];
        if (ka6.r0(8, this.d, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && ka6.q0(iArr, hh2.W))) {
            hh2.g(iArr);
        }
        return new xhd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[8];
        ka6.w0(hh2.W, ((xhd) ve4Var).d, iArr);
        hh2.x(iArr, this.d, iArr);
        return new xhd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xhd) {
            return ka6.c0(this.d, ((xhd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[8];
        ka6.w0(hh2.W, this.d, iArr);
        return new xhd(iArr);
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
        hh2.x(this.d, ((xhd) ve4Var).d, iArr);
        return new xhd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[8];
        int[] iArr2 = this.d;
        if (ka6.D0(iArr2)) {
            ka6.z1(iArr);
        } else {
            ka6.o1(hh2.W, iArr2, iArr);
        }
        return new xhd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (ka6.D0(iArr) || ka6.z0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        hh2.H(iArr, iArr2);
        hh2.x(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        hh2.I(2, iArr2, iArr3);
        hh2.x(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        hh2.I(2, iArr3, iArr4);
        hh2.x(iArr4, iArr2, iArr4);
        hh2.I(6, iArr4, iArr2);
        hh2.x(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        hh2.I(12, iArr2, iArr5);
        hh2.x(iArr5, iArr2, iArr5);
        hh2.I(6, iArr5, iArr2);
        hh2.x(iArr2, iArr4, iArr2);
        hh2.H(iArr2, iArr4);
        hh2.x(iArr4, iArr, iArr4);
        hh2.I(31, iArr4, iArr5);
        hh2.x(iArr5, iArr4, iArr2);
        hh2.I(32, iArr5, iArr5);
        hh2.x(iArr5, iArr2, iArr5);
        hh2.I(62, iArr5, iArr5);
        hh2.x(iArr5, iArr2, iArr5);
        hh2.I(4, iArr5, iArr5);
        hh2.x(iArr5, iArr3, iArr5);
        hh2.I(32, iArr5, iArr5);
        hh2.x(iArr5, iArr, iArr5);
        hh2.I(62, iArr5, iArr5);
        hh2.H(iArr5, iArr3);
        if (ka6.c0(iArr, iArr3)) {
            return new xhd(iArr5);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[8];
        hh2.H(this.d, iArr);
        return new xhd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[8];
        hh2.K(this.d, ((xhd) ve4Var).d, iArr);
        return new xhd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return ka6.k0(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return ka6.w1(this.d);
    }

    public xhd(int[] iArr) {
        this.d = iArr;
    }
}
