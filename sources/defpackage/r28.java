package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r28 implements ga<q28> {
    public static final r28 a = new r28();

    @Override // defpackage.ga
    public final q28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        q28.a.getClass();
        Iterator<T> it = q28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((q28) next).a(), strL)) {
                break;
            }
        }
        q28 q28Var = (q28) next;
        return q28Var == null ? q28.b : q28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q28 q28Var) {
        q28 q28Var2 = q28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        q28Var2.getClass();
        hc8Var.T0(q28Var2.a());
    }
}
