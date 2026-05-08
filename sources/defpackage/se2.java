package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class se2 implements ga<pe2> {
    public static final se2 a = new se2();

    @Override // defpackage.ga
    public final pe2 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        pe2.a.getClass();
        Iterator<T> it = pe2.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((pe2) next).a(), strL)) {
                break;
            }
        }
        pe2 pe2Var = (pe2) next;
        return pe2Var == null ? pe2.b : pe2Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, pe2 pe2Var) {
        pe2 pe2Var2 = pe2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        pe2Var2.getClass();
        hc8Var.T0(pe2Var2.a());
    }
}
