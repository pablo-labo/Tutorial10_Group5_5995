package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class kxd extends ve4 {
    public final long[] d;

    public kxd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            l5.q("x value invalid for SecT409FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            o6.h();
            throw null;
        }
        long[] jArr = new long[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[6];
        long j2 = j >>> 25;
        jArr[0] = jArr[0] ^ j2;
        jArr[1] = (j2 << 23) ^ jArr[1];
        jArr[6] = j & 33554431;
        this.d = jArr;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = ((kxd) ve4Var).d;
        long[] jArr2 = this.d;
        return new kxd(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4], jArr2[5] ^ jArr[5], jArr2[6] ^ jArr[6]});
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = this.d;
        return new kxd(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 409;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kxd)) {
            return false;
        }
        long[] jArr = ((kxd) obj).d;
        for (int i = 6; i >= 0; i--) {
            if (this.d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        long[] jArr = new long[7];
        for (int i = 0; i < 7; i++) {
            long[] jArr2 = this.d;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[7];
                long[] jArr4 = new long[7];
                long[] jArr5 = new long[7];
                long[] jArr6 = new long[13];
                nn2.t(jArr2, jArr6);
                nn2.z(jArr6, jArr3);
                nn2.B(jArr3, jArr4, 1);
                nn2.v(jArr3, jArr4, jArr3);
                nn2.B(jArr4, jArr4, 1);
                nn2.v(jArr3, jArr4, jArr3);
                nn2.B(jArr3, jArr4, 3);
                nn2.v(jArr3, jArr4, jArr3);
                nn2.B(jArr3, jArr4, 6);
                nn2.v(jArr3, jArr4, jArr3);
                nn2.B(jArr3, jArr4, 12);
                nn2.v(jArr3, jArr4, jArr5);
                nn2.B(jArr5, jArr3, 24);
                nn2.B(jArr3, jArr4, 24);
                nn2.v(jArr3, jArr4, jArr3);
                nn2.B(jArr3, jArr4, 48);
                nn2.v(jArr3, jArr4, jArr3);
                nn2.B(jArr3, jArr4, 96);
                nn2.v(jArr3, jArr4, jArr3);
                nn2.B(jArr3, jArr4, 192);
                nn2.v(jArr3, jArr4, jArr3);
                nn2.v(jArr3, jArr5, jArr);
                return new kxd(jArr);
            }
        }
        bg.h();
        return null;
    }

    @Override // defpackage.ve4
    public final boolean g() {
        long[] jArr = this.d;
        if (jArr[0] == 1) {
            for (int i = 1; i < 7; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ve4
    public final boolean h() {
        for (int i = 0; i < 7; i++) {
            if (this.d[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return st0.d(this.d, 7) ^ 4090087;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[7];
        nn2.v(this.d, ((kxd) ve4Var).d, jArr);
        return new kxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = ((kxd) ve4Var).d;
        long[] jArr2 = ((kxd) ve4Var2).d;
        long[] jArr3 = ((kxd) ve4Var3).d;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[14];
        nn2.s(this.d, jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        long[] jArr6 = new long[14];
        nn2.s(jArr2, jArr3, jArr6);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr4[i2] = jArr4[i2] ^ jArr6[i2];
        }
        long[] jArr7 = new long[7];
        nn2.z(jArr4, jArr7);
        return new kxd(jArr7);
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
        long jE4 = wab.E(jArr[3]);
        long j3 = (jE3 & 4294967295L) | (jE4 << 32);
        long j4 = (jE3 >>> 32) | (jE4 & (-4294967296L));
        long jE5 = wab.E(jArr[4]);
        long jE6 = wab.E(jArr[5]);
        long j5 = (jE5 >>> 32) | (jE6 & (-4294967296L));
        long jE7 = wab.E(jArr[6]);
        long j6 = jE7 >>> 32;
        return new kxd(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((jE5 & 4294967295L) | (jE6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((jE7 & 4294967295L) ^ (j6 << 44)) ^ (j5 >>> 20)) ^ (j2 << 13), ((jE7 >>> 52) ^ (j4 << 13)) ^ (j2 >>> 51), (j5 << 13) ^ (j4 >>> 51), (j6 << 13) ^ (j5 >>> 51)});
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        nn2.t(this.d, jArr2);
        nn2.z(jArr2, jArr);
        return new kxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = ((kxd) ve4Var).d;
        long[] jArr2 = ((kxd) ve4Var2).d;
        long[] jArr3 = new long[13];
        long[] jArr4 = new long[13];
        nn2.t(this.d, jArr4);
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
        long[] jArr5 = new long[14];
        nn2.s(jArr, jArr2, jArr5);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr3[i2] = jArr3[i2] ^ jArr5[i2];
        }
        long[] jArr6 = new long[7];
        nn2.z(jArr3, jArr6);
        return new kxd(jArr6);
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
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = this.d[i];
            if (j != 0) {
                h91.G(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public kxd() {
        this.d = new long[7];
    }

    public kxd(long[] jArr) {
        this.d = jArr;
    }
}
