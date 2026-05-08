package defpackage;

import defpackage.h26;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k26 implements ga<h26.b> {
    public static final k26 a = new k26();
    public static final List<String> b = u63.Z("onlineStatusPreference");

    @Override // defpackage.ga
    public final h26.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        h26.c cVar = null;
        while (mb8Var.D1(b) == 0) {
            l26 l26Var = l26.a;
            ha.g gVar = ha.a;
            cVar = (h26.c) new ena(l26Var, false).a(mb8Var, lb3Var);
        }
        if (cVar != null) {
            return new h26.b(cVar);
        }
        mh2.q(mb8Var, "onlineStatusPreference");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, h26.b bVar) {
        h26.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("onlineStatusPreference");
        l26 l26Var = l26.a;
        ha.g gVar = ha.a;
        h26.c cVar = bVar2.a;
        hc8Var.j();
        l26Var.b(hc8Var, lb3Var, cVar);
        hc8Var.t();
    }
}
