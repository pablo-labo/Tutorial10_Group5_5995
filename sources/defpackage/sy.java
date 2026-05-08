package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sy implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ sy(int i, g4a g4aVar) {
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
                g4aVar.setValue((String) obj);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            case 3:
                g4aVar.setValue(z6h.b((z6h) g4aVar.getValue(), 0.0f, ((th7) obj).a, 0L, 0L, 0L, 29));
                break;
            default:
                lcf lcfVar = (lcf) obj;
                lcfVar.getClass();
                g4aVar.setValue(lcfVar);
                break;
        }
        return j6g.a;
    }
}
