package defpackage;

import defpackage.oq7;
import defpackage.yra;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uq7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ uq7(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yra yraVar;
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                rra rraVar = (rra) obj;
                rraVar.getClass();
                int iOrdinal = rraVar.ordinal();
                if (iOrdinal == 0) {
                    yraVar = yra.b.INSTANCE;
                } else if (iOrdinal != 1) {
                    l.g();
                } else {
                    yraVar = yra.a.INSTANCE;
                }
                function1.invoke(new oq7.h(yraVar));
                break;
            default:
                zie zieVar = (zie) obj;
                zieVar.getClass();
                function1.invoke(zieVar);
                break;
        }
        return j6g.a;
    }
}
