package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jr9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah2 b;

    public /* synthetic */ jr9(ah2 ah2Var, int i, int i2) {
        this.a = i2;
        this.b = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ah2 ah2Var = this.b;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                kr9.a(ah2Var, bVar, ka2.L(7));
                break;
            default:
                yqb.c(ah2Var, bVar, ka2.L(7));
                break;
        }
        return j6g.a;
    }
}
