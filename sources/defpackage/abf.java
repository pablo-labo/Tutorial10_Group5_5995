package defpackage;

import defpackage.xaf;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class abf implements ga<xaf.b> {
    public static final abf a = new abf();
    public static final List<String> b = u63.Z("sectionId");

    @Override // defpackage.ga
    public final xaf.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new xaf.b(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xaf.b bVar) {
        xaf.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("sectionId");
        ha.i.b(hc8Var, lb3Var, bVar2.a);
    }
}
