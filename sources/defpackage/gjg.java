package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gjg implements ga<fjg> {
    public static final gjg a = new gjg();

    @Override // defpackage.ga
    public final fjg a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        fjg.a.getClass();
        Iterator<T> it = fjg.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((fjg) next).a(), strL)) {
                break;
            }
        }
        fjg fjgVar = (fjg) next;
        return fjgVar == null ? fjg.b : fjgVar;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fjg fjgVar) {
        fjg fjgVar2 = fjgVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fjgVar2.getClass();
        hc8Var.T0(fjgVar2.a());
    }
}
