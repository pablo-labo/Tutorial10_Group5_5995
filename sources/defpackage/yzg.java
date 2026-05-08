package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yzg implements wu5<e, b, Integer, e> {
    public final /* synthetic */ Function1<mzg, j6g> a;

    /* JADX WARN: Multi-variable type inference failed */
    public yzg(Function1<? super mzg, j6g> function1) {
        this.a = function1;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-1608161351);
        Function1<mzg, j6g> function1 = this.a;
        boolean zK = bVar2.K(function1);
        Object objV = bVar2.v();
        if (zK || objV == b.a.a) {
            objV = new vq2(function1);
            bVar2.p(objV);
        }
        vq2 vq2Var = (vq2) objV;
        bVar2.F();
        return vq2Var;
    }
}
