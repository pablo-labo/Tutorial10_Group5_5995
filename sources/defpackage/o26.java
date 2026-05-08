package defpackage;

import defpackage.m26;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o26 implements ga<m26.a> {
    public static final o26 a = new o26();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final m26.a a(mb8 mb8Var, lb3 lb3Var) {
        m26.c cVarC;
        mb8Var.getClass();
        lb3Var.getClass();
        Set<zr3> set = lb3Var.b;
        Set<String> set2 = lb3Var.a;
        m26.d dVarC = null;
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
            cVarC = q26.c(mb8Var, lb3Var);
        } else {
            cVarC = null;
        }
        if (mi1.b(mi1.c("JobSeekerOnlineStatusAccount"), set2, str, set)) {
            mb8Var.k();
            dVarC = r26.c(mb8Var, lb3Var);
        }
        return new m26.a(str, cVarC, dVarC);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, m26.a aVar) {
        m26.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        m26.c cVar = aVar2.b;
        if (cVar != null) {
            q26.d(hc8Var, lb3Var, cVar);
        }
        m26.d dVar = aVar2.c;
        if (dVar != null) {
            r26.d(hc8Var, lb3Var, dVar);
        }
    }
}
