package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.n9g;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r9g implements ga<n9g.c> {
    public static final r9g a = new r9g();
    public static final List<String> b = u63.a0("id", "maximumCommute");

    @Override // defpackage.ga
    public final n9g.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        n9g.b bVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new n9g.c(strA, bVar);
                }
                q9g q9gVar = q9g.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(q9gVar, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                bVar = (n9g.b) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, n9g.c cVar) {
        n9g.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("id");
        ha.i.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("maximumCommute");
        ena enaVar = new ena(q9g.a, false);
        n9g.b bVar = cVar2.b;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
