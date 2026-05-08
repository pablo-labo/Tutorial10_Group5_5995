package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class xr8 implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ ah2 a;

    public xr8(ah2 ah2Var) {
        this.a = ah2Var;
    }

    @Override // defpackage.xu5
    public final j6g j(xo8 xo8Var, Integer num, b bVar, Integer num2) {
        xo8 xo8Var2 = xo8Var;
        num.intValue();
        b bVar2 = bVar;
        int iIntValue = num2.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(xo8Var2) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 131) != 130)) {
            this.a.q(xo8Var2, bVar2, Integer.valueOf(iIntValue & 14));
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
