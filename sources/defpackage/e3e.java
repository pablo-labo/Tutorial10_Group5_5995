package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e3e implements Function2<b, Integer, j6g> {
    public final /* synthetic */ j4e a;
    public final /* synthetic */ p4e b;
    public final /* synthetic */ ah2 c;

    public e3e(ah2 ah2Var, j4e j4eVar, p4e p4eVar) {
        this.a = j4eVar;
        this.b = p4eVar;
        this.c = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            p4e p4eVar = this.b;
            ah2 ah2Var = this.c;
            j4e j4eVar = this.a;
            cu2.a(j4eVar, bh2.c(-284825865, new d3e(ah2Var, j4eVar, p4eVar), bVar2), bVar2, 48);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
