package defpackage;

import defpackage.dyc;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hyc implements ga<dyc.c> {
    public static final List<String> a = u63.Z("onlineStatus");

    public static dyc.c c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dyc.e eVar = null;
        while (mb8Var.D1(a) == 0) {
            jyc jycVar = jyc.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(jycVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (dyc.e) objA;
        }
        return new dyc.c(eVar);
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, dyc.c cVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        cVar.getClass();
        hc8Var.u0("onlineStatus");
        jyc jycVar = jyc.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(jycVar, false);
        dyc.e eVar = cVar.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
