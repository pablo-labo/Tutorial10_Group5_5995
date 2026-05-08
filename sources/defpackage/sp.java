package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class sp implements ga<rp> {
    public static final sp a = new sp();

    @Override // defpackage.ga
    public final rp a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        rp.a.getClass();
        Iterator<T> it = rp.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((rp) next).a(), strL)) {
                break;
            }
        }
        rp rpVar = (rp) next;
        return rpVar == null ? rp.b : rpVar;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rp rpVar) {
        rp rpVar2 = rpVar;
        hc8Var.getClass();
        lb3Var.getClass();
        rpVar2.getClass();
        hc8Var.T0(rpVar2.a());
    }
}
