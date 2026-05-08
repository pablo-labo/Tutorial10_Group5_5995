package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class v4h extends e.c implements lm8 {
    public o54 d0;
    public Function2<? super th7, ? super vl8, lh7> e0;

    public v4h() {
        throw null;
    }

    @Override // defpackage.lm8
    public final bg9 d(final q qVar, vf9 vf9Var, long j) {
        final w wVarR = vf9Var.R(mq2.a(this.d0 != o54.a ? 0 : iq2.j(j), iq2.h(j), this.d0 == o54.b ? iq2.i(j) : 0, iq2.g(j)));
        final int iC = nic.C(wVarR.a, iq2.j(j), iq2.h(j));
        final int iC2 = nic.C(wVarR.b, iq2.i(j), iq2.g(j));
        return qVar.Y0(iC, iC2, bs4.a, new Function1() { // from class: u4h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function2<? super th7, ? super vl8, lh7> function2 = this.a.e0;
                w wVar = wVarR;
                w.a.w((w.a) obj, wVar, function2.invoke(new th7((((long) (iC - wVar.a)) << 32) | (((long) (iC2 - wVar.b)) & 4294967295L)), qVar.getLayoutDirection()).a);
                return j6g.a;
            }
        });
    }
}
