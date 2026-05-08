package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t2c implements wu5 {
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        q qVar = (q) obj;
        final int iX0 = qVar.x0(10.0f);
        long j = ((iq2) obj3).a;
        int i = iX0 * 2;
        final w wVarR = ((vf9) obj2).R(mq2.i(0, i, j));
        int i2 = wVarR.b - i;
        return qVar.Y0(wVarR.a, i2, bs4.a, new Function1() { // from class: u2c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                ((w.a) obj4).r(wVarR, 0, -iX0, 0.0f);
                return j6g.a;
            }
        });
    }
}
