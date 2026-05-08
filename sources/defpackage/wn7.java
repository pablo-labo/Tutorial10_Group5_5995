package defpackage;

import defpackage.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class wn7 implements ga<vn7> {
    public static final wn7 a = new wn7();

    @Override // defpackage.ga
    public final vn7 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        vn7.a.getClass();
        Object it = vn7.e.iterator();
        while (true) {
            w2.b bVar = (w2.b) it;
            if (!bVar.hasNext()) {
                next = null;
                break;
            }
            next = bVar.next();
            if (wl7.b(((vn7) next).a(), strL)) {
                break;
            }
        }
        vn7 vn7Var = (vn7) next;
        return vn7Var == null ? vn7.c : vn7Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vn7 vn7Var) {
        vn7 vn7Var2 = vn7Var;
        hc8Var.getClass();
        lb3Var.getClass();
        vn7Var2.getClass();
        hc8Var.T0(vn7Var2.a());
    }
}
