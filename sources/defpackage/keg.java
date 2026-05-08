package defpackage;

import defpackage.geg;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class keg implements ga<geg.c> {
    public static final keg a = new keg();
    public static final List<String> b = u63.Z("resume");

    @Override // defpackage.ga
    public final geg.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        geg.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            jeg jegVar = jeg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(jegVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            bVar = (geg.b) objA;
        }
        return new geg.c(bVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, geg.c cVar) {
        geg.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("resume");
        jeg jegVar = jeg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(jegVar, false);
        geg.b bVar = cVar2.a;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, bVar);
        }
    }
}
