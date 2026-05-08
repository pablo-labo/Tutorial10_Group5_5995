package defpackage;

import defpackage.xj8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ck8 implements ga<xj8.d> {
    public static final ck8 a = new ck8();
    public static final List<String> b = u63.Z("sectionId");

    @Override // defpackage.ga
    public final xj8.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new xj8.d(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xj8.d dVar) {
        xj8.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("sectionId");
        ha.i.b(hc8Var, lb3Var, dVar2.a);
    }
}
