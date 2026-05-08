package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hla extends nt3 implements bc3 {
    public final mge b;

    public hla(mge mgeVar) {
        mgeVar.getClass();
        this.b = mgeVar;
    }

    @Override // defpackage.bc3
    public final boolean D0() {
        return true;
    }

    @Override // defpackage.nt3, defpackage.ui8
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.mge, defpackage.p7g
    public final p7g S0(gwf gwfVar) {
        gwfVar.getClass();
        return new hla(this.b.S0(gwfVar));
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: T0 */
    public final mge Q0(boolean z) {
        return z ? this.b.Q0(true) : this;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        return new hla(this.b.S0(gwfVar));
    }

    @Override // defpackage.nt3
    public final mge V0() {
        return this.b;
    }

    @Override // defpackage.nt3
    public final nt3 X0(mge mgeVar) {
        return new hla(mgeVar);
    }

    @Override // defpackage.bc3
    public final p7g t(ui8 ui8Var) {
        ui8Var.getClass();
        p7g p7gVarP0 = ui8Var.P0();
        if (!kyf.f(p7gVarP0) && !kyf.e(p7gVarP0)) {
            return p7gVarP0;
        }
        if (p7gVarP0 instanceof mge) {
            mge mgeVar = (mge) p7gVarP0;
            mge mgeVarQ0 = mgeVar.Q0(false);
            return !kyf.f(mgeVar) ? mgeVarQ0 : new hla(mgeVarQ0);
        }
        if (!(p7gVarP0 instanceof jh5)) {
            l.g();
            return null;
        }
        jh5 jh5Var = (jh5) p7gVarP0;
        mge mgeVar2 = jh5Var.b;
        mge mgeVarQ02 = mgeVar2.Q0(false);
        if (kyf.f(mgeVar2)) {
            mgeVarQ02 = new hla(mgeVarQ02);
        }
        mge mgeVar3 = jh5Var.c;
        mge mgeVarQ03 = mgeVar3.Q0(false);
        if (kyf.f(mgeVar3)) {
            mgeVarQ03 = new hla(mgeVarQ03);
        }
        return beb.n(yi8.a(mgeVarQ02, mgeVarQ03), beb.j(p7gVarP0));
    }
}
