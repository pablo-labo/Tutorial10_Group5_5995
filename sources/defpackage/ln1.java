package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class ln1 extends e.c implements an1, ql8 {
    public us2 d0;
    public boolean e0;

    public static final qtc c2(ln1 ln1Var, sl8 sl8Var, gu5<qtc> gu5Var) {
        qtc qtcVarInvoke;
        if (ln1Var.c0 && ln1Var.e0) {
            tia tiaVarE = us3.e(ln1Var);
            if (!sl8Var.d()) {
                sl8Var = null;
            }
            if (sl8Var != null && (qtcVarInvoke = gu5Var.invoke()) != null) {
                return qtcVarInvoke.i(tiaVarE.J(sl8Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.ql8
    public final void P0(sl8 sl8Var) {
        this.e0 = true;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // defpackage.an1
    public final Object j1(tia tiaVar, bn1 bn1Var, pu2 pu2Var) {
        Object objD = f13.d(new kn1(this, tiaVar, bn1Var, new jn1(0, this, tiaVar, bn1Var), null), pu2Var);
        return objD == g13.a ? objD : j6g.a;
    }
}
