package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class eff implements Function2<b, Integer, j6g> {
    public final /* synthetic */ long a;
    public final /* synthetic */ Float b;
    public final /* synthetic */ Function2<b, Integer, j6g> c;

    /* JADX WARN: Multi-variable type inference failed */
    public eff(long j, Float f, Function2<? super b, ? super Integer, j6g> function2) {
        this.a = j;
        this.b = f;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            ne4 ne4Var = ps2.a;
            long j = this.a;
            rm2.a(ne4Var.a(new da2(j)), bh2.c(-1624601445, new gle(j, this.b, this.c), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
