package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ tu(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer numValueOf;
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            case 1:
                g4aVar.setValue((sl8) obj);
                break;
            case 2:
                xm5 xm5Var = (xm5) obj;
                xm5Var.getClass();
                g4aVar.setValue(Boolean.valueOf(xm5Var.a()));
                break;
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    numValueOf = Integer.valueOf(num.intValue() <= 99 ? num.intValue() : 99);
                } else {
                    numValueOf = null;
                }
                g4aVar.setValue(numValueOf);
                break;
        }
        return j6g.a;
    }
}
