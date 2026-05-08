package defpackage;

import defpackage.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class s48 implements ga<r48> {
    public static final s48 a = new s48();

    @Override // defpackage.ga
    public final r48 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        r48.a.getClass();
        Object it = r48.f.iterator();
        while (true) {
            w2.b bVar = (w2.b) it;
            if (!bVar.hasNext()) {
                next = null;
                break;
            }
            next = bVar.next();
            if (wl7.b(((r48) next).a(), strL)) {
                break;
            }
        }
        r48 r48Var = (r48) next;
        return r48Var == null ? r48.d : r48Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, r48 r48Var) {
        r48 r48Var2 = r48Var;
        hc8Var.getClass();
        lb3Var.getClass();
        r48Var2.getClass();
        hc8Var.T0(r48Var2.a());
    }
}
