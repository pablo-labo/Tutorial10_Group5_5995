package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class q9c implements ga<p9c> {
    public static final q9c a = new q9c();

    @Override // defpackage.ga
    public final p9c a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        p9c.a.getClass();
        Iterator<T> it = p9c.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((p9c) next).a(), strL)) {
                break;
            }
        }
        p9c p9cVar = (p9c) next;
        return p9cVar == null ? p9c.b : p9cVar;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p9c p9cVar) {
        p9c p9cVar2 = p9cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        p9cVar2.getClass();
        hc8Var.T0(p9cVar2.a());
    }
}
