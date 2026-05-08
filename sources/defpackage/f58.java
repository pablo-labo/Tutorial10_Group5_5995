package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class f58 implements ga<c58> {
    public static final f58 a = new f58();

    @Override // defpackage.ga
    public final c58 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        c58.a.getClass();
        Iterator<T> it = c58.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((c58) next).a(), strL)) {
                break;
            }
        }
        c58 c58Var = (c58) next;
        return c58Var == null ? c58.d : c58Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, c58 c58Var) {
        c58 c58Var2 = c58Var;
        hc8Var.getClass();
        lb3Var.getClass();
        c58Var2.getClass();
        hc8Var.T0(c58Var2.a());
    }
}
