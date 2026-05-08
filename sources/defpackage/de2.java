package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class de2 implements ga<ce2> {
    public static final de2 a = new de2();

    @Override // defpackage.ga
    public final ce2 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        ce2.a.getClass();
        Iterator<T> it = ce2.V.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((ce2) next).a(), strL)) {
                break;
            }
        }
        ce2 ce2Var = (ce2) next;
        return ce2Var == null ? ce2.e : ce2Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ce2 ce2Var) {
        ce2 ce2Var2 = ce2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ce2Var2.getClass();
        hc8Var.T0(ce2Var2.a());
    }
}
