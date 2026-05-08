package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xw2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xw2(vsb vsbVar, gu5 gu5Var, wu5 wu5Var, b5g b5gVar, int i) {
        this.c = vsbVar;
        this.b = gu5Var;
        this.d = wu5Var;
        this.e = b5gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                ax2.a((x1e) this.c, (jta) this.d, this.b, (gu5) this.e, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1);
                o3h.a((vsb) this.c, this.b, (wu5) this.d, (b5g) this.e, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ xw2(x1e x1eVar, jta jtaVar, gu5 gu5Var, gu5 gu5Var2, int i) {
        this.c = x1eVar;
        this.d = jtaVar;
        this.b = gu5Var;
        this.e = gu5Var2;
    }
}
