package defpackage;

import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ge5 implements ga<sd5.m> {
    public static final List<String> a = u63.a0("query", "location", "reason");

    public static sd5.m c(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new sd5.m(strA, strA2, str);
        }
        mh2.q(mb8Var, "reason");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, sd5.m mVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        mVar.getClass();
        hc8Var.u0("query");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, mVar.a);
        hc8Var.u0("location");
        nmaVar.b(hc8Var, lb3Var, mVar.b);
        hc8Var.u0("reason");
        ha.a.b(hc8Var, lb3Var, mVar.c);
    }
}
