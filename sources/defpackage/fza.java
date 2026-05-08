package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public final class fza extends e.c implements lm8 {
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public boolean h0;

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        int iX0 = qVar.x0(this.f0) + qVar.x0(this.d0);
        int iX02 = qVar.x0(this.g0) + qVar.x0(this.e0);
        w wVarR = vf9Var.R(mq2.i(-iX0, -iX02, j));
        return qVar.Y0(mq2.g(wVarR.a + iX0, j), mq2.f(wVarR.b + iX02, j), bs4.a, new mz4(3, this, wVarR));
    }
}
