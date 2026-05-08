package defpackage;

import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x78 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ x78(Function1 function1, g4a g4aVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-job-type-preference", "save", null, null, 12));
                function1.invoke((List) g4aVar.getValue());
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-remote-preference", "save", null, null, 12));
                function1.invoke((List) g4aVar.getValue());
                break;
        }
        return j6g.a;
    }
}
