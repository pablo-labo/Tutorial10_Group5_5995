package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class iyg implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function1 c;

    public iyg(List list, Function2 function2, Function1 function1) {
        this.a = list;
        this.b = function2;
        this.c = function1;
    }

    @Override // defpackage.xu5
    public final j6g j(xo8 xo8Var, Integer num, b bVar, Integer num2) {
        int i;
        xo8 xo8Var2 = xo8Var;
        int iIntValue = num.intValue();
        b bVar2 = bVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= bVar2.d(iIntValue) ? 32 : 16;
        }
        if (bVar2.o(i & 1, (i & 147) != 146)) {
            lsc lscVar = (lsc) this.a.get(iIntValue);
            bVar2.L(-324516947);
            Function2 function2 = this.b;
            boolean zK = bVar2.K(function2) | bVar2.x(lscVar) | ((((i & 112) ^ 48) > 32 && bVar2.d(iIntValue)) || (i & 48) == 32);
            Object objV = bVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new eyg(function2, lscVar, iIntValue);
                bVar2.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            Function1 function1 = this.c;
            boolean zK2 = bVar2.K(function1) | bVar2.x(lscVar);
            Object objV2 = bVar2.v();
            if (zK2 || objV2 == c0020a) {
                objV2 = new we8(2, function1, lscVar);
                bVar2.p(objV2);
            }
            jyg.b(lscVar, gu5Var, (gu5) objV2, l5.l("RecentSearchItem", lscVar.a), bVar2, 0);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
