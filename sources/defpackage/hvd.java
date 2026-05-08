package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class hvd extends ye4.b {
    public hvd(fvd fvdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(fvdVar, ve4Var, ve4Var2);
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
        gvd gvdVar = (gvd) this.b;
        gvd gvdVar2 = (gvd) this.c;
        gvd gvdVar3 = (gvd) ye4Var.b;
        gvd gvdVar4 = (gvd) ye4Var.d();
        gvd gvdVar5 = (gvd) this.d[0];
        gvd gvdVar6 = (gvd) ye4Var.e();
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        int[] iArr9 = gvdVar5.d;
        boolean zD0 = v1.d0(iArr9);
        if (zD0) {
            iArr = gvdVar3.d;
            iArr2 = gvdVar4.d;
        } else {
            pg8.N(iArr9, iArr7);
            pg8.C(iArr7, gvdVar3.d, iArr6);
            pg8.C(iArr7, iArr9, iArr7);
            pg8.C(iArr7, gvdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = gvdVar6.d;
        boolean zD02 = v1.d0(iArr10);
        if (zD02) {
            iArr3 = gvdVar.d;
            iArr4 = gvdVar2.d;
        } else {
            pg8.N(iArr10, iArr8);
            pg8.C(iArr8, gvdVar.d, iArr5);
            pg8.C(iArr8, iArr10, iArr8);
            pg8.C(iArr8, gvdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[6];
        pg8.R(iArr3, iArr, iArr11);
        pg8.R(iArr4, iArr2, iArr6);
        boolean zE0 = v1.e0(iArr11);
        ue4 ue4Var = this.a;
        if (zE0) {
            return v1.e0(iArr6) ? m() : ue4Var.i();
        }
        pg8.N(iArr11, iArr7);
        int[] iArr12 = new int[6];
        pg8.C(iArr7, iArr11, iArr12);
        pg8.C(iArr7, iArr3, iArr7);
        if (v1.e0(iArr12)) {
            iArr12[0] = 0;
            iArr12[1] = 0;
            iArr12[2] = 0;
            iArr12[3] = 0;
            iArr12[4] = 0;
            iArr12[5] = 0;
        } else {
            v1.q0(pg8.v0, iArr12, iArr12);
        }
        v1.g0(iArr4, iArr12, iArr5);
        pg8.K(v1.J(iArr7, iArr7, iArr12), iArr12);
        gvd gvdVar7 = new gvd(iArr8);
        pg8.N(iArr6, iArr8);
        pg8.R(iArr8, iArr12, iArr8);
        gvd gvdVar8 = new gvd(iArr12);
        pg8.R(iArr7, iArr8, iArr12);
        if ((v1.i0(iArr12, iArr6, iArr5) != 0 || (iArr5[11] == -1 && ka6.o0(12, iArr5, pg8.w0))) && ka6.O(9, pg8.x0, iArr5) != 0) {
            ka6.t0(12, 9, iArr5);
        }
        pg8.J(iArr5, iArr12);
        gvd gvdVar9 = new gvd(iArr11);
        if (!zD0) {
            pg8.C(iArr11, iArr9, iArr11);
        }
        if (!zD02) {
            pg8.C(iArr11, iArr10, iArr11);
        }
        return new hvd(ue4Var, gvdVar7, gvdVar8, new ve4[]{gvdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new hvd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        int[] iArr;
        int[] iArr2 = pg8.v0;
        if (f()) {
            return this;
        }
        int[] iArr3 = ((gvd) this.c).d;
        boolean zE0 = v1.e0(iArr3);
        ue4 ue4Var = this.a;
        if (zE0) {
            return ue4Var.i();
        }
        gvd gvdVar = (gvd) this.b;
        gvd gvdVar2 = (gvd) this.d[0];
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        int[] iArr6 = new int[6];
        pg8.N(iArr3, iArr6);
        int[] iArr7 = new int[6];
        pg8.N(iArr6, iArr7);
        int[] iArr8 = gvdVar2.d;
        boolean zD0 = v1.d0(iArr8);
        if (zD0) {
            iArr = iArr8;
        } else {
            pg8.N(iArr8, iArr5);
            iArr = iArr5;
        }
        int[] iArr9 = gvdVar.d;
        pg8.R(iArr9, iArr, iArr4);
        if (v1.I(iArr9, iArr, iArr5) != 0 || (iArr5[5] == -1 && v1.c0(iArr5, iArr2))) {
            pg8.j(iArr5);
        }
        pg8.C(iArr5, iArr4, iArr5);
        pg8.K(v1.J(iArr5, iArr5, iArr5), iArr5);
        pg8.C(iArr6, iArr9, iArr6);
        pg8.K(ka6.c1(6, iArr6), iArr6);
        pg8.K(ka6.d1(6, iArr7, iArr4), iArr4);
        gvd gvdVar3 = new gvd(iArr7);
        pg8.N(iArr5, iArr7);
        pg8.R(iArr7, iArr6, iArr7);
        pg8.R(iArr7, iArr6, iArr7);
        gvd gvdVar4 = new gvd(iArr6);
        pg8.R(iArr6, iArr7, iArr6);
        pg8.C(iArr6, iArr5, iArr6);
        pg8.R(iArr6, iArr4, iArr6);
        gvd gvdVar5 = new gvd(iArr5);
        if (ka6.b1(6, 0, iArr3, iArr5) != 0 || (iArr5[5] == -1 && v1.c0(iArr5, iArr2))) {
            pg8.j(iArr5);
        }
        if (!zD0) {
            pg8.C(iArr5, iArr8, iArr5);
        }
        return new hvd(ue4Var, gvdVar3, gvdVar4, new ve4[]{gvdVar5}, this.e);
    }

    public hvd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
