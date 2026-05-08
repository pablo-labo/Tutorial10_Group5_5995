package defpackage;

import defpackage.ha;
import defpackage.mob;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pob implements ga<mob> {
    public static final List<String> a = u63.a0("testName", "bucket");

    public static mob c(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        mob.a aVar = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                nob nobVar = nob.a;
                ha.g gVar = ha.a;
                aVar = (mob.a) new ena(nobVar, false).a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "testName");
            throw null;
        }
        if (aVar != null) {
            return new mob(str, aVar);
        }
        mh2.q(mb8Var, "bucket");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, mob mobVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        mobVar.getClass();
        hc8Var.u0("testName");
        ha.a.b(hc8Var, lb3Var, mobVar.a);
        hc8Var.u0("bucket");
        nob nobVar = nob.a;
        mob.a aVar = mobVar.b;
        hc8Var.j();
        nobVar.b(hc8Var, lb3Var, aVar);
        hc8Var.t();
    }
}
