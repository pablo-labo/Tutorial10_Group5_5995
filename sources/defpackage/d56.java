package defpackage;

import defpackage.y46;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d56 implements ga<y46.d> {
    public static final d56 a = new d56();
    public static final List<String> b = u63.a0("id", "formattedLocationFull", "formattedLocationShort", "raw");

    @Override // defpackage.ga
    public final y46.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                strA3 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    return new y46.d(strA, strA2, strA3, strA4);
                }
                strA4 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, y46.d dVar) {
        y46.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("formattedLocationFull");
        nmaVar.b(hc8Var, lb3Var, dVar2.b);
        hc8Var.u0("formattedLocationShort");
        nmaVar.b(hc8Var, lb3Var, dVar2.c);
        hc8Var.u0("raw");
        nmaVar.b(hc8Var, lb3Var, dVar2.d);
    }
}
