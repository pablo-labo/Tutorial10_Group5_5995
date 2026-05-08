package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m12 {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        gu5Var.getClass();
        c cVarH = bVar.h(-426613713);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            iv6.a(uh2.a, f.a(e.a.b, "ChangeCountryTopBar"), false, null, false, null, bh2.c(-1201707566, new j12(ak2.I(R.string.ccl_a11y_back_button, cVarH), gu5Var, (o97) cVarH.M(p97.a)), cVarH), null, cVarH, 12582966, 380);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new k12(i, i3, gu5Var);
        }
    }
}
