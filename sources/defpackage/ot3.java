package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ot3 extends nt3 {
    public final mge b;

    public ot3(mge mgeVar) {
        this.b = mgeVar;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: T0 */
    public final mge Q0(boolean z) {
        return z == N0() ? this : this.b.Q0(z).S0(L0());
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        return gwfVar != L0() ? new pge(this, gwfVar) : this;
    }

    @Override // defpackage.nt3
    public final mge V0() {
        return this.b;
    }
}
