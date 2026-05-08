package defpackage;

import defpackage.fqb;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oqb implements ga<fqb.h> {
    public static final oqb a = new oqb();
    public static final List<String> b = u63.Z("location");

    @Override // defpackage.ga
    public final fqb.h a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        fqb.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            lqb lqbVar = lqb.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(lqbVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (fqb.e) objA;
        }
        return new fqb.h(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fqb.h hVar) {
        fqb.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("location");
        lqb lqbVar = lqb.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(lqbVar, false);
        fqb.e eVar = hVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
