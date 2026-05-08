package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vke implements Function2<b, Integer, j6g> {
    public final /* synthetic */ qke a;

    public vke(qke qkeVar) {
        ah2 ah2Var = hk2.a;
        this.a = qkeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            ah2 ah2Var = hk2.a;
            qke qkeVar = this.a;
            qkeVar.getClass();
            ah2Var.q(qkeVar, bVar2, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
