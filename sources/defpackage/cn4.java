package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cn4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ gu5 c;

    public /* synthetic */ cn4(Function1 function1, gu5 gu5Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        gu5 gu5Var = this.c;
        Function1 function1 = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                function1.invoke(0);
                gu5Var.invoke();
                break;
            default:
                str.getClass();
                function1.invoke(str);
                gu5Var.invoke();
                break;
        }
        return j6g.a;
    }
}
