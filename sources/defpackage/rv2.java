package defpackage;

import defpackage.ha;
import defpackage.jv2;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rv2 implements ga<jv2.g> {
    public static final rv2 a = new rv2();
    public static final List<String> b = u63.Z("requireResponse");

    @Override // defpackage.ga
    public final jv2.g a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        jv2.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            pv2 pv2Var = pv2.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(pv2Var, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (jv2.e) objA;
        }
        return new jv2.g(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, jv2.g gVar) {
        jv2.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("requireResponse");
        pv2 pv2Var = pv2.a;
        ha.g gVar3 = ha.a;
        ena enaVar = new ena(pv2Var, false);
        jv2.e eVar = gVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
