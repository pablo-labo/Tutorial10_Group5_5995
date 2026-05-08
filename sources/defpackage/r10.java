package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r10 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ Function2<b, Integer, j6g> a;

    /* JADX WARN: Multi-variable type inference failed */
    public r10(Function2<? super b, ? super Integer, j6g> function2) {
        this.a = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            fif.a(((nzf) bVar2.M(rzf.b)).j, this.a, bVar2, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
