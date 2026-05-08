package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.meg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oeg implements ga<meg.a> {
    public static final oeg a = new oeg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResumeWorkExperiences");

    @Override // defpackage.ga
    public final meg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        meg.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            peg pegVar = peg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(pegVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (meg.b) objA;
        }
        return new meg.a(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, meg.a aVar) {
        meg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResumeWorkExperiences");
        peg pegVar = peg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(pegVar, false);
        meg.b bVar = aVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
