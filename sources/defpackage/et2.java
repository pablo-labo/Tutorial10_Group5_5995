package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.kv0;

/* JADX INFO: loaded from: classes.dex */
public final class et2 extends e.c implements eb4, lm8 {
    public x2b d0;
    public c20 e0;
    public ft2 f0;
    public float g0;
    public ga2 h0;

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    public final long c2(long j) {
        if (kie.e(j)) {
            return 0L;
        }
        long jH = this.d0.h();
        if (jH != 9205357640488583168L) {
            float fD = kie.d(jH);
            if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                fD = kie.d(j);
            }
            float fB = kie.b(jH);
            if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                fB = kie.b(j);
            }
            long jE = oie.e(fD, fB);
            long jA = this.f0.a(jE, j);
            int i = wmd.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            if (!Float.isInfinite(fIntBitsToFloat) && !Float.isNaN(fIntBitsToFloat)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
                if (!Float.isInfinite(fIntBitsToFloat2) && !Float.isNaN(fIntBitsToFloat2)) {
                    return r03.B(jE, jA);
                }
            }
        }
        return j;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(d2(j));
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new q3(wVarR, 3));
    }

    public final long d2(long j) {
        float fJ;
        int i;
        float fB;
        boolean zF = iq2.f(j);
        boolean zE = iq2.e(j);
        if (!zF || !zE) {
            x2b x2bVar = this.d0;
            boolean z = iq2.d(j) && iq2.c(j);
            long jH = x2bVar.h();
            if (jH != 9205357640488583168L) {
                if (z && (zF || zE)) {
                    fJ = iq2.h(j);
                    i = iq2.g(j);
                } else {
                    float fD = kie.d(jH);
                    float fB2 = kie.b(jH);
                    if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                        fJ = iq2.j(j);
                    } else {
                        y03 y03Var = mkg.a;
                        fJ = nic.B(fD, iq2.j(j), iq2.h(j));
                    }
                    if (!Float.isInfinite(fB2) && !Float.isNaN(fB2)) {
                        y03 y03Var2 = mkg.a;
                        fB = nic.B(fB2, iq2.i(j), iq2.g(j));
                        long jC2 = c2(oie.e(fJ, fB));
                        return iq2.a(mq2.g(gf9.b(kie.d(jC2)), j), 0, mq2.f(gf9.b(kie.b(jC2)), j), 0, 10, j);
                    }
                    i = iq2.i(j);
                }
                fB = i;
                long jC22 = c2(oie.e(fJ, fB));
                return iq2.a(mq2.g(gf9.b(kie.d(jC22)), j), 0, mq2.f(gf9.b(kie.b(jC22)), j), 0, 10, j);
            }
            if (z && (!(x2bVar instanceof kv0) || ((kv0.b) ((kv0) x2bVar).i0.a.getValue()).b() != null)) {
                return iq2.a(iq2.h(j), 0, iq2.g(j), 0, 10, j);
            }
        }
        return j;
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        if (this.d0.h() == 9205357640488583168L) {
            return pl7Var.O(i);
        }
        long jD2 = d2(mq2.b(0, i, 7));
        return Math.max(iq2.j(jD2), pl7Var.O(i));
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        if (this.d0.h() == 9205357640488583168L) {
            return pl7Var.w(i);
        }
        long jD2 = d2(mq2.b(i, 0, 13));
        return Math.max(iq2.i(jD2), pl7Var.w(i));
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        if (this.d0.h() == 9205357640488583168L) {
            return pl7Var.K(i);
        }
        long jD2 = d2(mq2.b(i, 0, 13));
        return Math.max(iq2.i(jD2), pl7Var.K(i));
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        ax1 ax1Var = sm8Var.a;
        long jC2 = c2(ax1Var.c());
        c20 c20Var = this.e0;
        y03 y03Var = mkg.a;
        long jG = hh1.g(gf9.b(kie.d(jC2)), gf9.b(kie.b(jC2)));
        long jC = ax1Var.c();
        long jA = c20Var.a(jG, hh1.g(gf9.b(kie.d(jC)), gf9.b(kie.b(jC))), sm8Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ax1Var.b.a.k(f, f2);
        try {
            this.d0.g(sm8Var, jC2, this.g0, this.h0);
            ax1Var.b.a.k(-f, -f2);
            sm8Var.N1();
        } catch (Throwable th) {
            ax1Var.b.a.k(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        if (this.d0.h() == 9205357640488583168L) {
            return pl7Var.P(i);
        }
        long jD2 = d2(mq2.b(0, i, 7));
        return Math.max(iq2.j(jD2), pl7Var.P(i));
    }
}
