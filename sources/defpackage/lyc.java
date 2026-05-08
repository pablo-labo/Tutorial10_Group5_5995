package defpackage;

import defpackage.dyc;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lyc implements ga<dyc.g> {
    public static final lyc a = new lyc();
    public static final List<String> b = u63.Z("registerListeners");

    @Override // defpackage.ga
    public final dyc.g a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dyc.h hVar = null;
        while (mb8Var.D1(b) == 0) {
            myc mycVar = myc.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(mycVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            hVar = (dyc.h) objA;
        }
        return new dyc.g(hVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, dyc.g gVar) {
        dyc.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("registerListeners");
        myc mycVar = myc.a;
        ha.g gVar3 = ha.a;
        ena enaVar = new ena(mycVar, false);
        dyc.h hVar = gVar2.a;
        if (hVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, hVar);
        }
    }
}
