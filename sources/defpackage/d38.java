package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d38 implements ga<c38> {
    public static final d38 a = new d38();

    @Override // defpackage.ga
    public final c38 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        c38.a.getClass();
        Iterator<T> it = c38.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((c38) next).a(), strL)) {
                break;
            }
        }
        c38 c38Var = (c38) next;
        return c38Var == null ? c38.b : c38Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, c38 c38Var) {
        c38 c38Var2 = c38Var;
        hc8Var.getClass();
        lb3Var.getClass();
        c38Var2.getClass();
        hc8Var.T0(c38Var2.a());
    }
}
