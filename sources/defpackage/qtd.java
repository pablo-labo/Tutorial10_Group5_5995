package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qtd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ qtd(Function1 function1, g4a g4aVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                xm5 xm5Var = (xm5) obj;
                xm5Var.getClass();
                g4aVar.setValue(Boolean.valueOf(xm5Var.c()));
                function1.invoke(Boolean.valueOf(xm5Var.c()));
                break;
            default:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                g4aVar.setValue(jhfVar);
                function1.invoke(jhfVar.a.b);
                break;
        }
        return j6g.a;
    }
}
