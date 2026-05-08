package defpackage;

import defpackage.ig3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pt implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ pt(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        g4a g4aVar = this.b;
        s38 s38Var = (s38) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                Boolean bool = Boolean.FALSE;
                g4aVar.setValue(new ig3(null, bool, new ig3.b(bool, s38Var, num)));
                break;
            default:
                g4aVar.setValue(new tg3(Boolean.FALSE, s38Var, num));
                break;
        }
        return j6g.a;
    }
}
