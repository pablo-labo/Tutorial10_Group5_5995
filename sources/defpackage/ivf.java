package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ivf implements Function2<b, Integer, j6g> {
    public final /* synthetic */ Function2<b, Integer, j6g> a;
    public final /* synthetic */ ah2 b;

    public ivf(Function2 function2, ah2 ah2Var) {
        this.a = function2;
        this.b = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.invoke(bVar2, 0);
            this.b.invoke(bVar2, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
