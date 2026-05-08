package defpackage;

import defpackage.n9g;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q9g implements ga<n9g.b> {
    public static final q9g a = new q9g();
    public static final List<String> b = u63.Z("timeMinutes");

    @Override // defpackage.ga
    public final n9g.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Integer numA = null;
        while (mb8Var.D1(b) == 0) {
            numA = ha.k.a(mb8Var, lb3Var);
        }
        return new n9g.b(numA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, n9g.b bVar) {
        n9g.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("timeMinutes");
        ha.k.b(hc8Var, lb3Var, bVar2.a);
    }
}
