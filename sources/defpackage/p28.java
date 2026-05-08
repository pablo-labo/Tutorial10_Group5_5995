package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class p28 implements ga<o28> {
    public static final p28 a = new p28();

    @Override // defpackage.ga
    public final o28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        o28.a.getClass();
        Iterator<T> it = o28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((o28) next).a(), strL)) {
                break;
            }
        }
        o28 o28Var = (o28) next;
        return o28Var == null ? o28.b : o28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o28 o28Var) {
        o28 o28Var2 = o28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        o28Var2.getClass();
        hc8Var.T0(o28Var2.a());
    }
}
