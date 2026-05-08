package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class tl7 extends e.c implements lm8 {
    public abstract long c2(vf9 vf9Var, long j);

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        long jC2 = c2(vf9Var, j);
        if (d2()) {
            jC2 = mq2.e(j, jC2);
        }
        w wVarR = vf9Var.R(jC2);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new hp0(wVarR, 8));
    }

    public abstract boolean d2();

    @Override // defpackage.lm8
    public int p(w59 w59Var, pl7 pl7Var, int i) {
        return pl7Var.O(i);
    }

    public int r(w59 w59Var, pl7 pl7Var, int i) {
        return pl7Var.w(i);
    }

    public int v(w59 w59Var, pl7 pl7Var, int i) {
        return pl7Var.K(i);
    }

    @Override // defpackage.lm8
    public int z(w59 w59Var, pl7 pl7Var, int i) {
        return pl7Var.P(i);
    }
}
