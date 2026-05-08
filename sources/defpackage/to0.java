package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class to0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ to0(int i, gu5 gu5Var, String str, boolean z) {
        this.b = z;
        this.d = str;
        this.c = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(9);
                wo0.h((hw9) this.d, this.c, this.b, (b) obj, iL);
                break;
            default:
                String str = (String) this.d;
                ((Integer) obj2).getClass();
                b4g.f(ka2.L(1), this.c, (b) obj, str, this.b);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ to0(hw9 hw9Var, gu5 gu5Var, boolean z, int i) {
        this.d = hw9Var;
        this.c = gu5Var;
        this.b = z;
    }
}
