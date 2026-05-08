package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ks implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ ks(g4a g4aVar, g4a g4aVar2, int i) {
        this.a = i;
        this.b = g4aVar;
        this.c = g4aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.c;
        g4a g4aVar2 = this.b;
        switch (i) {
            case 0:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                g4aVar2.setValue(jhfVar);
                g4aVar.setValue(jhfVar.a.b);
                break;
            case 1:
                ((String) obj).getClass();
                g4aVar2.setValue("");
                g4aVar.setValue("");
                break;
            default:
                String str = (String) obj;
                str.getClass();
                g4aVar2.setValue(((Set) g4aVar2.getValue()).contains(str) ? bbe.m((Set) g4aVar2.getValue(), str) : bbe.p((Set) g4aVar2.getValue(), str));
                g4aVar.setValue(bbe.m((Set) g4aVar.getValue(), str));
                break;
        }
        return j6g.a;
    }
}
