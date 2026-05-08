package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class gvd extends ve4 {
    public static final BigInteger e = fvd.h;
    public int[] d;

    public gvd() {
        this.d = new int[6];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[6];
        if (v1.I(this.d, ((gvd) ve4Var).d, iArr) != 0 || (iArr[5] == -1 && v1.c0(iArr, pg8.v0))) {
            pg8.j(iArr);
        }
        return new gvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[6];
        if (ka6.r0(6, this.d, iArr) != 0 || (iArr[5] == -1 && v1.c0(iArr, pg8.v0))) {
            pg8.j(iArr);
        }
        return new gvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[6];
        ka6.w0(pg8.v0, ((gvd) ve4Var).d, iArr);
        pg8.C(iArr, this.d, iArr);
        return new gvd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gvd) {
            return v1.S(this.d, ((gvd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[6];
        ka6.w0(pg8.v0, this.d, iArr);
        return new gvd(iArr);
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
        pg8.C(this.d, ((gvd) ve4Var).d, iArr);
        return new gvd(iArr);
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
            v1.q0(pg8.v0, iArr2, iArr);
        }
        return new gvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (v1.e0(iArr) || v1.d0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        pg8.N(iArr, iArr2);
        pg8.C(iArr2, iArr, iArr2);
        pg8.O(2, iArr2, iArr3);
        pg8.C(iArr3, iArr2, iArr3);
        pg8.O(4, iArr3, iArr2);
        pg8.C(iArr2, iArr3, iArr2);
        pg8.O(8, iArr2, iArr3);
        pg8.C(iArr3, iArr2, iArr3);
        pg8.O(16, iArr3, iArr2);
        pg8.C(iArr2, iArr3, iArr2);
        pg8.O(32, iArr2, iArr3);
        pg8.C(iArr3, iArr2, iArr3);
        pg8.O(64, iArr3, iArr2);
        pg8.C(iArr2, iArr3, iArr2);
        pg8.O(62, iArr2, iArr2);
        pg8.N(iArr2, iArr3);
        if (v1.S(iArr, iArr3)) {
            return new gvd(iArr2);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[6];
        pg8.N(this.d, iArr);
        return new gvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[6];
        pg8.R(this.d, ((gvd) ve4Var).d, iArr);
        return new gvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return v1.W(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return v1.t0(this.d);
    }

    public gvd(int[] iArr) {
        this.d = iArr;
    }
}
