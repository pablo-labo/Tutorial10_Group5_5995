package defpackage;

import defpackage.ha;
import defpackage.j2h;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m2h implements ga<j2h> {
    public static final List<String> a = u63.a0("id", "title", "company", "location", "dateRange", "description");

    public static j2h c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        String strA2 = null;
        j2h.b bVar = null;
        j2h.a aVar = null;
        String strA3 = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 != 2) {
                mb8.a aVar2 = mb8.a.Y;
                if (iD1 == 3) {
                    l2h l2hVar = l2h.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(l2hVar, false);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar.a(mb8Var, lb3Var);
                    }
                    bVar = (j2h.b) objA2;
                } else if (iD1 == 4) {
                    k2h k2hVar = k2h.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(k2hVar, true);
                    if (mb8Var.peek() == aVar2) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar2.a(mb8Var, lb3Var);
                    }
                    aVar = (j2h.a) objA;
                } else {
                    if (iD1 != 5) {
                        break;
                    }
                    strA3 = ha.i.a(mb8Var, lb3Var);
                }
            } else {
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new j2h(str, strA, strA2, bVar, aVar, strA3);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, j2h j2hVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        j2hVar.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, j2hVar.a);
        hc8Var.u0("title");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, j2hVar.b);
        hc8Var.u0("company");
        nmaVar.b(hc8Var, lb3Var, j2hVar.c);
        hc8Var.u0("location");
        ena enaVar = new ena(l2h.a, false);
        j2h.b bVar = j2hVar.d;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
        hc8Var.u0("dateRange");
        ena enaVar2 = new ena(k2h.a, true);
        j2h.a aVar = j2hVar.e;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("description");
        nmaVar.b(hc8Var, lb3Var, j2hVar.f);
    }
}
