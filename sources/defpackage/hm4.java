package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hm4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ hm4(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                zie zieVar = (zie) obj;
                zieVar.getClass();
                function1.invoke(zieVar);
                break;
            default:
                ((et7) obj).getClass();
                if (function1 != null) {
                    function1.invoke(zs7.d);
                }
                break;
        }
        return j6g.a;
    }
}
