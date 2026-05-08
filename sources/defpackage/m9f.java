package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m9f implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ m9f(Function1 function1, g4a g4aVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) g4aVar.getValue();
                if (str == null || zve.U(str)) {
                    function1.invoke("1547992f9cc304b8");
                } else {
                    function1.invoke((String) g4aVar.getValue());
                }
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-summary", "refresh", null, null, 12));
                function1.invoke(((jhf) g4aVar.getValue()).a.b);
                break;
        }
        return j6g.a;
    }
}
