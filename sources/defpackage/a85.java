package defpackage;

import defpackage.o75;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a85 implements ga<o75.k> {
    public static final a85 a = new a85();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final o75.k a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        o75.h hVarC = null;
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        if (str == null) {
            r6.g("__typename was not found");
            return null;
        }
        if (mi1.b(mi1.c("TimelineModule"), lb3Var.a, str, lb3Var.b)) {
            mb8Var.k();
            hVarC = x75.c(mb8Var, lb3Var);
        }
        return new o75.k(str, hVarC);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.k kVar) {
        o75.k kVar2 = kVar;
        hc8Var.getClass();
        lb3Var.getClass();
        kVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, kVar2.a);
        o75.h hVar = kVar2.b;
        if (hVar != null) {
            x75.d(hc8Var, lb3Var, hVar);
        }
    }
}
