package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class f28 implements ga<e28> {
    public static final f28 a = new f28();

    @Override // defpackage.ga
    public final e28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        e28.a.getClass();
        Iterator<T> it = e28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((e28) next).a(), strL)) {
                break;
            }
        }
        e28 e28Var = (e28) next;
        return e28Var == null ? e28.b : e28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e28 e28Var) {
        e28 e28Var2 = e28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        e28Var2.getClass();
        hc8Var.T0(e28Var2.a());
    }
}
