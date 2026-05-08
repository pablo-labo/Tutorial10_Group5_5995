package androidx.compose.foundation;

import defpackage.cn0;
import defpackage.d3a;
import defpackage.ne4;
import defpackage.pa7;
import defpackage.ra7;
import defpackage.tf7;
import defpackage.ua7;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final ne4 a = new ne4(new cn0(7));

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, d3a d3aVar, pa7 pa7Var) {
        return pa7Var == null ? eVar : pa7Var instanceof ua7 ? eVar.o(new IndicationModifierElement(d3aVar, (ua7) pa7Var)) : androidx.compose.ui.c.a(eVar, tf7.a, new ra7(pa7Var, d3aVar));
    }
}
