package defpackage;

import defpackage.gje;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hje implements ga<gje.a> {
    public static final hje a = new hje();
    public static final List<String> b = u63.a0("id", "suid", "label");

    @Override // defpackage.ga
    public final gje.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        String strA2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new gje.a(str, strA, strA2);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, gje.a aVar) {
        gje.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("suid");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, aVar2.b);
        hc8Var.u0("label");
        nmaVar.b(hc8Var, lb3Var, aVar2.c);
    }
}
