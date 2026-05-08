package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ug4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ ug4(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

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
                g4aVar.setValue((String) obj);
                break;
            case 2:
                xm5 xm5Var = (xm5) obj;
                xm5Var.getClass();
                g4aVar.setValue(Boolean.valueOf(xm5Var.c()));
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
