package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yk5 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ ah2 a;

    public yk5(ah2 ah2Var) {
        this.a = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.q(jl5.a, bVar2, 6);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
