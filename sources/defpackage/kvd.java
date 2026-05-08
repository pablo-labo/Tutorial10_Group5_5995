package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class kvd extends ye4.b {
    public kvd(ivd ivdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(ivdVar, ve4Var, ve4Var2);
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
        jvd jvdVar = (jvd) this.b;
        jvd jvdVar2 = (jvd) this.c;
        jvd jvdVar3 = (jvd) ye4Var.b;
        jvd jvdVar4 = (jvd) ye4Var.d();
        jvd jvdVar5 = (jvd) this.d[0];
        jvd jvdVar6 = (jvd) ye4Var.e();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = jvdVar5.d;
        boolean zC = h91.C(iArr9);
        if (zC) {
            iArr = jvdVar3.d;
            iArr2 = jvdVar4.d;
        } else {
            c0h.T(iArr9, iArr7);
            c0h.J(iArr7, jvdVar3.d, iArr6);
            c0h.J(iArr7, iArr9, iArr7);
            c0h.J(iArr7, jvdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = jvdVar6.d;
        boolean zC2 = h91.C(iArr10);
        if (zC2) {
            iArr3 = jvdVar.d;
            iArr4 = jvdVar2.d;
        } else {
            c0h.T(iArr10, iArr8);
            c0h.J(iArr8, jvdVar.d, iArr5);
            c0h.J(iArr8, iArr10, iArr8);
            c0h.J(iArr8, jvdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[7];
        c0h.V(iArr3, iArr, iArr11);
        c0h.V(iArr4, iArr2, iArr6);
        boolean zE = h91.E(iArr11);
        ue4 ue4Var = this.a;
        if (zE) {
            return h91.E(iArr6) ? m() : ue4Var.i();
        }
        c0h.T(iArr11, iArr7);
        int[] iArr12 = new int[7];
        c0h.J(iArr7, iArr11, iArr12);
        c0h.J(iArr7, iArr3, iArr7);
        if (h91.E(iArr12)) {
            iArr12[0] = 0;
            iArr12[1] = 0;
            iArr12[2] = 0;
            iArr12[3] = 0;
            iArr12[4] = 0;
            iArr12[5] = 0;
            iArr12[6] = 0;
        } else {
            h91.P(c0h.j0, iArr12, iArr12);
        }
        h91.I(iArr4, iArr12, iArr5);
        c0h.M(h91.o(iArr7, iArr7, iArr12), iArr12);
        jvd jvdVar7 = new jvd(iArr8);
        c0h.T(iArr6, iArr8);
        c0h.V(iArr8, iArr12, iArr8);
        jvd jvdVar8 = new jvd(iArr12);
        c0h.V(iArr7, iArr8, iArr12);
        if ((h91.J(iArr12, iArr6, iArr5) != 0 || (iArr5[13] == -1 && ka6.o0(14, iArr5, c0h.k0))) && ka6.O(9, c0h.l0, iArr5) != 0) {
            ka6.t0(14, 9, iArr5);
        }
        c0h.L(iArr5, iArr12);
        jvd jvdVar9 = new jvd(iArr11);
        if (!zC) {
            c0h.J(iArr11, iArr9, iArr11);
        }
        if (!zC2) {
            c0h.J(iArr11, iArr10, iArr11);
        }
        return new kvd(ue4Var, jvdVar7, jvdVar8, new ve4[]{jvdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new kvd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        if (f()) {
            return this;
        }
        int[] iArr = ((jvd) this.c).d;
        boolean zE = h91.E(iArr);
        ue4 ue4Var = this.a;
        if (zE) {
            return ue4Var.i();
        }
        jvd jvdVar = (jvd) this.b;
        jvd jvdVar2 = (jvd) this.d[0];
        int[] iArr2 = new int[7];
        c0h.T(iArr, iArr2);
        int[] iArr3 = new int[7];
        c0h.T(iArr2, iArr3);
        int[] iArr4 = new int[7];
        c0h.T(jvdVar.d, iArr4);
        c0h.M(h91.o(iArr4, iArr4, iArr4), iArr4);
        c0h.J(iArr2, jvdVar.d, iArr2);
        c0h.M(ka6.c1(7, iArr2), iArr2);
        int[] iArr5 = new int[7];
        c0h.M(ka6.d1(7, iArr3, iArr5), iArr5);
        jvd jvdVar3 = new jvd(iArr3);
        c0h.T(iArr4, iArr3);
        c0h.V(iArr3, iArr2, iArr3);
        c0h.V(iArr3, iArr2, iArr3);
        jvd jvdVar4 = new jvd(iArr2);
        c0h.V(iArr2, iArr3, iArr2);
        c0h.J(iArr2, iArr4, iArr2);
        c0h.V(iArr2, iArr5, iArr2);
        jvd jvdVar5 = new jvd(iArr4);
        if (ka6.b1(7, 0, iArr, iArr4) != 0 || (iArr4[6] == -1 && h91.z(iArr4, c0h.j0))) {
            ka6.I(7, 6803, iArr4);
        }
        if (!h91.C(jvdVar2.d)) {
            c0h.J(iArr4, jvdVar2.d, iArr4);
        }
        return new kvd(ue4Var, jvdVar3, jvdVar4, new ve4[]{jvdVar5}, this.e);
    }

    public kvd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
