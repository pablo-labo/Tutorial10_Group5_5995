package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ig4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ ig4(g4a g4aVar, g4a g4aVar2, int i) {
        this.a = i;
        this.b = g4aVar;
        this.c = g4aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.c;
        g4a g4aVar2 = this.b;
        jhf jhfVar = (jhf) obj;
        switch (i) {
            case 0:
                jhfVar.getClass();
                g4aVar2.setValue(jhfVar);
                g4aVar.setValue(jhfVar.a.b);
                break;
            default:
                jhfVar.getClass();
                g4aVar2.setValue(jhfVar);
                g4aVar.setValue(jhfVar.a.b);
                break;
        }
        return j6g.a;
    }
}
