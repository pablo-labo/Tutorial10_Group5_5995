package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class xwd extends ve4 {
    public final long[] d;

    public xwd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            l5.q("x value invalid for SecT233FieldElement");
            throw null;
        }
        long[] jArrI0 = ka6.i0(bigInteger);
        long j = jArrI0[3];
        long j2 = j >>> 41;
        jArrI0[0] = jArrI0[0] ^ j2;
        jArrI0[1] = (j2 << 10) ^ jArrI0[1];
        jArrI0[3] = j & 2199023255551L;
        this.d = jArrI0;
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = ((xwd) ve4Var).d;
        long[] jArr2 = this.d;
        return new xwd(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = this.d;
        return new xwd(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 233;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xwd) {
            return ka6.d0(this.d, ((xwd) obj).d);
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
        r03.z(jArr2, jArr3);
        r03.w(jArr3, jArr2, jArr3);
        r03.z(jArr3, jArr3);
        r03.w(jArr3, jArr2, jArr3);
        r03.A(jArr3, jArr4, 3);
        r03.w(jArr4, jArr3, jArr4);
        r03.z(jArr4, jArr4);
        r03.w(jArr4, jArr2, jArr4);
        r03.A(jArr4, jArr3, 7);
        r03.w(jArr3, jArr4, jArr3);
        r03.A(jArr3, jArr4, 14);
        r03.w(jArr4, jArr3, jArr4);
        r03.z(jArr4, jArr4);
        r03.w(jArr4, jArr2, jArr4);
        r03.A(jArr4, jArr3, 29);
        r03.w(jArr3, jArr4, jArr3);
        r03.A(jArr3, jArr4, 58);
        r03.w(jArr4, jArr3, jArr4);
        r03.A(jArr4, jArr3, 116);
        r03.w(jArr3, jArr4, jArr3);
        r03.z(jArr3, jArr);
        return new xwd(jArr);
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
        return st0.d(this.d, 4) ^ 2330074;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[4];
        r03.w(this.d, ((xwd) ve4Var).d, jArr);
        return new xwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = ((xwd) ve4Var).d;
        long[] jArr2 = ((xwd) ve4Var2).d;
        long[] jArr3 = ((xwd) ve4Var3).d;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        r03.t(this.d, jArr, jArr5);
        r03.g(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        r03.t(jArr2, jArr3, jArr6);
        r03.g(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        r03.x(jArr4, jArr7);
        return new xwd(jArr7);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        return this;
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        long[] jArr = new long[4];
        long[] jArr2 = this.d;
        long jE = wab.E(jArr2[0]);
        long jE2 = wab.E(jArr2[1]);
        long j = (jE & 4294967295L) | (jE2 << 32);
        long j2 = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = wab.E(jArr2[2]);
        int i = 3;
        long jE4 = wab.E(jArr2[3]);
        long j3 = (4294967295L & jE3) | (jE4 << 32);
        long j4 = (jE3 >>> 32) | (jE4 & (-4294967296L));
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j7 << i5);
            int i6 = i4 + 1;
            int i7 = i;
            int i8 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j6 << i5) | (j7 >>> i8));
            int i9 = i4 + 2;
            jArr3[i9] = jArr3[i9] ^ ((j5 << i5) | (j6 >>> i8));
            int i10 = i4 + 3;
            jArr3[i10] = jArr3[i10] ^ (j5 >>> i8);
            i2++;
            i = i7;
        }
        r03.x(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new xwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[4];
        r03.z(this.d, jArr);
        return new xwd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = ((xwd) ve4Var).d;
        long[] jArr2 = ((xwd) ve4Var2).d;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        r03.v(this.d, jArr4);
        r03.g(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        r03.t(jArr, jArr2, jArr5);
        r03.g(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        r03.x(jArr3, jArr6);
        return new xwd(jArr6);
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

    public xwd() {
        this.d = new long[4];
    }

    public xwd(long[] jArr) {
        this.d = jArr;
    }
}
