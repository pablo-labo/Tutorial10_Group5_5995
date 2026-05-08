package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hef implements wu5<e, b, Integer, e> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ei7 b;
    public final /* synthetic */ ar3 c;

    public hef(boolean z, d3a d3aVar, ar3 ar3Var) {
        this.a = z;
        this.b = d3aVar;
        this.c = ar3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(1398930845);
        final bj1 bj1Var = (bj1) pg8.h(this.a, this.b, this.c, 2.0f, 1.0f, bVar2, 0).getValue();
        final float f = bj1Var.a;
        e eVarC = a.c(e.a.b, new Function1() { // from class: tff
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ss2 ss2Var = (ss2) obj;
                ss2Var.N1();
                float f2 = f;
                if (j94.c(f2, 0.0f)) {
                    return j6g.a;
                }
                float density = ss2Var.getDensity() * f2;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (ss2Var.c() & 4294967295L)) - (density / 2.0f);
                ss2Var.s1(bj1Var.b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ss2Var.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), density, (432 & 64) != 0 ? 1.0f : 0.0f);
                return j6g.a;
            }
        });
        bVar2.F();
        return eVarC;
    }
}
