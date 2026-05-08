package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class evd extends ye4.b {
    public evd(cvd cvdVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(cvdVar, ve4Var, ve4Var2);
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
        dvd dvdVar = (dvd) this.b;
        dvd dvdVar2 = (dvd) this.c;
        dvd dvdVar3 = (dvd) ye4Var.b;
        dvd dvdVar4 = (dvd) ye4Var.d();
        dvd dvdVar5 = (dvd) this.d[0];
        dvd dvdVar6 = (dvd) ye4Var.e();
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        int[] iArr9 = dvdVar5.d;
        boolean zD0 = v1.d0(iArr9);
        if (zD0) {
            iArr = dvdVar3.d;
            iArr2 = dvdVar4.d;
        } else {
            ygg.z(iArr9, iArr7);
            ygg.p(iArr7, dvdVar3.d, iArr6);
            ygg.p(iArr7, iArr9, iArr7);
            ygg.p(iArr7, dvdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = dvdVar6.d;
        boolean zD02 = v1.d0(iArr10);
        if (zD02) {
            iArr3 = dvdVar.d;
            iArr4 = dvdVar2.d;
        } else {
            ygg.z(iArr10, iArr8);
            ygg.p(iArr8, dvdVar.d, iArr5);
            ygg.p(iArr8, iArr10, iArr8);
            ygg.p(iArr8, dvdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[6];
        ygg.B(iArr3, iArr, iArr11);
        ygg.B(iArr4, iArr2, iArr6);
        boolean zE0 = v1.e0(iArr11);
        ue4 ue4Var = this.a;
        if (zE0) {
            return v1.e0(iArr6) ? m() : ue4Var.i();
        }
        ygg.z(iArr11, iArr7);
        int[] iArr12 = new int[6];
        ygg.p(iArr7, iArr11, iArr12);
        ygg.p(iArr7, iArr3, iArr7);
        if (v1.e0(iArr12)) {
            iArr12[0] = 0;
            iArr12[1] = 0;
            iArr12[2] = 0;
            iArr12[3] = 0;
            iArr12[4] = 0;
            iArr12[5] = 0;
        } else {
            v1.q0(ygg.X, iArr12, iArr12);
        }
        v1.g0(iArr4, iArr12, iArr5);
        ygg.t(v1.J(iArr7, iArr7, iArr12), iArr12);
        dvd dvdVar7 = new dvd(iArr8);
        ygg.z(iArr6, iArr8);
        ygg.B(iArr8, iArr12, iArr8);
        dvd dvdVar8 = new dvd(iArr12);
        ygg.B(iArr7, iArr8, iArr12);
        if ((v1.i0(iArr12, iArr6, iArr5) != 0 || (iArr5[11] == -1 && ka6.o0(12, iArr5, ygg.Y))) && ka6.O(8, ygg.Z, iArr5) != 0) {
            ka6.t0(12, 8, iArr5);
        }
        ygg.s(iArr5, iArr12);
        dvd dvdVar9 = new dvd(iArr11);
        if (!zD0) {
            ygg.p(iArr11, iArr9, iArr11);
        }
        if (!zD02) {
            ygg.p(iArr11, iArr10, iArr11);
        }
        return new evd(ue4Var, dvdVar7, dvdVar8, new ve4[]{dvdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new evd(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        if (f()) {
            return this;
        }
        int[] iArr = ((dvd) this.c).d;
        boolean zE0 = v1.e0(iArr);
        ue4 ue4Var = this.a;
        if (zE0) {
            return ue4Var.i();
        }
        dvd dvdVar = (dvd) this.b;
        dvd dvdVar2 = (dvd) this.d[0];
        int[] iArr2 = new int[6];
        ygg.z(iArr, iArr2);
        int[] iArr3 = new int[6];
        ygg.z(iArr2, iArr3);
        int[] iArr4 = new int[6];
        ygg.z(dvdVar.d, iArr4);
        ygg.t(v1.J(iArr4, iArr4, iArr4), iArr4);
        ygg.p(iArr2, dvdVar.d, iArr2);
        ygg.t(ka6.c1(6, iArr2), iArr2);
        int[] iArr5 = new int[6];
        ygg.t(ka6.d1(6, iArr3, iArr5), iArr5);
        dvd dvdVar3 = new dvd(iArr3);
        ygg.z(iArr4, iArr3);
        ygg.B(iArr3, iArr2, iArr3);
        ygg.B(iArr3, iArr2, iArr3);
        dvd dvdVar4 = new dvd(iArr2);
        ygg.B(iArr2, iArr3, iArr2);
        ygg.p(iArr2, iArr4, iArr2);
        ygg.B(iArr2, iArr5, iArr2);
        dvd dvdVar5 = new dvd(iArr4);
        if (ka6.b1(6, 0, iArr, iArr4) != 0 || (iArr4[5] == -1 && v1.c0(iArr4, ygg.X))) {
            ka6.I(6, 4553, iArr4);
        }
        if (!v1.d0(dvdVar2.d)) {
            ygg.p(iArr4, dvdVar2.d, iArr4);
        }
        return new evd(ue4Var, dvdVar3, dvdVar4, new ve4[]{dvdVar5}, this.e);
    }

    public evd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
