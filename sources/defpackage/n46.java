package defpackage;

import defpackage.e46;
import defpackage.xj8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n46 implements ga<e46.h> {
    public static final n46 a = new n46();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final e46.h a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        xj8 xj8VarC = ak8.c(mb8Var, lb3Var);
        if (str != null) {
            return new e46.h(str, xj8VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.h hVar) {
        e46.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, hVar2.a);
        List<String> list = ak8.a;
        xj8 xj8Var = hVar2.b;
        hc8Var.getClass();
        lb3Var.getClass();
        xj8Var.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, xj8Var.a);
        hc8Var.u0("taxonomyConceptLanguage");
        ena enaVar = new ena(dk8.a, false);
        xj8.e eVar = xj8Var.b;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
        hc8Var.u0("taxonomyConceptProficiency");
        ena enaVar2 = new ena(gk8.a, false);
        xj8.h hVar3 = xj8Var.c;
        if (hVar3 == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, hVar3);
        }
    }
}
