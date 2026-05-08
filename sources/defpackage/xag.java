package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.vag;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xag implements ga<vag.a> {
    public static final xag a = new xag();
    public static final List<String> b = u63.Z("updateJobSeekerProfileStructuredDataPreference");

    @Override // defpackage.ga
    public final vag.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        vag.e eVar = null;
        while (mb8Var.D1(b) == 0) {
            bbg bbgVar = bbg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(bbgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            eVar = (vag.e) objA;
        }
        return new vag.a(eVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vag.a aVar) {
        vag.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("updateJobSeekerProfileStructuredDataPreference");
        bbg bbgVar = bbg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(bbgVar, false);
        vag.e eVar = aVar2.a;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, eVar);
        }
    }
}
