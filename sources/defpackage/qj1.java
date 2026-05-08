package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qj1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ vu5 f;

    public /* synthetic */ qj1(e eVar, List list, xj1 xj1Var, Function1 function1, boolean z, int i) {
        this.b = eVar;
        this.d = list;
        this.e = xj1Var;
        this.f = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vu5 vu5Var = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                vj1.a(this.b, (List) obj4, (xj1) obj3, (Function1) vu5Var, this.c, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1573297);
                uy8.b(this.b, (Function2) obj4, (Function2) obj3, this.c, (ah2) vu5Var, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ qj1(e eVar, Function2 function2, Function2 function22, boolean z, ah2 ah2Var, int i) {
        this.b = eVar;
        this.d = function2;
        this.e = function22;
        this.c = z;
        this.f = ah2Var;
    }
}
