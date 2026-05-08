package defpackage;

import defpackage.p5a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t5a implements ga<p5a.c> {
    public static final t5a a = new t5a();
    public static final List<String> b = u63.a0("url", "type", "tooltip", "label");

    @Override // defpackage.ga
    public final p5a.c a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        ss1 ss1Var = null;
        String strA2 = null;
        String strA3 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                String strI0 = mb8Var.I0();
                strI0.getClass();
                ss1.a.getClass();
                Iterator<T> it = ss1.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b(((ss1) next).a(), strI0)) {
                        break;
                    }
                }
                ss1 ss1Var2 = (ss1) next;
                ss1Var = ss1Var2 == null ? ss1.c : ss1Var2;
            } else if (iD1 == 2) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                strA3 = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (ss1Var != null) {
            return new p5a.c(strA, ss1Var, strA2, strA3);
        }
        mh2.q(mb8Var, "type");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.c cVar) {
        p5a.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("url");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("type");
        hc8Var.T0(cVar2.b.a());
        hc8Var.u0("tooltip");
        nmaVar.b(hc8Var, lb3Var, cVar2.c);
        hc8Var.u0("label");
        nmaVar.b(hc8Var, lb3Var, cVar2.d);
    }
}
