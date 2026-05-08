package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xff implements wu5<Function2<? super b, ? super Integer, ? extends j6g>, b, Integer, j6g> {
    public final /* synthetic */ dce V;
    public final /* synthetic */ ar3 W;
    public final /* synthetic */ jhf a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ftg c;
    public final /* synthetic */ d3a d;
    public final /* synthetic */ Function2<b, Integer, j6g> e;
    public final /* synthetic */ Function2<b, Integer, j6g> f;

    public xff(jhf jhfVar, boolean z, ftg ftgVar, d3a d3aVar, Function2 function2, Function2 function22, dce dceVar, ar3 ar3Var) {
        this.a = jhfVar;
        this.b = z;
        this.c = ftgVar;
        this.d = d3aVar;
        this.e = function2;
        this.f = function22;
        this.V = dceVar;
        this.W = ar3Var;
    }

    @Override // defpackage.wu5
    public final j6g q(Function2<? super b, ? super Integer, ? extends j6g> function2, b bVar, Integer num) {
        Function2<? super b, ? super Integer, ? extends j6g> function22 = function2;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.x(function22) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            ief.a.c(this.a.a.b, function22, this.b, this.c, this.d, this.e, this.f, this.V, this.W, null, bVar2, (iIntValue << 3) & 112);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
