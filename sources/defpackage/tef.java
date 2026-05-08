package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tef implements Function2<b, Integer, j6g> {
    public final /* synthetic */ long a;
    public final /* synthetic */ Function2<b, Integer, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public tef(long j, Function2<? super b, ? super Integer, j6g> function2) {
        this.a = j;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            nff.b(this.a, null, this.b, bVar2, 0, 6);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
