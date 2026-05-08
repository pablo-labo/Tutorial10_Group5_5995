package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ns implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ ns(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                g4aVar.setValue(bool);
                break;
            case 1:
                lcf lcfVar = (lcf) obj;
                lcfVar.getClass();
                g4aVar.setValue(lcfVar);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                g4aVar.setValue(bool2);
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                g4aVar.setValue(bool3);
                break;
            case 5:
                tzc tzcVar = (tzc) obj;
                tzcVar.getClass();
                g4aVar.setValue(tzcVar);
                break;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(str2);
                break;
            case 7:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                g4aVar.setValue(bool4);
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                g4aVar.setValue(jhf.b((jhf) g4aVar.getValue(), str3));
                break;
        }
        return j6g.a;
    }
}
