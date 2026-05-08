package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y2b extends e.c implements lm8, eb4 {
    public x2b d0;
    public boolean e0;
    public c20 f0;
    public ft2 g0;
    public float h0;
    public ga2 i0;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar) {
            super(1);
            this.$placeable = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a.y(aVar, this.$placeable, 0, 0);
            return j6g.a;
        }
    }

    public static boolean d2(long j) {
        return !kie.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean e2(long j) {
        return !kie.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    public final boolean c2() {
        return this.e0 && this.d0.h() != 9205357640488583168L;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(f2(j));
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new a(wVarR));
    }

    public final long f2(long j) {
        boolean z = false;
        boolean z2 = iq2.d(j) && iq2.c(j);
        if (iq2.f(j) && iq2.e(j)) {
            z = true;
        }
        if ((!c2() && z2) || z) {
            return iq2.a(iq2.h(j), 0, iq2.g(j), 0, 10, j);
        }
        long jH = this.d0.h();
        int iRound = e2(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : iq2.j(j);
        int iRound2 = d2(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : iq2.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(mq2.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(mq2.g(iRound, j))) << 32);
        if (c2()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!e2(this.d0.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.d0.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!d2(this.d0.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.d0.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : r03.B(jFloatToRawIntBits2, this.g0.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return iq2.a(mq2.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, mq2.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        if (!c2()) {
            return pl7Var.O(i);
        }
        long jF2 = f2(mq2.b(0, i, 7));
        return Math.max(iq2.j(jF2), pl7Var.O(i));
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        if (!c2()) {
            return pl7Var.w(i);
        }
        long jF2 = f2(mq2.b(i, 0, 13));
        return Math.max(iq2.i(jF2), pl7Var.w(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.d0 + ", sizeToIntrinsics=" + this.e0 + ", alignment=" + this.f0 + ", alpha=" + this.h0 + ", colorFilter=" + this.i0 + ')';
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        if (!c2()) {
            return pl7Var.K(i);
        }
        long jF2 = f2(mq2.b(i, 0, 13));
        return Math.max(iq2.i(jF2), pl7Var.K(i));
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        ax1 ax1Var = sm8Var.a;
        long jH = this.d0.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(e2(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (ax1Var.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(d2(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (ax1Var.c() & 4294967295L)))) & 4294967295L);
        long jB = (Float.intBitsToFloat((int) (ax1Var.c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (ax1Var.c() & 4294967295L)) == 0.0f) ? 0L : r03.B(jFloatToRawIntBits, this.g0.a(jFloatToRawIntBits, ax1Var.c()));
        long jA = this.f0.a((((long) Math.round(Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (ax1Var.c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (ax1Var.c() & 4294967295L)))) & 4294967295L), sm8Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ax1Var.b.a.k(f, f2);
        try {
            this.d0.g(sm8Var, jB, this.h0, this.i0);
            ax1Var.b.a.k(-f, -f2);
            sm8Var.N1();
        } catch (Throwable th) {
            ax1Var.b.a.k(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        if (!c2()) {
            return pl7Var.P(i);
        }
        long jF2 = f2(mq2.b(0, i, 7));
        return Math.max(iq2.j(jF2), pl7Var.P(i));
    }
}
