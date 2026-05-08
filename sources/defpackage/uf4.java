package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uf4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ uf4(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                g4aVar.setValue("");
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                g4aVar.setValue(bool);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(str2);
                break;
            case 4:
                g4aVar.setValue((String) obj);
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
