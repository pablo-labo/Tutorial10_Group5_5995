package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ef implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ ef(int i, g4a g4aVar) {
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
                lcf lcfVar = (lcf) obj;
                lcfVar.getClass();
                g4aVar.setValue(lcfVar);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                Integer numB = vve.B(10, str);
                if (numB != null) {
                    numValueOf = Integer.valueOf(numB.intValue() <= 99 ? numB.intValue() : 99);
                } else {
                    numValueOf = null;
                }
                g4aVar.setValue(numValueOf);
                break;
        }
        return j6g.a;
    }
}
