package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class f38 implements ga<e38> {
    public static final f38 a = new f38();

    @Override // defpackage.ga
    public final e38 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        e38.a.getClass();
        Iterator<T> it = e38.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((e38) next).a(), strL)) {
                break;
            }
        }
        e38 e38Var = (e38) next;
        return e38Var == null ? e38.b : e38Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e38 e38Var) {
        e38 e38Var2 = e38Var;
        hc8Var.getClass();
        lb3Var.getClass();
        e38Var2.getClass();
        hc8Var.T0(e38Var2.a());
    }
}
