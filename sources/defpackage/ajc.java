package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ajc extends byf {
    public static final lw7 d;
    public static final lw7 e;
    public final beb b;
    public final vxf c;

    static {
        jyf jyfVar = jyf.b;
        d = lw7.a(wab.A(jyfVar, false, null, 5), ow7.c, false, null, null, 61);
        e = lw7.a(wab.A(jyfVar, false, null, 5), ow7.b, false, null, null, 61);
    }

    public ajc() {
        beb bebVar = new beb();
        this.b = bebVar;
        this.c = new vxf(bebVar);
    }

    @Override // defpackage.byf
    public final wxf d(ui8 ui8Var) {
        return new yxf(h(ui8Var, new lw7(jyf.b, false, false, null, 62)));
    }

    public final Pair<mge, Boolean> g(mge mgeVar, t52 t52Var, lw7 lw7Var) {
        if (mgeVar.M0().getParameters().isEmpty()) {
            return new Pair<>(mgeVar, Boolean.FALSE);
        }
        if (ei8.z(mgeVar)) {
            wxf wxfVar = mgeVar.K0().get(0);
            ylg ylgVarC = wxfVar.c();
            ui8 type = wxfVar.getType();
            type.getClass();
            return new Pair<>(yi8.c(mgeVar.L0(), mgeVar.M0(), u63.Z(new yxf(h(type, lw7Var), ylgVarC)), mgeVar.N0(), null), Boolean.FALSE);
        }
        if (pnb.D(mgeVar)) {
            return new Pair<>(lx4.c(kx4.a0, mgeVar.M0().toString()), Boolean.FALSE);
        }
        in9 in9VarH = t52Var.H(this);
        in9VarH.getClass();
        gwf gwfVarL0 = mgeVar.L0();
        kwf kwfVarJ = t52Var.j();
        kwfVarJ.getClass();
        List<rxf> parameters = t52Var.j().getParameters();
        parameters.getClass();
        List<rxf> list = parameters;
        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
        for (rxf rxfVar : list) {
            rxfVar.getClass();
            vxf vxfVar = this.c;
            arrayList.add(this.b.g(rxfVar, lw7Var, vxfVar, vxfVar.b(rxfVar, lw7Var)));
        }
        return new Pair<>(yi8.e(gwfVarL0, kwfVarJ, arrayList, mgeVar.N0(), in9VarH, new o0(t52Var, this, mgeVar, lw7Var)), Boolean.TRUE);
    }

    public final ui8 h(ui8 ui8Var, lw7 lw7Var) {
        v62 v62VarD = ui8Var.M0().d();
        if (v62VarD instanceof rxf) {
            lw7Var.getClass();
            return h(this.c.b((rxf) v62VarD, lw7.a(lw7Var, null, true, null, null, 59)), lw7Var);
        }
        if (!(v62VarD instanceof t52)) {
            ja.i(v62VarD, "Unexpected declaration kind: ");
            return null;
        }
        v62 v62VarD2 = w74.G(ui8Var).M0().d();
        if (v62VarD2 instanceof t52) {
            Pair<mge, Boolean> pairG = g(w74.v(ui8Var), (t52) v62VarD, d);
            mge mgeVarA = pairG.a();
            boolean zBooleanValue = pairG.b().booleanValue();
            Pair<mge, Boolean> pairG2 = g(w74.G(ui8Var), (t52) v62VarD2, e);
            mge mgeVarA2 = pairG2.a();
            return (zBooleanValue || pairG2.b().booleanValue()) ? new cjc(mgeVarA, mgeVarA2) : yi8.a(mgeVarA, mgeVarA2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + v62VarD2 + "\" while for lower it's \"" + v62VarD + '\"').toString());
    }
}
