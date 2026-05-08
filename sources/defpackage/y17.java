package defpackage;

import defpackage.ax1;

/* JADX INFO: loaded from: classes.dex */
public final class y17 extends x2b {
    public final k07 f;

    public y17(k07 k07Var) {
        this.f = k07Var;
    }

    @Override // defpackage.x2b
    public final long h() {
        k07 k07Var = this.f;
        int width = k07Var.getWidth();
        float f = width > 0 ? width : Float.NaN;
        int height = k07Var.getHeight();
        return oie.e(f, height > 0 ? height : Float.NaN);
    }

    @Override // defpackage.x2b
    public final void i(gb4 gb4Var) {
        k07 k07Var = this.f;
        int width = k07Var.getWidth();
        float fD = width > 0 ? kie.d(gb4Var.c()) / width : 1.0f;
        int height = k07Var.getHeight();
        float fB = height > 0 ? kie.b(gb4Var.c()) / height : 1.0f;
        ax1.b bVarW1 = gb4Var.w1();
        long jD = bVarW1.d();
        bVarW1.a().o();
        try {
            bVarW1.a.g(0L, fD, fB);
            k07Var.c(z40.a(gb4Var.w1().a()));
        } finally {
            g7.k(bVarW1, jD);
        }
    }
}
