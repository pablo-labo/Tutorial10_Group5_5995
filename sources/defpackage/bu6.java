package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bu6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ah2 b;

    public /* synthetic */ bu6(ah2 ah2Var) {
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
                num.getClass();
                du6.b(ah2Var, bVar, ka2.L(385));
                break;
            default:
                int iIntValue = num.intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ah2Var.invoke(bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }
}
