package defpackage;

import defpackage.dyc;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class fyc implements ga<dyc.a> {
    public static final fyc a = new fyc();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final dyc.a a(mb8 mb8Var, lb3 lb3Var) {
        dyc.c cVarC;
        mb8Var.getClass();
        lb3Var.getClass();
        Set<zr3> set = lb3Var.b;
        Set<String> set2 = lb3Var.a;
        dyc.d dVarC = null;
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str == null) {
            r6.g("__typename was not found");
            return null;
        }
        if (mi1.b(mi1.c("EmployerUser"), set2, str, set)) {
            mb8Var.k();
            cVarC = hyc.c(mb8Var, lb3Var);
        } else {
            cVarC = null;
        }
        if (mi1.b(mi1.c("JobSeekerOnlineStatusAccount"), set2, str, set)) {
            mb8Var.k();
            dVarC = iyc.c(mb8Var, lb3Var);
        }
        return new dyc.a(str, cVarC, dVarC);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dyc.a aVar) {
        dyc.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        dyc.c cVar = aVar2.b;
        if (cVar != null) {
            hyc.d(hc8Var, lb3Var, cVar);
        }
        dyc.d dVar = aVar2.c;
        if (dVar != null) {
            iyc.d(hc8Var, lb3Var, dVar);
        }
    }
}
