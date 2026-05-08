package defpackage;

import defpackage.ha;
import defpackage.o75;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z75 implements ga<o75.j> {
    public static final z75 a = new z75();
    public static final List<String> b = u63.a0("hasNextPage", "hasPreviousPage", "endCursor", "startCursor");

    @Override // defpackage.ga
    public final o75.j a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean bool = null;
        Boolean bool2 = null;
        String strA = null;
        String strA2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                bool = (Boolean) ha.f.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                bool2 = (Boolean) ha.f.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    break;
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (bool == null) {
            mh2.q(mb8Var, "hasNextPage");
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new o75.j(strA, strA2, zBooleanValue, bool2.booleanValue());
        }
        mh2.q(mb8Var, "hasPreviousPage");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.j jVar) {
        o75.j jVar2 = jVar;
        hc8Var.getClass();
        lb3Var.getClass();
        jVar2.getClass();
        hc8Var.u0("hasNextPage");
        ha.b bVar = ha.f;
        bVar.b(hc8Var, lb3Var, Boolean.valueOf(jVar2.a));
        hc8Var.u0("hasPreviousPage");
        bVar.b(hc8Var, lb3Var, Boolean.valueOf(jVar2.b));
        hc8Var.u0("endCursor");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, jVar2.c);
        hc8Var.u0("startCursor");
        nmaVar.b(hc8Var, lb3Var, jVar2.d);
    }
}
