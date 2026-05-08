package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class yud extends ye4.b {
    public yud(wud wudVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(wudVar, ve4Var, ve4Var2);
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
        xud xudVar = (xud) this.b;
        xud xudVar2 = (xud) this.c;
        xud xudVar3 = (xud) ye4Var.b;
        xud xudVar4 = (xud) ye4Var.d();
        xud xudVar5 = (xud) this.d[0];
        xud xudVar6 = (xud) ye4Var.e();
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        int[] iArr9 = xudVar5.d;
        boolean zY0 = ka6.y0(iArr9);
        if (zY0) {
            iArr = xudVar3.d;
            iArr2 = xudVar4.d;
        } else {
            ypd.T(iArr9, iArr7);
            ypd.G(iArr7, xudVar3.d, iArr6);
            ypd.G(iArr7, iArr9, iArr7);
            ypd.G(iArr7, xudVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = xudVar6.d;
        boolean zY02 = ka6.y0(iArr10);
        if (zY02) {
            iArr3 = xudVar.d;
            iArr4 = xudVar2.d;
        } else {
            ypd.T(iArr10, iArr8);
            ypd.G(iArr8, xudVar.d, iArr5);
            ypd.G(iArr8, iArr10, iArr8);
            ypd.G(iArr8, xudVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[5];
        ypd.V(iArr3, iArr, iArr11);
        ypd.V(iArr4, iArr2, iArr6);
        boolean zC0 = ka6.C0(iArr11);
        ue4 ue4Var = this.a;
        if (zC0) {
            return ka6.C0(iArr6) ? m() : ue4Var.i();
        }
        ypd.T(iArr11, iArr7);
        int[] iArr12 = new int[5];
        ypd.G(iArr7, iArr11, iArr12);
        ypd.G(iArr7, iArr3, iArr7);
        if (ka6.C0(iArr12)) {
            iArr12[0] = 0;
            iArr12[1] = 0;
            iArr12[2] = 0;
            iArr12[3] = 0;
            iArr12[4] = 0;
        } else {
            ka6.m1(ypd.W, iArr12, iArr12);
        }
        ka6.G0(iArr4, iArr12, iArr5);
        ypd.K(ka6.K(iArr7, iArr7, iArr12), iArr12);
        xud xudVar7 = new xud(iArr8);
        ypd.T(iArr6, iArr8);
        ypd.V(iArr8, iArr12, iArr8);
        xud xudVar8 = new xud(iArr12);
        ypd.V(iArr7, iArr8, iArr12);
        if ((ka6.I0(iArr12, iArr6, iArr5) != 0 || (iArr5[9] == -1 && ka6.o0(10, iArr5, ypd.X))) && ka6.O(7, ypd.Y, iArr5) != 0) {
            ka6.t0(10, 7, iArr5);
        }
        ypd.J(iArr5, iArr12);
        xud xudVar9 = new xud(iArr11);
        if (!zY0) {
            ypd.G(iArr11, iArr9, iArr11);
        }
        if (!zY02) {
            ypd.G(iArr11, iArr10, iArr11);
        }
        return new yud(ue4Var, xudVar7, xudVar8, new ve4[]{xudVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new yud(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        int[] iArr;
        int[] iArr2 = ypd.W;
        if (f()) {
            return this;
        }
        int[] iArr3 = ((xud) this.c).d;
        boolean zC0 = ka6.C0(iArr3);
        ue4 ue4Var = this.a;
        if (zC0) {
            return ue4Var.i();
        }
        xud xudVar = (xud) this.b;
        xud xudVar2 = (xud) this.d[0];
        int[] iArr4 = new int[5];
        int[] iArr5 = new int[5];
        int[] iArr6 = new int[5];
        ypd.T(iArr3, iArr6);
        int[] iArr7 = new int[5];
        ypd.T(iArr6, iArr7);
        int[] iArr8 = xudVar2.d;
        boolean zY0 = ka6.y0(iArr8);
        if (zY0) {
            iArr = iArr8;
        } else {
            ypd.T(iArr8, iArr5);
            iArr = iArr5;
        }
        int[] iArr9 = xudVar.d;
        ypd.V(iArr9, iArr, iArr4);
        if (ka6.G(iArr9, iArr, iArr5) != 0 || (iArr5[4] == -1 && ka6.p0(iArr5, iArr2))) {
            ka6.R(5, -2147483647, iArr5);
        }
        ypd.G(iArr5, iArr4, iArr5);
        ypd.K(ka6.K(iArr5, iArr5, iArr5), iArr5);
        ypd.G(iArr6, iArr9, iArr6);
        ypd.K(ka6.c1(5, iArr6), iArr6);
        ypd.K(ka6.d1(5, iArr7, iArr4), iArr4);
        xud xudVar3 = new xud(iArr7);
        ypd.T(iArr5, iArr7);
        ypd.V(iArr7, iArr6, iArr7);
        ypd.V(iArr7, iArr6, iArr7);
        xud xudVar4 = new xud(iArr6);
        ypd.V(iArr6, iArr7, iArr6);
        ypd.G(iArr6, iArr5, iArr6);
        ypd.V(iArr6, iArr4, iArr6);
        xud xudVar5 = new xud(iArr5);
        if (ka6.b1(5, 0, iArr3, iArr5) != 0 || (iArr5[4] == -1 && ka6.p0(iArr5, iArr2))) {
            ka6.R(5, -2147483647, iArr5);
        }
        if (!zY0) {
            ypd.G(iArr5, iArr8, iArr5);
        }
        return new yud(ue4Var, xudVar3, xudVar4, new ve4[]{xudVar5}, this.e);
    }

    public yud(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
