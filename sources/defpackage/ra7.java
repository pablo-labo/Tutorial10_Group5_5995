package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class ra7 implements wu5<e, b, Integer, e> {
    public final /* synthetic */ pa7 a;
    public final /* synthetic */ ei7 b;

    public ra7(pa7 pa7Var, ei7 ei7Var) {
        this.a = pa7Var;
        this.b = ei7Var;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-353972293);
        qa7 qa7VarB = this.a.b(this.b, bVar2);
        boolean zK = bVar2.K(qa7VarB);
        Object objV = bVar2.v();
        if (zK || objV == b.a.a) {
            objV = new sa7(qa7VarB);
            bVar2.p(objV);
        }
        sa7 sa7Var = (sa7) objV;
        bVar2.F();
        return sa7Var;
    }
}
