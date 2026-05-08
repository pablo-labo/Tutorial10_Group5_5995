package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ff implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ ff(int i, g4a g4aVar) {
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
                g4aVar.setValue((sl8) obj);
                break;
            case 2:
                sl8 sl8Var = (sl8) obj;
                sl8Var.getClass();
                g4aVar.setValue(z6h.b((z6h) g4aVar.getValue(), 0.0f, 0L, sl8Var.a(), 0L, 0L, 27));
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                g4aVar.setValue(bool2);
                break;
        }
        return j6g.a;
    }
}
