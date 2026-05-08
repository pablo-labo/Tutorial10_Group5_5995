package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vy implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ vy(int i, g4a g4aVar) {
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
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                g4aVar.setValue(jhfVar);
                break;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                ((Function1) g4aVar.getValue()).invoke(f);
                break;
            default:
                xm5 xm5Var = (xm5) obj;
                xm5Var.getClass();
                g4aVar.setValue(Boolean.valueOf(xm5Var.a()));
                break;
        }
        return j6g.a;
    }
}
