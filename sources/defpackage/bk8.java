package defpackage;

import defpackage.xj8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bk8 implements ga<xj8.c> {
    public static final bk8 a = new bk8();
    public static final List<String> b = u63.Z("sectionId");

    @Override // defpackage.ga
    public final xj8.c a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new xj8.c(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xj8.c cVar) {
        xj8.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("sectionId");
        ha.i.b(hc8Var, lb3Var, cVar2.a);
    }
}
