package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class lwd extends ve4 {
    public final long[] d;

    public lwd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            l5.q("x value invalid for SecT163FieldElement");
            throw null;
        }
        long[] jArrU = v1.U(bigInteger);
        long j = jArrU[2];
        long j2 = j >>> 35;
        jArrU[0] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ jArrU[0];
        jArrU[2] = j & 34359738367L;
        this.d = jArrU;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = ((lwd) ve4Var).d;
        long[] jArr2 = this.d;
        return new lwd(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = this.d;
        return new lwd(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 163;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lwd)) {
            return false;
        }
        long[] jArr = ((lwd) obj).d;
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
        long[] jArr5 = new long[6];
        q92.r(jArr2, jArr5);
        q92.A(jArr5, jArr3);
        q92.D(jArr3, jArr4, 1);
        q92.x(jArr3, jArr4, jArr3);
        q92.D(jArr4, jArr4, 1);
        q92.x(jArr3, jArr4, jArr3);
        q92.D(jArr3, jArr4, 3);
        q92.x(jArr3, jArr4, jArr3);
        q92.D(jArr4, jArr4, 3);
        q92.x(jArr3, jArr4, jArr3);
        q92.D(jArr3, jArr4, 9);
        q92.x(jArr3, jArr4, jArr3);
        q92.D(jArr4, jArr4, 9);
        q92.x(jArr3, jArr4, jArr3);
        q92.D(jArr3, jArr4, 27);
        q92.x(jArr3, jArr4, jArr3);
        q92.D(jArr4, jArr4, 27);
        q92.x(jArr3, jArr4, jArr3);
        q92.D(jArr3, jArr4, 81);
        q92.x(jArr3, jArr4, jArr);
        return new lwd(jArr);
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
        return st0.d(this.d, 3) ^ 163763;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[3];
        q92.x(this.d, ((lwd) ve4Var).d, jArr);
        return new lwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = ((lwd) ve4Var).d;
        long[] jArr2 = ((lwd) ve4Var2).d;
        long[] jArr3 = ((lwd) ve4Var3).d;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[6];
        q92.p(this.d, jArr, jArr5);
        q92.e(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        q92.p(jArr2, jArr3, jArr6);
        q92.e(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        q92.A(jArr4, jArr7);
        return new lwd(jArr7);
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
        q92.x(new long[]{(jE >>> 32) | (jE2 & (-4294967296L)), jE3 >>> 32, 0}, q92.a0, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (jE3 & 4294967295L);
        return new lwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        q92.r(this.d, jArr2);
        q92.A(jArr2, jArr);
        return new lwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = ((lwd) ve4Var).d;
        long[] jArr2 = ((lwd) ve4Var2).d;
        long[] jArr3 = new long[6];
        long[] jArr4 = new long[6];
        q92.r(this.d, jArr4);
        q92.e(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[6];
        q92.p(jArr, jArr2, jArr5);
        q92.e(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        q92.A(jArr3, jArr6);
        return new lwd(jArr6);
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

    public lwd() {
        this.d = new long[3];
    }

    public lwd(long[] jArr) {
        this.d = jArr;
    }
}
