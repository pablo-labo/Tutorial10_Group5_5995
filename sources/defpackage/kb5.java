package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public final class kb5 extends e.c implements lm8 {
    public o54 d0;
    public float e0;

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!iq2.d(j) || this.d0 == o54.a) {
            iJ = iq2.j(j);
            iH = iq2.h(j);
        } else {
            int iRound = Math.round(iq2.h(j) * this.e0);
            int iJ2 = iq2.j(j);
            iJ = iq2.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!iq2.c(j) || this.d0 == o54.b) {
            int i2 = iq2.i(j);
            int iG2 = iq2.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(iq2.g(j) * this.e0);
            int i3 = iq2.i(j);
            iG = iq2.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        w wVarR = vf9Var.R(mq2.a(iJ, iH, iG, i));
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new q2(wVarR, 10));
    }
}
