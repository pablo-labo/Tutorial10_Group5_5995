package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b3c {
    public static final void a(final boolean z, b bVar, final int i) {
        c cVarH = bVar.h(227056026);
        int i2 = (cVarH.a(z) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            if (z) {
                cVarH.L(-347326330);
                c3c.b(f.a(g.h(g.f(e.a.b, 1.0f), 2.0f), "ProgressIndicator"), eu6.c, eu6.p, cVarH, 6, 0);
            } else {
                cVarH.L(-348119000);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, z) { // from class: s2c
                public final /* synthetic */ boolean a;

                {
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    b3c.a(this.a, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
