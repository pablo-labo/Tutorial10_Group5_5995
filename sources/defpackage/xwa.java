package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xwa implements wu5<Function2<? super b, ? super Integer, ? extends j6g>, b, Integer, j6g> {
    public final /* synthetic */ ar3 V;
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ftg c;
    public final /* synthetic */ d3a d;
    public final /* synthetic */ Function2<b, Integer, j6g> e;
    public final /* synthetic */ dce f;

    public xwa(String str, boolean z, ftg ftgVar, d3a d3aVar, Function2 function2, dce dceVar, ar3 ar3Var) {
        this.a = str;
        this.b = z;
        this.c = ftgVar;
        this.d = d3aVar;
        this.e = function2;
        this.f = dceVar;
        this.V = ar3Var;
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
            boolean z = this.b;
            d3a d3aVar = this.d;
            ar3 ar3Var = this.V;
            dce dceVar = this.f;
            ief.a.b(this.a, function22, z, this.c, d3aVar, this.e, null, dceVar, ar3Var, null, bh2.c(-1118701585, new wwa(z, d3aVar, ar3Var, dceVar), bVar2), bVar2, (iIntValue << 3) & 112, 8192);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
