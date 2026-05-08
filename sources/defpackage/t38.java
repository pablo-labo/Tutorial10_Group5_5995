package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t38 implements ga<s38> {
    public static final t38 a = new t38();

    @Override // defpackage.ga
    public final s38 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        s38.a.getClass();
        Iterator<T> it = s38.g0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((s38) next).a(), strL)) {
                break;
            }
        }
        s38 s38Var = (s38) next;
        return s38Var == null ? s38.e0 : s38Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s38 s38Var) {
        s38 s38Var2 = s38Var;
        hc8Var.getClass();
        lb3Var.getClass();
        s38Var2.getClass();
        hc8Var.T0(s38Var2.a());
    }
}
