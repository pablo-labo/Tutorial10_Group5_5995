package defpackage;

import defpackage.aq3;
import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n61 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ n61(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(null);
                break;
            case 1:
                function1.invoke(null);
                break;
            case 2:
                aq3.a aVar = aq3.Companion;
                function1.invoke(new oq7.a());
                break;
            case 3:
                function1.invoke(null);
                break;
            case 4:
                function1.invoke("DismissBottomSheet");
                break;
            case 5:
                function1.invoke(null);
                break;
            default:
                function1.invoke("");
                break;
        }
        return j6g.a;
    }
}
