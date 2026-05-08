package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class re2 implements ga<qe2> {
    public static final re2 a = new re2();

    @Override // defpackage.ga
    public final qe2 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        qe2.a.getClass();
        Iterator<T> it = qe2.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((qe2) next).a(), strL)) {
                break;
            }
        }
        qe2 qe2Var = (qe2) next;
        return qe2Var == null ? qe2.b : qe2Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qe2 qe2Var) {
        qe2 qe2Var2 = qe2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        qe2Var2.getClass();
        hc8Var.T0(qe2Var2.a());
    }
}
