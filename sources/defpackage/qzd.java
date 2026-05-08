package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qzd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qzd(Object obj, Object obj2, Object obj3, gu5 gu5Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                fv6 fv6Var = (fv6) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                ((Integer) obj2).getClass();
                rzd.a(ka2.L(1), this.b, fv6Var, (b) obj, str, str2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                l3h.a((List) this.c, (List) this.d, (List) this.e, this.b, (b) obj, iL);
                break;
        }
        return j6g.a;
    }
}
