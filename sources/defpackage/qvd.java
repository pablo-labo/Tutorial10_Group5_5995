package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class qvd extends ye4.b {
    public qvd(ovd ovdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(ovdVar, ve4Var, ve4Var2);
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
        pvd pvdVar = (pvd) this.b;
        pvd pvdVar2 = (pvd) this.c;
        pvd pvdVar3 = (pvd) ye4Var.b;
        pvd pvdVar4 = (pvd) ye4Var.d();
        pvd pvdVar5 = (pvd) this.d[0];
        pvd pvdVar6 = (pvd) ye4Var.e();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = pvdVar5.d;
        boolean zZ0 = ka6.z0(iArr9);
        if (zZ0) {
            iArr = pvdVar3.d;
            iArr2 = pvdVar4.d;
        } else {
            ak2.G(iArr9, iArr7);
            ak2.v(iArr7, pvdVar3.d, iArr6);
            ak2.v(iArr7, iArr9, iArr7);
            ak2.v(iArr7, pvdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = pvdVar6.d;
        boolean zZ02 = ka6.z0(iArr10);
        if (zZ02) {
            iArr3 = pvdVar.d;
            iArr4 = pvdVar2.d;
        } else {
            ak2.G(iArr10, iArr8);
            ak2.v(iArr8, pvdVar.d, iArr5);
            ak2.v(iArr8, iArr10, iArr8);
            ak2.v(iArr8, pvdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[8];
        ak2.K(iArr3, iArr, iArr11);
        ak2.K(iArr4, iArr2, iArr6);
        boolean zD0 = ka6.D0(iArr11);
        ue4 ue4Var = this.a;
        if (zD0) {
            return ka6.D0(iArr6) ? m() : ue4Var.i();
        }
        ak2.G(iArr11, iArr7);
        int[] iArr12 = new int[8];
        ak2.v(iArr7, iArr11, iArr12);
        ak2.v(iArr7, iArr3, iArr7);
        if (ka6.D0(iArr12)) {
            ka6.z1(iArr12);
        } else {
            ka6.o1(ak2.X, iArr12, iArr12);
        }
        ka6.H0(iArr4, iArr12, iArr5);
        ak2.D(ka6.L(iArr7, iArr7, iArr12), iArr12);
        pvd pvdVar7 = new pvd(iArr8);
        ak2.G(iArr6, iArr8);
        ak2.K(iArr8, iArr12, iArr8);
        pvd pvdVar8 = new pvd(iArr12);
        ak2.K(iArr7, iArr8, iArr12);
        if ((ka6.J0(iArr12, iArr6, iArr5) != 0 || (iArr5[15] == -1 && ka6.o0(16, iArr5, ak2.Y))) && ka6.O(10, ak2.Z, iArr5) != 0) {
            ka6.t0(16, 10, iArr5);
        }
        ak2.C(iArr5, iArr12);
        pvd pvdVar9 = new pvd(iArr11);
        if (!zZ0) {
            ak2.v(iArr11, iArr9, iArr11);
        }
        if (!zZ02) {
            ak2.v(iArr11, iArr10, iArr11);
        }
        return new qvd(ue4Var, pvdVar7, pvdVar8, new ve4[]{pvdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new qvd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        if (f()) {
            return this;
        }
        int[] iArr = ((pvd) this.c).d;
        boolean zD0 = ka6.D0(iArr);
        ue4 ue4Var = this.a;
        if (zD0) {
            return ue4Var.i();
        }
        pvd pvdVar = (pvd) this.b;
        pvd pvdVar2 = (pvd) this.d[0];
        int[] iArr2 = new int[8];
        ak2.G(iArr, iArr2);
        int[] iArr3 = new int[8];
        ak2.G(iArr2, iArr3);
        int[] iArr4 = new int[8];
        ak2.G(pvdVar.d, iArr4);
        ak2.D(ka6.L(iArr4, iArr4, iArr4), iArr4);
        ak2.v(iArr2, pvdVar.d, iArr2);
        ak2.D(ka6.c1(8, iArr2), iArr2);
        int[] iArr5 = new int[8];
        ak2.D(ka6.d1(8, iArr3, iArr5), iArr5);
        pvd pvdVar3 = new pvd(iArr3);
        ak2.G(iArr4, iArr3);
        ak2.K(iArr3, iArr2, iArr3);
        ak2.K(iArr3, iArr2, iArr3);
        pvd pvdVar4 = new pvd(iArr2);
        ak2.K(iArr2, iArr3, iArr2);
        ak2.v(iArr2, iArr4, iArr2);
        ak2.K(iArr2, iArr5, iArr2);
        pvd pvdVar5 = new pvd(iArr4);
        if (ka6.b1(8, 0, iArr, iArr4) != 0 || (iArr4[7] == -1 && ka6.q0(iArr4, ak2.X))) {
            ka6.I(8, 977, iArr4);
        }
        if (!ka6.z0(pvdVar2.d)) {
            ak2.v(iArr4, pvdVar2.d, iArr4);
        }
        return new qvd(ue4Var, pvdVar3, pvdVar4, new ve4[]{pvdVar5}, this.e);
    }

    public qvd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
