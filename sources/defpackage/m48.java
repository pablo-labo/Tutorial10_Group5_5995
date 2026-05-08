package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m48 implements ga<l48> {
    public static final m48 a = new m48();

    @Override // defpackage.ga
    public final l48 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        l48.a.getClass();
        Iterator<T> it = l48.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((l48) next).a(), strL)) {
                break;
            }
        }
        l48 l48Var = (l48) next;
        return l48Var == null ? l48.c : l48Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l48 l48Var) {
        l48 l48Var2 = l48Var;
        hc8Var.getClass();
        lb3Var.getClass();
        l48Var2.getClass();
        hc8Var.T0(l48Var2.a());
    }
}
