package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ vd(int i, g4a g4aVar) {
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
                kcf kcfVar2 = (kcf) obj;
                kcfVar2.getClass();
                g4aVar.setValue(kcfVar2);
                break;
            case 2:
                g4aVar.setValue((ljg) obj);
                break;
            case 3:
                g4aVar.setValue((String) obj);
                break;
            case 4:
                String str = (String) obj;
                str.getClass();
                if (!((Boolean) g4aVar.getValue()).booleanValue()) {
                    q6.n(str, null, null, 6, (tp7) cr8.p(tp7.class));
                }
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(str2);
                break;
        }
        return j6g.a;
    }
}
