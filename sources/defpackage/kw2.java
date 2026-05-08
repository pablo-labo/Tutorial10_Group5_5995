package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kw2 implements ga<jw2> {
    public static final kw2 a = new kw2();

    @Override // defpackage.ga
    public final jw2 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        jw2.a.getClass();
        Iterator<T> it = jw2.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((jw2) next).a(), strL)) {
                break;
            }
        }
        jw2 jw2Var = (jw2) next;
        return jw2Var == null ? jw2.d : jw2Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jw2 jw2Var) {
        jw2 jw2Var2 = jw2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        jw2Var2.getClass();
        hc8Var.T0(jw2Var2.a());
    }
}
