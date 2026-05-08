package defpackage;

import defpackage.ha;
import defpackage.jo;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mo implements ga<jo.b> {
    public static final mo a = new mo();
    public static final List<String> b = u63.Z("addJobSeekerProfileResumePatents");

    @Override // defpackage.ga
    public final jo.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        jo.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            lo loVar = lo.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(loVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (jo.a) objA;
        }
        return new jo.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jo.b bVar) {
        jo.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileResumePatents");
        lo loVar = lo.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(loVar, false);
        jo.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
