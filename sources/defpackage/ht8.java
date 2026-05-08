package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ht8 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ah2 b;
    public final /* synthetic */ Object c;

    public ht8(ah2 ah2Var, gt8 gt8Var) {
        this.b = ah2Var;
        this.c = gt8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        ah2 ah2Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ah2Var.q((gt8) obj3, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Function2 function2 = (Function2) obj3;
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bVar2.D();
                } else if (function2 == null) {
                    bVar2.L(1845819398);
                    ile.d(ah2Var, bVar2, 0);
                    bVar2.F();
                } else {
                    bVar2.L(1845823628);
                    ile.a(ah2Var, function2, bVar2, 0);
                    bVar2.F();
                }
                break;
        }
        return j6g.a;
    }

    public ht8(Function2 function2, ah2 ah2Var) {
        this.c = function2;
        this.b = ah2Var;
    }
}
