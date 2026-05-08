package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class bmb {
    public static final void a(final boolean z, b bVar, final int i) {
        boolean z2;
        c cVarH = bVar.h(1406113286);
        int i2 = (cVarH.a(z) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            if (z) {
                cVarH.L(705042505);
                e eVarF = g.f(e.a.b, 0.85f);
                o44 o44Var = new o44(3);
                Object objV = cVarH.v();
                if (objV == b.a.a) {
                    objV = new zw(19);
                    cVarH.p(objV);
                }
                z2 = false;
                l40.b((gu5) objV, wj2.a, eVarF, wj2.b, wj2.c, null, 0L, 0L, o44Var, cVarH, 100691382, 224);
            } else {
                z2 = false;
                cVarH.L(703693788);
            }
            cVarH.U(z2);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, z) { // from class: amb
                public final /* synthetic */ boolean a;

                {
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    bmb.a(this.a, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
