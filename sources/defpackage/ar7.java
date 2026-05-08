package defpackage;

import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ar7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ar7(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                iq7 iq7Var = (iq7) obj;
                iq7Var.getClass();
                int iOrdinal = iq7Var.ordinal();
                if (iOrdinal == 0) {
                    function1.invoke(new oq7.f(kk7.c));
                } else if (iOrdinal != 1) {
                    l.g();
                } else {
                    function1.invoke(new oq7.f(kk7.b));
                }
                break;
            default:
                ((Boolean) obj).booleanValue();
                function1.invoke(Boolean.FALSE);
                break;
        }
        return j6g.a;
    }
}
