package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ee2 implements ga<be2> {
    public static final ee2 a = new ee2();

    @Override // defpackage.ga
    public final be2 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        be2.a.getClass();
        Iterator<T> it = be2.V.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((be2) next).a(), strL)) {
                break;
            }
        }
        be2 be2Var = (be2) next;
        return be2Var == null ? be2.e : be2Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, be2 be2Var) {
        be2 be2Var2 = be2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        be2Var2.getClass();
        hc8Var.T0(be2Var2.a());
    }
}
