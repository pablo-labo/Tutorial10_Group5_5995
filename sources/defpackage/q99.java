package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q99 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ q99(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                wj8 wj8Var = (wj8) obj;
                wj8Var.getClass();
                function1.invoke(wj8Var);
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                function1.invoke(list);
                break;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                function1.invoke(num);
                break;
        }
        return j6g.a;
    }
}
