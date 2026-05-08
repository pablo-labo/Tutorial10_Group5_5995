package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ nc(int i, g4a g4aVar) {
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
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                g4aVar.setValue(bool2);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                g4aVar.setValue(bool3);
                break;
            case 4:
                g4aVar.setValue((String) obj);
                break;
            case 5:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                g4aVar.setValue(jhfVar);
                break;
            default:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                g4aVar.setValue(bool4);
                break;
        }
        return j6g.a;
    }
}
