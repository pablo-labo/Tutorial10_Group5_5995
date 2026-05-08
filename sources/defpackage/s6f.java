package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.c20;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s6f extends mj8 implements wu5<e, b, Integer, e> {
    final /* synthetic */ o6f $currentTabPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6f(o6f o6fVar) {
        super(3);
        this.$currentTabPosition = o6fVar;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-1541271084);
        float f = this.$currentTabPosition.b;
        dvf dvfVar = u6f.b;
        ese eseVarA = vc0.a(f, dvfVar, bVar2, 0);
        ese eseVarA2 = vc0.a(this.$currentTabPosition.a, dvfVar, bVar2, 0);
        e eVarV = g.v(g.f(eVar, 1.0f), c20.a.g, 2);
        boolean zK = bVar2.K(eseVarA2);
        Object objV = bVar2.v();
        if (zK || objV == b.a.a) {
            objV = new r6f(eseVarA2);
            bVar2.p(objV);
        }
        e eVarR = g.r(androidx.compose.foundation.layout.e.a(eVarV, (Function1) objV), ((j94) eseVarA.getValue()).a);
        bVar2.F();
        return eVarR;
    }
}
