package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class wvd extends ye4.b {
    public wvd(uvd uvdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(uvdVar, ve4Var, ve4Var2);
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
        vvd vvdVar = (vvd) this.b;
        vvd vvdVar2 = (vvd) this.c;
        vvd vvdVar3 = (vvd) ye4Var.b;
        vvd vvdVar4 = (vvd) ye4Var.d();
        vvd vvdVar5 = (vvd) this.d[0];
        vvd vvdVar6 = (vvd) ye4Var.e();
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[12];
        int[] iArr8 = new int[12];
        boolean zG = vvdVar5.g();
        int[] iArr9 = vvdVar5.d;
        if (zG) {
            iArr = vvdVar3.d;
            iArr2 = vvdVar4.d;
        } else {
            mh2.A(iArr9, iArr7);
            mh2.r(iArr7, vvdVar3.d, iArr6);
            mh2.r(iArr7, iArr9, iArr7);
            mh2.r(iArr7, vvdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zG2 = vvdVar6.g();
        int[] iArr10 = vvdVar6.d;
        if (zG2) {
            iArr3 = vvdVar.d;
            iArr4 = vvdVar2.d;
        } else {
            mh2.A(iArr10, iArr8);
            mh2.r(iArr8, vvdVar.d, iArr5);
            mh2.r(iArr8, iArr10, iArr8);
            mh2.r(iArr8, vvdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[12];
        mh2.C(iArr3, iArr, iArr11);
        int[] iArr12 = new int[12];
        mh2.C(iArr4, iArr2, iArr12);
        boolean zB0 = ka6.B0(12, iArr11);
        ue4 ue4Var = this.a;
        if (zB0) {
            return ka6.B0(12, iArr12) ? m() : ue4Var.i();
        }
        mh2.A(iArr11, iArr7);
        int[] iArr13 = new int[12];
        mh2.r(iArr7, iArr11, iArr13);
        mh2.r(iArr7, iArr3, iArr7);
        if (ka6.B0(12, iArr13)) {
            for (int i = 0; i < 12; i++) {
                iArr13[i] = 0;
            }
        } else {
            ka6.l1(12, mh2.c0, iArr13, iArr13);
        }
        v1.h0(iArr4, iArr13, iArr5);
        mh2.u(ka6.J(12, iArr7, iArr7, iArr13), iArr13);
        vvd vvdVar7 = new vvd(iArr8);
        mh2.A(iArr12, iArr8);
        mh2.C(iArr8, iArr13, iArr8);
        vvd vvdVar8 = new vvd(iArr13);
        mh2.C(iArr7, iArr8, iArr13);
        v1.h0(iArr13, iArr12, iArr6);
        if ((ka6.F(24, iArr5, iArr6, iArr5) != 0 || (iArr5[23] == -1 && ka6.o0(24, iArr5, mh2.d0))) && ka6.O(17, mh2.e0, iArr5) != 0) {
            ka6.t0(24, 17, iArr5);
        }
        mh2.t(iArr5, iArr13);
        vvd vvdVar9 = new vvd(iArr11);
        if (!zG) {
            mh2.r(iArr11, iArr9, iArr11);
        }
        if (!zG2) {
            mh2.r(iArr11, iArr10, iArr11);
        }
        return new wvd(ue4Var, vvdVar7, vvdVar8, new ve4[]{vvdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new wvd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        int[] iArr;
        int[] iArr2 = mh2.c0;
        if (f()) {
            return this;
        }
        vvd vvdVar = (vvd) this.c;
        boolean zH = vvdVar.h();
        int[] iArr3 = vvdVar.d;
        ue4 ue4Var = this.a;
        if (zH) {
            return ue4Var.i();
        }
        vvd vvdVar2 = (vvd) this.b;
        vvd vvdVar3 = (vvd) this.d[0];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[12];
        mh2.A(iArr3, iArr6);
        int[] iArr7 = new int[12];
        mh2.A(iArr6, iArr7);
        boolean zG = vvdVar3.g();
        int[] iArr8 = vvdVar3.d;
        if (zG) {
            iArr = iArr8;
        } else {
            mh2.A(iArr8, iArr5);
            iArr = iArr5;
        }
        int[] iArr9 = vvdVar2.d;
        mh2.C(iArr9, iArr, iArr4);
        if (ka6.F(12, iArr9, iArr, iArr5) != 0 || (iArr5[11] == -1 && ka6.o0(12, iArr5, iArr2))) {
            mh2.f(iArr5);
        }
        mh2.r(iArr5, iArr4, iArr5);
        mh2.u(ka6.J(12, iArr5, iArr5, iArr5), iArr5);
        mh2.r(iArr6, iArr9, iArr6);
        mh2.u(ka6.c1(12, iArr6), iArr6);
        mh2.u(ka6.d1(12, iArr7, iArr4), iArr4);
        vvd vvdVar4 = new vvd(iArr7);
        mh2.A(iArr5, iArr7);
        mh2.C(iArr7, iArr6, iArr7);
        mh2.C(iArr7, iArr6, iArr7);
        vvd vvdVar5 = new vvd(iArr6);
        mh2.C(iArr6, iArr7, iArr6);
        mh2.r(iArr6, iArr5, iArr6);
        mh2.C(iArr6, iArr4, iArr6);
        vvd vvdVar6 = new vvd(iArr5);
        if (ka6.b1(12, 0, iArr3, iArr5) != 0 || (iArr5[11] == -1 && ka6.o0(12, iArr5, iArr2))) {
            mh2.f(iArr5);
        }
        if (!zG) {
            mh2.r(iArr5, iArr8, iArr5);
        }
        return new wvd(ue4Var, vvdVar4, vvdVar5, new ve4[]{vvdVar6}, this.e);
    }

    public wvd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
