package defpackage;

import defpackage.ere;

/* JADX INFO: loaded from: classes3.dex */
public final class k4g extends l7g<Integer> {
    public k4g(int i) {
        super(Integer.valueOf(i));
    }

    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        mge mgeVarO;
        xx9Var.getClass();
        t52 t52VarA = rc5.a(xx9Var, ere.a.U);
        return (t52VarA == null || (mgeVarO = t52VarA.o()) == null) ? lx4.c(kx4.m0, "UInt") : mgeVarO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up2
    public final String toString() {
        return ((Number) this.a).intValue() + ".toUInt()";
    }
}
