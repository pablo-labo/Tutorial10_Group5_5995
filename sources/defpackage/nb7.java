package defpackage;

import defpackage.ha;
import defpackage.kb7;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nb7 implements ga<kb7.b> {
    public static final nb7 a = new nb7();
    public static final List<String> b = u63.a0("job", "employerStartedReview", "applicationInsights");

    @Override // defpackage.ga
    public final kb7.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        kb7.d dVar = null;
        Boolean bool = null;
        List list = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                pb7 pb7Var = pb7.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(pb7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (kb7.d) objA2;
            } else if (iD1 == 1) {
                bool = (Boolean) ha.f.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                hy8 hy8Var = new hy8(ha.a);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = hy8Var.a(mb8Var, lb3Var);
                }
                list = (List) objA;
            }
        }
        if (bool != null) {
            return new kb7.b(dVar, bool.booleanValue(), list);
        }
        mh2.q(mb8Var, "employerStartedReview");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, kb7.b bVar) {
        kb7.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("job");
        pb7 pb7Var = pb7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(pb7Var, false);
        kb7.d dVar = bVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("employerStartedReview");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(bVar2.b));
        hc8Var.u0("applicationInsights");
        hy8 hy8Var = new hy8(ha.a);
        List<String> list = bVar2.c;
        if (list == null) {
            hc8Var.H1();
        } else {
            hy8Var.b(hc8Var, lb3Var, list);
        }
    }
}
