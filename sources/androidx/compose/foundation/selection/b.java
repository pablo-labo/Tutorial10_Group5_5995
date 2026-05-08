package androidx.compose.foundation.selection;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.e3a;
import defpackage.gu5;
import defpackage.inf;
import defpackage.pa7;
import defpackage.qed;
import defpackage.wu5;

/* JADX INFO: loaded from: classes.dex */
public final class b implements wu5<e, androidx.compose.runtime.b, Integer, e> {
    public final /* synthetic */ pa7 a;
    public final /* synthetic */ inf b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qed d;
    public final /* synthetic */ gu5 e;

    public b(pa7 pa7Var, inf infVar, boolean z, qed qedVar, gu5 gu5Var) {
        this.a = pa7Var;
        this.b = infVar;
        this.c = z;
        this.d = qedVar;
        this.e = gu5Var;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.runtime.b bVar2 = bVar;
        num.intValue();
        bVar2.L(-1525724089);
        Object objV = bVar2.v();
        if (objV == b.a.a) {
            objV = new e3a();
            bVar2.p(objV);
        }
        d3a d3aVar = (d3a) objV;
        e eVarO = androidx.compose.foundation.e.a(e.a.b, d3aVar, this.a).o(new TriStateToggleableElement(this.b, d3aVar, null, this.c, this.d, this.e));
        bVar2.F();
        return eVarO;
    }
}
