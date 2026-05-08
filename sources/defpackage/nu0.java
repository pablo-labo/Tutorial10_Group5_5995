package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.mu0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nu0 implements ga<mu0> {
    public static final List<String> a = u63.a0("title", "description", "dateRange", "id");

    public static mu0 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        mu0.a aVar = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                ou0 ou0Var = ou0.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(ou0Var, true);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                aVar = (mu0.a) objA;
            } else {
                if (iD1 != 3) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new mu0(strA, strA2, aVar, str);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, mu0 mu0Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        mu0Var.getClass();
        hc8Var.u0("title");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, mu0Var.a);
        hc8Var.u0("description");
        nmaVar.b(hc8Var, lb3Var, mu0Var.b);
        hc8Var.u0("dateRange");
        ena enaVar = new ena(ou0.a, true);
        mu0.a aVar = mu0Var.c;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, mu0Var.d);
    }
}
