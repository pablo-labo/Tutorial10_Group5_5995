package defpackage;

import defpackage.hv1;
import defpackage.j29;
import defpackage.lf0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class jw4 extends w52 {
    /* JADX WARN: Illegal instructions before constructor call */
    public jw4(n8a n8aVar) {
        lx4 lx4Var = lx4.a;
        qw4 qw4Var = lx4.b;
        j29.a aVar = j29.e;
        ax9 ax9Var = ax9.d;
        c62 c62Var = c62.CLASS;
        zr4 zr4Var = zr4.a;
        super(qw4Var, n8aVar, ax9Var, c62Var, zr4Var, aVar);
        n52 n52Var = new n52(this, null, lf0.a.a, true, hv1.a.a, qne.p);
        n52Var.X0(zr4Var, d04.d);
        ww4 ww4VarB = lx4.b(xw4.SCOPE_FOR_ERROR_CLASS, n52Var.getName().a, "");
        kx4 kx4Var = kx4.i0;
        n52Var.V = new hx4(lx4.d(kx4Var, new String[0]), ww4VarB, kx4Var, zr4Var, false, new String[0]);
        K0(ww4VarB, pi3.k(n52Var), n52Var);
    }

    @Override // defpackage.x0
    /* JADX INFO: renamed from: G0 */
    public final t52 b(TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        return this;
    }

    @Override // defpackage.x0, defpackage.qxe
    public final cj3 b(TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        return this;
    }

    @Override // defpackage.x0, defpackage.tx9
    public final in9 t(byf byfVar, bj8 bj8Var) {
        bj8Var.getClass();
        return lx4.b(xw4.SCOPE_FOR_ERROR_CLASS, getName().a, byfVar.toString());
    }

    @Override // defpackage.w52
    public final String toString() {
        String strC = getName().c();
        strC.getClass();
        return strC;
    }
}
