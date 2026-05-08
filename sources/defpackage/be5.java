package defpackage;

import defpackage.ha;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class be5 implements ga<sd5.h> {
    public static final be5 a = new be5();
    public static final List<String> b = u63.Z("viewJobRedirectClickUrl");

    @Override // defpackage.ga
    public final sd5.h a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        while (mb8Var.D1(b) == 0) {
            objA = ha.g.a(mb8Var, lb3Var);
        }
        if (objA != null) {
            return new sd5.h(objA);
        }
        mh2.q(mb8Var, "viewJobRedirectClickUrl");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sd5.h hVar) {
        sd5.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("viewJobRedirectClickUrl");
        ha.g gVar = ha.a;
        f.a(hc8Var, hVar2.a);
    }
}
