package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class pxd extends ve4 {
    public final long[] d;

    public pxd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            l5.q("x value invalid for SecT571FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            o6.h();
            throw null;
        }
        long[] jArr = new long[9];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        w74.D(jArr, 0);
        this.d = jArr;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = new long[9];
        w74.e(this.d, ((pxd) ve4Var).d, jArr);
        return new pxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = new long[9];
        long[] jArr2 = this.d;
        jArr[0] = jArr2[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr[i] = jArr2[i];
        }
        return new pxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 571;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pxd)) {
            return false;
        }
        long[] jArr = ((pxd) obj).d;
        for (int i = 8; i >= 0; i--) {
            if (this.d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        long[] jArr = new long[9];
        long[] jArr2 = this.d;
        if (h91.F(jArr2)) {
            bg.h();
            return null;
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        w74.E(jArr2, jArr5);
        w74.E(jArr5, jArr3);
        w74.E(jArr3, jArr4);
        w74.w(jArr3, jArr4, jArr3);
        w74.F(jArr3, jArr4, 2);
        w74.w(jArr3, jArr4, jArr3);
        w74.w(jArr3, jArr5, jArr3);
        w74.F(jArr3, jArr4, 5);
        w74.w(jArr3, jArr4, jArr3);
        w74.F(jArr4, jArr4, 5);
        w74.w(jArr3, jArr4, jArr3);
        w74.F(jArr3, jArr4, 15);
        w74.w(jArr3, jArr4, jArr5);
        w74.F(jArr5, jArr3, 30);
        w74.F(jArr3, jArr4, 30);
        w74.w(jArr3, jArr4, jArr3);
        w74.F(jArr3, jArr4, 60);
        w74.w(jArr3, jArr4, jArr3);
        w74.F(jArr4, jArr4, 60);
        w74.w(jArr3, jArr4, jArr3);
        w74.F(jArr3, jArr4, 180);
        w74.w(jArr3, jArr4, jArr3);
        w74.F(jArr4, jArr4, 180);
        w74.w(jArr3, jArr4, jArr3);
        w74.w(jArr3, jArr5, jArr);
        return new pxd(jArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        long[] jArr = this.d;
        if (jArr[0] == 1) {
            for (int i = 1; i < 9; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return h91.F(this.d);
    }

    public final int hashCode() {
        return st0.d(this.d, 9) ^ 5711052;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[9];
        w74.w(this.d, ((pxd) ve4Var).d, jArr);
        return new pxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = ((pxd) ve4Var).d;
        long[] jArr2 = ((pxd) ve4Var2).d;
        long[] jArr3 = ((pxd) ve4Var3).d;
        long[] jArr4 = new long[18];
        w74.x(this.d, jArr, jArr4);
        w74.x(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        w74.C(jArr4, jArr5);
        return new pxd(jArr5);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        return this;
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        int i = 0;
        int i2 = 0;
        while (true) {
            long[] jArr4 = this.d;
            if (i >= 4) {
                long jE = wab.E(jArr4[i2]);
                jArr2[4] = jE & 4294967295L;
                jArr3[4] = jE >>> 32;
                w74.w(jArr3, w74.a0, jArr);
                w74.e(jArr, jArr2, jArr);
                return new pxd(jArr);
            }
            int i3 = i2 + 1;
            long jE2 = wab.E(jArr4[i2]);
            i2 += 2;
            long jE3 = wab.E(jArr4[i3]);
            jArr2[i] = (jE2 & 4294967295L) | (jE3 << 32);
            jArr3[i] = (jE2 >>> 32) | ((-4294967296L) & jE3);
            i++;
        }
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[9];
        w74.E(this.d, jArr);
        return new pxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = ((pxd) ve4Var).d;
        long[] jArr2 = ((pxd) ve4Var2).d;
        long[] jArr3 = new long[18];
        long[] jArr4 = new long[18];
        w74.p(this.d, jArr4);
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
        w74.x(jArr, jArr2, jArr3);
        long[] jArr5 = new long[9];
        w74.C(jArr3, jArr5);
        return new pxd(jArr5);
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
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = this.d[i];
            if (j != 0) {
                h91.G(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public pxd() {
        this.d = new long[9];
    }

    public pxd(long[] jArr) {
        this.d = jArr;
    }
}
