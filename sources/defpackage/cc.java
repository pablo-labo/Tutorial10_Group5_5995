package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cc implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ cc(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objV = bVar.v();
                    if (objV == b.a.a) {
                        objV = new mb(1, g4aVar);
                        bVar.p(objV);
                    }
                    ad.d((Function1) objV, (ig3) g4aVar.getValue(), bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            default:
                g4aVar.setValue(new tg3(Boolean.FALSE, (s38) obj, (Integer) obj2));
                break;
        }
        return j6g.a;
    }
}
