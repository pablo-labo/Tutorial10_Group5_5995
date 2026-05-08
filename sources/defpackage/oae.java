package defpackage;

import defpackage.lae;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oae implements ga<lae.b> {
    public static final oae a = new oae();
    public static final List<String> b = u63.Z("isEnabled");

    @Override // defpackage.ga
    public final lae.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean bool = null;
        while (mb8Var.D1(b) == 0) {
            bool = (Boolean) ha.f.a(mb8Var, lb3Var);
        }
        if (bool != null) {
            return new lae.b(bool.booleanValue());
        }
        mh2.q(mb8Var, "isEnabled");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, lae.b bVar) {
        lae.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("isEnabled");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(bVar2.a));
    }
}
