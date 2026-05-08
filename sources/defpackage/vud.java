package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class vud extends ye4.b {
    public vud(uud uudVar, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(uudVar, ve4Var, ve4Var2);
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
        avd avdVar = (avd) this.b;
        avd avdVar2 = (avd) this.c;
        avd avdVar3 = (avd) ye4Var.b;
        avd avdVar4 = (avd) ye4Var.d();
        avd avdVar5 = (avd) this.d[0];
        avd avdVar6 = (avd) ye4Var.e();
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        int[] iArr9 = avdVar5.d;
        boolean zY0 = ka6.y0(iArr9);
        if (zY0) {
            iArr = avdVar3.d;
            iArr2 = avdVar4.d;
        } else {
            pyd.S(iArr9, iArr7);
            pyd.H(iArr7, avdVar3.d, iArr6);
            pyd.H(iArr7, iArr9, iArr7);
            pyd.H(iArr7, avdVar4.d, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = avdVar6.d;
        boolean zY02 = ka6.y0(iArr10);
        if (zY02) {
            iArr3 = avdVar.d;
            iArr4 = avdVar2.d;
        } else {
            pyd.S(iArr10, iArr8);
            pyd.H(iArr8, avdVar.d, iArr5);
            pyd.H(iArr8, iArr10, iArr8);
            pyd.H(iArr8, avdVar2.d, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[5];
        pyd.Y(iArr3, iArr, iArr11);
        pyd.Y(iArr4, iArr2, iArr6);
        boolean zC0 = ka6.C0(iArr11);
        ue4 ue4Var = this.a;
        if (zC0) {
            return ka6.C0(iArr6) ? m() : ue4Var.i();
        }
        pyd.S(iArr11, iArr7);
        int[] iArr12 = new int[5];
        pyd.H(iArr7, iArr11, iArr12);
        pyd.H(iArr7, iArr3, iArr7);
        if (ka6.C0(iArr12)) {
            iArr12[0] = 0;
            iArr12[1] = 0;
            iArr12[2] = 0;
            iArr12[3] = 0;
            iArr12[4] = 0;
        } else {
            ka6.m1(pyd.Z, iArr12, iArr12);
        }
        ka6.G0(iArr4, iArr12, iArr5);
        pyd.P(ka6.K(iArr7, iArr7, iArr12), iArr12);
        avd avdVar7 = new avd(iArr8);
        pyd.S(iArr6, iArr8);
        pyd.Y(iArr8, iArr12, iArr8);
        avd avdVar8 = new avd(iArr12);
        pyd.Y(iArr7, iArr8, iArr12);
        pyd.I(iArr12, iArr6, iArr5);
        pyd.N(iArr5, iArr12);
        avd avdVar9 = new avd(iArr11);
        if (!zY0) {
            pyd.H(iArr11, iArr9, iArr11);
        }
        if (!zY02) {
            pyd.H(iArr11, iArr10, iArr11);
        }
        return new vud(ue4Var, avdVar7, avdVar8, new ve4[]{avdVar9}, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (f()) {
            return this;
        }
        return new vud(this.a, this.b, this.c.l(), this.d, this.e);
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        if (f()) {
            return this;
        }
        int[] iArr = ((avd) this.c).d;
        boolean zC0 = ka6.C0(iArr);
        ue4 ue4Var = this.a;
        if (zC0) {
            return ue4Var.i();
        }
        avd avdVar = (avd) this.b;
        avd avdVar2 = (avd) this.d[0];
        int[] iArr2 = new int[5];
        pyd.S(iArr, iArr2);
        int[] iArr3 = new int[5];
        pyd.S(iArr2, iArr3);
        int[] iArr4 = new int[5];
        pyd.S(avdVar.d, iArr4);
        pyd.P(ka6.K(iArr4, iArr4, iArr4), iArr4);
        pyd.H(iArr2, avdVar.d, iArr2);
        pyd.P(ka6.c1(5, iArr2), iArr2);
        int[] iArr5 = new int[5];
        pyd.P(ka6.d1(5, iArr3, iArr5), iArr5);
        avd avdVar3 = new avd(iArr3);
        pyd.S(iArr4, iArr3);
        pyd.Y(iArr3, iArr2, iArr3);
        pyd.Y(iArr3, iArr2, iArr3);
        avd avdVar4 = new avd(iArr2);
        pyd.Y(iArr2, iArr3, iArr2);
        pyd.H(iArr2, iArr4, iArr2);
        pyd.Y(iArr2, iArr5, iArr2);
        avd avdVar5 = new avd(iArr4);
        pyd.b0(iArr, iArr4);
        if (!ka6.y0(avdVar2.d)) {
            pyd.H(iArr4, avdVar2.d, iArr4);
        }
        return new vud(ue4Var, avdVar3, avdVar4, new ve4[]{avdVar5}, this.e);
    }

    public vud(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
