package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class rxd extends ye4.a {
    public rxd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, boolean z) {
        super(ue4Var, ve4Var, ve4Var2);
        if ((ve4Var == null) == (ve4Var2 == null)) {
            this.e = z;
        } else {
            l5.q("Exactly one of the field elements is null");
            throw null;
        }
    }

    @Override // defpackage.ye4
    public final ye4 a(ye4 ye4Var) {
        int i;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        pxd pxdVar;
        pxd pxdVar2;
        pxd pxdVar3;
        if (f()) {
            return ye4Var;
        }
        if (ye4Var.f()) {
            return this;
        }
        pxd pxdVar4 = (pxd) this.b;
        pxd pxdVar5 = (pxd) ye4Var.b;
        boolean zF = h91.F(pxdVar4.d);
        ue4 ue4Var = this.a;
        if (zF) {
            return h91.F(pxdVar5.d) ? ue4Var.i() : ye4Var.a(this);
        }
        pxd pxdVar6 = (pxd) this.c;
        pxd pxdVar7 = (pxd) this.d[0];
        pxd pxdVar8 = (pxd) ye4Var.c;
        pxd pxdVar9 = (pxd) ye4Var.e();
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        boolean zG = pxdVar7.g();
        long[] jArr8 = pxdVar7.d;
        long[] jArrB = zG ? null : w74.B(jArr8);
        if (jArrB == null) {
            jArr2 = pxdVar5.d;
            i = 0;
            jArr = pxdVar8.d;
        } else {
            i = 0;
            w74.y(pxdVar5.d, jArrB, jArr5);
            w74.y(pxdVar8.d, jArrB, jArr7);
            jArr = jArr7;
            jArr2 = jArr5;
        }
        long[] jArrB2 = pxdVar9.g() ? null : w74.B(pxdVar9.d);
        long[] jArr9 = pxdVar4.d;
        if (jArrB2 == null) {
            jArr3 = pxdVar6.d;
        } else {
            w74.y(jArr9, jArrB2, jArr4);
            w74.y(pxdVar6.d, jArrB2, jArr6);
            jArr9 = jArr4;
            jArr3 = jArr6;
        }
        w74.e(jArr3, jArr, jArr6);
        w74.e(jArr9, jArr2, jArr7);
        if (h91.F(jArr7)) {
            return h91.F(jArr6) ? m() : ue4Var.i();
        }
        if (h91.F(pxdVar5.d)) {
            ye4 ye4VarI = i();
            pxd pxdVar10 = (pxd) ye4VarI.b;
            ve4 ve4VarD = ye4VarI.d();
            ve4 ve4VarD2 = ve4VarD.a(pxdVar8).d(pxdVar10);
            pxd pxdVar11 = (pxd) ve4VarD2.n().a(ve4VarD2).a(pxdVar10);
            if (h91.F(pxdVar11.d)) {
                return new rxd(ue4Var, pxdVar11, ue4Var.c, this.e);
            }
            pxd pxdVar12 = (pxd) ve4VarD2.i(pxdVar10.a(pxdVar11)).a(pxdVar11).a(ve4VarD).d(pxdVar11).a(pxdVar11);
            pxdVar3 = (pxd) ue4Var.g(te4.b);
            pxdVar2 = pxdVar12;
            pxdVar = pxdVar11;
        } else {
            w74.E(jArr7, jArr7);
            long[] jArrB3 = w74.B(jArr6);
            w74.y(jArr9, jArrB3, jArr4);
            w74.y(jArr2, jArrB3, jArr5);
            pxd pxdVar13 = new pxd(jArr4);
            w74.w(jArr4, jArr5, jArr4);
            if (h91.F(jArr4)) {
                return new rxd(ue4Var, pxdVar13, ue4Var.c, this.e);
            }
            pxd pxdVar14 = new pxd(jArr6);
            w74.y(jArr7, jArrB3, jArr6);
            if (jArrB2 != null) {
                w74.y(jArr6, jArrB2, jArr6);
            }
            long[] jArr10 = new long[18];
            w74.e(jArr5, jArr7, jArr7);
            long[] jArr11 = new long[18];
            w74.p(jArr7, jArr11);
            for (int i2 = i; i2 < 18; i2++) {
                jArr10[i2] = jArr10[i2] ^ jArr11[i2];
            }
            w74.e(pxdVar6.d, jArr8, jArr7);
            w74.x(jArr7, jArr6, jArr10);
            pxd pxdVar15 = new pxd(jArr7);
            w74.C(jArr10, jArr7);
            if (jArrB != null) {
                w74.y(jArr6, jArrB, jArr6);
            }
            pxdVar = pxdVar13;
            pxdVar2 = pxdVar15;
            pxdVar3 = pxdVar14;
        }
        ve4[] ve4VarArr = new ve4[1];
        ve4VarArr[i] = pxdVar3;
        return new rxd(ue4Var, pxdVar, pxdVar2, ve4VarArr, this.e);
    }

    @Override // defpackage.ye4
    public final ve4 d() {
        boolean zF = f();
        ve4 ve4Var = this.c;
        if (!zF) {
            ve4 ve4Var2 = this.b;
            if (!ve4Var2.h()) {
                ve4 ve4VarI = ve4Var.a(ve4Var2).i(ve4Var2);
                ve4 ve4Var3 = this.d[0];
                return !ve4Var3.g() ? ve4VarI.d(ve4Var3) : ve4VarI;
            }
        }
        return ve4Var;
    }

    @Override // defpackage.ye4
    public final ye4 h() {
        if (!f()) {
            ve4 ve4Var = this.b;
            if (!ve4Var.h()) {
                ve4 ve4Var2 = this.d[0];
                boolean z = this.e;
                return new rxd(this.a, ve4Var, this.c.a(ve4Var2), new ve4[]{ve4Var2}, z);
            }
        }
        return this;
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        if (f()) {
            return this;
        }
        ve4 ve4Var = this.b;
        boolean zH = ve4Var.h();
        ue4 ue4Var = this.a;
        if (zH) {
            return ue4Var.i();
        }
        ve4 ve4VarN = this.d[0];
        boolean zG = ve4VarN.g();
        ve4 ve4VarN2 = zG ? ve4VarN : ve4VarN.n();
        ve4 ve4Var2 = this.c;
        ve4 ve4VarA = zG ? ve4Var2.n().a(ve4Var2) : ve4Var2.a(ve4VarN).i(ve4Var2);
        if (ve4VarA.h()) {
            return new rxd(ue4Var, ve4VarA, ue4Var.c, this.e);
        }
        ve4 ve4Var3 = ve4VarN2;
        ve4 ve4VarN3 = ve4VarA.n();
        ve4 ve4VarI = zG ? ve4VarA : ve4VarA.i(ve4Var3);
        ve4 ve4VarN4 = ve4Var2.a(ve4Var).n();
        if (!zG) {
            ve4VarN = ve4Var3.n();
        }
        return new rxd(ue4Var, ve4VarN3, ve4VarN4.a(ve4VarA).a(ve4Var3).i(ve4VarN4).a(ve4VarN).a(ve4VarN3).a(ve4VarI), new ve4[]{ve4VarI}, this.e);
    }

    public rxd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
