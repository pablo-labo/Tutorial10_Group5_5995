package defpackage;

import androidx.compose.runtime.b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fz9 implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ List a;

    public fz9(List list) {
        this.a = list;
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
            ax6 ax6Var = (ax6) this.a.get(iIntValue);
            bVar2.L(1624549813);
            fx6.b(ax6Var.a, ax6Var.c, ax6Var.d, false, ax6Var.b, bVar2, 48, 168);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
