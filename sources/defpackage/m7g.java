package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public final class m7g extends e.c implements lm8 {
    public float d0;
    public float e0;

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.d0) || iq2.j(j) != 0) {
            iJ = iq2.j(j);
        } else {
            int iX0 = qVar.x0(this.d0);
            iJ = iq2.h(j);
            if (iX0 < 0) {
                iX0 = 0;
            }
            if (iX0 <= iJ) {
                iJ = iX0;
            }
        }
        int iH = iq2.h(j);
        if (Float.isNaN(this.e0) || iq2.i(j) != 0) {
            i = iq2.i(j);
        } else {
            int iX02 = qVar.x0(this.e0);
            i = iq2.g(j);
            int i2 = iX02 >= 0 ? iX02 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        w wVarR = vf9Var.R(mq2.a(iJ, iH, i, iq2.g(j)));
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new na(wVarR, 14));
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        int iO = pl7Var.O(i);
        int iX0 = !Float.isNaN(this.d0) ? w59Var.x0(this.d0) : 0;
        return iO < iX0 ? iX0 : iO;
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        int iW = pl7Var.w(i);
        int iX0 = !Float.isNaN(this.e0) ? w59Var.x0(this.e0) : 0;
        return iW < iX0 ? iX0 : iW;
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        int iK = pl7Var.K(i);
        int iX0 = !Float.isNaN(this.e0) ? w59Var.x0(this.e0) : 0;
        return iK < iX0 ? iX0 : iK;
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        int iP = pl7Var.P(i);
        int iX0 = !Float.isNaN(this.d0) ? w59Var.x0(this.d0) : 0;
        return iP < iX0 ? iX0 : iP;
    }
}
