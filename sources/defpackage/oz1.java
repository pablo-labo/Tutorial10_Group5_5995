package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.nz1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oz1 implements ga<nz1> {
    public static final List<String> a = u63.a0("title", "description", "dateRange", "id");

    public static nz1 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        nz1.a aVar = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                pz1 pz1Var = pz1.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(pz1Var, true);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                aVar = (nz1.a) objA;
            } else {
                if (iD1 != 3) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new nz1(strA, strA2, aVar, str);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, nz1 nz1Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        nz1Var.getClass();
        hc8Var.u0("title");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, nz1Var.a);
        hc8Var.u0("description");
        nmaVar.b(hc8Var, lb3Var, nz1Var.b);
        hc8Var.u0("dateRange");
        ena enaVar = new ena(pz1.a, true);
        nz1.a aVar = nz1Var.c;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, nz1Var.d);
    }
}
