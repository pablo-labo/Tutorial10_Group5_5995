package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class s29 implements ga<r29> {
    public static final s29 a = new s29();

    @Override // defpackage.ga
    public final r29 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        r29.a.getClass();
        Iterator<T> it = r29.W.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((r29) next).a(), strL)) {
                break;
            }
        }
        r29 r29Var = (r29) next;
        return r29Var == null ? r29.f : r29Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, r29 r29Var) {
        r29 r29Var2 = r29Var;
        hc8Var.getClass();
        lb3Var.getClass();
        r29Var2.getClass();
        hc8Var.T0(r29Var2.a());
    }
}
