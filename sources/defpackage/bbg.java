package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.vag;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bbg implements ga<vag.e> {
    public static final bbg a = new bbg();
    public static final List<String> b = u63.Z("preference");

    @Override // defpackage.ga
    public final vag.e a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        vag.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            zag zagVar = zag.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(zagVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            cVar = (vag.c) objA;
        }
        return new vag.e(cVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vag.e eVar) {
        vag.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("preference");
        zag zagVar = zag.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(zagVar, false);
        vag.c cVar = eVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
    }
}
