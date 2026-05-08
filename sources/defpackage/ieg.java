package defpackage;

import defpackage.geg;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ieg implements ga<geg.a> {
    public static final ieg a = new ieg();
    public static final List<String> b = u63.Z("updateJobSeekerProfileResume");

    @Override // defpackage.ga
    public final geg.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        geg.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            keg kegVar = keg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(kegVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (geg.c) objA;
        }
        return new geg.a(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, geg.a aVar) {
        geg.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileResume");
        keg kegVar = keg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(kegVar, false);
        geg.c cVar = aVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
