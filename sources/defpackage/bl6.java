package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bl6 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ vu5 W;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bl6(dx4 dx4Var, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, boolean z, int i, int i2) {
        this.e = dx4Var;
        this.f = gu5Var;
        this.V = gu5Var2;
        this.W = gu5Var3;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        vu5 vu5Var = this.W;
        Object obj3 = this.V;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(i2 | 1);
                kl6.c((dx4) obj5, (gu5) obj4, (gu5) obj3, (gu5) vu5Var, this.b, (b) obj, iL, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(i2 | 1);
                py8.a((String) obj5, (le0) obj4, (String) obj3, this.b, (Function1) vu5Var, (b) obj, iL2, this.d);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ bl6(String str, le0 le0Var, String str2, boolean z, Function1 function1, int i, int i2) {
        this.e = str;
        this.f = le0Var;
        this.V = str2;
        this.b = z;
        this.W = function1;
        this.c = i;
        this.d = i2;
    }
}
