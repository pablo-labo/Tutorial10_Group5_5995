package defpackage;

import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yc7 implements ga<wc7.a> {
    public static final yc7 a = new yc7();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final wc7.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        wc7.i iVarC = null;
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str == null) {
            r6.g("__typename was not found");
            return null;
        }
        if (mi1.b(mi1.c("PassportAccount"), lb3Var.a, str, lb3Var.b)) {
            mb8Var.k();
            iVarC = gd7.c(mb8Var, lb3Var);
        }
        return new wc7.a(str, iVarC);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wc7.a aVar) {
        wc7.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        wc7.i iVar = aVar2.b;
        if (iVar != null) {
            gd7.d(hc8Var, lb3Var, iVar);
        }
    }
}
