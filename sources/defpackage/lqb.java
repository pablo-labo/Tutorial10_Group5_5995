package defpackage;

import defpackage.fqb;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lqb implements ga<fqb.e> {
    public static final lqb a = new lqb();
    public static final List<String> b = u63.a0("formattedLocation", "unknownLocation");

    @Override // defpackage.ga
    public final fqb.e a(mb8 mb8Var, lb3 lb3Var) {
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
                    return new fqb.e(strA, strA2);
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fqb.e eVar) {
        fqb.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("formattedLocation");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("unknownLocation");
        nmaVar.b(hc8Var, lb3Var, eVar2.b);
    }
}
