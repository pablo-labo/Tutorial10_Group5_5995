package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class os6 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ os6(Object obj, gu5 gu5Var, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = gu5Var;
        this.e = obj2;
        this.f = obj3;
        this.V = obj4;
        this.W = obj5;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.W;
        Object obj4 = this.V;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(i2 | 1);
                gt6.d((String) obj7, this.b, (e) obj6, (vt6) obj5, (fv6) obj4, (fv6) obj3, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(i2 | 1);
                d3d.b((f3d) obj7, this.b, (gu5) obj6, (Function1) obj5, (Function1) obj4, (fnf) obj3, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }
}
