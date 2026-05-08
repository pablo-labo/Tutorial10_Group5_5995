package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.lhd;
import defpackage.ut0;
import defpackage.vl8;
import defpackage.w59;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends w.a {
    public final w59 b;

    public p(w59 w59Var) {
        this.b = w59Var;
    }

    @Override // androidx.compose.ui.layout.w.a
    public final float g(z zVar) {
        int iP0;
        Function2<w.a, Float, Float> function2 = zVar.a;
        if (function2 != null) {
            return function2.invoke(this, Float.valueOf(Float.NaN)).floatValue();
        }
        w59 w59Var = this.b;
        if (w59Var.Z) {
            return Float.NaN;
        }
        w59 w59Var2 = w59Var;
        while (true) {
            lhd lhdVar = w59Var2.b0;
            float f = (lhdVar == null || (iP0 = ut0.p0(zVar, lhdVar.b)) < 0) ? Float.NaN : lhdVar.c[iP0];
            if (!Float.isNaN(f)) {
                w59Var2.n0(w59Var.H1(), zVar);
                return zVar.a(f, w59Var2.a1(), w59Var.a1());
            }
            w59 w59VarH0 = w59Var2.H0();
            if (w59VarH0 == null) {
                w59Var2.n0(w59Var.H1(), zVar);
                return Float.NaN;
            }
            w59Var2 = w59VarH0;
        }
    }

    @Override // androidx.compose.ui.layout.w.a, defpackage.iy3
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // androidx.compose.ui.layout.w.a
    public final vl8 k() {
        return this.b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.w.a
    public final int p() {
        return this.b.e0();
    }

    @Override // androidx.compose.ui.layout.w.a, defpackage.iy3
    public final float p1() {
        return this.b.p1();
    }
}
