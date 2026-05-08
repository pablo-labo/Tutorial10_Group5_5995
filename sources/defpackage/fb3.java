package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fb3 implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ List a;
    public final /* synthetic */ kk1 b;
    public final /* synthetic */ Function2 c;

    public fb3(List list, kk1 kk1Var, Function2 function2) {
        this.a = list;
        this.b = kk1Var;
        this.c = function2;
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
            fo7 fo7Var = (fo7) this.a.get(iIntValue);
            bVar2.L(-1861406228);
            hb3.b(fo7Var, this.b.b, this.c, bVar2, 0);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
