package defpackage;

import defpackage.h26;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l26 implements ga<h26.c> {
    public static final l26 a = new l26();
    public static final List<String> b = u63.Z("isEnabled");

    @Override // defpackage.ga
    public final h26.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean bool = null;
        while (mb8Var.D1(b) == 0) {
            bool = (Boolean) ha.f.a(mb8Var, lb3Var);
        }
        if (bool != null) {
            return new h26.c(bool.booleanValue());
        }
        mh2.q(mb8Var, "isEnabled");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, h26.c cVar) {
        h26.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("isEnabled");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(cVar2.a));
    }
}
