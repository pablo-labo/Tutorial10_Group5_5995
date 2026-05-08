package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r61 {
    public static final void a(Function1 function1, svb svbVar, b bVar, int i) {
        int i2;
        function1.getClass();
        svbVar.getClass();
        c cVarH = bVar.h(1155575285);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(svbVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            String strI = ak2.I(R.string.label_awards, cVarH);
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new n61(function1, 0);
                cVarH.p(objV);
            }
            uub.b(strI, "", (gu5) objV, null, false, !svbVar.v.isEmpty(), false, bh2.c(1587460632, new o61(0, svbVar, function1), cVarH), cVarH, 12582960, 88);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new p61(i, 0, function1, svbVar);
        }
    }
}
