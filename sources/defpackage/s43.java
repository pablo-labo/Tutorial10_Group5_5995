package defpackage;

import defpackage.ha;
import defpackage.j43;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s43 implements ga<j43.c> {
    public static final s43 a = new s43();
    public static final List<String> b = u63.Z("applyUrl");

    @Override // defpackage.ga
    public final j43.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        j43.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            o43 o43Var = o43.a;
            ha.g gVar = ha.a;
            aVar = (j43.a) new ena(o43Var, false).a(mb8Var, lb3Var);
        }
        if (aVar != null) {
            return new j43.c(aVar);
        }
        mh2.q(mb8Var, "applyUrl");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j43.c cVar) {
        j43.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("applyUrl");
        o43 o43Var = o43.a;
        ha.g gVar = ha.a;
        j43.a aVar = cVar2.a;
        hc8Var.j();
        o43Var.b(hc8Var, lb3Var, aVar);
        hc8Var.t();
    }
}
