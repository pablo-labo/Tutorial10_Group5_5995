package defpackage;

import android.graphics.DashPathEffect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r1c implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;

    public /* synthetic */ r1c(float f, boolean z) {
        this.a = z;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gb4 gb4Var = (gb4) obj;
        gb4Var.getClass();
        if (this.a) {
            float f = this.b;
            n80 n80Var = new n80(new DashPathEffect(new float[]{f, f}, 0.0f));
            float fT1 = gb4Var.t1(1.0f);
            float f2 = fT1 / 2.0f;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (gb4Var.c() >> 32)) - fT1;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - fT1;
            long j = eu6.q;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
            gb4Var.p0(j, (224 & 2) != 0 ? 0L : jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (((long) Float.floatToRawIntBits(gb4Var.t1(8.0f))) << 32) | (((long) Float.floatToRawIntBits(gb4Var.t1(8.0f))) & 4294967295L), new bwe(fT1, 0.0f, 1, 0, n80Var, 10));
        }
        return j6g.a;
    }
}
