package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class tvd extends ye4.b {
    public tvd(rvd rvdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(rvdVar, ve4Var, ve4Var2);
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
        svd svdVar = (svd) this.b;
        svd svdVar2 = (svd) this.c;
        svd svdVar3 = (svd) ye4Var.b;
        svd svdVar4 = (svd) ye4Var.d();
        svd svdVar5 = (svd) this.d[0];
        svd svdVar6 = (svd) ye4Var.e();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = svdVar5.d;
        boolean zZ0 = ka6.z0(iArr9);
        if (zZ0) {
            iArr = svdVar3.d;
            iArr2 = svdVar4.d;
        } else {
            ee3.w(iArr9, iArr7);
            ee3.s(iArr7, svdVar3.d, iArr6);
            ee3.s(iArr7, iArr9, iArr7);
            ee3.s(iArr7, svdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = svdVar6.d;
        boolean zZ02 = ka6.z0(iArr10);
        if (zZ02) {
            iArr3 = svdVar.d;
            iArr4 = svdVar2.d;
        } else {
            ee3.w(iArr10, iArr8);
            ee3.s(iArr8, svdVar.d, iArr5);
            ee3.s(iArr8, iArr10, iArr8);
            ee3.s(iArr8, svdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[8];
        ee3.y(iArr3, iArr, iArr11);
        ee3.y(iArr4, iArr2, iArr6);
        boolean zD0 = ka6.D0(iArr11);
        ue4 ue4Var = this.a;
        if (zD0) {
            return ka6.D0(iArr6) ? m() : ue4Var.i();
        }
        ee3.w(iArr11, iArr7);
        int[] iArr12 = new int[8];
        ee3.s(iArr7, iArr11, iArr12);
        ee3.s(iArr7, iArr3, iArr7);
        if (ka6.D0(iArr12)) {
            ka6.z1(iArr12);
        } else {
            ka6.o1(ee3.f, iArr12, iArr12);
        }
        ka6.H0(iArr4, iArr12, iArr5);
        ee3.u(ka6.L(iArr7, iArr7, iArr12), iArr12);
        svd svdVar7 = new svd(iArr8);
        ee3.w(iArr6, iArr8);
        ee3.y(iArr8, iArr12, iArr8);
        svd svdVar8 = new svd(iArr12);
        ee3.y(iArr7, iArr8, iArr12);
        int[] iArr13 = ee3.V;
        if (ka6.J0(iArr12, iArr6, iArr5) != 0 || ((iArr5[15] >>> 1) >= Integer.MAX_VALUE && ka6.o0(16, iArr5, iArr13))) {
            ka6.r1(16, iArr13, iArr5);
        }
        ee3.t(iArr5, iArr12);
        svd svdVar9 = new svd(iArr11);
        if (!zZ0) {
            ee3.s(iArr11, iArr9, iArr11);
        }
        if (!zZ02) {
            ee3.s(iArr11, iArr10, iArr11);
        }
        return new tvd(ue4Var, svdVar7, svdVar8, new ve4[]{svdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new tvd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        int[] iArr;
        int[] iArr2 = ee3.f;
        if (f()) {
            return this;
        }
        int[] iArr3 = ((svd) this.c).d;
        boolean zD0 = ka6.D0(iArr3);
        ue4 ue4Var = this.a;
        if (zD0) {
            return ue4Var.i();
        }
        svd svdVar = (svd) this.b;
        svd svdVar2 = (svd) this.d[0];
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[8];
        ee3.w(iArr3, iArr6);
        int[] iArr7 = new int[8];
        ee3.w(iArr6, iArr7);
        int[] iArr8 = svdVar2.d;
        boolean zZ0 = ka6.z0(iArr8);
        if (zZ0) {
            iArr = iArr8;
        } else {
            ee3.w(iArr8, iArr5);
            iArr = iArr5;
        }
        int[] iArr9 = svdVar.d;
        ee3.y(iArr9, iArr, iArr4);
        if (ka6.H(iArr9, iArr, iArr5) != 0 || (iArr5[7] == -1 && ka6.q0(iArr5, iArr2))) {
            ee3.h(iArr5);
        }
        ee3.s(iArr5, iArr4, iArr5);
        ee3.u(ka6.L(iArr5, iArr5, iArr5), iArr5);
        ee3.s(iArr6, iArr9, iArr6);
        ee3.u(ka6.c1(8, iArr6), iArr6);
        ee3.u(ka6.d1(8, iArr7, iArr4), iArr4);
        svd svdVar3 = new svd(iArr7);
        ee3.w(iArr5, iArr7);
        ee3.y(iArr7, iArr6, iArr7);
        ee3.y(iArr7, iArr6, iArr7);
        svd svdVar4 = new svd(iArr6);
        ee3.y(iArr6, iArr7, iArr6);
        ee3.s(iArr6, iArr5, iArr6);
        ee3.y(iArr6, iArr4, iArr6);
        svd svdVar5 = new svd(iArr5);
        if (ka6.b1(8, 0, iArr3, iArr5) != 0 || (iArr5[7] == -1 && ka6.q0(iArr5, iArr2))) {
            ee3.h(iArr5);
        }
        if (!zZ0) {
            ee3.s(iArr5, iArr8, iArr5);
        }
        return new tvd(ue4Var, svdVar3, svdVar4, new ve4[]{svdVar5}, this.e);
    }

    public tvd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
