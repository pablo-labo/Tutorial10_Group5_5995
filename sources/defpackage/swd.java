package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class swd extends ve4 {
    public final long[] d;

    public swd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            l5.q("x value invalid for SecT193FieldElement");
            throw null;
        }
        long[] jArrI0 = ka6.i0(bigInteger);
        long j = jArrI0[3];
        long j2 = j >>> 1;
        jArrI0[0] = (j2 ^ (j2 << 15)) ^ jArrI0[0];
        jArrI0[1] = jArrI0[1] ^ (j >>> 50);
        jArrI0[3] = j & 1;
        this.d = jArrI0;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = ((swd) ve4Var).d;
        long[] jArr2 = this.d;
        return new swd(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = this.d;
        return new swd(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 193;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof swd) {
            return ka6.d0(this.d, ((swd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        long[] jArr = new long[4];
        long[] jArr2 = this.d;
        if (ka6.E0(jArr2)) {
            bg.h();
            return null;
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[8];
        cr8.u(jArr2, jArr5);
        cr8.A(jArr5, jArr3);
        cr8.D(jArr3, jArr4, 1);
        cr8.z(jArr3, jArr4, jArr3);
        cr8.D(jArr4, jArr4, 1);
        cr8.z(jArr3, jArr4, jArr3);
        cr8.D(jArr3, jArr4, 3);
        cr8.z(jArr3, jArr4, jArr3);
        cr8.D(jArr3, jArr4, 6);
        cr8.z(jArr3, jArr4, jArr3);
        cr8.D(jArr3, jArr4, 12);
        cr8.z(jArr3, jArr4, jArr3);
        cr8.D(jArr3, jArr4, 24);
        cr8.z(jArr3, jArr4, jArr3);
        cr8.D(jArr3, jArr4, 48);
        cr8.z(jArr3, jArr4, jArr3);
        cr8.D(jArr3, jArr4, 96);
        cr8.z(jArr3, jArr4, jArr);
        return new swd(jArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return ka6.A0(this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return ka6.E0(this.d);
    }

    public final int hashCode() {
        return st0.d(this.d, 4) ^ 1930015;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[4];
        cr8.z(this.d, ((swd) ve4Var).d, jArr);
        return new swd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = ((swd) ve4Var).d;
        long[] jArr2 = ((swd) ve4Var2).d;
        long[] jArr3 = ((swd) ve4Var3).d;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        cr8.s(this.d, jArr, jArr5);
        cr8.g(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        cr8.s(jArr2, jArr3, jArr6);
        cr8.g(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        cr8.A(jArr4, jArr7);
        return new swd(jArr7);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        return this;
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        long[] jArr = this.d;
        long jE = wab.E(jArr[0]);
        long jE2 = wab.E(jArr[1]);
        long j = (jE & 4294967295L) | (jE2 << 32);
        long j2 = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = wab.E(jArr[2]);
        long j3 = jE3 >>> 32;
        return new swd(new long[]{j ^ (j2 << 8), ((((jE3 & 4294967295L) ^ (jArr[3] << 32)) ^ (j3 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33), (j2 >>> 31) ^ (j3 << 33), jE3 >>> 63});
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        cr8.u(this.d, jArr2);
        cr8.A(jArr2, jArr);
        return new swd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = ((swd) ve4Var).d;
        long[] jArr2 = ((swd) ve4Var2).d;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        cr8.u(this.d, jArr4);
        cr8.g(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        cr8.s(jArr, jArr2, jArr5);
        cr8.g(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        cr8.A(jArr3, jArr6);
        return new swd(jArr6);
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
        return ka6.x1(this.d);
    }

    public swd() {
        this.d = new long[4];
    }

    public swd(long[] jArr) {
        this.d = jArr;
    }
}
