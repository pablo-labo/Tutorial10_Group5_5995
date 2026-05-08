package defpackage;

import defpackage.fqb;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jqb implements ga<fqb.c> {
    public static final jqb a = new jqb();
    public static final List<String> b = u63.Z("contactInformation");

    @Override // defpackage.ga
    public final fqb.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        fqb.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            hqb hqbVar = hqb.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(hqbVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (fqb.a) objA;
        }
        return new fqb.c(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fqb.c cVar) {
        fqb.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("contactInformation");
        hqb hqbVar = hqb.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(hqbVar, false);
        fqb.a aVar = cVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
