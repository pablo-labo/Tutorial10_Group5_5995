package defpackage;

import defpackage.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class j68 implements ga<h68> {
    public static final j68 a = new j68();

    @Override // defpackage.ga
    public final h68 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        h68.a.getClass();
        Object it = h68.f.iterator();
        while (true) {
            w2.b bVar = (w2.b) it;
            if (!bVar.hasNext()) {
                next = null;
                break;
            }
            next = bVar.next();
            if (wl7.b(((h68) next).a(), strL)) {
                break;
            }
        }
        h68 h68Var = (h68) next;
        return h68Var == null ? h68.d : h68Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, h68 h68Var) {
        h68 h68Var2 = h68Var;
        hc8Var.getClass();
        lb3Var.getClass();
        h68Var2.getClass();
        hc8Var.T0(h68Var2.a());
    }
}
