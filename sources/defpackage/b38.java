package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b38 implements ga<a38> {
    public static final b38 a = new b38();

    @Override // defpackage.ga
    public final a38 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        a38.a.getClass();
        Iterator<T> it = a38.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((a38) next).a(), strL)) {
                break;
            }
        }
        a38 a38Var = (a38) next;
        return a38Var == null ? a38.b : a38Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, a38 a38Var) {
        a38 a38Var2 = a38Var;
        hc8Var.getClass();
        lb3Var.getClass();
        a38Var2.getClass();
        hc8Var.T0(a38Var2.a());
    }
}
