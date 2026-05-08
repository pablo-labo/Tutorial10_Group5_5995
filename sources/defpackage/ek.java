package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.zj;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ek implements ga<zj.d> {
    public static final ek a = new ek();
    public static final List<String> b = u63.a0("id", "maximumCommute");

    @Override // defpackage.ga
    public final zj.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        zj.c cVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new zj.d(strA, cVar);
                }
                dk dkVar = dk.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(dkVar, false);
                if (mb8Var.peek() == mb8.a.Y) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar.a(mb8Var, lb3Var);
                }
                cVar = (zj.c) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zj.d dVar) {
        zj.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("id");
        ha.i.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("maximumCommute");
        ena enaVar = new ena(dk.a, false);
        zj.c cVar = dVar2.b;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
