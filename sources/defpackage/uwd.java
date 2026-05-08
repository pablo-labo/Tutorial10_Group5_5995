package defpackage;

import defpackage.ye4;

/* JADX INFO: loaded from: classes3.dex */
public final class uwd extends ye4.a {
    public uwd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, boolean z) {
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
        ve4 ve4VarI;
        ve4 ve4VarI2;
        ve4 ve4VarI3;
        ve4 ve4Var;
        ve4 ve4Var2;
        ve4 ve4VarG;
        if (f()) {
            return ye4Var;
        }
        if (ye4Var.f()) {
            return this;
        }
        ve4 ve4Var3 = ye4Var.b;
        ve4 ve4VarI4 = this.b;
        boolean zH = ve4VarI4.h();
        ue4 ue4Var = this.a;
        if (zH) {
            return ve4Var3.h() ? ue4Var.i() : ye4Var.a(this);
        }
        ve4 ve4Var4 = this.d[0];
        ve4 ve4Var5 = ye4Var.c;
        ve4 ve4VarE = ye4Var.e();
        boolean zG = ve4Var4.g();
        if (zG) {
            ve4VarI = ve4Var3;
            ve4VarI2 = ve4Var5;
        } else {
            ve4VarI = ve4Var3.i(ve4Var4);
            ve4VarI2 = ve4Var5.i(ve4Var4);
        }
        boolean zG2 = ve4VarE.g();
        ve4 ve4Var6 = this.c;
        if (zG2) {
            ve4VarI3 = ve4Var6;
        } else {
            ve4VarI4 = ve4VarI4.i(ve4VarE);
            ve4VarI3 = ve4Var6.i(ve4VarE);
        }
        ve4 ve4VarA = ve4VarI3.a(ve4VarI2);
        ve4 ve4VarA2 = ve4VarI4.a(ve4VarI);
        if (ve4VarA2.h()) {
            return ve4VarA.h() ? m() : ue4Var.i();
        }
        if (ve4Var3.h()) {
            ye4 ye4VarI = i();
            ve4 ve4Var7 = ye4VarI.b;
            ve4 ve4VarD = ye4VarI.d();
            ve4 ve4VarD2 = ve4VarD.a(ve4Var5).d(ve4Var7);
            ve4 ve4VarA3 = k20.j(ve4VarD2, ve4VarD2, ve4Var7).a(ue4Var.b);
            if (ve4VarA3.h()) {
                return new uwd(ue4Var, ve4VarA3, ue4Var.c.m(), this.e);
            }
            ve4 ve4VarA4 = ve4VarD2.i(ve4Var7.a(ve4VarA3)).a(ve4VarA3).a(ve4VarD).d(ve4VarA3).a(ve4VarA3);
            ve4VarG = ue4Var.g(te4.b);
            ve4Var = ve4VarA4;
            ve4Var2 = ve4VarA3;
        } else {
            ve4 ve4VarN = ve4VarA2.n();
            ve4 ve4VarI5 = ve4VarA.i(ve4VarI4);
            ve4 ve4VarI6 = ve4VarA.i(ve4VarI);
            ve4 ve4VarI7 = ve4VarI5.i(ve4VarI6);
            if (ve4VarI7.h()) {
                return new uwd(ue4Var, ve4VarI7, ue4Var.c.m(), this.e);
            }
            ve4 ve4VarI8 = ve4VarA.i(ve4VarN);
            ve4 ve4VarI9 = !zG2 ? ve4VarI8.i(ve4VarE) : ve4VarI8;
            ve4 ve4VarO = ve4VarI6.a(ve4VarN).o(ve4VarI9, ve4Var6.a(ve4Var4));
            if (!zG) {
                ve4VarI9 = ve4VarI9.i(ve4Var4);
            }
            ve4Var = ve4VarO;
            ve4Var2 = ve4VarI7;
            ve4VarG = ve4VarI9;
        }
        return new uwd(ue4Var, ve4Var2, ve4Var, new ve4[]{ve4VarG}, this.e);
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
                return new uwd(this.a, ve4Var, this.c.a(ve4Var2), new ve4[]{ve4Var2}, z);
            }
        }
        return this;
    }

    @Override // defpackage.ye4
    public final ye4 m() {
        if (f()) {
            return this;
        }
        ve4 ve4VarI = this.b;
        boolean zH = ve4VarI.h();
        ue4 ue4Var = this.a;
        if (zH) {
            return ue4Var.i();
        }
        ve4 ve4Var = this.d[0];
        boolean zG = ve4Var.g();
        ve4 ve4Var2 = this.c;
        ve4 ve4VarI2 = zG ? ve4Var2 : ve4Var2.i(ve4Var);
        ve4 ve4VarN = zG ? ve4Var : ve4Var.n();
        ve4 ve4VarI3 = ue4Var.b;
        if (!zG) {
            ve4VarI3 = ve4VarI3.i(ve4VarN);
        }
        ve4 ve4VarJ = k20.j(ve4Var2, ve4VarI2, ve4VarI3);
        if (ve4VarJ.h()) {
            return new uwd(ue4Var, ve4VarJ, ue4Var.c.m(), this.e);
        }
        ve4 ve4VarN2 = ve4VarJ.n();
        ve4 ve4VarI4 = zG ? ve4VarJ : ve4VarJ.i(ve4VarN);
        if (!zG) {
            ve4VarI = ve4VarI.i(ve4Var);
        }
        return new uwd(ue4Var, ve4VarN2, ve4VarI.o(ve4VarJ, ve4VarI2).a(ve4VarN2).a(ve4VarI4), new ve4[]{ve4VarI4}, this.e);
    }

    public uwd(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
        super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
        this.e = z;
    }
}
