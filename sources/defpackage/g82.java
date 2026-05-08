package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g82 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ g82(int i, int i2, gu5 gu5Var) {
        this.a = i2;
        this.b = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                h82.a(this.b, bVar, ka2.L(1));
                break;
            default:
                rof.a(this.b, bVar, ka2.L(49));
                break;
        }
        return j6g.a;
    }
}
