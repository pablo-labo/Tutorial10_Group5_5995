package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qge extends nt3 implements oyf {
    public final mge b;
    public final ui8 c;

    public qge(mge mgeVar, ui8 ui8Var) {
        mgeVar.getClass();
        ui8Var.getClass();
        this.b = mgeVar;
        this.c = ui8Var;
    }

    @Override // defpackage.oyf
    public final p7g G0() {
        return this.b;
    }

    @Override // defpackage.oyf
    public final ui8 K() {
        return this.c;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: T0 */
    public final mge Q0(boolean z) {
        p7g p7gVarN = beb.n(this.b.Q0(z), this.c.P0().Q0(z));
        p7gVarN.getClass();
        return (mge) p7gVarN;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        p7g p7gVarN = beb.n(this.b.S0(gwfVar), this.c);
        p7gVarN.getClass();
        return (mge) p7gVarN;
    }

    @Override // defpackage.nt3
    public final mge V0() {
        return this.b;
    }

    @Override // defpackage.nt3
    public final nt3 X0(mge mgeVar) {
        return new qge(mgeVar, this.c);
    }

    @Override // defpackage.nt3
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final qge O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new qge((mge) bj8Var.A0(this.b), bj8Var.A0(this.c));
    }

    @Override // defpackage.mge
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.c + ")] " + this.b;
    }
}
