package defpackage;

import defpackage.j1d;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m1d implements ga<j1d.b> {
    public static final m1d a = new m1d();
    public static final List<String> b = u63.Z("externalId");

    @Override // defpackage.ga
    public final j1d.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str != null) {
            return new j1d.b(str);
        }
        mh2.q(mb8Var, "externalId");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j1d.b bVar) {
        j1d.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("externalId");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
    }
}
