package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l28 implements ga<i28> {
    public static final l28 a = new l28();

    @Override // defpackage.ga
    public final i28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        i28.a.getClass();
        Iterator<T> it = i28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((i28) next).a(), strL)) {
                break;
            }
        }
        i28 i28Var = (i28) next;
        return i28Var == null ? i28.b : i28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, i28 i28Var) {
        i28 i28Var2 = i28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        i28Var2.getClass();
        hc8Var.T0(i28Var2.a());
    }
}
