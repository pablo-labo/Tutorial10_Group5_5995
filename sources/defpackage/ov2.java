package defpackage;

import defpackage.jv2;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ov2 implements ga<jv2.d> {
    public static final ov2 a = new ov2();
    public static final List<String> b = u63.a0("role", "accountKey", "participantName", "removed");

    @Override // defpackage.ga
    public final jv2.d a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        gy2 gy2Var = null;
        String strA = null;
        String strA2 = null;
        Boolean boolA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                String strI0 = mb8Var.I0();
                strI0.getClass();
                gy2.a.getClass();
                Iterator<T> it = gy2.X.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((gy2) next).a(), strI0)) {
                        break;
                    }
                }
                gy2 gy2Var2 = (gy2) next;
                gy2Var = gy2Var2 == null ? gy2.V : gy2Var2;
            } else if (iD1 == 1) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                boolA = ha.l.a(mb8Var, lb3Var);
            }
        }
        if (gy2Var != null) {
            return new jv2.d(gy2Var, strA, strA2, boolA);
        }
        mh2.q(mb8Var, "role");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.d dVar) {
        jv2.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("role");
        hc8Var.T0(dVar2.a.a());
        hc8Var.u0("accountKey");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, dVar2.b);
        hc8Var.u0("participantName");
        nmaVar.b(hc8Var, lb3Var, dVar2.c);
        hc8Var.u0("removed");
        ha.l.b(hc8Var, lb3Var, dVar2.d);
    }
}
