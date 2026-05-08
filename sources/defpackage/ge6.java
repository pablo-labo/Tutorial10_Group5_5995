package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ge6 extends ezg {
    @Override // defpackage.ezg, defpackage.ny3
    public final void a(ny3 ny3Var) {
        ry3 ry3Var = this.h;
        if (ry3Var.c && !ry3Var.j) {
            ry3Var.d((int) ((((ry3) ry3Var.l.get(0)).g * ((fe6) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.ezg
    public final void d() {
        gq2 gq2Var = this.b;
        fe6 fe6Var = (fe6) gq2Var;
        int i = fe6Var.r0;
        int i2 = fe6Var.s0;
        int i3 = fe6Var.u0;
        ry3 ry3Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                ry3Var.l.add(gq2Var.U.d.h);
                this.b.U.d.h.k.add(ry3Var);
                ry3Var.f = i;
            } else if (i2 != -1) {
                ry3Var.l.add(gq2Var.U.d.i);
                this.b.U.d.i.k.add(ry3Var);
                ry3Var.f = -i2;
            } else {
                ry3Var.b = true;
                ry3Var.l.add(gq2Var.U.d.i);
                this.b.U.d.i.k.add(ry3Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            ry3Var.l.add(gq2Var.U.e.h);
            this.b.U.e.h.k.add(ry3Var);
            ry3Var.f = i;
        } else if (i2 != -1) {
            ry3Var.l.add(gq2Var.U.e.i);
            this.b.U.e.i.k.add(ry3Var);
            ry3Var.f = -i2;
        } else {
            ry3Var.b = true;
            ry3Var.l.add(gq2Var.U.e.i);
            this.b.U.e.i.k.add(ry3Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.ezg
    public final void e() {
        gq2 gq2Var = this.b;
        int i = ((fe6) gq2Var).u0;
        ry3 ry3Var = this.h;
        if (i == 1) {
            gq2Var.Z = ry3Var.g;
        } else {
            gq2Var.a0 = ry3Var.g;
        }
    }

    @Override // defpackage.ezg
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.ezg
    public final boolean k() {
        return false;
    }

    public final void m(ry3 ry3Var) {
        ry3 ry3Var2 = this.h;
        ry3Var2.k.add(ry3Var);
        ry3Var.l.add(ry3Var2);
    }
}
