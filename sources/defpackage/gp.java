package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gp implements ga<fp> {
    public static final gp a = new gp();

    @Override // defpackage.ga
    public final fp a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        fp.a.getClass();
        Iterator<T> it = fp.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((fp) next).a(), strL)) {
                break;
            }
        }
        fp fpVar = (fp) next;
        return fpVar == null ? fp.b : fpVar;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fp fpVar) {
        fp fpVar2 = fpVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fpVar2.getClass();
        hc8Var.T0(fpVar2.a());
    }
}
