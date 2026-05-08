package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class mvd extends ve4 {
    public static final BigInteger e = lvd.h;
    public int[] d;

    public mvd() {
        this.d = new int[7];
    }

    @Override // defpackage.ve4
    public final ve4 a(ve4 ve4Var) {
        int[] iArr = new int[7];
        jh2.g(this.d, ((mvd) ve4Var).d, iArr);
        return new mvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 b() {
        int[] iArr = new int[7];
        if (ka6.r0(7, this.d, iArr) != 0 || (iArr[6] == -1 && h91.z(iArr, jh2.W))) {
            jh2.h(iArr);
        }
        return new mvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 d(ve4 ve4Var) {
        int[] iArr = new int[7];
        ka6.w0(jh2.W, ((mvd) ve4Var).d, iArr);
        jh2.z(iArr, this.d, iArr);
        return new mvd(iArr);
    }

    @Override // defpackage.ve4
    public final int e() {
        return e.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvd) {
            return h91.u(this.d, ((mvd) obj).d);
        }
        return false;
    }

    @Override // defpackage.ve4
    public final ve4 f() {
        int[] iArr = new int[7];
        ka6.w0(jh2.W, this.d, iArr);
        return new mvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean g() {
        return h91.C(this.d);
    }

    @Override // defpackage.ve4
    public final boolean h() {
        return h91.E(this.d);
    }

    public final int hashCode() {
        return st0.c(7, this.d) ^ e.hashCode();
    }

    @Override // defpackage.ve4
    public final ve4 i(ve4 ve4Var) {
        int[] iArr = new int[7];
        jh2.z(this.d, ((mvd) ve4Var).d, iArr);
        return new mvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 l() {
        int[] iArr = new int[7];
        int[] iArr2 = this.d;
        if (h91.E(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            iArr[6] = 0;
        } else {
            h91.P(jh2.W, iArr2, iArr);
        }
        return new mvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 m() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = jh2.W;
        int[] iArr4 = this.d;
        if (h91.E(iArr4) || h91.C(iArr4)) {
            return this;
        }
        int[] iArr5 = new int[7];
        char c = 6;
        if (h91.E(iArr4)) {
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr5[2] = 0;
            iArr5[3] = 0;
            iArr5[4] = 0;
            iArr5[5] = 0;
            iArr5[6] = 0;
        } else {
            h91.P(iArr3, iArr4, iArr5);
        }
        Random random = new Random();
        int[] iArr6 = new int[7];
        int i = iArr3[6];
        int i2 = i | (i >>> 1);
        int i3 = i2 | (i2 >>> 2);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        int i6 = (i5 >>> 16) | i5;
        do {
            for (int i7 = 0; i7 != 7; i7++) {
                iArr6[i7] = random.nextInt();
            }
            iArr6[6] = iArr6[6] & i6;
        } while (ka6.o0(7, iArr6, iArr3));
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[7];
        h91.s(iArr4, iArr8);
        for (int i8 = 0; i8 < 7; i8++) {
            h91.s(iArr8, iArr9);
            int i9 = 1 << i8;
            int[] iArr10 = new int[14];
            h91.N(iArr8, iArr10);
            jh2.B(iArr10, iArr8);
            while (true) {
                i9--;
                if (i9 > 0) {
                    h91.N(iArr8, iArr10);
                    jh2.B(iArr10, iArr8);
                }
            }
            jh2.z(iArr8, iArr9, iArr8);
        }
        int[] iArr11 = new int[14];
        h91.N(iArr8, iArr11);
        jh2.B(iArr11, iArr8);
        int i10 = 95;
        while (true) {
            i10--;
            if (i10 <= 0) {
                break;
            }
            h91.N(iArr8, iArr11);
            jh2.B(iArr11, iArr8);
        }
        if (!h91.C(iArr8)) {
            return null;
        }
        loop5: while (true) {
            int[] iArr12 = new int[7];
            h91.s(iArr6, iArr12);
            int[] iArr13 = new int[7];
            iArr13[0] = 1;
            int[] iArr14 = new int[7];
            h91.s(iArr5, iArr14);
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            for (int i11 = 0; i11 < 7; i11++) {
                h91.s(iArr12, iArr15);
                h91.s(iArr13, iArr16);
                int i12 = 1 << i11;
                while (true) {
                    i12--;
                    if (i12 >= 0) {
                        jh2.z(iArr13, iArr12, iArr13);
                        jh2.M(iArr13, iArr13);
                        jh2.F(iArr12, iArr7);
                        jh2.g(iArr14, iArr7, iArr12);
                        jh2.z(iArr14, iArr7, iArr14);
                        jh2.C(ka6.c1(7, iArr14), iArr14);
                        c = c;
                    }
                }
                jh2.z(iArr13, iArr16, iArr7);
                jh2.z(iArr7, iArr5, iArr7);
                jh2.z(iArr12, iArr15, iArr14);
                jh2.g(iArr14, iArr7, iArr14);
                jh2.z(iArr12, iArr16, iArr7);
                h91.s(iArr14, iArr12);
                jh2.z(iArr13, iArr15, iArr13);
                jh2.g(iArr13, iArr7, iArr13);
                jh2.F(iArr13, iArr14);
                jh2.z(iArr14, iArr5, iArr14);
            }
            char c2 = c;
            iArr = new int[7];
            iArr2 = new int[7];
            for (int i13 = 1; i13 < 96; i13++) {
                h91.s(iArr12, iArr);
                h91.s(iArr13, iArr2);
                jh2.z(iArr13, iArr12, iArr13);
                jh2.M(iArr13, iArr13);
                jh2.F(iArr12, iArr7);
                jh2.g(iArr14, iArr7, iArr12);
                jh2.z(iArr14, iArr7, iArr14);
                jh2.C(ka6.c1(7, iArr14), iArr14);
                if (h91.E(iArr12)) {
                    break loop5;
                }
            }
            if (ka6.r0(7, iArr6, iArr6) != 0 || (iArr6[c2] == -1 && h91.z(iArr6, iArr3))) {
                jh2.h(iArr6);
            }
            c = c2;
        }
        ka6.w0(iArr3, iArr2, iArr7);
        jh2.z(iArr7, iArr, iArr7);
        jh2.F(iArr7, iArr6);
        if (h91.u(iArr4, iArr6)) {
            return new mvd(iArr7);
        }
        return null;
    }

    @Override // defpackage.ve4
    public final ve4 n() {
        int[] iArr = new int[7];
        jh2.F(this.d, iArr);
        return new mvd(iArr);
    }

    @Override // defpackage.ve4
    public final ve4 p(ve4 ve4Var) {
        int[] iArr = new int[7];
        jh2.G(this.d, ((mvd) ve4Var).d, iArr);
        return new mvd(iArr);
    }

    @Override // defpackage.ve4
    public final boolean q() {
        return h91.w(this.d) == 1;
    }

    @Override // defpackage.ve4
    public final BigInteger r() {
        return h91.Q(this.d);
    }

    public mvd(int[] iArr) {
        this.d = iArr;
    }
}
