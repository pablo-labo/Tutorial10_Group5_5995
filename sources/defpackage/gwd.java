package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class gwd extends ve4 {
    public final long[] d;

    public gwd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            l5.q("x value invalid for SecT131FieldElement");
            throw null;
        }
        long[] jArrU = v1.U(bigInteger);
        long j = jArrU[2];
        long j2 = j >>> 3;
        jArrU[0] = ((j2 << 8) ^ (((j2 << 2) ^ j2) ^ (j2 << 3))) ^ jArrU[0];
        jArrU[1] = jArrU[1] ^ (j >>> 59);
        jArrU[2] = j & 7;
        this.d = jArrU;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = ((gwd) ve4Var).d;
        long[] jArr2 = this.d;
        return new gwd(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = this.d;
        return new gwd(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 131;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gwd)) {
            return false;
        }
        long[] jArr = ((gwd) obj).d;
        for (int i = 2; i >= 0; i--) {
            if (this.d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        long[] jArr = new long[3];
        long[] jArr2 = this.d;
        if (v1.f0(jArr2)) {
            bg.h();
            return null;
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[5];
        wg2.L(jArr2, jArr5);
        wg2.V(jArr5, jArr3);
        wg2.O(jArr3, jArr2, jArr3);
        wg2.Y(jArr3, jArr4, 2);
        wg2.O(jArr4, jArr3, jArr4);
        wg2.Y(jArr4, jArr3, 4);
        wg2.O(jArr3, jArr4, jArr3);
        wg2.Y(jArr3, jArr4, 8);
        wg2.O(jArr4, jArr3, jArr4);
        wg2.Y(jArr4, jArr3, 16);
        wg2.O(jArr3, jArr4, jArr3);
        wg2.Y(jArr3, jArr4, 32);
        wg2.O(jArr4, jArr3, jArr4);
        long[] jArr6 = new long[5];
        wg2.L(jArr4, jArr6);
        wg2.V(jArr6, jArr4);
        wg2.O(jArr4, jArr2, jArr4);
        wg2.Y(jArr4, jArr3, 65);
        wg2.O(jArr3, jArr4, jArr3);
        long[] jArr7 = new long[5];
        wg2.L(jArr3, jArr7);
        wg2.V(jArr7, jArr);
        return new gwd(jArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        long[] jArr = this.d;
        if (jArr[0] == 1) {
            for (int i = 1; i < 3; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return v1.f0(this.d);
    }

    public final int hashCode() {
        return st0.d(this.d, 3) ^ 131832;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[3];
        wg2.O(this.d, ((gwd) ve4Var).d, jArr);
        return new gwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = ((gwd) ve4Var).d;
        long[] jArr2 = ((gwd) ve4Var2).d;
        long[] jArr3 = ((gwd) ve4Var3).d;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[6];
        wg2.J(this.d, jArr, jArr5);
        wg2.g(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        wg2.J(jArr2, jArr3, jArr6);
        wg2.g(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        wg2.V(jArr4, jArr7);
        return new gwd(jArr7);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        return this;
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        long[] jArr = new long[3];
        long[] jArr2 = this.d;
        long jE = wab.E(jArr2[0]);
        long jE2 = wab.E(jArr2[1]);
        long j = (jE & 4294967295L) | (jE2 << 32);
        long jE3 = wab.E(jArr2[2]);
        wg2.O(new long[]{(jE >>> 32) | (jE2 & (-4294967296L)), jE3 >>> 32, 0}, wg2.a0, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (jE3 & 4294967295L);
        return new gwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[5];
        wg2.L(this.d, jArr2);
        wg2.V(jArr2, jArr);
        return new gwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = ((gwd) ve4Var).d;
        long[] jArr2 = ((gwd) ve4Var2).d;
        long[] jArr3 = new long[5];
        long[] jArr4 = new long[5];
        wg2.L(this.d, jArr4);
        wg2.g(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[6];
        wg2.J(jArr, jArr2, jArr5);
        wg2.g(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        wg2.V(jArr3, jArr6);
        return new gwd(jArr6);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        return a(ve4Var);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return (this.d[0] & 1) != 0;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return v1.u0(this.d);
    }

    public gwd() {
        this.d = new long[3];
    }

    public gwd(long[] jArr) {
        this.d = jArr;
    }
}
