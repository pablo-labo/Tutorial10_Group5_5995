package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ lc(int i, g4a g4aVar) {
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
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 120) {
                    g4aVar.setValue(str);
                }
                break;
            case 2:
                g4aVar.setValue((String) obj);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(bbe.p((Set) g4aVar.getValue(), str2));
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                g4aVar.setValue(str3);
                break;
        }
        return j6g.a;
    }
}
