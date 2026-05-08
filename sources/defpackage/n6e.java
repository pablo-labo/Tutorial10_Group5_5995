package defpackage;

import defpackage.ha;
import defpackage.j6e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n6e implements ga<j6e.c> {
    public static final n6e a = new n6e();
    public static final List<String> b = u63.a0("conversationId", "event");

    @Override // defpackage.ga
    public final j6e.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        j6e.b bVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                m6e m6eVar = m6e.a;
                ha.g gVar = ha.a;
                bVar = (j6e.b) new ena(m6eVar, true).a(mb8Var, lb3Var);
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "conversationId");
            throw null;
        }
        if (bVar != null) {
            return new j6e.c(str, bVar);
        }
        mh2.q(mb8Var, "event");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j6e.c cVar) {
        j6e.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("conversationId");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("event");
        m6e m6eVar = m6e.a;
        j6e.b bVar = cVar2.b;
        if (hc8Var instanceof ub9) {
            ub9 ub9Var = (ub9) hc8Var;
            ub9Var.j();
            m6eVar.b(hc8Var, lb3Var, bVar);
            ub9Var.t();
            return;
        }
        ub9 ub9Var2 = new ub9();
        ub9Var2.j();
        m6eVar.b(ub9Var2, lb3Var, bVar);
        ub9Var2.t();
        Object objH = ub9Var2.h();
        objH.getClass();
        f.a(hc8Var, objH);
    }
}
