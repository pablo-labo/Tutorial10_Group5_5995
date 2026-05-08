package defpackage;

import defpackage.ha;
import defpackage.jv2;
import defpackage.mb8;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tv2 implements ga<jv2.i> {
    public static final tv2 a = new tv2();
    public static final List<String> b = u63.a0("lastVisited", "readCursor", "unreadCount");

    @Override // defpackage.ga
    public final jv2.i a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        Date date = null;
        Date date2 = null;
        Integer num = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                ga gaVarE = lb3Var.e(qg3.a);
                ha.g gVar = ha.a;
                if (gaVarE instanceof nma) {
                    r6.g("The adapter is already nullable");
                    return null;
                }
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = gaVarE.a(mb8Var, lb3Var);
                }
                date = (Date) objA;
            } else if (iD1 == 1) {
                date2 = (Date) lb3Var.e(qg3.a).a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    if (date2 == null) {
                        mh2.q(mb8Var, "readCursor");
                        throw null;
                    }
                    if (num != null) {
                        return new jv2.i(date, date2, num.intValue());
                    }
                    mh2.q(mb8Var, "unreadCount");
                    throw null;
                }
                num = (Integer) ha.b.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.i iVar) {
        jv2.i iVar2 = iVar;
        hc8Var.getClass();
        lb3Var.getClass();
        iVar2.getClass();
        hc8Var.u0("lastVisited");
        mb3 mb3Var = qg3.a;
        ga gaVarE = lb3Var.e(mb3Var);
        ha.g gVar = ha.a;
        if (gaVarE instanceof nma) {
            r6.g("The adapter is already nullable");
            return;
        }
        Date date = iVar2.a;
        if (date == null) {
            hc8Var.H1();
        } else {
            gaVarE.b(hc8Var, lb3Var, date);
        }
        hc8Var.u0("readCursor");
        lb3Var.e(mb3Var).b(hc8Var, lb3Var, iVar2.b);
        hc8Var.u0("unreadCount");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(iVar2.c));
    }
}
