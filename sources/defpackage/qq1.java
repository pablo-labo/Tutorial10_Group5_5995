package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qq1 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ gza a;
    public final /* synthetic */ ah2 b;

    public qq1(gza gzaVar, ah2 ah2Var) {
        this.a = gzaVar;
        this.b = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            fif.a(((nzf) bVar2.M(rzf.b)).k, bh2.c(165539859, new oq1(this.a, this.b), bVar2), bVar2, 48);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
