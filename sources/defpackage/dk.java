package defpackage;

import defpackage.zj;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dk implements ga<zj.c> {
    public static final dk a = new dk();
    public static final List<String> b = u63.Z("timeMinutes");

    @Override // defpackage.ga
    public final zj.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Integer numA = null;
        while (mb8Var.D1(b) == 0) {
            numA = ha.k.a(mb8Var, lb3Var);
        }
        return new zj.c(numA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zj.c cVar) {
        zj.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("timeMinutes");
        ha.k.b(hc8Var, lb3Var, cVar2.a);
    }
}
