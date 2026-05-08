package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dk7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dk7(int i, int i2, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ik7.a((c88) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gxc.c(i2, (String) obj3, (b) obj, ka2.L(1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ dk7(c88 c88Var, int i) {
        this.c = c88Var;
        this.b = i;
    }
}
