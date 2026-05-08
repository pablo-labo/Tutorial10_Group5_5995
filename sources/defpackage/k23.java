package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k23 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ k23(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
                break;
            case 1:
                g4aVar.setValue((String) obj);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                g4aVar.setValue(bool2);
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            default:
                g4aVar.setValue((dbf) obj);
                break;
        }
        return j6g.a;
    }
}
