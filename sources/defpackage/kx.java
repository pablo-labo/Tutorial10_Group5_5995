package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kx implements gu5 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ g4a e;

    public /* synthetic */ kx(yvb yvbVar, Function1 function1, g4a g4aVar, g4a g4aVar2) {
        this.d = yvbVar;
        this.b = function1;
        this.c = g4aVar;
        this.e = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        Double dValueOf;
        int i = this.a;
        g4a g4aVar = this.c;
        g4a g4aVar2 = this.e;
        Object obj = this.d;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((yvb) obj).I("", "");
                function1.invoke(new zie(null, (String) g4aVar.getValue(), null, null, false, (String) g4aVar2.getValue(), null, null, null, null, 989));
                mx.b(nx.c);
                break;
            default:
                vsb vsbVar = (vsb) obj;
                v2a v2aVar = (v2a) g4aVar2;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-minimum-pay-preference", "save", null, null, 12));
                if (v2aVar.c() == 0.0d) {
                    zt9 zt9Var = vsbVar.p;
                    dValueOf = zt9Var != null ? zt9Var.a : null;
                } else {
                    dValueOf = Double.valueOf(v2aVar.c());
                }
                function1.invoke(new zt9(dValueOf, (f68) g4aVar.getValue(), 8));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ kx(Function1 function1, vsb vsbVar, v2a v2aVar, g4a g4aVar) {
        this.b = function1;
        this.d = vsbVar;
        this.e = v2aVar;
        this.c = g4aVar;
    }
}
