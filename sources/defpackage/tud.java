package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class tud extends ye4.b {
    public tud(rud rudVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(rudVar, ve4Var, ve4Var2);
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
        if (f()) {
            return ye4Var;
        }
        if (ye4Var.f()) {
            return this;
        }
        if (this == ye4Var) {
            return m();
        }
        sud sudVar = (sud) this.b;
        sud sudVar2 = (sud) this.c;
        sud sudVar3 = (sud) ye4Var.b;
        sud sudVar4 = (sud) ye4Var.d();
        sud sudVar5 = (sud) this.d[0];
        sud sudVar6 = (sud) ye4Var.e();
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[4];
        int[] iArr7 = new int[4];
        int[] iArr8 = new int[4];
        int[] iArr9 = sudVar5.d;
        boolean zB = h91.B(iArr9);
        if (zB) {
            iArr = sudVar3.d;
            iArr2 = sudVar4.d;
        } else {
            zkd.K(iArr9, iArr7);
            zkd.F(iArr7, sudVar3.d, iArr6);
            zkd.F(iArr7, iArr9, iArr7);
            zkd.F(iArr7, sudVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = sudVar6.d;
        boolean zB2 = h91.B(iArr10);
        if (zB2) {
            iArr3 = sudVar.d;
            iArr4 = sudVar2.d;
        } else {
            zkd.K(iArr10, iArr8);
            zkd.F(iArr8, sudVar.d, iArr5);
            zkd.F(iArr8, iArr10, iArr8);
            zkd.F(iArr8, sudVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[4];
        zkd.N(iArr3, iArr, iArr11);
        zkd.N(iArr4, iArr2, iArr6);
        boolean zD = h91.D(iArr11);
        ue4 ue4Var = this.a;
        if (zD) {
            return h91.D(iArr6) ? m() : ue4Var.i();
        }
        zkd.K(iArr11, iArr7);
        int[] iArr12 = new int[4];
        zkd.F(iArr7, iArr11, iArr12);
        zkd.F(iArr7, iArr3, iArr7);
        if (h91.D(iArr12)) {
            iArr12[0] = 0;
            iArr12[1] = 0;
            iArr12[2] = 0;
            iArr12[3] = 0;
        } else {
            h91.O(zkd.X, iArr12, iArr12);
        }
        h91.H(iArr4, iArr12, iArr5);
        zkd.H(h91.n(iArr7, iArr7, iArr12), iArr12);
        sud sudVar7 = new sud(iArr8);
        zkd.K(iArr6, iArr8);
        zkd.N(iArr8, iArr12, iArr8);
        sud sudVar8 = new sud(iArr12);
        zkd.N(iArr7, iArr8, iArr12);
        long j = ((long) iArr6[0]) & 4294967295L;
        long j2 = ((long) iArr6[1]) & 4294967295L;
        long j3 = ((long) iArr6[2]) & 4294967295L;
        long j4 = ((long) iArr6[3]) & 4294967295L;
        int i = 0;
        long j5 = 0;
        while (i < 4) {
            long j6 = j2;
            long j7 = ((long) iArr12[i]) & 4294967295L;
            long j8 = (j7 * j) + (((long) iArr5[i]) & 4294967295L);
            iArr5[i] = (int) j8;
            int i2 = i + 1;
            long j9 = (j7 * j6) + (((long) iArr5[i2]) & 4294967295L) + (j8 >>> 32);
            iArr5[i2] = (int) j9;
            int i3 = i + 2;
            long j10 = (j7 * j3) + (((long) iArr5[i3]) & 4294967295L) + (j9 >>> 32);
            iArr5[i3] = (int) j10;
            int i4 = i + 3;
            long j11 = (j7 * j4) + (((long) iArr5[i4]) & 4294967295L) + (j10 >>> 32);
            iArr5[i4] = (int) j11;
            int i5 = i + 4;
            long j12 = j5 + (((long) iArr5[i5]) & 4294967295L) + (j11 >>> 32);
            iArr5[i5] = (int) j12;
            j5 = j12 >>> 32;
            i = i2;
            j2 = j6;
        }
        if (((int) j5) != 0 || ((iArr5[7] >>> 1) >= 2147483646 && ka6.q0(iArr5, zkd.Y))) {
            ka6.O(8, zkd.Z, iArr5);
        }
        zkd.G(iArr5, sudVar8.d);
        sud sudVar9 = new sud(iArr11);
        if (!zB) {
            zkd.F(iArr11, iArr9, iArr11);
        }
        if (!zB2) {
            zkd.F(iArr11, iArr10, iArr11);
        }
        return new tud(ue4Var, sudVar7, sudVar8, new ve4[]{sudVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new tud(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        int[] iArr;
        if (f()) {
            return this;
        }
        int[] iArr2 = ((sud) this.c).d;
        boolean zD = h91.D(iArr2);
        ue4 ue4Var = this.a;
        if (zD) {
            return ue4Var.i();
        }
        sud sudVar = (sud) this.b;
        sud sudVar2 = (sud) this.d[0];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[4];
        zkd.K(iArr2, iArr5);
        int[] iArr6 = new int[4];
        zkd.K(iArr5, iArr6);
        int[] iArr7 = sudVar2.d;
        boolean zB = h91.B(iArr7);
        if (zB) {
            iArr = iArr7;
        } else {
            zkd.K(iArr7, iArr4);
            iArr = iArr4;
        }
        int[] iArr8 = sudVar.d;
        zkd.N(iArr8, iArr, iArr3);
        zkd.r(iArr8, iArr, iArr4);
        zkd.F(iArr4, iArr3, iArr4);
        zkd.H(h91.n(iArr4, iArr4, iArr4), iArr4);
        zkd.F(iArr5, iArr8, iArr5);
        zkd.H(ka6.c1(4, iArr5), iArr5);
        zkd.H(ka6.d1(4, iArr6, iArr3), iArr3);
        sud sudVar3 = new sud(iArr6);
        zkd.K(iArr4, iArr6);
        zkd.N(iArr6, iArr5, iArr6);
        zkd.N(iArr6, iArr5, iArr6);
        sud sudVar4 = new sud(iArr5);
        zkd.N(iArr5, iArr6, iArr5);
        zkd.F(iArr5, iArr4, iArr5);
        zkd.N(iArr5, iArr3, iArr5);
        sud sudVar5 = new sud(iArr4);
        if (ka6.b1(4, 0, iArr2, iArr4) != 0 || ((iArr4[3] >>> 1) >= 2147483646 && h91.y(iArr4, zkd.X))) {
            zkd.s(iArr4);
        }
        if (!zB) {
            zkd.F(iArr4, iArr7, iArr4);
        }
        return new tud(ue4Var, sudVar3, sudVar4, new ve4[]{sudVar5}, this.e);
    }

    public tud(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
