package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xq3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ vu5 e;

    public /* synthetic */ xq3(Object obj, Object obj2, vu5 vu5Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = vu5Var;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        vu5 vu5Var = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                yq3.c((kdf) obj4, (zcf) obj3, (gu5) vu5Var, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                z3f.a((tg2) obj4, (String) obj3, (ah2) vu5Var, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
