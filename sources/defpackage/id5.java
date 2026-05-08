package defpackage;

import defpackage.dd5;
import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class id5 implements ga<dd5.d> {
    public static final id5 a = new id5();
    public static final List<String> b = u63.a0("employer", "whatType");

    @Override // defpackage.ga
    public final dd5.d a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        dd5.c cVar = null;
        qd5 qd5Var = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                hd5 hd5Var = hd5.a;
                ha.g gVar = ha.a;
                cVar = (dd5.c) new ena(hd5Var, false).a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                String strI0 = mb8Var.I0();
                strI0.getClass();
                qd5.a.getClass();
                Iterator<T> it = qd5.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((qd5) next).a(), strI0)) {
                        break;
                    }
                }
                qd5 qd5Var2 = (qd5) next;
                qd5Var = qd5Var2 == null ? qd5.c : qd5Var2;
            }
        }
        if (cVar == null) {
            mh2.q(mb8Var, "employer");
            throw null;
        }
        if (qd5Var != null) {
            return new dd5.d(cVar, qd5Var);
        }
        mh2.q(mb8Var, "whatType");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dd5.d dVar) {
        dd5.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("employer");
        hd5 hd5Var = hd5.a;
        ha.g gVar = ha.a;
        dd5.c cVar = dVar2.a;
        hc8Var.j();
        hd5Var.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
        hc8Var.u0("whatType");
        hc8Var.T0(dVar2.b.a());
    }
}
