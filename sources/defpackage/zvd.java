package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class zvd extends ye4.b {
    public zvd(xvd xvdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(xvdVar, ve4Var, ve4Var2);
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
        yvd yvdVar = (yvd) this.b;
        yvd yvdVar2 = (yvd) this.c;
        yvd yvdVar3 = (yvd) ye4Var.b;
        yvd yvdVar4 = (yvd) ye4Var.d();
        yvd yvdVar5 = (yvd) this.d[0];
        yvd yvdVar6 = (yvd) ye4Var.e();
        int[] iArr5 = new int[17];
        int[] iArr6 = new int[17];
        int[] iArr7 = new int[17];
        int[] iArr8 = new int[17];
        boolean zG = yvdVar5.g();
        int[] iArr9 = yvdVar5.d;
        if (zG) {
            iArr = yvdVar3.d;
            iArr2 = yvdVar4.d;
        } else {
            hh1.V(iArr9, iArr7);
            hh1.K(iArr7, yvdVar3.d, iArr6);
            hh1.K(iArr7, iArr9, iArr7);
            hh1.K(iArr7, yvdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zG2 = yvdVar6.g();
        int[] iArr10 = yvdVar6.d;
        if (zG2) {
            iArr3 = yvdVar.d;
            iArr4 = yvdVar2.d;
        } else {
            hh1.V(iArr10, iArr8);
            hh1.K(iArr8, yvdVar.d, iArr5);
            hh1.K(iArr8, iArr10, iArr8);
            hh1.K(iArr8, yvdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[17];
        hh1.W(iArr3, iArr, iArr11);
        hh1.W(iArr4, iArr2, iArr6);
        boolean zB0 = ka6.B0(17, iArr11);
        ue4 ue4Var = this.a;
        if (zB0) {
            return ka6.B0(17, iArr6) ? m() : ue4Var.i();
        }
        hh1.V(iArr11, iArr7);
        int[] iArr12 = new int[17];
        hh1.K(iArr7, iArr11, iArr12);
        hh1.K(iArr7, iArr3, iArr7);
        hh1.K(iArr4, iArr12, iArr5);
        yvd yvdVar7 = new yvd(iArr8);
        hh1.V(iArr6, iArr8);
        hh1.i(iArr8, iArr12, iArr8);
        hh1.W(iArr8, iArr7, iArr8);
        hh1.W(iArr8, iArr7, iArr8);
        yvd yvdVar8 = new yvd(iArr12);
        hh1.W(iArr7, iArr8, iArr12);
        hh1.K(iArr12, iArr6, iArr6);
        hh1.W(iArr6, iArr5, iArr12);
        yvd yvdVar9 = new yvd(iArr11);
        if (!zG) {
            hh1.K(iArr11, iArr9, iArr11);
        }
        if (!zG2) {
            hh1.K(iArr11, iArr10, iArr11);
        }
        return new zvd(ue4Var, yvdVar7, yvdVar8, new ve4[]{yvdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new zvd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        int[] iArr;
        if (f()) {
            return this;
        }
        yvd yvdVar = (yvd) this.c;
        boolean zH = yvdVar.h();
        int[] iArr2 = yvdVar.d;
        ue4 ue4Var = this.a;
        if (zH) {
            return ue4Var.i();
        }
        yvd yvdVar2 = (yvd) this.b;
        yvd yvdVar3 = (yvd) this.d[0];
        int[] iArr3 = new int[17];
        int[] iArr4 = new int[17];
        int[] iArr5 = new int[17];
        hh1.V(iArr2, iArr5);
        int[] iArr6 = new int[17];
        hh1.V(iArr5, iArr6);
        boolean zG = yvdVar3.g();
        int[] iArr7 = yvdVar3.d;
        if (zG) {
            iArr = iArr7;
        } else {
            hh1.V(iArr7, iArr4);
            iArr = iArr4;
        }
        int[] iArr8 = yvdVar2.d;
        hh1.W(iArr8, iArr, iArr3);
        hh1.i(iArr8, iArr, iArr4);
        hh1.K(iArr4, iArr3, iArr4);
        ka6.J(17, iArr4, iArr4, iArr4);
        hh1.Q(iArr4);
        hh1.K(iArr5, iArr8, iArr5);
        ka6.c1(17, iArr5);
        hh1.Q(iArr5);
        ka6.d1(17, iArr6, iArr3);
        hh1.Q(iArr3);
        yvd yvdVar4 = new yvd(iArr6);
        hh1.V(iArr4, iArr6);
        hh1.W(iArr6, iArr5, iArr6);
        hh1.W(iArr6, iArr5, iArr6);
        yvd yvdVar5 = new yvd(iArr5);
        hh1.W(iArr5, iArr6, iArr5);
        hh1.K(iArr5, iArr4, iArr5);
        hh1.W(iArr5, iArr3, iArr5);
        yvd yvdVar6 = new yvd(iArr4);
        int i = iArr2[16];
        iArr4[16] = (ka6.b1(16, i << 23, iArr2, iArr4) | (i << 1)) & 511;
        if (!zG) {
            hh1.K(iArr4, iArr7, iArr4);
        }
        return new zvd(ue4Var, yvdVar4, yvdVar5, new ve4[]{yvdVar6}, this.e);
    }

    public zvd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
