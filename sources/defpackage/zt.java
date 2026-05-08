package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.wt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zt implements ga<wt.b> {
    public static final zt a = new zt();
    public static final List<String> b = u63.Z("resumeFileSuggestionMutations");

    @Override // defpackage.ga
    public final wt.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        wt.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            bu buVar = bu.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(buVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (wt.d) objA;
        }
        return new wt.b(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wt.b bVar) {
        wt.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("resumeFileSuggestionMutations");
        bu buVar = bu.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(buVar, false);
        wt.d dVar = bVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
