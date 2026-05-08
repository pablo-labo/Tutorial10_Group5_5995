package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ dd1(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (g4aVar != null) {
                    g4aVar.setValue(list);
                }
                break;
            case 1:
                g4aVar.setValue((ig3) obj);
                break;
            case 2:
                g4aVar.setValue((String) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
                break;
        }
        return j6g.a;
    }
}
