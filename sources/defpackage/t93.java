package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class t93 extends ve4 {
    public static final BigInteger e = s93.h;
    public static final int[] f = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public int[] d;

    public t93() {
        this.d = new int[8];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[8];
        ka6.H(this.d, ((t93) ve4Var).d, iArr);
        if (ka6.q0(iArr, pyd.V)) {
            pyd.W(iArr);
        }
        return new t93(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[8];
        ka6.r0(8, this.d, iArr);
        if (ka6.q0(iArr, pyd.V)) {
            pyd.W(iArr);
        }
        return new t93(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[8];
        ka6.w0(pyd.V, ((t93) ve4Var).d, iArr);
        pyd.G(iArr, this.d, iArr);
        return new t93(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t93) {
            return ka6.c0(this.d, ((t93) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[8];
        ka6.w0(pyd.V, this.d, iArr);
        return new t93(iArr);
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
        pyd.G(this.d, ((t93) ve4Var).d, iArr);
        return new t93(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[8];
        int[] iArr2 = this.d;
        if (ka6.D0(iArr2)) {
            ka6.z1(iArr);
        } else {
            ka6.o1(pyd.V, iArr2, iArr);
        }
        return new t93(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (ka6.D0(iArr) || ka6.z0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        pyd.R(iArr, iArr2);
        pyd.G(iArr2, iArr, iArr2);
        pyd.R(iArr2, iArr2);
        pyd.G(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        pyd.R(iArr2, iArr3);
        pyd.G(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        pyd.T(3, iArr3, iArr4);
        pyd.G(iArr4, iArr2, iArr4);
        pyd.T(4, iArr4, iArr2);
        pyd.G(iArr2, iArr3, iArr2);
        pyd.T(4, iArr2, iArr4);
        pyd.G(iArr4, iArr3, iArr4);
        pyd.T(15, iArr4, iArr3);
        pyd.G(iArr3, iArr4, iArr3);
        pyd.T(30, iArr3, iArr4);
        pyd.G(iArr4, iArr3, iArr4);
        pyd.T(60, iArr4, iArr3);
        pyd.G(iArr3, iArr4, iArr3);
        pyd.T(11, iArr3, iArr4);
        pyd.G(iArr4, iArr2, iArr4);
        pyd.T(120, iArr4, iArr2);
        pyd.G(iArr2, iArr3, iArr2);
        pyd.R(iArr2, iArr2);
        pyd.R(iArr2, iArr3);
        if (ka6.c0(iArr, iArr3)) {
            return new t93(iArr2);
        }
        pyd.G(iArr2, f, iArr2);
        pyd.R(iArr2, iArr3);
        if (ka6.c0(iArr, iArr3)) {
            return new t93(iArr2);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[8];
        pyd.R(this.d, iArr);
        return new t93(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[8];
        pyd.X(this.d, ((t93) ve4Var).d, iArr);
        return new t93(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return ka6.k0(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return ka6.w1(this.d);
    }

    public t93(int[] iArr) {
        this.d = iArr;
    }
}
