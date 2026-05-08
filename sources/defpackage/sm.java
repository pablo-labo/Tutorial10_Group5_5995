package defpackage;

import defpackage.om;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sm implements ga<om.c> {
    public static final sm a = new sm();
    public static final List<String> b = u63.Z("id");

    @Override // defpackage.ga
    public final om.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new om.c(str);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, om.c cVar) {
        om.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, cVar2.a);
    }
}
