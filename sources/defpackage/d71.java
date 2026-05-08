package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d71 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d71(int i, int i2, gu5 gu5Var, Object obj) {
        this.a = i2;
        this.b = gu5Var;
        this.d = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.d;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(i2 | 1);
                e71.a(iL, gu5Var, (b) obj, (String) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                t54.a(gu5Var, (gu5) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
