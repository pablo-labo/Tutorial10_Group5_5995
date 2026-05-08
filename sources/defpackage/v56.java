package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.p56;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v56 implements ga<p56.e> {
    public static final v56 a = new v56();
    public static final List<String> b = u63.a0("taxonomyConcepts", "responseStatus");

    @Override // defpackage.ga
    public final p56.e a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        List list = null;
        p56.c cVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                u56 u56Var = u56.a;
                ha.g gVar = ha.a;
                hy8 hy8Var = new hy8(new ena(u56Var, false));
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = hy8Var.a(mb8Var, lb3Var);
                }
                list = (List) objA;
            } else {
                if (iD1 != 1) {
                    break;
                }
                t56 t56Var = t56.a;
                ha.g gVar2 = ha.a;
                cVar = (p56.c) new ena(t56Var, false).a(mb8Var, lb3Var);
            }
        }
        if (cVar != null) {
            return new p56.e(list, cVar);
        }
        mh2.q(mb8Var, "responseStatus");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p56.e eVar) {
        p56.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("taxonomyConcepts");
        u56 u56Var = u56.a;
        ha.g gVar = ha.a;
        hy8 hy8Var = new hy8(new ena(u56Var, false));
        List<p56.d> list = eVar2.a;
        if (list == null) {
            hc8Var.H1();
        } else {
            hy8Var.b(hc8Var, lb3Var, list);
        }
        hc8Var.u0("responseStatus");
        t56 t56Var = t56.a;
        p56.c cVar = eVar2.b;
        hc8Var.j();
        t56Var.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
