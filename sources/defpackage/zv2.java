package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zv2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ zv2(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                g4aVar.setValue(Boolean.FALSE);
                break;
            case 1:
                lcf lcfVar = (lcf) obj;
                lcfVar.getClass();
                g4aVar.setValue(lcfVar);
                break;
            case 2:
                g4aVar.setValue((String) obj);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                g4aVar.setValue(bool);
                break;
            default:
                g4aVar.setValue((p2e) obj);
                break;
        }
        return j6g.a;
    }
}
