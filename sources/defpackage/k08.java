package defpackage;

import defpackage.ha;
import defpackage.i08;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k08 implements ga<i08.a> {
    public static final k08 a = new k08();
    public static final List<String> b = u63.Z("jobSeekerProfile");

    @Override // defpackage.ga
    public final i08.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        i08.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            m08 m08Var = m08.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(m08Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (i08.c) objA;
        }
        return new i08.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, i08.a aVar) {
        i08.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("jobSeekerProfile");
        m08 m08Var = m08.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(m08Var, false);
        i08.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
