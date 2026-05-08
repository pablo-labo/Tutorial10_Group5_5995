package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jh5 extends p7g implements zi8 {
    public final mge b;
    public final mge c;

    public jh5(mge mgeVar, mge mgeVar2) {
        mgeVar.getClass();
        mgeVar2.getClass();
        this.b = mgeVar;
        this.c = mgeVar2;
    }

    @Override // defpackage.ui8
    public final List<wxf> K0() {
        return T0().K0();
    }

    @Override // defpackage.ui8
    public gwf L0() {
        return T0().L0();
    }

    @Override // defpackage.ui8
    public final kwf M0() {
        return T0().M0();
    }

    @Override // defpackage.ui8
    public boolean N0() {
        return T0().N0();
    }

    public abstract mge T0();

    public abstract String U0(pz3 pz3Var, pz3 pz3Var2);

    @Override // defpackage.ui8
    public in9 n() {
        return T0().n();
    }

    public String toString() {
        return mz3.c.X(this);
    }
}
