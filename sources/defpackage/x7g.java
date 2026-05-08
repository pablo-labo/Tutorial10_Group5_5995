package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x7g implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gu5 d;

    public /* synthetic */ x7g(Function1 function1, String str, gu5 gu5Var, int i, int i2) {
        this.a = i2;
        this.b = function1;
        this.c = str;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b8g.a(this.b, this.c, this.d, bVar, ka2.L(7));
                break;
            default:
                hfg.a(this.b, this.c, this.d, bVar, ka2.L(7));
                break;
        }
        return j6g.a;
    }
}
