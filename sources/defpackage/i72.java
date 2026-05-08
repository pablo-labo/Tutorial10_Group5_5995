package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class i72 implements wu5<e, b, Integer, e> {
    public final /* synthetic */ gu5<j6g> a;

    public i72(gu5 gu5Var) {
        this.a = gu5Var;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        d3a d3aVar;
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-756081143);
        pa7 pa7Var = (pa7) bVar2.M(androidx.compose.foundation.e.a);
        if (pa7Var instanceof ua7) {
            bVar2.L(-1604682242);
            bVar2.F();
            d3aVar = null;
        } else {
            bVar2.L(-1604549624);
            Object objV = bVar2.v();
            if (objV == b.a.a) {
                objV = new e3a();
                bVar2.p(objV);
            }
            d3aVar = (d3a) objV;
            bVar2.F();
        }
        d3a d3aVar2 = d3aVar;
        e eVarA = androidx.compose.foundation.b.a(e.a.b, d3aVar2, pa7Var, true, null, null, this.a);
        bVar2.F();
        return eVarA;
    }
}
