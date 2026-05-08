package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class p5b {
    public static final void a(Function1 function1, svb svbVar, b bVar, int i) {
        int i2;
        function1.getClass();
        svbVar.getClass();
        c cVarH = bVar.h(2025239716);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(svbVar) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String strI = ak2.I(R.string.label_patents, cVarH);
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new a1(function1, 18);
                cVarH.p(objV);
            }
            uub.b(strI, "", (gu5) objV, null, false, !svbVar.r.isEmpty(), false, bh2.c(392740615, new jx7(1, svbVar, function1, o97Var), cVarH), cVarH, 12582960, 88);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new o5b(function1, i, 0, svbVar);
        }
    }
}
