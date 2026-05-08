package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ud implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ ud(g4a g4aVar, g4a g4aVar2, int i) {
        this.a = i;
        this.b = g4aVar;
        this.c = g4aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.c;
        g4a g4aVar2 = this.b;
        switch (i) {
            case 0:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                g4aVar2.setValue(jhfVar);
                g4aVar.setValue(jhfVar.a.b);
                break;
            case 1:
                jhf jhfVar2 = (jhf) obj;
                jhfVar2.getClass();
                g4aVar2.setValue(jhfVar2);
                g4aVar.setValue(jhfVar2.a.b);
                break;
            default:
                vnd vndVar = (vnd) obj;
                vndVar.getClass();
                n76.g(g4aVar2, true);
                g4aVar.setValue(new ah2(268468942, new d76(vndVar, 0), true));
                break;
        }
        return j6g.a;
    }
}
