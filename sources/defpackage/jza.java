package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jza extends e.c implements lm8 {
    public gza d0;

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        float fB = this.d0.b(qVar.getLayoutDirection());
        float fD = this.d0.d();
        float fC = this.d0.c(qVar.getLayoutDirection());
        float fA = this.d0.a();
        if (!((Float.compare(fB, 0.0f) >= 0) & (Float.compare(fD, 0.0f) >= 0) & (Float.compare(fC, 0.0f) >= 0) & (Float.compare(fA, 0.0f) >= 0))) {
            yd7.a("Padding must be non-negative");
        }
        final int iX0 = qVar.x0(fB);
        int iX02 = qVar.x0(fC) + iX0;
        final int iX03 = qVar.x0(fD);
        int iX04 = qVar.x0(fA) + iX03;
        final w wVarR = vf9Var.R(mq2.i(-iX02, -iX04, j));
        return qVar.Y0(mq2.g(wVarR.a + iX02, j), mq2.f(wVarR.b + iX04, j), bs4.a, new Function1() { // from class: iza
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((w.a) obj).r(wVarR, iX0, iX03, 0.0f);
                return j6g.a;
            }
        });
    }
}
