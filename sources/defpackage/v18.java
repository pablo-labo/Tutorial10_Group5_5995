package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class v18 implements ga<u18> {
    public static final v18 a = new v18();

    @Override // defpackage.ga
    public final u18 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        u18.a.getClass();
        Iterator<T> it = u18.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((u18) next).a(), strL)) {
                break;
            }
        }
        u18 u18Var = (u18) next;
        return u18Var == null ? u18.d : u18Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, u18 u18Var) {
        u18 u18Var2 = u18Var;
        hc8Var.getClass();
        lb3Var.getClass();
        u18Var2.getClass();
        hc8Var.T0(u18Var2.a());
    }
}
