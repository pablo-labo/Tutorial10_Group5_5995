package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lmd implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Object c;

    public lmd(u55 u55Var, Function2 function2) {
        this.c = u55Var;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rm2.a(pmd.a.a((u55) obj3), function2, bVar, 8);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ne4 ne4Var = ls2.a;
                    long j = ((da2) bVar2.M(ps2.a)).a;
                    rm2.a(ne4Var.a(Float.valueOf((!((kb2) bVar2.M(lb2.a)).g() ? ((double) pnb.J(j)) < 0.5d : ((double) pnb.J(j)) > 0.5d) ? 0.87f : 1.0f)), bh2.c(1236486620, new jmd(function2, (ah2) obj3), bVar2), bVar2, 56);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }

    public lmd(Function2 function2, ah2 ah2Var) {
        this.b = function2;
        this.c = ah2Var;
    }
}
