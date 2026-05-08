package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class of0 extends ewf<of0> {
    public final lf0 a;

    public of0(lf0 lf0Var) {
        lf0Var.getClass();
        this.a = lf0Var;
    }

    @Override // defpackage.ewf
    public final of0 a(ewf ewfVar) {
        of0 of0Var = (of0) ewfVar;
        if (of0Var == null) {
            return this;
        }
        lf0 sl2Var = of0Var.a;
        lf0 lf0Var = this.a;
        lf0Var.getClass();
        sl2Var.getClass();
        if (!lf0Var.isEmpty()) {
            sl2Var = sl2Var.isEmpty() ? lf0Var : new sl2(lf0Var, sl2Var);
        }
        return new of0(sl2Var);
    }

    @Override // defpackage.ewf
    public final yd8<? extends of0> b() {
        return fwc.a.b(of0.class);
    }

    @Override // defpackage.ewf
    public final of0 c(ewf ewfVar) {
        if (wl7.b((of0) ewfVar, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof of0) {
            return wl7.b(((of0) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
