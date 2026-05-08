package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public final class qie extends e.c implements lm8 {
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public boolean h0;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c2(androidx.compose.ui.layout.q r7) {
        /*
            r6 = this;
            float r0 = r6.f0
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f0
            int r0 = r7.x0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.g0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.g0
            int r3 = r7.x0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.d0
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.d0
            int r4 = r7.x0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.e0
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.e0
            int r6 = r7.x0(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.mq2.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qie.c2(androidx.compose.ui.layout.q):long");
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jC2 = c2(qVar);
        if (this.h0) {
            jA = mq2.e(j, jC2);
        } else {
            if (Float.isNaN(this.d0)) {
                iJ = iq2.j(j);
                int iH2 = iq2.h(jC2);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = iq2.j(jC2);
            }
            if (Float.isNaN(this.f0)) {
                iH = iq2.h(j);
                int iJ2 = iq2.j(jC2);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = iq2.h(jC2);
            }
            if (Float.isNaN(this.e0)) {
                i = iq2.i(j);
                int iG2 = iq2.g(jC2);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = iq2.i(jC2);
            }
            if (Float.isNaN(this.g0)) {
                iG = iq2.g(j);
                int i2 = iq2.i(jC2);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = iq2.g(jC2);
            }
            jA = mq2.a(iJ, iH, i, iG);
        }
        w wVarR = vf9Var.R(jA);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new wi(wVarR, 11));
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        long jC2 = c2(w59Var);
        if (iq2.f(jC2)) {
            return iq2.h(jC2);
        }
        if (!this.h0) {
            i = mq2.f(i, jC2);
        }
        return mq2.g(pl7Var.O(i), jC2);
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        long jC2 = c2(w59Var);
        if (iq2.e(jC2)) {
            return iq2.g(jC2);
        }
        if (!this.h0) {
            i = mq2.g(i, jC2);
        }
        return mq2.f(pl7Var.w(i), jC2);
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        long jC2 = c2(w59Var);
        if (iq2.e(jC2)) {
            return iq2.g(jC2);
        }
        if (!this.h0) {
            i = mq2.g(i, jC2);
        }
        return mq2.f(pl7Var.K(i), jC2);
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        long jC2 = c2(w59Var);
        if (iq2.f(jC2)) {
            return iq2.h(jC2);
        }
        if (!this.h0) {
            i = mq2.f(i, jC2);
        }
        return mq2.g(pl7Var.P(i), jC2);
    }
}
