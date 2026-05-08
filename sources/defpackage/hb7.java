package defpackage;

import defpackage.eb7;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hb7 implements ga<eb7.b> {
    public static final hb7 a = new hb7();
    public static final List<String> b = u63.a0("job", "employerReplyLikelihood", "applicationInsights");

    @Override // defpackage.ga
    public final eb7.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        eb7.d dVar = null;
        String str = null;
        List list = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                jb7 jb7Var = jb7.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(jb7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (eb7.d) objA2;
            } else if (iD1 == 1) {
                str = (String) ha.a.a(mb8Var, lb3Var);
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
        if (str != null) {
            return new eb7.b(dVar, str, list);
        }
        mh2.q(mb8Var, "employerReplyLikelihood");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, eb7.b bVar) {
        eb7.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("job");
        jb7 jb7Var = jb7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(jb7Var, false);
        eb7.d dVar = bVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("employerReplyLikelihood");
        ha.g gVar2 = ha.a;
        gVar2.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("applicationInsights");
        hy8 hy8Var = new hy8(gVar2);
        List<String> list = bVar2.c;
        if (list == null) {
            hc8Var.H1();
        } else {
            hy8Var.b(hc8Var, lb3Var, list);
        }
    }
}
