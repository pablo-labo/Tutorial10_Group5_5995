package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x60 implements wu5<e, b, Integer, e> {
    public static final x60 a = new x60();

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        e eVar2 = eVar;
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-2126899193);
        final long j = ((qjf) bVar2.M(rjf.a)).a;
        boolean zE = bVar2.e(j);
        Object objV = bVar2.v();
        if (zE || objV == b.a.a) {
            objV = new Function1() { // from class: w60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ft1 ft1Var = (ft1) obj;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (ft1Var.a.c() >> 32)) / 2.0f;
                    return ft1Var.d(new v60(fIntBitsToFloat, y90.d(ft1Var, fIntBitsToFloat), new ih1(j, 5), 0));
                }
            };
            bVar2.p(objV);
        }
        e eVarO = eVar2.o(a.b(e.a.b, (Function1) objV));
        bVar2.F();
        return eVarO;
    }
}
