package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements wu5<e, b, Integer, e> {
    public final /* synthetic */ mzg a;

    public zzg(mzg mzgVar) {
        this.a = mzgVar;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-1415685722);
        mzg mzgVar = this.a;
        boolean zK = bVar2.K(mzgVar);
        Object objV = bVar2.v();
        if (zK || objV == b.a.a) {
            objV = new pf7(mzgVar);
            bVar2.p(objV);
        }
        pf7 pf7Var = (pf7) objV;
        bVar2.F();
        return pf7Var;
    }
}
