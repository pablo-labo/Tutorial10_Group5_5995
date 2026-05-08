package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mh5 extends jh5 implements oyf {
    public final jh5 d;
    public final ui8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh5(jh5 jh5Var, ui8 ui8Var) {
        super(jh5Var.b, jh5Var.c);
        jh5Var.getClass();
        ui8Var.getClass();
        this.d = jh5Var;
        this.e = ui8Var;
    }

    @Override // defpackage.oyf
    public final p7g G0() {
        return this.d;
    }

    @Override // defpackage.oyf
    public final ui8 K() {
        return this.e;
    }

    @Override // defpackage.ui8
    public final ui8 O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new mh5((jh5) bj8Var.A0(this.d), bj8Var.A0(this.e));
    }

    @Override // defpackage.p7g
    public final p7g Q0(boolean z) {
        return beb.n(this.d.Q0(z), this.e.P0().Q0(z));
    }

    @Override // defpackage.p7g
    /* JADX INFO: renamed from: R0 */
    public final p7g O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new mh5((jh5) bj8Var.A0(this.d), bj8Var.A0(this.e));
    }

    @Override // defpackage.p7g
    public final p7g S0(gwf gwfVar) {
        gwfVar.getClass();
        return beb.n(this.d.S0(gwfVar), this.e);
    }

    @Override // defpackage.jh5
    public final mge T0() {
        return this.d.T0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jh5
    public final String U0(pz3 pz3Var, pz3 pz3Var2) {
        uz3 uz3Var = pz3Var2.d.m;
        qf8<Object> qf8Var = vz3.Y[11];
        uz3Var.getClass();
        qf8Var.getClass();
        return ((Boolean) uz3Var.a).booleanValue() ? pz3Var.X(this.e) : this.d.U0(pz3Var, pz3Var2);
    }

    @Override // defpackage.jh5
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.e + ")] " + this.d;
    }
}
