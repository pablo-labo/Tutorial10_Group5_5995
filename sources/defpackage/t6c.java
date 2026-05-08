package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.ha;
import defpackage.mb8;
import defpackage.r6c;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t6c implements ga<r6c> {
    public static final List<String> a = u63.a0("id", LogAttributes.DATE, "description", "title", "url");

    public static r6c c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        r6c.a aVar = null;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                s6c s6cVar = s6c.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(s6cVar, true);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                aVar = (r6c.a) objA;
            } else if (iD1 == 2) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 3) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 4) {
                    break;
                }
                strA3 = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new r6c(str, aVar, strA, strA2, strA3);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, r6c r6cVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        r6cVar.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, r6cVar.a);
        hc8Var.u0(LogAttributes.DATE);
        ena enaVar = new ena(s6c.a, true);
        r6c.a aVar = r6cVar.b;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("description");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, r6cVar.c);
        hc8Var.u0("title");
        nmaVar.b(hc8Var, lb3Var, r6cVar.d);
        hc8Var.u0("url");
        nmaVar.b(hc8Var, lb3Var, r6cVar.e);
    }
}
