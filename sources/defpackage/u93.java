package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class u93 extends ye4.b {
    public u93(s93 s93Var, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(s93Var, ve4Var, ve4Var2);
        if ((ve4Var == null) == (ve4Var2 == null)) {
            this.e = z;
        } else {
            l5.q("Exactly one of the field elements is null");
            throw null;
        }
    }

    @Override // defpackage.ye4
    public final ye4 a(ye4 ye4Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        t93 t93Var;
        t93 t93Var2;
        boolean z;
        char c;
        long j;
        char c2;
        if (f()) {
            return ye4Var;
        }
        if (ye4Var.f()) {
            return this;
        }
        if (this == ye4Var) {
            return m();
        }
        t93 t93Var3 = (t93) this.b;
        t93 t93Var4 = (t93) this.c;
        t93 t93Var5 = (t93) this.d[0];
        t93 t93Var6 = (t93) ye4Var.b;
        t93 t93Var7 = (t93) ye4Var.d();
        t93 t93Var8 = (t93) ye4Var.e();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = t93Var5.d;
        boolean zZ0 = ka6.z0(iArr9);
        if (zZ0) {
            iArr = t93Var6.d;
            iArr2 = t93Var7.d;
        } else {
            pyd.R(iArr9, iArr7);
            pyd.G(iArr7, t93Var6.d, iArr6);
            pyd.G(iArr7, iArr9, iArr7);
            pyd.G(iArr7, t93Var7.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = t93Var8.d;
        boolean zZ02 = ka6.z0(iArr10);
        if (zZ02) {
            iArr3 = t93Var3.d;
            iArr4 = t93Var4.d;
        } else {
            pyd.R(iArr10, iArr8);
            pyd.G(iArr8, t93Var3.d, iArr5);
            pyd.G(iArr8, iArr10, iArr8);
            pyd.G(iArr8, t93Var4.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[8];
        pyd.X(iArr3, iArr, iArr11);
        pyd.X(iArr4, iArr2, iArr6);
        boolean zD0 = ka6.D0(iArr11);
        ue4 ue4Var = this.a;
        if (zD0) {
            return ka6.D0(iArr6) ? m() : ue4Var.i();
        }
        int[] iArr12 = new int[8];
        pyd.R(iArr11, iArr12);
        int[] iArr13 = new int[8];
        pyd.G(iArr12, iArr11, iArr13);
        pyd.G(iArr12, iArr3, iArr7);
        if (ka6.D0(iArr13)) {
            ka6.z1(iArr13);
        } else {
            ka6.o1(pyd.V, iArr13, iArr13);
        }
        ka6.H0(iArr4, iArr13, iArr5);
        pyd.O(ka6.L(iArr7, iArr7, iArr13), iArr13);
        t93 t93Var9 = new t93(iArr8);
        pyd.R(iArr6, iArr8);
        pyd.X(iArr8, iArr13, iArr8);
        t93 t93Var10 = new t93(iArr13);
        pyd.X(iArr7, iArr8, iArr13);
        ka6.J0(iArr13, iArr6, iArr5);
        int[] iArr14 = pyd.W;
        if (ka6.o0(16, iArr5, iArr14)) {
            z = zZ0;
            long j2 = (((long) iArr5[0]) & 4294967295L) - (((long) iArr14[0]) & 4294967295L);
            iArr5[0] = (int) j2;
            long jU = j2 >> 32;
            if (jU != 0) {
                c = ' ';
                j = 0;
                c2 = '\b';
                jU = ka6.U(8, 1, iArr5);
            } else {
                c = ' ';
                j = 0;
                c2 = '\b';
            }
            long j3 = (((long) iArr5[c2]) & 4294967295L) + 19 + jU;
            iArr5[c2] = (int) j3;
            long jT0 = j3 >> c;
            if (jT0 != j) {
                jT0 = ka6.t0(15, 9, iArr5);
            }
            t93Var = t93Var9;
            t93Var2 = t93Var10;
            iArr5[15] = (int) (((((long) iArr5[15]) & 4294967295L) - (((long) (iArr14[15] + 1)) & 4294967295L)) + jT0);
        } else {
            t93Var = t93Var9;
            t93Var2 = t93Var10;
            z = zZ0;
        }
        pyd.M(iArr5, iArr13);
        t93 t93Var11 = new t93(iArr11);
        if (!z) {
            pyd.G(iArr11, iArr9, iArr11);
        }
        if (!zZ02) {
            pyd.G(iArr11, iArr10, iArr11);
        }
        if (!z || !zZ02) {
            iArr12 = null;
        }
        return new u93(ue4Var, t93Var, t93Var2, new ve4[]{t93Var11, n(t93Var11, iArr12)}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new u93(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        if (f()) {
            return this;
        }
        ve4 ve4Var = this.c;
        if (ve4Var.h()) {
            return this.a.i();
        }
        t93 t93Var = (t93) this.b;
        int[] iArr = ((t93) ve4Var).d;
        ve4[] ve4VarArr = this.d;
        ve4 ve4Var2 = ve4VarArr[0];
        t93 t93Var2 = (t93) ve4Var2;
        t93 t93VarN = (t93) ve4VarArr[1];
        if (t93VarN == null) {
            t93VarN = n((t93) ve4Var2, null);
            ve4VarArr[1] = t93VarN;
        }
        int[] iArr2 = {(int) j, (int) j, (int) j, (int) j, (int) j, (int) j, (int) j, (int) j};
        pyd.R(t93Var.d, iArr2);
        int iL = ka6.L(iArr2, iArr2, iArr2);
        int[] iArr3 = t93VarN.d;
        long j = (((long) iArr3[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        long j2 = (((long) iArr3[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        t93 t93Var3 = t93VarN;
        long j3 = (((long) iArr3[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        long j4 = (((long) iArr3[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        long j5 = (((long) iArr3[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        long j6 = (((long) iArr3[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        long j7 = (((long) iArr3[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        long j8 = (((long) iArr3[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j7 >>> 32);
        pyd.O(iL + ((int) (j8 >>> 32)), iArr2);
        int[] iArr4 = new int[8];
        pyd.a0(iArr, iArr4);
        int[] iArr5 = new int[8];
        pyd.G(iArr4, iArr, iArr5);
        int[] iArr6 = new int[8];
        pyd.G(iArr5, t93Var.d, iArr6);
        pyd.a0(iArr6, iArr6);
        int[] iArr7 = new int[8];
        pyd.R(iArr5, iArr7);
        pyd.a0(iArr7, iArr7);
        t93 t93Var4 = new t93(iArr5);
        pyd.R(iArr2, iArr5);
        pyd.X(iArr5, iArr6, iArr5);
        pyd.X(iArr5, iArr6, iArr5);
        t93 t93Var5 = new t93(iArr6);
        pyd.X(iArr6, iArr5, iArr6);
        pyd.G(iArr6, iArr2, iArr6);
        pyd.X(iArr6, iArr7, iArr6);
        t93 t93Var6 = new t93(iArr4);
        if (!ka6.z0(t93Var2.d)) {
            pyd.G(iArr4, t93Var2.d, iArr4);
        }
        t93 t93Var7 = new t93(iArr7);
        pyd.G(iArr7, t93Var3.d, iArr7);
        pyd.a0(iArr7, iArr7);
        return new u93(this.a, t93Var4, t93Var5, new ve4[]{t93Var6, t93Var7}, this.e);
    }

    public final t93 n(t93 t93Var, int[] iArr) {
        t93 t93Var2 = (t93) this.a.b;
        if (ka6.z0(t93Var.d)) {
            return t93Var2;
        }
        t93 t93Var3 = new t93();
        if (iArr == null) {
            iArr = t93Var3.d;
            pyd.R(t93Var.d, iArr);
        }
        pyd.R(iArr, t93Var3.d);
        int[] iArr2 = t93Var3.d;
        pyd.G(iArr2, t93Var2.d, iArr2);
        return t93Var3;
    }

    public u93(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
