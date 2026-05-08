package defpackage;

import defpackage.agg;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class egg implements ga<agg.c> {
    public static final egg a = new egg();
    public static final List<String> b = u63.Z("sourcingElection");

    @Override // defpackage.ga
    public final agg.c a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        mb8Var.getClass();
        lb3Var.getClass();
        r48 r48Var = null;
        while (mb8Var.D1(b) == 0) {
            String strI0 = mb8Var.I0();
            strI0.getClass();
            r48.a.getClass();
            Iterator<T> it = r48.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (wl7.b(((r48) next).a(), strI0)) {
                    break;
                }
            }
            r48 r48Var2 = (r48) next;
            r48Var = r48Var2 == null ? r48.d : r48Var2;
        }
        if (r48Var != null) {
            return new agg.c(r48Var);
        }
        mh2.q(mb8Var, "sourcingElection");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, agg.c cVar) {
        agg.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("sourcingElection");
        hc8Var.T0(cVar2.a.a());
    }
}
