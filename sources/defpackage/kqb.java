package defpackage;

import defpackage.fqb;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kqb implements ga<fqb.d> {
    public static final kqb a = new kqb();
    public static final List<String> b = u63.Z("profile");

    @Override // defpackage.ga
    public final fqb.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        fqb.g gVar = null;
        while (mb8Var.D1(b) == 0) {
            nqb nqbVar = nqb.a;
            ha.g gVar2 = ha.a;
            ena enaVar = new ena(nqbVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            gVar = (fqb.g) objA;
        }
        return new fqb.d(gVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fqb.d dVar) {
        fqb.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("profile");
        nqb nqbVar = nqb.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(nqbVar, false);
        fqb.g gVar2 = dVar2.a;
        if (gVar2 == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, gVar2);
        }
    }
}
