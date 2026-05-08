package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.ha;
import defpackage.mb8;
import defpackage.q5b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s5b implements ga<q5b> {
    public static final List<String> a = u63.a0("id", LogAttributes.DATE, "patentNumber", "description", "title", "url");

    public static q5b c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        q5b.a aVar = null;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                r5b r5bVar = r5b.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(r5bVar, true);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                aVar = (q5b.a) objA;
            } else if (iD1 == 2) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 3) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 4) {
                strA3 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 5) {
                    break;
                }
                strA4 = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new q5b(str, aVar, strA, strA2, strA3, strA4);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, q5b q5bVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        q5bVar.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, q5bVar.a);
        hc8Var.u0(LogAttributes.DATE);
        ena enaVar = new ena(r5b.a, true);
        q5b.a aVar = q5bVar.b;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("patentNumber");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, q5bVar.c);
        hc8Var.u0("description");
        nmaVar.b(hc8Var, lb3Var, q5bVar.d);
        hc8Var.u0("title");
        nmaVar.b(hc8Var, lb3Var, q5bVar.e);
        hc8Var.u0("url");
        nmaVar.b(hc8Var, lb3Var, q5bVar.f);
    }
}
