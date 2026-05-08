package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;

/* JADX INFO: loaded from: classes3.dex */
public final class yt3 {
    public static final void a(int i, gu5 gu5Var, b bVar, String str) {
        int i2;
        gu5Var.getClass();
        str.getClass();
        c cVarH = bVar.h(-218414798);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (cVarH.K(str) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            v1c.a(gu5Var, f.a(e.a.b, "DeleteInfoButton"), false, null, 0L, null, null, null, null, bh2.c(315656352, new cr2((o97) cVarH.M(p97.a), str, 1), cVarH), cVarH, (i3 & 14) | 48, 1020);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new wq3(gu5Var, i, 1, str);
        }
    }
}
