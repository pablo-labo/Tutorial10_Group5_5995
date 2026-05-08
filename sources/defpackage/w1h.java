package defpackage;

import defpackage.ha;
import defpackage.s1h;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w1h implements ga<s1h> {
    public static final List<String> a = u63.a0("lever", "workAreaSelection");

    public static s1h c(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        s1h.a aVar = null;
        s1h.c cVar = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 == 0) {
                t1h t1hVar = t1h.a;
                ha.g gVar = ha.a;
                aVar = (s1h.a) new ena(t1hVar, false).a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                v1h v1hVar = v1h.a;
                ha.g gVar2 = ha.a;
                cVar = (s1h.c) new ena(v1hVar, false).a(mb8Var, lb3Var);
            }
        }
        if (aVar == null) {
            mh2.q(mb8Var, "lever");
            throw null;
        }
        if (cVar != null) {
            return new s1h(aVar, cVar);
        }
        mh2.q(mb8Var, "workAreaSelection");
        throw null;
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, s1h s1hVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        s1hVar.getClass();
        hc8Var.u0("lever");
        t1h t1hVar = t1h.a;
        ha.g gVar = ha.a;
        s1h.a aVar = s1hVar.a;
        hc8Var.j();
        t1hVar.b(hc8Var, lb3Var, aVar);
        hc8Var.t();
        hc8Var.u0("workAreaSelection");
        v1h v1hVar = v1h.a;
        s1h.c cVar = s1hVar.b;
        hc8Var.j();
        v1hVar.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
