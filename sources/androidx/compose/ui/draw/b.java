package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.ft2;
import defpackage.ga2;
import defpackage.x2b;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static e a(e eVar, x2b x2bVar, c20 c20Var, ft2 ft2Var, float f, ga2 ga2Var, int i) {
        if ((i & 4) != 0) {
            c20Var = c20.a.e;
        }
        c20 c20Var2 = c20Var;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return eVar.o(new PainterElement(x2bVar, c20Var2, ft2Var, f, ga2Var));
    }
}
