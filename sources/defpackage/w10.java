package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class w10 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ah2 b;
    public final /* synthetic */ Function2 c;

    public w10(ah2 ah2Var, Function2 function2) {
        this.b = ah2Var;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function2 function2 = this.c;
        ah2 ah2Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (function2 == null) {
                        bVar.L(690531395);
                    } else {
                        bVar.L(-254819458);
                        function2.invoke(bVar, 0);
                    }
                    bVar.F();
                    ah2Var.invoke(bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ah2Var.invoke(bVar2, 0);
                    function2.getClass();
                    function2.invoke(bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }

    public w10(Function2 function2, ah2 ah2Var) {
        this.c = function2;
        this.b = ah2Var;
    }
}
