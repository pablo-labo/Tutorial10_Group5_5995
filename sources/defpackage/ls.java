package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ls implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ ls(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                lcf lcfVar = (lcf) obj;
                lcfVar.getClass();
                g4aVar.setValue(lcfVar);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
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
                f68 f68Var = (f68) obj;
                f68Var.getClass();
                g4aVar.setValue(f68Var);
                break;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(str2);
                break;
            default:
                ((Function1) g4aVar.getValue()).invoke((ooa) obj);
                break;
        }
        return j6g.a;
    }
}
