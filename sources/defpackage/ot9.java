package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ot9 {
    public static final void a(Function1 function1, List list, Locale locale, b bVar, int i) {
        int i2;
        function1.getClass();
        list.getClass();
        c cVarH = bVar.h(-807167973);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(locale) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i3 = i2 | 3072;
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String strI = ak2.I(R.string.label_military_service, cVarH);
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new iz1(function1, 2);
                cVarH.p(objV);
            }
            uub.b(strI, "", (gu5) objV, null, false, !list.isEmpty(), false, bh2.c(-491700200, new nt9(list, function1, o97Var, locale, 0), cVarH), cVarH, 12582960, 88);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kz1(function1, list, locale, i, 1);
        }
    }
}
