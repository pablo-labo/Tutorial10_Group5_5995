package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t28 implements ga<s28> {
    public static final t28 a = new t28();

    @Override // defpackage.ga
    public final s28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        s28.a.getClass();
        Iterator<T> it = s28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((s28) next).a(), strL)) {
                break;
            }
        }
        s28 s28Var = (s28) next;
        return s28Var == null ? s28.b : s28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, s28 s28Var) {
        s28 s28Var2 = s28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        s28Var2.getClass();
        hc8Var.T0(s28Var2.a());
    }
}
