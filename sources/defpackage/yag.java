package defpackage;

import defpackage.vag;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yag implements ga<vag.b> {
    public static final yag a = new yag();
    public static final List<String> b = u63.a0("id", "formattedLocationFull", "formattedLocationShort", "raw");

    @Override // defpackage.ga
    public final vag.b a(mb8 mb8Var, lb3 lb3Var) {
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
                    return new vag.b(strA, strA2, strA3, strA4);
                }
                strA4 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vag.b bVar) {
        vag.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("formattedLocationFull");
        nmaVar.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("formattedLocationShort");
        nmaVar.b(hc8Var, lb3Var, bVar2.c);
        hc8Var.u0("raw");
        nmaVar.b(hc8Var, lb3Var, bVar2.d);
    }
}
