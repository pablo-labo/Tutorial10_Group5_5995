package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.indeed.android.jobsearch.R;
import defpackage.saa;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c8a {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        gu5Var.getClass();
        c cVarH = bVar.h(-914944089);
        int i3 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            String string = ((Context) cVarH.M(AndroidCompositionLocals_androidKt.b)).getString(R.string.my_jobs_heading_name);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new mc(7);
                cVarH.p(objV);
            }
            sof sofVar = new sof(string, vmf.a, null, (Function1) objV, 12);
            i2 = 1;
            b4g.p(null, ((h2g) cr8.p(h2g.class)).a() ? u63.Z(new raa(saa.g.a, "myjobs_screen", (String) null, (Integer) null, gu5Var, 28)) : zr4.a, sofVar, null, false, cVarH, 24576, 41);
        } else {
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new wr2(i, i2, gu5Var);
        }
    }
}
