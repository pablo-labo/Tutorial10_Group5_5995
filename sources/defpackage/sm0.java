package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sm0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ gu5 c;

    public /* synthetic */ sm0(int i, int i2, gu5 gu5Var, gu5 gu5Var2) {
        this.a = i2;
        this.b = gu5Var;
        this.c = gu5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                u63.e(this.b, this.c, bVar, ka2.L(1));
                break;
            default:
                r03.e(this.b, this.c, bVar, ka2.L(7));
                break;
        }
        return j6g.a;
    }
}
