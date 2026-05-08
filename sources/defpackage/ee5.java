package defpackage;

import defpackage.ha;
import defpackage.sd5;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ee5 implements ga<sd5.k> {
    public static final ee5 a = new ee5();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final sd5.k a(mb8 mb8Var, lb3 lb3Var) {
        sd5.l lVarC;
        mb8Var.getClass();
        lb3Var.getClass();
        Set<zr3> set = lb3Var.b;
        Set<String> set2 = lb3Var.a;
        sd5.m mVarC = null;
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str == null) {
            r6.g("__typename was not found");
            return null;
        }
        if (mi1.b(mi1.c("DefaultRelevantJobsMatchInfo"), set2, str, set)) {
            mb8Var.k();
            lVarC = fe5.c(mb8Var, lb3Var);
        } else {
            lVarC = null;
        }
        if (mi1.b(mi1.c("RecentQueryRelevantJobsMatchInfo"), set2, str, set)) {
            mb8Var.k();
            mVarC = ge5.c(mb8Var, lb3Var);
        }
        return new sd5.k(str, lVarC, mVarC);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.k kVar) {
        sd5.k kVar2 = kVar;
        hc8Var.getClass();
        lb3Var.getClass();
        kVar2.getClass();
        hc8Var.u0("__typename");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, kVar2.a);
        sd5.l lVar = kVar2.b;
        if (lVar != null) {
            List<String> list = fe5.a;
            hc8Var.u0("reason");
            gVar.b(hc8Var, lb3Var, lVar.a);
        }
        sd5.m mVar = kVar2.c;
        if (mVar != null) {
            ge5.d(hc8Var, lb3Var, mVar);
        }
    }
}
