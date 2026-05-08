package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class svd extends ve4 {
    public static final BigInteger e = rvd.h;
    public int[] d;

    public svd() {
        this.d = new int[8];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[8];
        if (ka6.H(this.d, ((svd) ve4Var).d, iArr) != 0 || (iArr[7] == -1 && ka6.q0(iArr, ee3.f))) {
            ee3.h(iArr);
        }
        return new svd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[8];
        if (ka6.r0(8, this.d, iArr) != 0 || (iArr[7] == -1 && ka6.q0(iArr, ee3.f))) {
            ee3.h(iArr);
        }
        return new svd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[8];
        ka6.w0(ee3.f, ((svd) ve4Var).d, iArr);
        ee3.s(iArr, this.d, iArr);
        return new svd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof svd) {
            return ka6.c0(this.d, ((svd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[8];
        ka6.w0(ee3.f, this.d, iArr);
        return new svd(iArr);
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
        ee3.s(this.d, ((svd) ve4Var).d, iArr);
        return new svd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[8];
        int[] iArr2 = this.d;
        if (ka6.D0(iArr2)) {
            ka6.z1(iArr);
        } else {
            ka6.o1(ee3.f, iArr2, iArr);
        }
        return new svd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (ka6.D0(iArr) || ka6.z0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        ee3.w(iArr, iArr2);
        ee3.s(iArr2, iArr, iArr2);
        ee3.x(2, iArr2, iArr3);
        ee3.s(iArr3, iArr2, iArr3);
        ee3.x(4, iArr3, iArr2);
        ee3.s(iArr2, iArr3, iArr2);
        ee3.x(8, iArr2, iArr3);
        ee3.s(iArr3, iArr2, iArr3);
        ee3.x(16, iArr3, iArr2);
        ee3.s(iArr2, iArr3, iArr2);
        ee3.x(32, iArr2, iArr2);
        ee3.s(iArr2, iArr, iArr2);
        ee3.x(96, iArr2, iArr2);
        ee3.s(iArr2, iArr, iArr2);
        ee3.x(94, iArr2, iArr2);
        ee3.w(iArr2, iArr3);
        if (ka6.c0(iArr, iArr3)) {
            return new svd(iArr2);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[8];
        ee3.w(this.d, iArr);
        return new svd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[8];
        ee3.y(this.d, ((svd) ve4Var).d, iArr);
        return new svd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return ka6.k0(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return ka6.w1(this.d);
    }

    public svd(int[] iArr) {
        this.d = iArr;
    }
}
