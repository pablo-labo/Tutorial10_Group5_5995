package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wra implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ gu5 c;

    public /* synthetic */ wra(gu5 gu5Var, gu5 gu5Var2) {
        this.b = gu5Var;
        this.c = gu5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gu5 gu5Var = this.c;
        gu5 gu5Var2 = this.b;
        b bVar = (b) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                xra.b(gu5Var2, gu5Var, bVar, ka2.L(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m9d.b(gu5Var2, gu5Var, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ wra(gu5 gu5Var, gu5 gu5Var2, int i) {
        this.b = gu5Var;
        this.c = gu5Var2;
    }
}
