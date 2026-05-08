package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ng0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ ng0(int i, gu5 gu5Var) {
        this.b = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gu5 gu5Var = this.b;
        b bVar = (b) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                rg0.a(gu5Var, bVar, ka2.L(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xra.d(gu5Var, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ng0(gu5 gu5Var) {
        this.b = gu5Var;
    }
}
