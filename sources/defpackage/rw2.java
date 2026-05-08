package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class rw2 implements ga<qw2> {
    public static final rw2 a = new rw2();

    @Override // defpackage.ga
    public final qw2 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        qw2.a.getClass();
        Iterator<T> it = qw2.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((qw2) next).a(), strL)) {
                break;
            }
        }
        qw2 qw2Var = (qw2) next;
        return qw2Var == null ? qw2.c : qw2Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qw2 qw2Var) {
        qw2 qw2Var2 = qw2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        qw2Var2.getClass();
        hc8Var.T0(qw2Var2.a());
    }
}
