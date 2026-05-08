package defpackage;

import com.datadog.android.log.LogAttributes;
import defpackage.ha;
import defpackage.mb8;
import defpackage.s61;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t61 implements ga<s61> {
    public static final List<String> a = u63.a0("id", LogAttributes.DATE, "description", "title");

    public static s61 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        s61.a aVar = null;
        String strA = null;
        String strA2 = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                u61 u61Var = u61.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(u61Var, true);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                aVar = (s61.a) objA;
            } else if (iD1 == 2) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new s61(str, aVar, strA, strA2);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, s61 s61Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        s61Var.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, s61Var.a);
        hc8Var.u0(LogAttributes.DATE);
        ena enaVar = new ena(u61.a, true);
        s61.a aVar = s61Var.b;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
        hc8Var.u0("description");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, s61Var.c);
        hc8Var.u0("title");
        nmaVar.b(hc8Var, lb3Var, s61Var.d);
    }
}
