package defpackage;

import defpackage.te5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ze5 implements ga<te5.e> {
    public static final ze5 a = new ze5();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final te5.e a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        te5.f fVarC = null;
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str == null) {
            r6.g("__typename was not found");
            return null;
        }
        if (mi1.b(mi1.c("SegmentationWorkWellbeingConfiguration"), lb3Var.a, str, lb3Var.b)) {
            mb8Var.k();
            fVarC = af5.c(mb8Var, lb3Var);
        }
        return new te5.e(str, fVarC);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, te5.e eVar) {
        te5.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, eVar2.a);
        te5.f fVar = eVar2.b;
        if (fVar != null) {
            af5.d(hc8Var, lb3Var, fVar);
        }
    }
}
