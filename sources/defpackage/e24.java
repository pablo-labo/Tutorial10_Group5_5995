package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e24 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ e24(gu5 gu5Var) {
        this.a = 3;
        this.b = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                g24.b(gu5Var, (b) obj, ka2.L(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                x77.a(gu5Var, (b) obj, ka2.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                nec.f(gu5Var, (b) obj, ka2.L(1));
                break;
            default:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rq6.b(this.b, null, false, null, null, ypd.e, bVar, 196608, 30);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ e24(int i, int i2, gu5 gu5Var) {
        this.a = i2;
        this.b = gu5Var;
    }
}
