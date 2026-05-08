package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d3e implements Function2<b, Integer, j6g> {
    public final /* synthetic */ p4e a;
    public final /* synthetic */ ah2 b;
    public final /* synthetic */ j4e c;

    public d3e(ah2 ah2Var, j4e j4eVar, p4e p4eVar) {
        this.a = p4eVar;
        this.b = ah2Var;
        this.c = j4eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            rm2.a(q4e.a.a(this.a), bh2.c(610483127, new c3e(this.b, this.c), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
