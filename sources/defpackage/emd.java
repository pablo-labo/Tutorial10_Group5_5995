package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class emd implements Function2<b, Integer, j6g> {
    public final /* synthetic */ wu5<ale, b, Integer, j6g> a;
    public final /* synthetic */ smd b;

    /* JADX WARN: Multi-variable type inference failed */
    public emd(wu5<? super ale, ? super b, ? super Integer, j6g> wu5Var, smd smdVar) {
        this.a = wu5Var;
        this.b = smdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.q(this.b.a, bVar2, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
