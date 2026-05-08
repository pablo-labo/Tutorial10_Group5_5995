package defpackage;

import defpackage.ha;
import defpackage.j6e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m6e implements ga<j6e.b> {
    public static final m6e a = new m6e();
    public static final List<String> b = u63.a0("__typename", "id");

    @Override // defpackage.ga
    public final j6e.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                str2 = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        mb8Var.k();
        jk8 jk8VarC = mk8.c(mb8Var, lb3Var);
        if (str == null) {
            mh2.q(mb8Var, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new j6e.b(str, str2, jk8VarC);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j6e.b bVar) {
        j6e.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("__typename");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("id");
        gVar.b(hc8Var, lb3Var, bVar2.b);
        List<String> list = mk8.a;
        mk8.d(hc8Var, lb3Var, bVar2.c);
    }
}
