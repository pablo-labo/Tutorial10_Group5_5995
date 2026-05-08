package defpackage;

import defpackage.ha;
import defpackage.hig;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jig implements ga<hig.a> {
    public static final jig a = new jig();
    public static final List<String> b = u63.Z("urlRegistry");

    @Override // defpackage.ga
    public final hig.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        hig.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            lig ligVar = lig.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ligVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (hig.c) objA;
        }
        return new hig.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, hig.a aVar) {
        hig.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("urlRegistry");
        lig ligVar = lig.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ligVar, false);
        hig.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
