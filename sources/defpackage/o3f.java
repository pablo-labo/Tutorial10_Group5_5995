package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o3f implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah2 b;

    public /* synthetic */ o3f(ah2 ah2Var, int i) {
        this.a = i;
        this.b = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ah2 ah2Var = this.b;
        b bVar = (b) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ah2Var.invoke(bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            default:
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
