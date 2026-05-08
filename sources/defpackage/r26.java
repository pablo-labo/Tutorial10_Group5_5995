package defpackage;

import defpackage.ha;
import defpackage.m26;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r26 implements ga<m26.d> {
    public static final List<String> a = u63.Z("onlineStatus");

    public static m26.d c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        m26.e eVar = null;
        while (mb8Var.D1(a) == 0) {
            s26 s26Var = s26.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(s26Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (m26.e) objA;
        }
        return new m26.d(eVar);
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, m26.d dVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        dVar.getClass();
        hc8Var.u0("onlineStatus");
        s26 s26Var = s26.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(s26Var, false);
        m26.e eVar = dVar.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
