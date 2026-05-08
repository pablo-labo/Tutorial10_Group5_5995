package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class xyg implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;

    public xyg(String str, List list, Function1 function1) {
        this.a = list;
        this.b = str;
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
            zye zyeVar = (zye) this.a.get(iIntValue);
            bVar2.L(252181630);
            ux6 ux6Var = new ux6(zyeVar.c, zlg.a, fv6.Y4, 240);
            String str = this.b;
            if (zve.U(str)) {
                str = "__DEFAULT_MATCH_TERM__";
            }
            String str2 = str;
            Function1 function1 = this.c;
            boolean zK = bVar2.K(function1) | ((((i & 112) ^ 48) > 32 && bVar2.d(iIntValue)) || (i & 48) == 32);
            Object objV = bVar2.v();
            if (zK || objV == b.a.a) {
                objV = new wyg(function1, iIntValue);
                bVar2.p(objV);
            }
            zx6.a(ux6Var, (gu5) objV, null, str2, null, bVar2, 0, 20);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
