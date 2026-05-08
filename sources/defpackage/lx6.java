package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lx6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lx6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && bVar.i()) {
                    bVar.D();
                } else {
                    ((ah2) obj4).q((pb2) obj3, bVar, 0);
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wg2.M((String) obj4, (String) obj3, bVar2, new Object[0]);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
