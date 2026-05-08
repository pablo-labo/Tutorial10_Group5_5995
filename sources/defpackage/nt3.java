package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nt3 extends mge {
    @Override // defpackage.ui8
    public final List<wxf> K0() {
        return V0().K0();
    }

    @Override // defpackage.ui8
    public gwf L0() {
        return V0().L0();
    }

    @Override // defpackage.ui8
    public final kwf M0() {
        return V0().M0();
    }

    @Override // defpackage.ui8
    public boolean N0() {
        return V0().N0();
    }

    public abstract mge V0();

    @Override // defpackage.p7g
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public mge R0(bj8 bj8Var) {
        bj8Var.getClass();
        return X0((mge) bj8Var.A0(V0()));
    }

    public abstract nt3 X0(mge mgeVar);

    @Override // defpackage.ui8
    public final in9 n() {
        return V0().n();
    }
}
