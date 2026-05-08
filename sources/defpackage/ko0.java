package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ko0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gu5 c;

    public /* synthetic */ ko0(String str, gu5 gu5Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gu5 gu5Var = this.c;
        String str = this.b;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                wo0.c(ka2.L(1), gu5Var, bVar, str);
                break;
            default:
                dq4.b(ka2.L(1), gu5Var, bVar, str);
                break;
        }
        return j6g.a;
    }
}
