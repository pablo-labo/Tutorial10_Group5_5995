package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class my4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ my4(int i, int i2, gu5 gu5Var) {
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
                yy4.c(this.b, bVar, ka2.L(1));
                break;
            default:
                b86.a(this.b, bVar, ka2.L(1));
                break;
        }
        return j6g.a;
    }
}
