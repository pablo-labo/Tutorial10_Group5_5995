package defpackage;

import defpackage.cv8;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rf4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ g4a d;
    public final /* synthetic */ g4a e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rf4(Function1 function1, Object obj, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, int i) {
        this.a = i;
        this.b = function1;
        this.f = obj;
        this.c = g4aVar;
        this.d = g4aVar2;
        this.e = g4aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.e;
        g4a g4aVar2 = this.d;
        g4a g4aVar3 = this.c;
        Object obj = this.f;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                av8 av8Var = (av8) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-accounting-license", "refresh", null, null, 12));
                function1.invoke(new av8(av8Var != null ? av8Var.a : null, (String) g4aVar3.getValue(), (List) null, (cv8.d) null, new cv8.b(null, null, null, null, null, null, null, null, (String) g4aVar.getValue()), (k38) null, (ig3) g4aVar2.getValue(), 172));
                break;
            default:
                mu0 mu0Var = (mu0) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-groups", "refresh", null, null, 12));
                function1.invoke(new lu0(mu0Var != null ? mu0Var.d : null, (String) g4aVar3.getValue(), (ig3) g4aVar2.getValue(), (String) g4aVar.getValue()));
                break;
        }
        return j6g.a;
    }
}
