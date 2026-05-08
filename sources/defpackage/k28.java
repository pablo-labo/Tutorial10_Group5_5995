package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k28 implements ga<j28> {
    public static final k28 a = new k28();

    @Override // defpackage.ga
    public final j28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        j28.a.getClass();
        Iterator<T> it = j28.I4.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((j28) next).c(), strL)) {
                break;
            }
        }
        j28 j28Var = (j28) next;
        return j28Var == null ? j28.G4 : j28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j28 j28Var) {
        j28 j28Var2 = j28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        j28Var2.getClass();
        hc8Var.T0(j28Var2.c());
    }
}
