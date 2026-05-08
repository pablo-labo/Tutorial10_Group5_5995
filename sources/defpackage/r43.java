package defpackage;

import defpackage.ha;
import defpackage.k43;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r43 implements ga<k43.c> {
    public static final r43 a = new r43();
    public static final List<String> b = u63.Z("applyUrl");

    @Override // defpackage.ga
    public final k43.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        k43.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            n43 n43Var = n43.a;
            ha.g gVar = ha.a;
            aVar = (k43.a) new ena(n43Var, false).a(mb8Var, lb3Var);
        }
        if (aVar != null) {
            return new k43.c(aVar);
        }
        mh2.q(mb8Var, "applyUrl");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, k43.c cVar) {
        k43.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("applyUrl");
        n43 n43Var = n43.a;
        ha.g gVar = ha.a;
        k43.a aVar = cVar2.a;
        hc8Var.j();
        n43Var.b(hc8Var, lb3Var, aVar);
        hc8Var.t();
    }
}
