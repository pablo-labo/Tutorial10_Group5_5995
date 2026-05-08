package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class m02 {
    public static final void a(final e eVar, final float f, b bVar, final int i, final int i2) {
        int i3;
        c cVarH = bVar.h(175157588);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.c(f) ? 32 : 16;
        }
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            float f2 = i5 != 0 ? 1.0f : f;
            a84.a(f2, i3 & 112, 0, eu6.r, cVarH, g.f(eVar, 1.0f));
            f = f2;
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: l02
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    m02.a(eVar, f, (b) obj, iL, i2);
                    return j6g.a;
                }
            };
        }
    }
}
