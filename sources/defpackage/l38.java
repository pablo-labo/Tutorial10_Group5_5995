package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l38 implements ga<k38> {
    public static final l38 a = new l38();

    @Override // defpackage.ga
    public final k38 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        k38.a.getClass();
        Iterator<T> it = k38.W.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((k38) next).a(), strL)) {
                break;
            }
        }
        k38 k38Var = (k38) next;
        return k38Var == null ? k38.f : k38Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, k38 k38Var) {
        k38 k38Var2 = k38Var;
        hc8Var.getClass();
        lb3Var.getClass();
        k38Var2.getClass();
        hc8Var.T0(k38Var2.a());
    }
}
