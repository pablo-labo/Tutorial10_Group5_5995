package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xa3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah2 b;

    public /* synthetic */ xa3(ah2 ah2Var, int i) {
        this.a = i;
        this.b = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ah2 ah2Var = this.b;
        b bVar = (b) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ah2Var.invoke(bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                num.getClass();
                n76.c(ah2Var, bVar, ka2.L(7));
                break;
            case 2:
                num.getClass();
                nn2.g(ah2Var, bVar, ka2.L(1));
                break;
            default:
                int iIntValue2 = num.intValue();
                if (bVar.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ah2Var.invoke(bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ xa3(ah2 ah2Var, int i, int i2) {
        this.a = i2;
        this.b = ah2Var;
    }
}
