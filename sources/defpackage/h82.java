package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.o97;

/* JADX INFO: loaded from: classes2.dex */
public final class h82 {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        gu5Var.getClass();
        c cVarH = bVar.h(651606494);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97.g gVar = ((o97) cVarH.M(p97.a)).i;
            gu5Var2 = gu5Var;
            sq6.a(gu5Var2, f.a(g.n(e.a.b, 24.0f), "CloseButton"), false, web.b, cVarH, (i2 & 14) | 24576, 12);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new g82(i, 0, gu5Var2);
        }
    }
}
