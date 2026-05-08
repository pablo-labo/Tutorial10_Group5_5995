package defpackage;

import defpackage.ha;
import defpackage.lae;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nae implements ga<lae.a> {
    public static final nae a = new nae();
    public static final List<String> b = u63.Z("onlineStatusPreference");

    @Override // defpackage.ga
    public final lae.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        lae.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            pae paeVar = pae.a;
            ha.g gVar = ha.a;
            cVar = (lae.c) new ena(paeVar, false).a(mb8Var, lb3Var);
        }
        if (cVar != null) {
            return new lae.a(cVar);
        }
        mh2.q(mb8Var, "onlineStatusPreference");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lae.a aVar) {
        lae.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("onlineStatusPreference");
        pae paeVar = pae.a;
        ha.g gVar = ha.a;
        lae.c cVar = aVar2.a;
        hc8Var.j();
        paeVar.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
