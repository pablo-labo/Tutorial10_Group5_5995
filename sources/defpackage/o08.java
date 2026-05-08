package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o08 implements ga<h08> {
    public static final o08 a = new o08();

    @Override // defpackage.ga
    public final h08 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        h08.a.getClass();
        Iterator<T> it = h08.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((h08) next).a(), strL)) {
                break;
            }
        }
        h08 h08Var = (h08) next;
        return h08Var == null ? h08.d : h08Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, h08 h08Var) {
        h08 h08Var2 = h08Var;
        hc8Var.getClass();
        lb3Var.getClass();
        h08Var2.getClass();
        hc8Var.T0(h08Var2.a());
    }
}
