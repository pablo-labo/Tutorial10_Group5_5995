package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fmd implements Function2<b, Integer, j6g> {
    public final /* synthetic */ wu5<ale, b, Integer, j6g> V;
    public final /* synthetic */ smd W;
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2<b, Integer, j6g> b;
    public final /* synthetic */ ah2 c;
    public final /* synthetic */ Function2<b, Integer, j6g> d;
    public final /* synthetic */ m4a e;
    public final /* synthetic */ Function2<b, Integer, j6g> f;

    public fmd(int i, Function2 function2, ah2 ah2Var, Function2 function22, m4a m4aVar, Function2 function23, wu5 wu5Var, smd smdVar) {
        this.a = i;
        this.b = function2;
        this.c = ah2Var;
        this.d = function22;
        this.e = m4aVar;
        this.f = function23;
        this.V = wu5Var;
        this.W = smdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            pmd.c(this.a, this.b, this.c, bh2.c(545329543, new emd(this.V, this.W), bVar2), this.d, this.e, this.f, bVar2, 24576);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
