package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z28 implements ga<y28> {
    public static final z28 a = new z28();

    @Override // defpackage.ga
    public final y28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        y28.a.getClass();
        Iterator<T> it = y28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((y28) next).a(), strL)) {
                break;
            }
        }
        y28 y28Var = (y28) next;
        return y28Var == null ? y28.b : y28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y28 y28Var) {
        y28 y28Var2 = y28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        y28Var2.getClass();
        hc8Var.T0(y28Var2.a());
    }
}
