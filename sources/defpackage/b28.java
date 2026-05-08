package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b28 implements ga<a28> {
    public static final b28 a = new b28();

    @Override // defpackage.ga
    public final a28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        a28.a.getClass();
        Iterator<T> it = a28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((a28) next).a(), strL)) {
                break;
            }
        }
        a28 a28Var = (a28) next;
        return a28Var == null ? a28.b : a28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, a28 a28Var) {
        a28 a28Var2 = a28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        a28Var2.getClass();
        hc8Var.T0(a28Var2.a());
    }
}
