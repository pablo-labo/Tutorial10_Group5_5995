package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class fyg implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;

    public fyg(String str, List list, Function1 function1) {
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
            bVar2.L(888394261);
            String str = this.b;
            String str2 = zve.U(str) ? "__DEFAULT_MATCH_TERM__" : str;
            Function1 function1 = this.c;
            boolean zK = bVar2.K(function1) | ((((i & 112) ^ 48) > 32 && bVar2.d(iIntValue)) || (i & 48) == 32);
            Object objV = bVar2.v();
            if (zK || objV == b.a.a) {
                objV = new vd8(function1, iIntValue, 1);
                bVar2.p(objV);
            }
            jyg.d(zyeVar, str2, (gu5) objV, p6.c(iIntValue, zve.U(str) ? "InitialSuggestionItem" : "SuggestionMatchItem"), bVar2, 0);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
