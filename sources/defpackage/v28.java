package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class v28 implements ga<u28> {
    public static final v28 a = new v28();

    @Override // defpackage.ga
    public final u28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        u28.a.getClass();
        Iterator<T> it = u28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((u28) next).a(), strL)) {
                break;
            }
        }
        u28 u28Var = (u28) next;
        return u28Var == null ? u28.b : u28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, u28 u28Var) {
        u28 u28Var2 = u28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        u28Var2.getClass();
        hc8Var.T0(u28Var2.a());
    }
}
