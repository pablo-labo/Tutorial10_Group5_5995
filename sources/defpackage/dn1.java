package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends e.c implements an1 {
    public ViewGroup d0;

    @Override // defpackage.an1
    public final Object j1(tia tiaVar, bn1 bn1Var, pu2 pu2Var) {
        long jA0 = tiaVar.a0(0L);
        qtc qtcVar = (qtc) bn1Var.invoke();
        qtc qtcVarI = qtcVar != null ? qtcVar.i(jA0) : null;
        if (qtcVarI != null) {
            this.d0.requestRectangleOnScreen(wab.y(qtcVarI), false);
        }
        return j6g.a;
    }
}
