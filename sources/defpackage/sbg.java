package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.pbg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sbg implements ga<pbg.b> {
    public static final sbg a = new sbg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeAwards");

    @Override // defpackage.ga
    public final pbg.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        pbg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            tbg tbgVar = tbg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(tbgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (pbg.c) objA;
        }
        return new pbg.b(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, pbg.b bVar) {
        pbg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeAwards");
        tbg tbgVar = tbg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(tbgVar, false);
        pbg.c cVar = bVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
