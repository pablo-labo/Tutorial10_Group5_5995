package defpackage;

import defpackage.cf5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gf5 implements ga<cf5.c> {
    public static final gf5 a = new gf5();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final cf5.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        s1h s1hVarC = null;
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str == null) {
            r6.g("__typename was not found");
            return null;
        }
        if (mi1.b(mi1.c("SegmentationCrowtaxoWorkAreasSelectionConfiguration"), lb3Var.a, str, lb3Var.b)) {
            mb8Var.k();
            s1hVarC = w1h.c(mb8Var, lb3Var);
        }
        return new cf5.c(str, s1hVarC);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cf5.c cVar) {
        cf5.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
        s1h s1hVar = cVar2.b;
        if (s1hVar != null) {
            w1h.d(hc8Var, lb3Var, s1hVar);
        }
    }
}
