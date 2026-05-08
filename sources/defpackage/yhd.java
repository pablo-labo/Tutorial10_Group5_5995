package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class yhd extends ye4.b {
    public yhd(whd whdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(whdVar, ve4Var, ve4Var2);
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
        xhd xhdVar = (xhd) this.b;
        xhd xhdVar2 = (xhd) this.c;
        xhd xhdVar3 = (xhd) ye4Var.b;
        xhd xhdVar4 = (xhd) ye4Var.d();
        xhd xhdVar5 = (xhd) this.d[0];
        xhd xhdVar6 = (xhd) ye4Var.e();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = xhdVar5.d;
        boolean zZ0 = ka6.z0(iArr9);
        if (zZ0) {
            iArr = xhdVar3.d;
            iArr2 = xhdVar4.d;
        } else {
            hh2.H(iArr9, iArr7);
            hh2.x(iArr7, xhdVar3.d, iArr6);
            hh2.x(iArr7, iArr9, iArr7);
            hh2.x(iArr7, xhdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = xhdVar6.d;
        boolean zZ02 = ka6.z0(iArr10);
        if (zZ02) {
            iArr3 = xhdVar.d;
            iArr4 = xhdVar2.d;
        } else {
            hh2.H(iArr10, iArr8);
            hh2.x(iArr8, xhdVar.d, iArr5);
            hh2.x(iArr8, iArr10, iArr8);
            hh2.x(iArr8, xhdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[8];
        hh2.K(iArr3, iArr, iArr11);
        hh2.K(iArr4, iArr2, iArr6);
        boolean zD0 = ka6.D0(iArr11);
        ue4 ue4Var = this.a;
        if (zD0) {
            return ka6.D0(iArr6) ? m() : ue4Var.i();
        }
        hh2.H(iArr11, iArr7);
        int[] iArr12 = new int[8];
        hh2.x(iArr7, iArr11, iArr12);
        hh2.x(iArr7, iArr3, iArr7);
        if (ka6.D0(iArr12)) {
            ka6.z1(iArr12);
        } else {
            ka6.o1(hh2.W, iArr12, iArr12);
        }
        ka6.H0(iArr4, iArr12, iArr5);
        hh2.D(ka6.L(iArr7, iArr7, iArr12), iArr12);
        xhd xhdVar7 = new xhd(iArr8);
        hh2.H(iArr6, iArr8);
        hh2.K(iArr8, iArr12, iArr8);
        xhd xhdVar8 = new xhd(iArr12);
        hh2.K(iArr7, iArr8, iArr12);
        int[] iArr13 = hh2.X;
        if (ka6.J0(iArr12, iArr6, iArr5) != 0 || ((iArr5[15] >>> 1) >= Integer.MAX_VALUE && ka6.o0(16, iArr5, iArr13))) {
            ka6.r1(16, iArr13, iArr5);
        }
        hh2.C(iArr5, iArr12);
        xhd xhdVar9 = new xhd(iArr11);
        if (!zZ0) {
            hh2.x(iArr11, iArr9, iArr11);
        }
        if (!zZ02) {
            hh2.x(iArr11, iArr10, iArr11);
        }
        return new yhd(ue4Var, xhdVar7, xhdVar8, new ve4[]{xhdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new yhd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        int[] iArr;
        if (f()) {
            return this;
        }
        int[] iArr2 = ((xhd) this.c).d;
        boolean zD0 = ka6.D0(iArr2);
        ue4 ue4Var = this.a;
        if (zD0) {
            return ue4Var.i();
        }
        xhd xhdVar = (xhd) this.b;
        xhd xhdVar2 = (xhd) this.d[0];
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[8];
        hh2.H(iArr2, iArr5);
        int[] iArr6 = new int[8];
        hh2.H(iArr5, iArr6);
        int[] iArr7 = xhdVar2.d;
        boolean zZ0 = ka6.z0(iArr7);
        if (zZ0) {
            iArr = iArr7;
        } else {
            hh2.H(iArr7, iArr4);
            iArr = iArr4;
        }
        int[] iArr8 = xhdVar.d;
        hh2.K(iArr8, iArr, iArr3);
        hh2.f(iArr8, iArr, iArr4);
        hh2.x(iArr4, iArr3, iArr4);
        hh2.D(ka6.L(iArr4, iArr4, iArr4), iArr4);
        hh2.x(iArr5, iArr8, iArr5);
        hh2.D(ka6.c1(8, iArr5), iArr5);
        hh2.D(ka6.d1(8, iArr6, iArr3), iArr3);
        xhd xhdVar3 = new xhd(iArr6);
        hh2.H(iArr4, iArr6);
        hh2.K(iArr6, iArr5, iArr6);
        hh2.K(iArr6, iArr5, iArr6);
        xhd xhdVar4 = new xhd(iArr5);
        hh2.K(iArr5, iArr6, iArr5);
        hh2.x(iArr5, iArr4, iArr5);
        hh2.K(iArr5, iArr3, iArr5);
        xhd xhdVar5 = new xhd(iArr4);
        if (ka6.b1(8, 0, iArr2, iArr4) != 0 || ((iArr4[7] >>> 1) >= Integer.MAX_VALUE && ka6.q0(iArr4, hh2.W))) {
            hh2.g(iArr4);
        }
        if (!zZ0) {
            hh2.x(iArr4, iArr7, iArr4);
        }
        return new yhd(ue4Var, xhdVar3, xhdVar4, new ve4[]{xhdVar5}, this.e);
    }

    public yhd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
