package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z18 implements ga<y18> {
    public static final z18 a = new z18();

    @Override // defpackage.ga
    public final y18 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        y18.a.getClass();
        Iterator<T> it = y18.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((y18) next).a(), strL)) {
                break;
            }
        }
        y18 y18Var = (y18) next;
        return y18Var == null ? y18.d : y18Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y18 y18Var) {
        y18 y18Var2 = y18Var;
        hc8Var.getClass();
        lb3Var.getClass();
        y18Var2.getClass();
        hc8Var.T0(y18Var2.a());
    }
}
