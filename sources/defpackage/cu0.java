package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public final class cu0 extends e.c implements lm8 {
    public float d0;

    public final long c2(long j, boolean z) {
        int iRound;
        int iG = iq2.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.d0)) <= 0) {
            return 0L;
        }
        if (!z || a.b(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        long jD2 = d2(j, true);
        if (th7.b(jD2, 0L)) {
            jD2 = c2(j, true);
            if (th7.b(jD2, 0L)) {
                jD2 = f2(j, true);
                if (th7.b(jD2, 0L)) {
                    jD2 = e2(j, true);
                    if (th7.b(jD2, 0L)) {
                        jD2 = d2(j, false);
                        if (th7.b(jD2, 0L)) {
                            jD2 = c2(j, false);
                            if (th7.b(jD2, 0L)) {
                                jD2 = f2(j, false);
                                if (th7.b(jD2, 0L)) {
                                    jD2 = e2(j, false);
                                    if (th7.b(jD2, 0L)) {
                                        jD2 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!th7.b(jD2, 0L)) {
            int i = (int) (jD2 >> 32);
            int i2 = (int) (4294967295L & jD2);
            if (!((i >= 0) & (i2 >= 0))) {
                ce7.a("width and height must be >= 0");
            }
            j = mq2.h(i, i, i2, i2);
        }
        w wVarR = vf9Var.R(j);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new se(wVarR, 3));
    }

    public final long d2(long j, boolean z) {
        int iRound;
        int iH = iq2.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.d0)) <= 0) {
            return 0L;
        }
        if (!z || a.b(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long e2(long j, boolean z) {
        int i = iq2.i(j);
        int iRound = Math.round(i * this.d0);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || a.b(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long f2(long j, boolean z) {
        int iJ = iq2.j(j);
        int iRound = Math.round(iJ / this.d0);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || a.b(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.d0) : pl7Var.O(i);
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.d0) : pl7Var.w(i);
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.d0) : pl7Var.K(i);
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.d0) : pl7Var.P(i);
    }
}
