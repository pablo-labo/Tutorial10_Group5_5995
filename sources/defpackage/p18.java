package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class p18 implements ga<o18> {
    public static final p18 a = new p18();

    @Override // defpackage.ga
    public final o18 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        o18.a.getClass();
        Iterator<T> it = o18.W.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((o18) next).a(), strL)) {
                break;
            }
        }
        o18 o18Var = (o18) next;
        return o18Var == null ? o18.f : o18Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o18 o18Var) {
        o18 o18Var2 = o18Var;
        hc8Var.getClass();
        lb3Var.getClass();
        o18Var2.getClass();
        hc8Var.T0(o18Var2.a());
    }
}
