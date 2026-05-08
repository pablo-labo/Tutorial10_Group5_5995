package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w18 implements ga<t18> {
    public static final w18 a = new w18();

    @Override // defpackage.ga
    public final t18 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        t18.a.getClass();
        Iterator<T> it = t18.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((t18) next).a(), strL)) {
                break;
            }
        }
        t18 t18Var = (t18) next;
        return t18Var == null ? t18.c : t18Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, t18 t18Var) {
        t18 t18Var2 = t18Var;
        hc8Var.getClass();
        lb3Var.getClass();
        t18Var2.getClass();
        hc8Var.T0(t18Var2.a());
    }
}
