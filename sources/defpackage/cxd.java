package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class cxd extends ve4 {
    public long[] d;

    public cxd() {
        this.d = new long[4];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        long[] jArr = this.d;
        long[] jArr2 = ((cxd) ve4Var).d;
        return new cxd(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr2[3] ^ jArr[3]});
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        long[] jArr = this.d;
        return new cxd(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        return i(ve4Var.f());
    }

    @Override // defpackage.ve4
    public final int e() {
        return 239;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxd) {
            return ka6.d0(this.d, ((cxd) obj).d);
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
        u63.l0(jArr2, jArr3);
        u63.c0(jArr3, jArr2, jArr3);
        u63.l0(jArr3, jArr3);
        u63.c0(jArr3, jArr2, jArr3);
        u63.m0(jArr3, jArr4, 3);
        u63.c0(jArr4, jArr3, jArr4);
        u63.l0(jArr4, jArr4);
        u63.c0(jArr4, jArr2, jArr4);
        u63.m0(jArr4, jArr3, 7);
        u63.c0(jArr3, jArr4, jArr3);
        u63.m0(jArr3, jArr4, 14);
        u63.c0(jArr4, jArr3, jArr4);
        u63.l0(jArr4, jArr4);
        u63.c0(jArr4, jArr2, jArr4);
        u63.m0(jArr4, jArr3, 29);
        u63.c0(jArr3, jArr4, jArr3);
        u63.l0(jArr3, jArr3);
        u63.c0(jArr3, jArr2, jArr3);
        u63.m0(jArr3, jArr4, 59);
        u63.c0(jArr4, jArr3, jArr4);
        u63.l0(jArr4, jArr4);
        u63.c0(jArr4, jArr2, jArr4);
        u63.m0(jArr4, jArr3, 119);
        u63.c0(jArr3, jArr4, jArr3);
        u63.l0(jArr3, jArr);
        return new cxd(jArr);
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
        return st0.d(this.d, 4) ^ 23900158;
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        long[] jArr = new long[4];
        u63.c0(this.d, ((cxd) ve4Var).d, jArr);
        return new cxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return k(ve4Var, ve4Var2, ve4Var3);
    }

    @Override // defpackage.ve4
    public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        long[] jArr = this.d;
        long[] jArr2 = ((cxd) ve4Var).d;
        long[] jArr3 = ((cxd) ve4Var2).d;
        long[] jArr4 = ((cxd) ve4Var3).d;
        long[] jArr5 = new long[8];
        long[] jArr6 = new long[8];
        u63.Q(jArr, jArr2, jArr6);
        u63.j(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[8];
        u63.Q(jArr3, jArr4, jArr7);
        u63.j(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[4];
        u63.h0(jArr5, jArr8);
        return new cxd(jArr8);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        return this;
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        long[] jArr = new long[4];
        long[] jArr2 = this.d;
        boolean z = false;
        long jE = wab.E(jArr2[0]);
        boolean z2 = true;
        long jE2 = wab.E(jArr2[1]);
        long j = (jE & 4294967295L) | (jE2 << 32);
        long j2 = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = wab.E(jArr2[2]);
        long jE4 = wab.E(jArr2[3]);
        long j3 = (jE3 & 4294967295L) | (jE4 << 32);
        long j4 = (jE3 >>> 32) | (jE4 & (-4294967296L));
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        while (i < 2) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            boolean z3 = z;
            int i4 = i2 & 63;
            jArr3[i3] = jArr3[i3] ^ (j2 << i4);
            int i5 = i3 + 1;
            boolean z4 = z2;
            int i6 = -i4;
            jArr3[i5] = jArr3[i5] ^ ((j7 << i4) | (j2 >>> i6));
            int i7 = i3 + 2;
            jArr3[i7] = jArr3[i7] ^ ((j6 << i4) | (j7 >>> i6));
            int i8 = i3 + 3;
            jArr3[i8] = jArr3[i8] ^ ((j5 << i4) | (j6 >>> i6));
            int i9 = i3 + 4;
            jArr3[i9] = jArr3[i9] ^ (j5 >>> i6);
            i++;
            z = z3;
            z2 = z4;
        }
        boolean z5 = z;
        boolean z6 = z2;
        u63.h0(jArr3, jArr);
        jArr[z5 ? 1 : 0] = jArr[z5 ? 1 : 0] ^ j;
        jArr[z6 ? 1 : 0] = jArr[z6 ? 1 : 0] ^ j3;
        return new cxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        long[] jArr = new long[4];
        u63.l0(this.d, jArr);
        return new cxd(jArr);
    }

    @Override // defpackage.ve4
    public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        long[] jArr = this.d;
        long[] jArr2 = ((cxd) ve4Var).d;
        long[] jArr3 = ((cxd) ve4Var2).d;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        u63.S(jArr, jArr5);
        u63.j(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        u63.Q(jArr2, jArr3, jArr6);
        u63.j(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        u63.h0(jArr4, jArr7);
        return new cxd(jArr7);
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

    public cxd(long[] jArr) {
        this.d = jArr;
    }
}
