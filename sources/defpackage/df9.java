package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class df9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ df9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    nn2.g((ah2) obj3, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fif.b(((qke) obj3).getMessage(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
