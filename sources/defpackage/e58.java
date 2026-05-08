package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e58 implements ga<d58> {
    public static final e58 a = new e58();

    @Override // defpackage.ga
    public final d58 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        d58.a.getClass();
        Iterator<T> it = d58.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((d58) next).a(), strL)) {
                break;
            }
        }
        d58 d58Var = (d58) next;
        return d58Var == null ? d58.c : d58Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, d58 d58Var) {
        d58 d58Var2 = d58Var;
        hc8Var.getClass();
        lb3Var.getClass();
        d58Var2.getClass();
        hc8Var.T0(d58Var2.a());
    }
}
