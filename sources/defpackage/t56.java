package defpackage;

import defpackage.p56;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t56 implements ga<p56.c> {
    public static final t56 a = new t56();
    public static final List<String> b = u63.a0("errorMessage", "responseCode");

    @Override // defpackage.ga
    public final p56.c a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        sf9 sf9Var = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                String strI0 = mb8Var.I0();
                strI0.getClass();
                sf9.a.getClass();
                Iterator<T> it = sf9.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((sf9) next).a(), strI0)) {
                        break;
                    }
                }
                sf9 sf9Var2 = (sf9) next;
                sf9Var = sf9Var2 == null ? sf9.c : sf9Var2;
            }
        }
        if (sf9Var != null) {
            return new p56.c(strA, sf9Var);
        }
        mh2.q(mb8Var, "responseCode");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p56.c cVar) {
        p56.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("errorMessage");
        ha.i.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("responseCode");
        hc8Var.T0(cVar2.b.a());
    }
}
