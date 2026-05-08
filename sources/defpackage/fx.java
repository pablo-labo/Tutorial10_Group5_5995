package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fx implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fx(Function1 function1, mu0 mu0Var, g4a g4aVar) {
        this.b = function1;
        this.d = mu0Var;
        this.c = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.c;
        Object obj = this.d;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-skill", "refresh", null, null, 12));
                function1.invoke(new zie(null, (String) g4aVar.getValue(), (Integer) ((g4a) obj).getValue(), q68.c, false, null, null, null, null, null, 1009));
                break;
            default:
                mu0 mu0Var = (mu0) obj;
                g4aVar.setValue(Boolean.FALSE);
                function1.invoke(mu0Var != null ? mu0Var.d : null);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ fx(Function1 function1, g4a g4aVar, g4a g4aVar2) {
        this.b = function1;
        this.c = g4aVar;
        this.d = g4aVar2;
    }
}
