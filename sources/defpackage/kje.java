package defpackage;

import defpackage.gje;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kje implements ga<gje.c> {
    public static final kje a = new kje();
    public static final List<String> b = u63.a0("label", "suid");

    @Override // defpackage.ga
    public final gje.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new gje.c(strA, strA2);
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, gje.c cVar) {
        gje.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("label");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("suid");
        nmaVar.b(hc8Var, lb3Var, cVar2.b);
    }
}
