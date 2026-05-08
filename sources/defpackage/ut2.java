package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ut2 implements wu5<st2, b, Integer, j6g> {
    public final /* synthetic */ Function2<b, Integer, String> a;
    public final /* synthetic */ wu5<da2, b, Integer, j6g> b;
    public final /* synthetic */ gu5<j6g> c;

    public ut2(Function2 function2, wu5 wu5Var, gu5 gu5Var) {
        this.a = function2;
        this.b = wu5Var;
        this.c = gu5Var;
    }

    @Override // defpackage.wu5
    public final j6g q(st2 st2Var, b bVar, Integer num) {
        st2 st2Var2 = st2Var;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(st2Var2) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            String strInvoke = this.a.invoke(bVar2, 0);
            if (zve.U(strInvoke)) {
                de7.c("Label must not be blank");
            }
            au2.c(strInvoke, st2Var2, e.a.b, this.b, this.c, bVar2, (iIntValue << 6) & 896);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
