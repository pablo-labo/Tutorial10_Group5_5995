package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qi5 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ ah2 a;

    public qi5(ah2 ah2Var) {
        this.a = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            fif.a(((nzf) bVar2.M(rzf.b)).k, bh2.c(-1686273317, new pi5(this.a), bVar2), bVar2, 48);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
