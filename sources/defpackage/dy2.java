package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class dy2 {
    public static final void a(e eVar, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(248023580);
        int i3 = 2;
        int i4 = (cVarH.K(eVar) ? 4 : 2) | i;
        if (cVarH.o(i4 & 1, (i4 & 3) != 2)) {
            e eVarB = a.b(g.d(f.a(eVar, "ConversationListShimmer"), 1.0f), ((o97) cVarH.M(p97.a)).c.b.a, ytc.a);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new xr(i3);
                cVarH.p(objV);
            }
            i2 = 0;
            hn8.b(eVarB, null, null, false, null, null, null, false, null, (Function1) objV, cVarH, 805306368, 510);
        } else {
            i2 = 0;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new cy2(eVar, i, i2);
        }
    }

    public static final void b(int i, b bVar) {
        c cVar;
        c cVarH = bVar.h(-1909890606);
        if (cVarH.o(i & 1, i != 0)) {
            ay1.b(g.h(g.f(e.a.b, 1.0f), 77.0f), ytc.a, wx1.a(((o97) cVarH.M(p97.a)).c.b.a, 0L, 0L, 0L, cVarH, 14), null, null, bi2.b, cVarH, 196662, 24);
            cVar = cVarH;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ph2(i, 3);
        }
    }
}
