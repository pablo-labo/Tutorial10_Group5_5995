package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ia3 implements ga<ha3> {
    public static final ia3 a = new ia3();

    @Override // defpackage.ga
    public final ha3 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        ha3.a.getClass();
        Iterator<T> it = ha3.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((ha3) next).a(), strL)) {
                break;
            }
        }
        ha3 ha3Var = (ha3) next;
        return ha3Var == null ? ha3.b : ha3Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ha3 ha3Var) {
        ha3 ha3Var2 = ha3Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ha3Var2.getClass();
        hc8Var.T0(ha3Var2.a());
    }
}
