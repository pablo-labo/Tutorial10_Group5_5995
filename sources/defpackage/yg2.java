package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vu5 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yg2(int i, int i2, vu5 vu5Var, Object obj) {
        this.a = i2;
        this.c = vu5Var;
        this.d = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.d;
        vu5 vu5Var = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((ah2) vu5Var).b(obj3, (b) obj, ka2.L(i2) | 1);
                break;
            default:
                ((Integer) obj2).intValue();
                cyb.d((gu5) vu5Var, (gu5) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
