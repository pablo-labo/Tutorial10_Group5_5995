package defpackage;

import defpackage.fdg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class idg implements ga<fdg.b> {
    public static final idg a = new idg();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final fdg.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        it9 it9VarC = kt9.c(mb8Var, lb3Var);
        if (str != null) {
            return new fdg.b(str, it9VarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, fdg.b bVar) {
        fdg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        List<String> list = kt9.a;
        kt9.d(hc8Var, lb3Var, bVar2.b);
    }
}
