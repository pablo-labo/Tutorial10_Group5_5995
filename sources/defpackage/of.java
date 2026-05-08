package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class of implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ g4a d;
    public final /* synthetic */ g4a e;

    public /* synthetic */ of(Function1 function1, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, int i) {
        this.a = i;
        this.b = function1;
        this.c = g4aVar;
        this.d = g4aVar2;
        this.e = g4aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.e;
        g4a g4aVar2 = this.d;
        g4a g4aVar3 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-certification", "save", null, null, 12));
                function1.invoke(new hz1(null, (String) g4aVar3.getValue(), (ig3) g4aVar.getValue(), (String) g4aVar2.getValue(), 5));
                break;
            default:
                function1.invoke(new zie(null, (String) g4aVar3.getValue(), (Integer) g4aVar2.getValue(), q68.c, false, (String) g4aVar.getValue(), null, null, null, null, 977));
                mx.b(nx.c);
                break;
        }
        return j6g.a;
    }
}
