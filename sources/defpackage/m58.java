package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m58 implements ga<l58> {
    public static final m58 a = new m58();

    @Override // defpackage.ga
    public final l58 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        l58.a.getClass();
        Iterator<T> it = l58.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((l58) next).a(), strL)) {
                break;
            }
        }
        l58 l58Var = (l58) next;
        return l58Var == null ? l58.b : l58Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, l58 l58Var) {
        l58 l58Var2 = l58Var;
        hc8Var.getClass();
        lb3Var.getClass();
        l58Var2.getClass();
        hc8Var.T0(l58Var2.a());
    }
}
