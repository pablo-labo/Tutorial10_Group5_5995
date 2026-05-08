package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class x28 implements ga<w28> {
    public static final x28 a = new x28();

    @Override // defpackage.ga
    public final w28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        w28.a.getClass();
        Iterator<T> it = w28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((w28) next).a(), strL)) {
                break;
            }
        }
        w28 w28Var = (w28) next;
        return w28Var == null ? w28.b : w28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, w28 w28Var) {
        w28 w28Var2 = w28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        w28Var2.getClass();
        hc8Var.T0(w28Var2.a());
    }
}
