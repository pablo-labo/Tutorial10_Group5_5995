package defpackage;

import defpackage.ha;
import defpackage.wt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yt implements ga<wt.a> {
    public static final yt a = new yt();
    public static final List<String> b = u63.Z("resumeFileSuggestion");

    @Override // defpackage.ga
    public final wt.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        wt.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            au auVar = au.a;
            ha.g gVar = ha.a;
            cVar = (wt.c) new ena(auVar, false).a(mb8Var, lb3Var);
        }
        if (cVar != null) {
            return new wt.a(cVar);
        }
        mh2.q(mb8Var, "resumeFileSuggestion");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wt.a aVar) {
        wt.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("resumeFileSuggestion");
        au auVar = au.a;
        ha.g gVar = ha.a;
        wt.c cVar = aVar2.a;
        hc8Var.j();
        auVar.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
