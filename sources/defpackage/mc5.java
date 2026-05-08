package defpackage;

import defpackage.ha;
import defpackage.ic5;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mc5 implements ga<ic5.c> {
    public static final mc5 a = new mc5();
    public static final List<String> b = u63.a0("id", "label", "question");

    @Override // defpackage.ga
    public final ic5.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        ic5.d dVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                nc5 nc5Var = nc5.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(nc5Var, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (ic5.d) objA;
            }
        }
        if (str == null) {
            mh2.q(mb8Var, "id");
            throw null;
        }
        if (str2 != null) {
            return new ic5.c(str, str2, dVar);
        }
        mh2.q(mb8Var, "label");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ic5.c cVar) {
        ic5.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("label");
        gVar.b(hc8Var, lb3Var, cVar2.b);
        hc8Var.u0("question");
        ena enaVar = new ena(nc5.a, false);
        ic5.d dVar = cVar2.c;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
