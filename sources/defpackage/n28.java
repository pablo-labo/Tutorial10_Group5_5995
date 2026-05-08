package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class n28 implements ga<m28> {
    public static final n28 a = new n28();

    @Override // defpackage.ga
    public final m28 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        m28.a.getClass();
        Iterator<T> it = m28.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((m28) next).a(), strL)) {
                break;
            }
        }
        m28 m28Var = (m28) next;
        return m28Var == null ? m28.b : m28Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, m28 m28Var) {
        m28 m28Var2 = m28Var;
        hc8Var.getClass();
        lb3Var.getClass();
        m28Var2.getClass();
        hc8Var.T0(m28Var2.a());
    }
}
