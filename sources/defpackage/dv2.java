package defpackage;

import defpackage.w2;

/* JADX INFO: loaded from: classes2.dex */
public final class dv2 implements ga<av2> {
    public static final dv2 a = new dv2();

    @Override // defpackage.ga
    public final av2 a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        String strL = ia.l(mb8Var, lb3Var);
        av2.a.getClass();
        Object it = av2.W.iterator();
        while (true) {
            w2.b bVar = (w2.b) it;
            if (!bVar.hasNext()) {
                next = null;
                break;
            }
            next = bVar.next();
            if (wl7.b(((av2) next).a(), strL)) {
                break;
            }
        }
        av2 av2Var = (av2) next;
        return av2Var == null ? av2.f : av2Var;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, av2 av2Var) {
        av2 av2Var2 = av2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        av2Var2.getClass();
        hc8Var.T0(av2Var2.a());
    }
}
