package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bz6 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ bz6(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke("");
                break;
            default:
                function1.invoke("");
                break;
        }
        return j6g.a;
    }
}
