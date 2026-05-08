package androidx.compose.foundation.selection;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.gu5;
import defpackage.inf;
import defpackage.pa7;
import defpackage.qed;
import defpackage.tf7;
import defpackage.ua7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final e a(boolean z, d3a d3aVar, boolean z2, qed qedVar, Function1 function1) {
        return new ToggleableElement(z, d3aVar, z2, qedVar, function1);
    }

    public static final e b(inf infVar, d3a d3aVar, pa7 pa7Var, boolean z, qed qedVar, gu5 gu5Var) {
        if (pa7Var instanceof ua7) {
            return new TriStateToggleableElement(infVar, d3aVar, (ua7) pa7Var, z, qedVar, gu5Var);
        }
        if (pa7Var == null) {
            return new TriStateToggleableElement(infVar, d3aVar, null, z, qedVar, gu5Var);
        }
        e.a aVar = e.a.b;
        if (d3aVar != null) {
            return androidx.compose.foundation.e.a(aVar, d3aVar, pa7Var).o(new TriStateToggleableElement(infVar, d3aVar, null, z, qedVar, gu5Var));
        }
        return androidx.compose.ui.c.a(aVar, tf7.a, new b(pa7Var, infVar, z, qedVar, gu5Var));
    }
}
