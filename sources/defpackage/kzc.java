package defpackage;

import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kzc implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ g4a d;

    public /* synthetic */ kzc(Function2 function2, g4a g4aVar, g4a g4aVar2, int i) {
        this.a = i;
        this.b = function2;
        this.c = g4aVar;
        this.d = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.d;
        g4a g4aVar2 = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-relocation-preference", "refresh", null, null, 12));
                function2.invoke((tzc) g4aVar2.getValue(), (List) g4aVar.getValue());
                break;
            default:
                String str = (String) g4aVar2.getValue();
                Boolean bool = (Boolean) g4aVar.getValue();
                bool.booleanValue();
                function2.invoke(str, bool);
                break;
        }
        return j6g.a;
    }
}
