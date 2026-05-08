package defpackage;

import defpackage.ha;
import defpackage.vc5;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ad5 implements ga<vc5.d> {
    public static final ad5 a = new ad5();
    public static final List<String> b = u63.a0("endCursor", "startCursor", "hasPreviousPage", "hasNextPage");

    @Override // defpackage.ga
    public final vc5.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                strA2 = ha.i.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                bool = (Boolean) ha.f.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                bool2 = (Boolean) ha.f.a(mb8Var, lb3Var);
            }
        }
        if (bool == null) {
            mh2.q(mb8Var, "hasPreviousPage");
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new vc5.d(strA, strA2, zBooleanValue, bool2.booleanValue());
        }
        mh2.q(mb8Var, "hasNextPage");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vc5.d dVar) {
        vc5.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("endCursor");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("startCursor");
        nmaVar.b(hc8Var, lb3Var, dVar2.b);
        hc8Var.u0("hasPreviousPage");
        ha.b bVar = ha.f;
        bVar.b(hc8Var, lb3Var, Boolean.valueOf(dVar2.c));
        hc8Var.u0("hasNextPage");
        bVar.b(hc8Var, lb3Var, Boolean.valueOf(dVar2.d));
    }
}
