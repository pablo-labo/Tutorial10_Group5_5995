package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cs2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cs2(gu5 gu5Var, gu5 gu5Var2, g4a g4aVar) {
        this.b = gu5Var;
        this.c = gu5Var2;
        this.d = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj5;
                gu5 gu5Var2 = (gu5) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zK = bVar.K(gu5Var) | bVar.K(gu5Var2);
                    Object objV = bVar.v();
                    if (zK || objV == b.a.a) {
                        objV = new tr2(0, gu5Var, gu5Var2, g4aVar);
                        bVar.p(objV);
                    }
                    gs2.b((gu5) objV, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                sl4.c((zt9) obj5, (f68) obj4, (Function1) obj3, (b) obj, ka2.L(385));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ cs2(zt9 zt9Var, f68 f68Var, Function1 function1, int i) {
        this.b = zt9Var;
        this.c = f68Var;
        this.d = function1;
    }
}
