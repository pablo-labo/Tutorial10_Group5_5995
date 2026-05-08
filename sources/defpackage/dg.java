package defpackage;

import defpackage.ag;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dg implements ga<ag.a> {
    public static final dg a = new dg();
    public static final List<String> b = u63.Z("conversation");

    @Override // defpackage.ga
    public final ag.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        ag.b bVar = null;
        while (mb8Var.D1(b) == 0) {
            eg egVar = eg.a;
            ha.g gVar = ha.a;
            bVar = (ag.b) new ena(egVar, false).a(mb8Var, lb3Var);
        }
        if (bVar != null) {
            return new ag.a(bVar);
        }
        mh2.q(mb8Var, "conversation");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ag.a aVar) {
        ag.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("conversation");
        eg egVar = eg.a;
        ha.g gVar = ha.a;
        ag.b bVar = aVar2.a;
        hc8Var.j();
        egVar.b(hc8Var, lb3Var, bVar);
        hc8Var.t();
    }
}
