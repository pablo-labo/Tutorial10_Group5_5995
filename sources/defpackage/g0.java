package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends nt3 {
    public final mge b;
    public final mge c;

    public g0(mge mgeVar, mge mgeVar2) {
        mgeVar.getClass();
        mgeVar2.getClass();
        this.b = mgeVar;
        this.c = mgeVar2;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        return new g0(this.b.S0(gwfVar), this.c);
    }

    @Override // defpackage.nt3
    public final mge V0() {
        return this.b;
    }

    @Override // defpackage.nt3
    public final nt3 X0(mge mgeVar) {
        return new g0(mgeVar, this.c);
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public final g0 Q0(boolean z) {
        return new g0(this.b.Q0(z), this.c.Q0(z));
    }

    @Override // defpackage.nt3
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g0 O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new g0((mge) bj8Var.A0(this.b), (mge) bj8Var.A0(this.c));
    }
}
