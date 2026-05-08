package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h38 implements ga<g38> {
    public static final h38 a = new h38();

    @Override // defpackage.ga
    public final g38 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        g38.a.getClass();
        Iterator<T> it = g38.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((g38) next).a(), strL)) {
                break;
            }
        }
        g38 g38Var = (g38) next;
        return g38Var == null ? g38.b : g38Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g38 g38Var) {
        g38 g38Var2 = g38Var;
        hc8Var.getClass();
        lb3Var.getClass();
        g38Var2.getClass();
        hc8Var.T0(g38Var2.a());
    }
}
