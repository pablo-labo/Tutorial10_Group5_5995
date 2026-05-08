package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h28 implements ga<g28> {
    public static final h28 a = new h28();

    @Override // defpackage.ga
    public final g28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        g28.a.getClass();
        Iterator<T> it = g28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((g28) next).a(), strL)) {
                break;
            }
        }
        g28 g28Var = (g28) next;
        return g28Var == null ? g28.b : g28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g28 g28Var) {
        g28 g28Var2 = g28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        g28Var2.getClass();
        hc8Var.T0(g28Var2.a());
    }
}
