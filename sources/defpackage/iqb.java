package defpackage;

import defpackage.fqb;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iqb implements ga<fqb.b> {
    public static final iqb a = new iqb();
    public static final List<String> b = u63.Z("jobSeekerProfile");

    @Override // defpackage.ga
    public final fqb.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        fqb.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            kqb kqbVar = kqb.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(kqbVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (fqb.d) objA;
        }
        return new fqb.b(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fqb.b bVar) {
        fqb.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("jobSeekerProfile");
        kqb kqbVar = kqb.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(kqbVar, false);
        fqb.d dVar = bVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
