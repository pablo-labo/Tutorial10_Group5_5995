package defpackage;

import defpackage.w2;

/* JADX INFO: loaded from: classes2.dex */
public final class hy2 implements ga<gy2> {
    public static final hy2 a = new hy2();

    @Override // defpackage.ga
    public final gy2 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        gy2.a.getClass();
        Object it = gy2.X.iterator();
        while (true) {
            w2.b bVar = (w2.b) it;
            if (!bVar.hasNext()) {
                next = null;
                break;
            }
            next = bVar.next();
            if (wl7.b(((gy2) next).a(), strL)) {
                break;
            }
        }
        gy2 gy2Var = (gy2) next;
        return gy2Var == null ? gy2.V : gy2Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, gy2 gy2Var) {
        gy2 gy2Var2 = gy2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        gy2Var2.getClass();
        hc8Var.T0(gy2Var2.a());
    }
}
