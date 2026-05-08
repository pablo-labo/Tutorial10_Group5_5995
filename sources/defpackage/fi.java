package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ fi(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                g4aVar.setValue((ig3) obj);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            default:
                g4aVar.setValue((ig3) obj);
                break;
        }
        return j6g.a;
    }
}
