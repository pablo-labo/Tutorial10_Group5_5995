package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lh5 extends jh5 implements bc3 {
    @Override // defpackage.bc3
    public final boolean D0() {
        mge mgeVar = this.b;
        return (mgeVar.M0().d() instanceof rxf) && wl7.b(mgeVar.M0(), this.c.M0());
    }

    @Override // defpackage.p7g
    public final p7g Q0(boolean z) {
        return yi8.a(this.b.Q0(z), this.c.Q0(z));
    }

    @Override // defpackage.p7g
    public final p7g S0(gwf gwfVar) {
        gwfVar.getClass();
        return yi8.a(this.b.S0(gwfVar), this.c.S0(gwfVar));
    }

    @Override // defpackage.jh5
    public final mge T0() {
        return this.b;
    }

    @Override // defpackage.jh5
    public final String U0(pz3 pz3Var, pz3 pz3Var2) {
        boolean zO = pz3Var2.d.o();
        mge mgeVar = this.c;
        mge mgeVar2 = this.b;
        if (!zO) {
            return pz3Var.F(pz3Var.X(mgeVar2), pz3Var.X(mgeVar), boa.t(this));
        }
        return "(" + pz3Var.X(mgeVar2) + ".." + pz3Var.X(mgeVar) + ')';
    }

    @Override // defpackage.p7g
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final jh5 O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new lh5((mge) bj8Var.A0(this.b), (mge) bj8Var.A0(this.c));
    }

    @Override // defpackage.bc3
    public final p7g t(ui8 ui8Var) {
        p7g p7gVarA;
        ui8Var.getClass();
        p7g p7gVarP0 = ui8Var.P0();
        if (p7gVarP0 instanceof jh5) {
            p7gVarA = p7gVarP0;
        } else {
            if (!(p7gVarP0 instanceof mge)) {
                l.g();
                return null;
            }
            mge mgeVar = (mge) p7gVarP0;
            p7gVarA = yi8.a(mgeVar, mgeVar.Q0(true));
        }
        return beb.k(p7gVarA, p7gVarP0);
    }

    @Override // defpackage.jh5
    public final String toString() {
        return "(" + this.b + ".." + this.c + ')';
    }
}
