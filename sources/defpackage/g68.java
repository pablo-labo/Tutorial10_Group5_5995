package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g68 implements ga<f68> {
    public static final g68 a = new g68();

    @Override // defpackage.ga
    public final f68 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        f68.a.getClass();
        Iterator<T> it = f68.Z.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((f68) next).a(), strL)) {
                break;
            }
        }
        f68 f68Var = (f68) next;
        return f68Var == null ? f68.X : f68Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, f68 f68Var) {
        f68 f68Var2 = f68Var;
        hc8Var.getClass();
        lb3Var.getClass();
        f68Var2.getClass();
        hc8Var.T0(f68Var2.a());
    }
}
