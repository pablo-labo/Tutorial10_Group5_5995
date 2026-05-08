package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.yb7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bc7 implements ga<yb7.b> {
    public static final bc7 a = new bc7();
    public static final List<String> b = u63.a0("job", "applicationInsights");

    @Override // defpackage.ga
    public final yb7.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        yb7.d dVar = null;
        List list = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                dc7 dc7Var = dc7.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(dc7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (yb7.d) objA2;
            } else {
                if (iD1 != 1) {
                    return new yb7.b(dVar, list);
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
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, yb7.b bVar) {
        yb7.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("job");
        dc7 dc7Var = dc7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(dc7Var, false);
        yb7.d dVar = bVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("applicationInsights");
        hy8 hy8Var = new hy8(ha.a);
        List<String> list = bVar2.b;
        if (list == null) {
            hc8Var.H1();
        } else {
            hy8Var.b(hc8Var, lb3Var, list);
        }
    }
}
