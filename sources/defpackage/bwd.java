package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class bwd extends ve4 {
    public final long[] d;

    public bwd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            l5.q("x value invalid for SecT113FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            o6.h();
            throw null;
        }
        long[] jArr = new long[2];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[1];
        long j2 = j >>> 49;
        jArr[0] = (j2 ^ (j2 << 9)) ^ jArr[0];
        jArr[1] = j & 562949953421311L;
        this.d = jArr;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = ((bwd) ve4Var).d;
        long[] jArr2 = this.d;
        return new bwd(new long[]{jArr2[0] ^ jArr[0], jArr[1] ^ jArr2[1]});
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = this.d;
        return new bwd(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 113;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwd)) {
            return false;
        }
        long[] jArr = ((bwd) obj).d;
        for (int i = 1; i >= 0; i--) {
            if (this.d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        long[] jArr = new long[2];
        for (int i = 0; i < 2; i++) {
            long[] jArr2 = this.d;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[2];
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[4];
                awd.g(jArr2, jArr5);
                awd.j(jArr5, jArr3);
                awd.h(jArr3, jArr2, jArr3);
                long[] jArr6 = new long[4];
                awd.g(jArr3, jArr6);
                awd.j(jArr6, jArr3);
                awd.h(jArr3, jArr2, jArr3);
                awd.q(jArr3, jArr4, 3);
                awd.h(jArr4, jArr3, jArr4);
                long[] jArr7 = new long[4];
                awd.g(jArr4, jArr7);
                awd.j(jArr7, jArr4);
                awd.h(jArr4, jArr2, jArr4);
                awd.q(jArr4, jArr3, 7);
                awd.h(jArr3, jArr4, jArr3);
                awd.q(jArr3, jArr4, 14);
                awd.h(jArr4, jArr3, jArr4);
                awd.q(jArr4, jArr3, 28);
                awd.h(jArr3, jArr4, jArr3);
                awd.q(jArr3, jArr4, 56);
                awd.h(jArr4, jArr3, jArr4);
                long[] jArr8 = new long[4];
                awd.g(jArr4, jArr8);
                awd.j(jArr8, jArr);
                return new bwd(jArr);
            }
        }
        bg.h();
        return null;
    }

    @Override // defpackage.ve4
    public final boolean g() {
        long[] jArr = this.d;
        return jArr[0] == 1 && jArr[1] == 0;
    }

    @Override // defpackage.ve4
    public final boolean h() {
        for (int i = 0; i < 2; i++) {
            if (this.d[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return st0.d(this.d, 2) ^ 113009;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[2];
        awd.h(this.d, ((bwd) ve4Var).d, jArr);
        return new bwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = ((bwd) ve4Var).d;
        long[] jArr2 = ((bwd) ve4Var2).d;
        long[] jArr3 = ((bwd) ve4Var3).d;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        awd.e(this.d, jArr, jArr5);
        awd.a(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[4];
        awd.e(jArr2, jArr3, jArr6);
        awd.a(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        awd.j(jArr4, jArr7);
        return new bwd(jArr7);
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
        long j = (4294967295L & jE) | (jE2 << 32);
        long j2 = (jE >>> 32) | (jE2 & (-4294967296L));
        return new bwd(new long[]{((j2 << 57) ^ j) ^ (j2 << 5), (j2 >>> 59) ^ (j2 >>> 7)});
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        awd.g(this.d, jArr2);
        awd.j(jArr2, jArr);
        return new bwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = ((bwd) ve4Var).d;
        long[] jArr2 = ((bwd) ve4Var2).d;
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        awd.g(this.d, jArr4);
        awd.a(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[4];
        awd.e(jArr, jArr2, jArr5);
        awd.a(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[2];
        awd.j(jArr3, jArr6);
        return new bwd(jArr6);
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
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = this.d[i];
            if (j != 0) {
                h91.G(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public bwd() {
        this.d = new long[2];
    }

    public bwd(long[] jArr) {
        this.d = jArr;
    }
}
