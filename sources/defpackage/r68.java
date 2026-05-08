package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r68 implements ga<q68> {
    public static final r68 a = new r68();

    @Override // defpackage.ga
    public final q68 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        q68.a.getClass();
        Iterator<T> it = q68.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((q68) next).a(), strL)) {
                break;
            }
        }
        q68 q68Var = (q68) next;
        return q68Var == null ? q68.d : q68Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q68 q68Var) {
        q68 q68Var2 = q68Var;
        hc8Var.getClass();
        lb3Var.getClass();
        q68Var2.getClass();
        hc8Var.T0(q68Var2.a());
    }
}
