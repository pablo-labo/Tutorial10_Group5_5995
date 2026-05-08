package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.wt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bu implements ga<wt.d> {
    public static final bu a = new bu();
    public static final List<String> b = u63.Z("addOrUpdateResumeFileSuggestion");

    @Override // defpackage.ga
    public final wt.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        wt.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            yt ytVar = yt.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ytVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (wt.a) objA;
        }
        return new wt.d(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wt.d dVar) {
        wt.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("addOrUpdateResumeFileSuggestion");
        yt ytVar = yt.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ytVar, false);
        wt.a aVar = dVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
