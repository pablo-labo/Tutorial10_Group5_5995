package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.qb7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tb7 implements ga<qb7.b> {
    public static final tb7 a = new tb7();
    public static final List<String> b = u63.a0("job", "employerStartedReview", "replyLikelihoodAdjusted", "applicationInsights");

    @Override // defpackage.ga
    public final qb7.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        qb7.d dVar = null;
        Boolean bool = null;
        String str = null;
        List list = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                vb7 vb7Var = vb7.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(vb7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (qb7.d) objA2;
            } else if (iD1 == 1) {
                bool = (Boolean) ha.f.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
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
        if (bool == null) {
            mh2.q(mb8Var, "employerStartedReview");
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (str != null) {
            return new qb7.b(dVar, zBooleanValue, str, list);
        }
        mh2.q(mb8Var, "replyLikelihoodAdjusted");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, qb7.b bVar) {
        qb7.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("job");
        vb7 vb7Var = vb7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(vb7Var, false);
        qb7.d dVar = bVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("employerStartedReview");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(bVar2.b));
        hc8Var.u0("replyLikelihoodAdjusted");
        ha.g gVar2 = ha.a;
        gVar2.b(hc8Var, lb3Var, bVar2.c);
        hc8Var.u0("applicationInsights");
        hy8 hy8Var = new hy8(gVar2);
        List<String> list = bVar2.d;
        if (list == null) {
            hc8Var.H1();
        } else {
            hy8Var.b(hc8Var, lb3Var, list);
        }
    }
}
