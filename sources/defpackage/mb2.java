package defpackage;

import androidx.compose.runtime.b;
import defpackage.c20;
import defpackage.vs0;

/* JADX INFO: loaded from: classes.dex */
public final class mb2 {
    public static final ob2 a = new ob2(vs0.c, c20.a.m);

    public static final ob2 a(vs0.l lVar, c20.b bVar, b bVar2, int i) {
        if (lVar.equals(vs0.c) && wl7.b(bVar, c20.a.m)) {
            bVar2.L(-1446569784);
            bVar2.F();
            return a;
        }
        bVar2.L(-1446515937);
        boolean z = ((((i & 14) ^ 6) > 4 && bVar2.K(lVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && bVar2.K(bVar)) || (i & 48) == 32);
        Object objV = bVar2.v();
        if (z || objV == b.a.a) {
            objV = new ob2(lVar, bVar);
            bVar2.p(objV);
        }
        ob2 ob2Var = (ob2) objV;
        bVar2.F();
        return ob2Var;
    }
}
