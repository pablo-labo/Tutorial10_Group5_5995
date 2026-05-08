package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d28 implements ga<c28> {
    public static final d28 a = new d28();

    @Override // defpackage.ga
    public final c28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        c28.a.getClass();
        Iterator<T> it = c28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((c28) next).a(), strL)) {
                break;
            }
        }
        c28 c28Var = (c28) next;
        return c28Var == null ? c28.b : c28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, c28 c28Var) {
        c28 c28Var2 = c28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        c28Var2.getClass();
        hc8Var.T0(c28Var2.a());
    }
}
