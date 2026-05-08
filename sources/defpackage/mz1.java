package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mz1 {
    public static final void a(Function1 function1, svb svbVar, Locale locale, b bVar, int i) {
        int i2;
        function1.getClass();
        svbVar.getClass();
        c cVarH = bVar.h(-142209883);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(svbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(locale) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i3 = i2 | 3072;
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            String strI = ak2.I(R.string.certification_license_item_title, cVarH);
            String strI2 = ak2.I(R.string.certification_license_item_desc, cVarH);
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new iz1(function1, 0);
                cVarH.p(objV);
            }
            uub.b(strI, strI2, (gu5) objV, null, false, !svbVar.G.isEmpty(), false, bh2.c(1324419362, new jz1(svbVar, function1, locale), cVarH), cVarH, 12582912, 88);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kz1(function1, svbVar, locale, i, 0);
        }
    }
}
