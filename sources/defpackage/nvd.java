package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class nvd extends ye4.b {
    public nvd(lvd lvdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(lvdVar, ve4Var, ve4Var2);
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
        mvd mvdVar = (mvd) this.b;
        mvd mvdVar2 = (mvd) this.c;
        mvd mvdVar3 = (mvd) ye4Var.b;
        mvd mvdVar4 = (mvd) ye4Var.d();
        mvd mvdVar5 = (mvd) this.d[0];
        mvd mvdVar6 = (mvd) ye4Var.e();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = mvdVar5.d;
        boolean zC = h91.C(iArr9);
        if (zC) {
            iArr = mvdVar3.d;
            iArr2 = mvdVar4.d;
        } else {
            jh2.F(iArr9, iArr7);
            jh2.z(iArr7, mvdVar3.d, iArr6);
            jh2.z(iArr7, iArr9, iArr7);
            jh2.z(iArr7, mvdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = mvdVar6.d;
        boolean zC2 = h91.C(iArr10);
        if (zC2) {
            iArr3 = mvdVar.d;
            iArr4 = mvdVar2.d;
        } else {
            jh2.F(iArr10, iArr8);
            jh2.z(iArr8, mvdVar.d, iArr5);
            jh2.z(iArr8, iArr10, iArr8);
            jh2.z(iArr8, mvdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[7];
        jh2.G(iArr3, iArr, iArr11);
        jh2.G(iArr4, iArr2, iArr6);
        boolean zE = h91.E(iArr11);
        ue4 ue4Var = this.a;
        if (zE) {
            return h91.E(iArr6) ? m() : ue4Var.i();
        }
        jh2.F(iArr11, iArr7);
        int[] iArr12 = new int[7];
        jh2.z(iArr7, iArr11, iArr12);
        jh2.z(iArr7, iArr3, iArr7);
        if (h91.E(iArr12)) {
            iArr12[0] = 0;
            iArr12[1] = 0;
            iArr12[2] = 0;
            iArr12[3] = 0;
            iArr12[4] = 0;
            iArr12[5] = 0;
            iArr12[6] = 0;
        } else {
            h91.P(jh2.W, iArr12, iArr12);
        }
        h91.I(iArr4, iArr12, iArr5);
        jh2.C(h91.o(iArr7, iArr7, iArr12), iArr12);
        mvd mvdVar7 = new mvd(iArr8);
        jh2.F(iArr6, iArr8);
        jh2.G(iArr8, iArr12, iArr8);
        mvd mvdVar8 = new mvd(iArr12);
        jh2.G(iArr7, iArr8, iArr12);
        if ((h91.J(iArr12, iArr6, iArr5) != 0 || (iArr5[13] == -1 && ka6.o0(14, iArr5, jh2.X))) && ka6.O(11, jh2.Y, iArr5) != 0) {
            ka6.t0(14, 11, iArr5);
        }
        jh2.B(iArr5, iArr12);
        mvd mvdVar9 = new mvd(iArr11);
        if (!zC) {
            jh2.z(iArr11, iArr9, iArr11);
        }
        if (!zC2) {
            jh2.z(iArr11, iArr10, iArr11);
        }
        return new nvd(ue4Var, mvdVar7, mvdVar8, new ve4[]{mvdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new nvd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        int[] iArr;
        if (f()) {
            return this;
        }
        int[] iArr2 = ((mvd) this.c).d;
        boolean zE = h91.E(iArr2);
        ue4 ue4Var = this.a;
        if (zE) {
            return ue4Var.i();
        }
        mvd mvdVar = (mvd) this.b;
        mvd mvdVar2 = (mvd) this.d[0];
        int[] iArr3 = new int[7];
        int[] iArr4 = new int[7];
        int[] iArr5 = new int[7];
        jh2.F(iArr2, iArr5);
        int[] iArr6 = new int[7];
        jh2.F(iArr5, iArr6);
        int[] iArr7 = mvdVar2.d;
        boolean zC = h91.C(iArr7);
        if (zC) {
            iArr = iArr7;
        } else {
            jh2.F(iArr7, iArr4);
            iArr = iArr4;
        }
        int[] iArr8 = mvdVar.d;
        jh2.G(iArr8, iArr, iArr3);
        jh2.g(iArr8, iArr, iArr4);
        jh2.z(iArr4, iArr3, iArr4);
        jh2.C(h91.o(iArr4, iArr4, iArr4), iArr4);
        jh2.z(iArr5, iArr8, iArr5);
        jh2.C(ka6.c1(7, iArr5), iArr5);
        jh2.C(ka6.d1(7, iArr6, iArr3), iArr3);
        mvd mvdVar3 = new mvd(iArr6);
        jh2.F(iArr4, iArr6);
        jh2.G(iArr6, iArr5, iArr6);
        jh2.G(iArr6, iArr5, iArr6);
        mvd mvdVar4 = new mvd(iArr5);
        jh2.G(iArr5, iArr6, iArr5);
        jh2.z(iArr5, iArr4, iArr5);
        jh2.G(iArr5, iArr3, iArr5);
        mvd mvdVar5 = new mvd(iArr4);
        jh2.M(iArr2, iArr4);
        if (!zC) {
            jh2.z(iArr4, iArr7, iArr4);
        }
        return new nvd(ue4Var, mvdVar3, mvdVar4, new ve4[]{mvdVar5}, this.e);
    }

    public nvd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
