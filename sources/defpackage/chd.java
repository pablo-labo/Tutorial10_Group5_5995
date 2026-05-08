package defpackage;

import androidx.compose.runtime.b;
import defpackage.c20;
import defpackage.vs0;

/* JADX INFO: loaded from: classes.dex */
public final class chd {
    public static final ehd a = new ehd(vs0.a, c20.a.j);

    public static final ehd a(vs0.e eVar, c20.c cVar, b bVar, int i) {
        if (eVar.equals(vs0.a) && wl7.b(cVar, c20.a.j)) {
            bVar.L(-1073795767);
            bVar.F();
            return a;
        }
        bVar.L(-1073744896);
        boolean z = ((((i & 14) ^ 6) > 4 && bVar.K(eVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && bVar.K(cVar)) || (i & 48) == 32);
        Object objV = bVar.v();
        if (z || objV == b.a.a) {
            objV = new ehd(eVar, cVar);
            bVar.p(objV);
        }
        ehd ehdVar = (ehd) objV;
        bVar.F();
        return ehdVar;
    }
}
