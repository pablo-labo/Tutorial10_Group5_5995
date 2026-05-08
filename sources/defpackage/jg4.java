package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jg4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ jg4(int i, g4a g4aVar) {
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
                kcf kcfVar = (kcf) obj;
                kcfVar.getClass();
                g4aVar.setValue(kcfVar);
                break;
            case 1:
                ((String) obj).getClass();
                g4aVar.setValue("");
                break;
            case 2:
                g4aVar.setValue((String) obj);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
                break;
            case 4:
                kcf kcfVar2 = (kcf) obj;
                kcfVar2.getClass();
                g4aVar.setValue(kcfVar2);
                break;
            case 5:
                String str = (String) obj;
                g4aVar.setValue(str != null ? str : "");
                break;
            case 6:
                g4aVar.setValue((String) obj);
                break;
            case 7:
                g4aVar.setValue(z6h.b((z6h) g4aVar.getValue(), 0.0f, ((th7) obj).a, 0L, 0L, 0L, 29));
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                g4aVar.setValue(bool2);
                break;
        }
        return j6g.a;
    }
}
