package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k48 implements ga<j48> {
    public static final k48 a = new k48();

    @Override // defpackage.ga
    public final j48 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        j48.a.getClass();
        Iterator<T> it = j48.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((j48) next).a(), strL)) {
                break;
            }
        }
        j48 j48Var = (j48) next;
        return j48Var == null ? j48.b : j48Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j48 j48Var) {
        j48 j48Var2 = j48Var;
        hc8Var.getClass();
        lb3Var.getClass();
        j48Var2.getClass();
        hc8Var.T0(j48Var2.a());
    }
}
