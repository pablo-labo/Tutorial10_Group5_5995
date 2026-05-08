package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jub implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Enum c;
    public final /* synthetic */ vu5 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jub(Enum r1, Function1 function1, vu5 vu5Var, Object obj, int i, int i2) {
        this.a = i2;
        this.c = r1;
        this.b = function1;
        this.d = vu5Var;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                kub.b((cub) this.c, this.b, (gu5) this.d, (b5g) this.e, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1);
                zxb.a((rxb) this.c, this.b, (Function1) this.d, (Function1) this.e, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }
}
