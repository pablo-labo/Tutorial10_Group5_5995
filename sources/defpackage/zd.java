package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ zd(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            case 1:
                g4aVar.setValue((ig3) obj);
                break;
            case 2:
                g4aVar.setValue(new th7(((th7) obj).a));
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                g4aVar.setValue(bool);
                break;
            default:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                g4aVar.setValue(jhfVar);
                break;
        }
        return j6g.a;
    }
}
