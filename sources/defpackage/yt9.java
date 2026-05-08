package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yt9 extends e.c implements nm2, lm8 {
    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        boolean z = this.c0 && ((Boolean) om2.a(this, gi7.a)).booleanValue();
        long j2 = gi7.c;
        final w wVarR = vf9Var.R(j);
        final int iMax = wVarR.a;
        if (z) {
            iMax = Math.max(iMax, qVar.x0(m94.b(j2)));
        }
        final int iMax2 = wVarR.b;
        if (z) {
            iMax2 = Math.max(iMax2, qVar.x0(m94.a(j2)));
        }
        return qVar.Y0(iMax, iMax2, bs4.a, new Function1() { // from class: wt9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((w.a) obj).r(wVarR, gf9.b((iMax - r0.a) / 2.0f), gf9.b((iMax2 - r0.b) / 2.0f), 0.0f);
                return j6g.a;
            }
        });
    }
}
