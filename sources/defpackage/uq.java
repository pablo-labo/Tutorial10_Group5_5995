package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ uq(int i, g4a g4aVar) {
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
                lcf lcfVar = (lcf) obj;
                lcfVar.getClass();
                g4aVar.setValue(lcfVar);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                g4aVar.setValue(bool);
                break;
            case 3:
                ((mif) obj).getClass();
                g4aVar.setValue(Boolean.valueOf(!r2.d()));
                break;
            case 4:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.g(s5eVar, 0);
                o5e.f(s5eVar, (String) g4aVar.getValue());
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
