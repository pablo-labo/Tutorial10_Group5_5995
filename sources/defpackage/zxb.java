package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zxb {
    public static final void a(rxb rxbVar, Function1<? super rxb, j6g> function1, Function1<? super rxb, j6g> function12, Function1<? super rxb, j6g> function13, b bVar, int i) {
        rxb rxbVar2;
        int i2;
        rxbVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        c cVarH = bVar.h(-1672018873);
        int i3 = i | (cVarH.d(rxbVar.ordinal()) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(function12) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function13) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            rxbVar2 = rxbVar;
            cVarH.A(-492352594, rxbVar2);
            String strI = ak2.I(R.string.tab_profile, cVarH);
            fv6 fv6Var = fv6.q7;
            ar6 ar6Var = ar6.Filled;
            dy6 dy6Var = new dy6(strI, fv6Var, fv6Var, ar6Var, ar6Var);
            String strI2 = ak2.I(R.string.tab_preferences, cVarH);
            fv6 fv6Var2 = fv6.G4;
            dy6 dy6Var2 = new dy6(strI2, fv6Var2, fv6Var2, ar6Var, ar6Var);
            String strI3 = ak2.I(R.string.tab_resume, cVarH);
            fv6 fv6Var3 = fv6.A3;
            List listA0 = u63.a0(dy6Var, dy6Var2, new dy6(strI3, fv6Var3, fv6Var3, ar6Var, ar6Var));
            int iOrdinal = rxbVar2.ordinal();
            if (iOrdinal == 0) {
                i2 = 0;
            } else if (iOrdinal == 1) {
                i2 = 1;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return;
                }
                i2 = 2;
            }
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new fv2(2, function1, function12, function13);
                cVarH.p(objV);
            }
            ky6.c(listA0, i2, (Function1) objV, f.a(e.a.b, "IdlTabMenu"), cVarH, 3072, 16);
            cVarH.U(false);
        } else {
            rxbVar2 = rxbVar;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jub(rxbVar2, function1, function12, function13, i, 1);
        }
    }
}
