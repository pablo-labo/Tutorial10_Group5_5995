package defpackage;

import defpackage.g16;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j16 implements ga<g16.b> {
    public static final j16 a = new j16();
    public static final List<String> b = u63.Z("enabled");

    @Override // defpackage.ga
    public final g16.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean bool = null;
        while (mb8Var.D1(b) == 0) {
            bool = (Boolean) ha.f.a(mb8Var, lb3Var);
        }
        if (bool != null) {
            return new g16.b(bool.booleanValue());
        }
        mh2.q(mb8Var, "enabled");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g16.b bVar) {
        g16.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("enabled");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(bVar2.a));
    }
}
