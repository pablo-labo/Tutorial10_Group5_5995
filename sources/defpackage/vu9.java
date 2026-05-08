package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vu9 implements ga<uu9> {
    public static final vu9 a = new vu9();

    @Override // defpackage.ga
    public final uu9 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        uu9.a.getClass();
        Iterator<T> it = uu9.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((uu9) next).a(), strL)) {
                break;
            }
        }
        uu9 uu9Var = (uu9) next;
        return uu9Var == null ? uu9.c : uu9Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, uu9 uu9Var) {
        uu9 uu9Var2 = uu9Var;
        hc8Var.getClass();
        lb3Var.getClass();
        uu9Var2.getClass();
        hc8Var.T0(uu9Var2.a());
    }
}
