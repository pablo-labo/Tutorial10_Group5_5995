package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fbf implements ga<ebf> {
    public static final fbf a = new fbf();

    @Override // defpackage.ga
    public final ebf a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        ebf.a.getClass();
        Iterator<T> it = ebf.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((ebf) next).a(), strL)) {
                break;
            }
        }
        ebf ebfVar = (ebf) next;
        return ebfVar == null ? ebf.c : ebfVar;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ebf ebfVar) {
        ebf ebfVar2 = ebfVar;
        hc8Var.getClass();
        lb3Var.getClass();
        ebfVar2.getClass();
        hc8Var.T0(ebfVar2.a());
    }
}
