package defpackage;

import defpackage.j2h;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l2h implements ga<j2h.b> {
    public static final l2h a = new l2h();
    public static final List<String> b = u63.a0("country", "formattedLocation", "unknownLocation");

    @Override // defpackage.ga
    public final j2h.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    return new j2h.b(strA, strA2, strA3);
                }
                strA3 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j2h.b bVar) {
        j2h.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("country");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("formattedLocation");
        nmaVar.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("unknownLocation");
        nmaVar.b(hc8Var, lb3Var, bVar2.c);
    }
}
