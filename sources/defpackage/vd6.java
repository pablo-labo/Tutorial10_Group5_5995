package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vd6 {
    public static final void a(Function1 function1, svb svbVar, Locale locale, b bVar, int i) {
        int i2;
        function1.getClass();
        svbVar.getClass();
        c cVarH = bVar.h(219179554);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(svbVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= cVarH.x(locale) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            String strI = ak2.I(R.string.label_groups, cVarH);
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new td6(function1, 0);
                cVarH.p(objV);
            }
            uub.b(strI, "", (gu5) objV, null, false, !svbVar.C.isEmpty(), false, bh2.c(-2029754977, new om4(1, svbVar, function1, locale), cVarH), cVarH, 12582960, 88);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new tc1(function1, svbVar, locale, i);
        }
    }
}
