package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class yvd extends ve4 {
    public static final BigInteger e = xvd.h;
    public int[] d;

    public yvd() {
        this.d = new int[17];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[17];
        hh1.i(this.d, ((yvd) ve4Var).d, iArr);
        return new yvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[17];
        int[] iArr2 = this.d;
        int iR0 = ka6.r0(16, iArr2, iArr) + iArr2[16];
        if (iR0 > 511 || (iR0 == 511 && ka6.a0(16, iArr, hh1.e))) {
            iR0 = (ka6.s0(iArr) + iR0) & 511;
        }
        iArr[16] = iR0;
        return new yvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[17];
        ka6.w0(hh1.e, ((yvd) ve4Var).d, iArr);
        hh1.K(iArr, this.d, iArr);
        return new yvd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yvd) {
            return ka6.a0(17, this.d, ((yvd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[17];
        ka6.w0(hh1.e, this.d, iArr);
        return new yvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return ka6.x0(17, this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return ka6.B0(17, this.d);
    }

    public final int hashCode() {
        return st0.c(17, this.d) ^ e.hashCode();
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        int[] iArr = new int[17];
        hh1.K(this.d, ((yvd) ve4Var).d, iArr);
        return new yvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[17];
        int[] iArr2 = this.d;
        if (ka6.B0(17, iArr2)) {
            for (int i = 0; i < 17; i++) {
                iArr[i] = 0;
            }
        } else {
            ka6.l1(17, hh1.e, iArr2, iArr);
        }
        return new yvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (ka6.B0(17, iArr) || ka6.x0(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        int[] iArr4 = new int[33];
        hh1.C(iArr, iArr4);
        hh1.P(iArr4, iArr2);
        int i = 519;
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            hh1.C(iArr2, iArr4);
            hh1.P(iArr4, iArr2);
        }
        hh1.V(iArr2, iArr3);
        if (ka6.a0(17, iArr, iArr3)) {
            return new yvd(iArr2);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[17];
        hh1.V(this.d, iArr);
        return new yvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[17];
        hh1.W(this.d, ((yvd) ve4Var).d, iArr);
        return new yvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return ka6.l0(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return ka6.u1(17, this.d);
    }

    public yvd(int[] iArr) {
        this.d = iArr;
    }
}
