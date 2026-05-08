package defpackage;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class nu6 {
    @SuppressLint({"ComposableModifierFactory"})
    public static final e a(final long j, b bVar) {
        bVar.L(-1599219991);
        final float fT1 = ((iy3) bVar.M(um2.h)).t1(1.0f);
        bVar.L(-1633490746);
        boolean zC = bVar.c(fT1) | bVar.e(j);
        Object objV = bVar.v();
        if (zC || objV == b.a.a) {
            objV = new Function1() { // from class: mu6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    gb4 gb4Var = (gb4) obj;
                    gb4Var.getClass();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (gb4Var.c() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L));
                    float f = fT1;
                    float f2 = fIntBitsToFloat2 - (f / 2.0f);
                    gb4Var.W(j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), f, (496 & 16) != 0 ? 0 : 0);
                    return j6g.a;
                }
            };
            bVar.p(objV);
        }
        bVar.F();
        e eVarJ = f.j(g.f(a.a(e.a.b, (Function1) objV), 1.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7);
        bVar.F();
        return eVarJ;
    }
}
