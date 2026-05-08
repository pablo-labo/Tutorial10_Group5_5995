package defpackage;

import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.xzg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b0h implements wu5<e, b, Integer, e> {
    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(359872873);
        WeakHashMap<View, xzg> weakHashMap = xzg.v;
        xzg xzgVarC = xzg.a.c(bVar2);
        boolean zK = bVar2.K(xzgVarC);
        Object objV = bVar2.v();
        if (zK || objV == b.a.a) {
            objV = new pf7(xzgVarC.f);
            bVar2.p(objV);
        }
        pf7 pf7Var = (pf7) objV;
        bVar2.F();
        return pf7Var;
    }
}
