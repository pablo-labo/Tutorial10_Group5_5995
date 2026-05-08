package defpackage;

import defpackage.jo4;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class no4 implements ga<jo4.c> {
    public static final no4 a = new no4();
    public static final List<String> b = u63.a0("country", "formattedLocation", "unknownLocation");

    @Override // defpackage.ga
    public final jo4.c a(mb8 mb8Var, lb3 lb3Var) {
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
                    return new jo4.c(strA, strA2, strA3);
                }
                strA3 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jo4.c cVar) {
        jo4.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("country");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, cVar2.a);
        hc8Var.u0("formattedLocation");
        nmaVar.b(hc8Var, lb3Var, cVar2.b);
        hc8Var.u0("unknownLocation");
        nmaVar.b(hc8Var, lb3Var, cVar2.c);
    }
}
