package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class dvd extends ve4 {
    public static final BigInteger e = cvd.h;
    public int[] d;

    public dvd() {
        this.d = new int[6];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[6];
        if (v1.I(this.d, ((dvd) ve4Var).d, iArr) != 0 || (iArr[5] == -1 && v1.c0(iArr, ygg.X))) {
            ka6.I(6, 4553, iArr);
        }
        return new dvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[6];
        if (ka6.r0(6, this.d, iArr) != 0 || (iArr[5] == -1 && v1.c0(iArr, ygg.X))) {
            ka6.I(6, 4553, iArr);
        }
        return new dvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[6];
        ka6.w0(ygg.X, ((dvd) ve4Var).d, iArr);
        ygg.p(iArr, this.d, iArr);
        return new dvd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvd) {
            return v1.S(this.d, ((dvd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[6];
        ka6.w0(ygg.X, this.d, iArr);
        return new dvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return v1.d0(this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return v1.e0(this.d);
    }

    public final int hashCode() {
        return st0.c(6, this.d) ^ e.hashCode();
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        int[] iArr = new int[6];
        ygg.p(this.d, ((dvd) ve4Var).d, iArr);
        return new dvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[6];
        int[] iArr2 = this.d;
        if (v1.e0(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
        } else {
            v1.q0(ygg.X, iArr2, iArr);
        }
        return new dvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (v1.e0(iArr) || v1.d0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        ygg.z(iArr, iArr2);
        ygg.p(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        ygg.z(iArr2, iArr3);
        ygg.p(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        ygg.A(3, iArr3, iArr4);
        ygg.p(iArr4, iArr3, iArr4);
        ygg.A(2, iArr4, iArr4);
        ygg.p(iArr4, iArr2, iArr4);
        ygg.A(8, iArr4, iArr2);
        ygg.p(iArr2, iArr4, iArr2);
        ygg.A(3, iArr2, iArr4);
        ygg.p(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        ygg.A(16, iArr4, iArr5);
        ygg.p(iArr5, iArr2, iArr5);
        ygg.A(35, iArr5, iArr2);
        ygg.p(iArr2, iArr5, iArr2);
        ygg.A(70, iArr2, iArr5);
        ygg.p(iArr5, iArr2, iArr5);
        ygg.A(19, iArr5, iArr2);
        ygg.p(iArr2, iArr4, iArr2);
        ygg.A(20, iArr2, iArr2);
        ygg.p(iArr2, iArr4, iArr2);
        ygg.A(4, iArr2, iArr2);
        ygg.p(iArr2, iArr3, iArr2);
        ygg.A(6, iArr2, iArr2);
        ygg.p(iArr2, iArr3, iArr2);
        ygg.z(iArr2, iArr2);
        ygg.z(iArr2, iArr3);
        if (v1.S(iArr, iArr3)) {
            return new dvd(iArr2);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[6];
        ygg.z(this.d, iArr);
        return new dvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[6];
        ygg.B(this.d, ((dvd) ve4Var).d, iArr);
        return new dvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return v1.W(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return v1.t0(this.d);
    }

    public dvd(int[] iArr) {
        this.d = iArr;
    }
}
