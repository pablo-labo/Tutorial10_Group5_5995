package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class sud extends ve4 {
    public static final BigInteger e = rud.h;
    public int[] d;

    public sud() {
        this.d = new int[4];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[4];
        zkd.r(this.d, ((sud) ve4Var).d, iArr);
        return new sud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[4];
        if (ka6.r0(4, this.d, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && h91.y(iArr, zkd.X))) {
            zkd.s(iArr);
        }
        return new sud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[4];
        ka6.w0(zkd.X, ((sud) ve4Var).d, iArr);
        zkd.F(iArr, this.d, iArr);
        return new sud(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sud)) {
            return false;
        }
        int[] iArr = this.d;
        int[] iArr2 = ((sud) obj).d;
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[4];
        ka6.w0(zkd.X, this.d, iArr);
        return new sud(iArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return h91.B(this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return h91.D(this.d);
    }

    public final int hashCode() {
        return st0.c(4, this.d) ^ e.hashCode();
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        int[] iArr = new int[4];
        zkd.F(this.d, ((sud) ve4Var).d, iArr);
        return new sud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[4];
        int[] iArr2 = this.d;
        if (h91.D(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
        } else {
            h91.O(zkd.X, iArr2, iArr);
        }
        return new sud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr = this.d;
        if (h91.D(iArr) || h91.B(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        zkd.K(iArr, iArr2);
        zkd.F(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        zkd.L(2, iArr2, iArr3);
        zkd.F(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        zkd.L(4, iArr3, iArr4);
        zkd.F(iArr4, iArr3, iArr4);
        zkd.L(2, iArr4, iArr3);
        zkd.F(iArr3, iArr2, iArr3);
        zkd.L(10, iArr3, iArr2);
        zkd.F(iArr2, iArr3, iArr2);
        zkd.L(10, iArr2, iArr4);
        zkd.F(iArr4, iArr3, iArr4);
        zkd.K(iArr4, iArr3);
        zkd.F(iArr3, iArr, iArr3);
        zkd.L(95, iArr3, iArr3);
        zkd.K(iArr3, iArr4);
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr4[i]) {
                return null;
            }
        }
        return new sud(iArr3);
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[4];
        zkd.K(this.d, iArr);
        return new sud(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[4];
        zkd.N(this.d, ((sud) ve4Var).d, iArr);
        return new sud(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return (this.d[0] & 1) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        int[] iArr = this.d;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h91.A(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public sud(int[] iArr) {
        this.d = iArr;
    }
}
