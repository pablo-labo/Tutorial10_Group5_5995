package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jtd implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gu5 d;
    public final /* synthetic */ gu5 e;
    public final /* synthetic */ int f;

    public /* synthetic */ jtd(gu5 gu5Var, String str, fv6 fv6Var, gu5 gu5Var2, String str2, int i) {
        this.d = gu5Var;
        this.b = str;
        this.V = fv6Var;
        this.e = gu5Var2;
        this.c = str2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wtd.d(this.d, this.b, (fv6) this.V, this.e, this.c, (b) obj, ka2.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dmc.b(this.b, this.c, this.d, this.e, (List) this.V, (b) obj, ka2.L(this.f | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ jtd(String str, String str2, gu5 gu5Var, gu5 gu5Var2, List list, int i) {
        this.b = str;
        this.c = str2;
        this.d = gu5Var;
        this.e = gu5Var2;
        this.V = list;
        this.f = i;
    }
}
