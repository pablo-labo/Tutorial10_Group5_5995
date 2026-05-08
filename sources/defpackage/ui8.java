package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ui8 implements ie0, zi8 {
    public int a;

    public abstract List<wxf> K0();

    public abstract gwf L0();

    public abstract kwf M0();

    public abstract boolean N0();

    public abstract ui8 O0(bj8 bj8Var);

    public abstract p7g P0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui8)) {
            return false;
        }
        ui8 ui8Var = (ui8) obj;
        if (N0() == ui8Var.N0()) {
            return wab.w(ofe.a, P0(), ui8Var.P0());
        }
        return false;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        return pf0.a(L0());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.a;
        if (i != 0) {
            return i;
        }
        if (pnb.D(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (N0() ? 1 : 0) + ((K0().hashCode() + (M0().hashCode() * 31)) * 31);
        }
        this.a = iHashCode;
        return iHashCode;
    }

    public abstract in9 n();
}
