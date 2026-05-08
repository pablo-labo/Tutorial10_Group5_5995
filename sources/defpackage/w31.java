package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w31 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ w31(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    function1.invoke("");
                }
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(str2);
                break;
            default:
                wf7 wf7Var = (wf7) obj;
                wf7Var.getClass();
                wf7Var.a.b(function1, "offset");
                break;
        }
        return j6g.a;
    }
}
