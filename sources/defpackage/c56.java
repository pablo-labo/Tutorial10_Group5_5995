package defpackage;

import defpackage.y46;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c56 implements ga<y46.c> {
    public static final c56 a = new c56();
    public static final List<String> b = u63.a0("id", "jobTitle", "normalizedValue", "sentiment");

    @Override // defpackage.ga
    public final y46.c a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        h68 h68Var = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                strA3 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                String strI0 = mb8Var.I0();
                strI0.getClass();
                h68.a.getClass();
                Iterator<T> it = h68.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((h68) next).a(), strI0)) {
                        break;
                    }
                }
                h68 h68Var2 = (h68) next;
                h68Var = h68Var2 == null ? h68.d : h68Var2;
            }
        }
        if (h68Var != null) {
            return new y46.c(h68Var, strA, strA2, strA3);
        }
        mh2.q(mb8Var, "sentiment");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y46.c cVar) {
        y46.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("id");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("jobTitle");
        nmaVar.b(hc8Var, lb3Var, cVar2.b);
        hc8Var.u0("normalizedValue");
        nmaVar.b(hc8Var, lb3Var, cVar2.c);
        hc8Var.u0("sentiment");
        hc8Var.T0(cVar2.d.a());
    }
}
