package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.mk;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pk implements ga<mk.b> {
    public static final pk a = new pk();
    public static final List<String> b = u63.Z("addJobSeekerProfileStructuredDataPreference");

    @Override // defpackage.ga
    public final mk.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        mk.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            ok okVar = ok.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(okVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (mk.a) objA;
        }
        return new mk.b(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, mk.b bVar) {
        mk.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("addJobSeekerProfileStructuredDataPreference");
        ok okVar = ok.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(okVar, false);
        mk.a aVar = bVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
