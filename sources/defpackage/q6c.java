package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q6c {
    public static final void a(Function1 function1, svb svbVar, b bVar, int i) {
        int i2;
        function1.getClass();
        svbVar.getClass();
        c cVarH = bVar.h(1403009239);
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
            String strI = ak2.I(R.string.label_publications, cVarH);
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new asb(function1, 1);
                cVarH.p(objV);
            }
            uub.b(strI, null, (gu5) objV, null, false, !svbVar.n.isEmpty(), false, bh2.c(-2137642886, new f23(svbVar, function1, o97Var), cVarH), cVarH, 12582912, 90);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new je4(i, 2, function1, svbVar);
        }
    }
}
