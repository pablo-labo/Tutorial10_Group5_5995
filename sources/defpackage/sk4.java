package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sk4 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ gu5 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sk4(Object obj, List list, Function1 function1, gu5 gu5Var, Function1 function12, Object obj2, int i, int i2) {
        this.a = i2;
        this.f = obj;
        this.b = list;
        this.c = function1;
        this.d = gu5Var;
        this.e = function12;
        this.V = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                yk4.a((String) this.f, this.b, this.c, this.d, this.e, (b5g) this.V, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1576321);
                hic.e((tzc) this.f, this.b, this.c, this.d, this.e, (Function1) this.V, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }
}
