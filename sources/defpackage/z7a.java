package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z7a implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ gu5 d;

    public /* synthetic */ z7a(int i, int i2, gu5 gu5Var, gu5 gu5Var2, boolean z) {
        this.a = i2;
        this.b = z;
        this.c = gu5Var;
        this.d = gu5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ygg.c(ka2.L(1), this.c, this.d, bVar, this.b);
                break;
            default:
                bma.a(ka2.L(1), this.c, this.d, bVar, this.b);
                break;
        }
        return j6g.a;
    }
}
