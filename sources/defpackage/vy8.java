package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vy8 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ tjf a;
    public final /* synthetic */ fx8 b;
    public final /* synthetic */ Function2<b, Integer, j6g> c;

    /* JADX WARN: Multi-variable type inference failed */
    public vy8(tjf tjfVar, fx8 fx8Var, Function2<? super b, ? super Integer, j6g> function2) {
        this.a = tjfVar;
        this.b = fx8Var;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            fif.a(tjf.a(this.a, 0L, 0L, null, null, null, 0L, 0, 0L, null, this.b, 0, 15728639), this.c, bVar2, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
