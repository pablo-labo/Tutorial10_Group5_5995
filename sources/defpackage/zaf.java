package defpackage;

import defpackage.xaf;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zaf implements ga<xaf.a> {
    public static final zaf a = new zaf();
    public static final List<String> b = u63.Z("suid");

    @Override // defpackage.ga
    public final xaf.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new xaf.a(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xaf.a aVar) {
        xaf.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("suid");
        ha.i.b(hc8Var, lb3Var, aVar2.a);
    }
}
