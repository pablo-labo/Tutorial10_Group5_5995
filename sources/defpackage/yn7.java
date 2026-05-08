package defpackage;

import defpackage.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class yn7 implements ga<xn7> {
    public static final yn7 a = new yn7();

    @Override // defpackage.ga
    public final xn7 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        xn7.a.getClass();
        Object it = xn7.e.iterator();
        while (true) {
            w2.b bVar = (w2.b) it;
            if (!bVar.hasNext()) {
                next = null;
                break;
            }
            next = bVar.next();
            if (wl7.b(((xn7) next).a(), strL)) {
                break;
            }
        }
        xn7 xn7Var = (xn7) next;
        return xn7Var == null ? xn7.c : xn7Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xn7 xn7Var) {
        xn7 xn7Var2 = xn7Var;
        hc8Var.getClass();
        lb3Var.getClass();
        xn7Var2.getClass();
        hc8Var.T0(xn7Var2.a());
    }
}
