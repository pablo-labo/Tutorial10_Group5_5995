package defpackage;

import defpackage.ha;
import defpackage.it9;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kt9 implements ga<it9> {
    public static final List<String> a = u63.a0("id", "country", "branch", "rank", "description", "serviceCode", "dateRange");

    public static it9 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        String strA5 = null;
        it9.a aVar = null;
        while (true) {
            switch (mb8Var.D1(a)) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 3:
                    strA3 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 4:
                    strA4 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 5:
                    strA5 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 6:
                    jt9 jt9Var = jt9.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(jt9Var, true);
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar.a(mb8Var, lb3Var);
                    }
                    aVar = (it9.a) objA;
                    break;
                default:
                    if (str != null) {
                        return new it9(str, strA, strA2, strA3, strA4, strA5, aVar);
                    }
                    mh2.q(mb8Var, "id");
                    throw null;
            }
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, it9 it9Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        it9Var.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, it9Var.a);
        hc8Var.u0("country");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, it9Var.b);
        hc8Var.u0("branch");
        nmaVar.b(hc8Var, lb3Var, it9Var.c);
        hc8Var.u0("rank");
        nmaVar.b(hc8Var, lb3Var, it9Var.d);
        hc8Var.u0("description");
        nmaVar.b(hc8Var, lb3Var, it9Var.e);
        hc8Var.u0("serviceCode");
        nmaVar.b(hc8Var, lb3Var, it9Var.f);
        hc8Var.u0("dateRange");
        ena enaVar = new ena(jt9.a, true);
        it9.a aVar = it9Var.g;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
