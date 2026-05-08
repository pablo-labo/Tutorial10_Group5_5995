package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.o97;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hu9 {
    public static final void a(String str, String str2, gu5 gu5Var, e eVar, b bVar, int i) {
        e eVar2;
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(925890635);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(str2) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | 3072;
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i3 == 4) | (i4 == 32);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new gu9(str, str2, null);
                cVarH.p(objV);
            }
            to4.f(str, str2, (Function2) objV, cVarH);
            o97 o97Var = (o97) cVarH.M(p97.a);
            b20 b20Var = b20.WARNING;
            String strI = ak2.I(R.string.missing_details_alert_message, cVarH);
            String strI2 = ak2.I(R.string.missing_details_alert_dismiss_description, cVarH);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarJ = f.j(eVarF, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            boolean z2 = (i3 == 4) | (i4 == 32) | ((i2 & 896) == 256);
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new yq7(str, str2, gu5Var);
                cVarH.p(objV2);
            }
            tr6.a(b20Var, (gu5) objV2, strI2, eVarJ, null, null, strI, null, cVarH, 6, 176);
            eVar2 = aVar;
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fu9(str, str2, gu5Var, eVar2, i);
        }
    }
}
