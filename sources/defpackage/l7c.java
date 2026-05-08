package defpackage;

import defpackage.ax1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l7c extends mj8 implements Function1<gb4, j6g> {
    final /* synthetic */ ese<Float> $alphaState;
    final /* synthetic */ long $color;
    final /* synthetic */ v5b $path;
    final /* synthetic */ gu5<Float> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7c(gu5<Float> gu5Var, ese<Float> eseVar, long j, v5b v5bVar) {
        super(1);
        this.$progress = gu5Var;
        this.$alphaState = eseVar;
        this.$color = j;
        this.$path = v5bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(gb4 gb4Var) {
        gb4 gb4Var2 = gb4Var;
        float fFloatValue = this.$progress.invoke().floatValue();
        dvf<Float> dvfVar = o7c.a;
        float fMax = (Math.max(Math.min(1.0f, fFloatValue) - 0.4f, 0.0f) * 5.0f) / 3.0f;
        float fB = nic.B(Math.abs(fFloatValue) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fB - (((float) Math.pow(fB, 2.0d)) / 4.0f))) * 0.5f;
        float f = fPow * 360.0f;
        float f2 = ((0.8f * fMax) + fPow) * 360.0f;
        wt0 wt0Var = new wt0(fPow, f, f2, Math.min(1.0f, fMax));
        float fFloatValue2 = this.$alphaState.getValue().floatValue();
        long j = this.$color;
        v5b v5bVar = this.$path;
        long jF1 = gb4Var2.F1();
        ax1.b bVarW1 = gb4Var2.w1();
        long jD = bVarW1.d();
        bVarW1.a().o();
        try {
            bVarW1.a.f(jF1, fPow);
            float fT1 = (gb4Var2.t1(2.5f) / 2.0f) + gb4Var2.t1(5.5f);
            long j2 = oie.j(gb4Var2.c());
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            qtc qtcVar = new qtc(Float.intBitsToFloat(i) - fT1, Float.intBitsToFloat(i2) - fT1, Float.intBitsToFloat(i) + fT1, Float.intBitsToFloat(i2) + fT1);
            gb4Var2.Q(j, f, f2 - f, qtcVar.d(), qtcVar.c(), (832 & 64) != 0 ? 1.0f : fFloatValue2, new bwe(gb4Var2.t1(2.5f), 0.0f, 0, 0, null, 26));
            o7c.c(gb4Var2, v5bVar, qtcVar, j, fFloatValue2, wt0Var);
            g7.k(bVarW1, jD);
            return j6g.a;
        } catch (Throwable th) {
            g7.k(bVarW1, jD);
            throw th;
        }
    }
}
