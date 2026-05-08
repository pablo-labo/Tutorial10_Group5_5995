package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class fxd extends ve4 {
    public final long[] d;

    public fxd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            l5.q("x value invalid for SecT283FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            o6.h();
            throw null;
        }
        long[] jArr = new long[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[4];
        long j2 = j >>> 27;
        jArr[0] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[0];
        jArr[4] = j & 134217727;
        this.d = jArr;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = ((fxd) ve4Var).d;
        long[] jArr2 = this.d;
        return new fxd(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4]});
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = this.d;
        return new fxd(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 283;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fxd)) {
            return false;
        }
        long[] jArr = ((fxd) obj).d;
        for (int i = 4; i >= 0; i--) {
            if (this.d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        long[] jArr = new long[5];
        for (int i = 0; i < 5; i++) {
            long[] jArr2 = this.d;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[5];
                long[] jArr4 = new long[5];
                h4.z(jArr2, jArr3);
                h4.u(jArr3, jArr2, jArr3);
                h4.A(jArr3, jArr4, 2);
                h4.u(jArr4, jArr3, jArr4);
                h4.A(jArr4, jArr3, 4);
                h4.u(jArr3, jArr4, jArr3);
                h4.A(jArr3, jArr4, 8);
                h4.u(jArr4, jArr3, jArr4);
                h4.z(jArr4, jArr4);
                h4.u(jArr4, jArr2, jArr4);
                h4.A(jArr4, jArr3, 17);
                h4.u(jArr3, jArr4, jArr3);
                h4.z(jArr3, jArr3);
                h4.u(jArr3, jArr2, jArr3);
                h4.A(jArr3, jArr4, 35);
                h4.u(jArr4, jArr3, jArr4);
                h4.A(jArr4, jArr3, 70);
                h4.u(jArr3, jArr4, jArr3);
                h4.z(jArr3, jArr3);
                h4.u(jArr3, jArr2, jArr3);
                h4.A(jArr3, jArr4, 141);
                h4.u(jArr4, jArr3, jArr4);
                h4.z(jArr4, jArr);
                return new fxd(jArr);
            }
        }
        bg.h();
        return null;
    }

    @Override // defpackage.ve4
    public final boolean g() {
        long[] jArr = this.d;
        if (jArr[0] == 1) {
            for (int i = 1; i < 5; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ve4
    public final boolean h() {
        for (int i = 0; i < 5; i++) {
            if (this.d[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return st0.d(this.d, 5) ^ 2831275;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[5];
        h4.u(this.d, ((fxd) ve4Var).d, jArr);
        return new fxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = ((fxd) ve4Var).d;
        long[] jArr2 = ((fxd) ve4Var2).d;
        long[] jArr3 = ((fxd) ve4Var3).d;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[10];
        h4.q(this.d, jArr, jArr5);
        h4.f(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[10];
        h4.q(jArr2, jArr3, jArr6);
        h4.f(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[5];
        h4.v(jArr4, jArr7);
        return new fxd(jArr7);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        return this;
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        long[] jArr = new long[5];
        long[] jArr2 = this.d;
        long jE = wab.E(jArr2[0]);
        long jE2 = wab.E(jArr2[1]);
        long j = (jE & 4294967295L) | (jE2 << 32);
        long jE3 = wab.E(jArr2[2]);
        long jE4 = wab.E(jArr2[3]);
        long j2 = (jE3 & 4294967295L) | (jE4 << 32);
        long jE5 = wab.E(jArr2[4]);
        h4.u(new long[]{(jE >>> 32) | (jE2 & (-4294967296L)), (jE3 >>> 32) | (jE4 & (-4294967296L)), jE5 >>> 32, 0, 0}, h4.Y, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j2;
        jArr[2] = jArr[2] ^ (4294967295L & jE5);
        return new fxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[5];
        h4.z(this.d, jArr);
        return new fxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = ((fxd) ve4Var).d;
        long[] jArr2 = ((fxd) ve4Var2).d;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        h4.s(this.d, jArr4);
        h4.f(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[10];
        h4.q(jArr, jArr2, jArr5);
        h4.f(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[5];
        h4.v(jArr3, jArr6);
        return new fxd(jArr6);
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
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = this.d[i];
            if (j != 0) {
                h91.G(j, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public fxd() {
        this.d = new long[5];
    }

    public fxd(long[] jArr) {
        this.d = jArr;
    }
}
