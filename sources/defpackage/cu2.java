package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class cu2 {
    public static final void a(j4e j4eVar, ah2 ah2Var, b bVar, int i) {
        c cVarH = bVar.h(-954926513);
        int i2 = (cVarH.x(j4eVar) ? 4 : 2) | i;
        int i3 = 18;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            cVarH.L(1647828491);
            lbb.b(androidx.compose.foundation.text.contextmenu.modifier.c.a(a.a(new d4e(j4eVar, null)), j4eVar.h, new e4e(j4eVar, null), null, new na0(j4eVar, i3)), ah2Var, cVarH, 48);
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bb(j4eVar, ah2Var, i);
        }
    }

    public static final void b(rgf rgfVar, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(2080741862);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(rgfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(ah2Var) ? 32 : 16;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            cVarH.L(-1881943916);
            lbb.b(!rgfVar.j() ? e.a.b : androidx.compose.foundation.text.contextmenu.modifier.c.a(a.a(new jgf(rgfVar, null)), rgfVar.y, new kgf(rgfVar, null), new lgf(rgfVar, null), new ma(rgfVar, 21)), ah2Var, cVarH, i2 & 112);
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bu2(rgfVar, i, i3, ah2Var);
        }
    }
}
